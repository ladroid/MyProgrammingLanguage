%module Int
%{
  #include "Int.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%template(_string_list) std::vector< std::string >;
%rename(Addition) operator+(Int &number, Int &number2);
%rename(Subtraction) operator-(Int &number, Int &number2);
%rename(Multiply) operator*(Int &number, Int &number2);
%rename(Division) operator/(Int &number, Int &number2);
%rename(Output) &operator<<(ostream &out, Int &num);
%include "Int.h"