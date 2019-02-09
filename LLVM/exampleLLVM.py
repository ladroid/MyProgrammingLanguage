from llvmlite import ir

int_type = ir.IntType(64)

fn_int_to_int_type = ir.FunctionType( int_type, [int_type] )

module = ir.Module( name="m_fibonacci_example" )

# Create the Fibonacci function and block
fn_fib = ir.Function( module, fn_int_to_int_type, name="fn_fib" )
fn_fib_block = fn_fib.append_basic_block( name="fn_fib_entry" )

# Create the builder for the fibonacci code block
builder = ir.IRBuilder( fn_fib_block )

# Access the function argument
fn_fib_n, = fn_fib.args # trailing , to unwrap tuple

# Const values for int(1) and int(2)
const_1 = ir.Constant(int_type,1);
const_2 = ir.Constant(int_type,2);

# Create inequality comparison instruction
fn_fib_n_lteq_1 = builder.icmp_signed(cmpop="<=", lhs=fn_fib_n, rhs=const_1 )

# Create the base case
# Using the if_then helper to create the branch instruction and 'then' block if
# the predicate (fn_fib_n_lteq_1) is true ( ie if n <= 1 then ... )
with builder.if_then( fn_fib_n_lteq_1 ):
  # Simply return 1 if n <= 1
  builder.ret( const_1 )

# This is where the recursive case is created
# _temp1= n - 1
fn_fib_n_minus_1 = builder.sub( fn_fib_n, const_1 )
# _temp2 = n - 2
fn_fib_n_minus_2 = builder.sub( fn_fib_n, const_2 )
#Then we call our fibonacci function on the results:

# Call fibonacci( n - 1 )
# arguments in a list, in positional order
call_fn_fib_n_minus_1 = builder.call( fn_fib, [fn_fib_n_minus_1] );
# Call fibonacci( n - 2 )
call_fn_fib_n_minus_2 = builder.call( fn_fib, [fn_fib_n_minus_2] );
#Then we add the results, and return it.

# Add the resulting call values
fn_fib_rec_res =  builder.add( call_fn_fib_n_minus_1, call_fn_fib_n_minus_2 )

# Return the result of the addition
builder.ret( fn_fib_rec_res )

# Print the generated LLVM asm code
print( module )