%module Float
%{
  #include "Float.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%template(_string_list) std::vector< std::string >;
%rename(Addition) operator+(Float &number, Float &number2);
%rename(Subtraction) operator-(Float &number, Float &number2);
%rename(Multiply) operator*(Float &number, Float &number2);
%rename(Division) operator/(Float &number, Float &number2);
%rename(Output) &operator<<(ostream &out, Float &num);
%include "Float.h"