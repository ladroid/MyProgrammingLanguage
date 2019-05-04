%module Decimal
%{
  #include "Decimal.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%template(_string_list) std::vector< std::string >;
%rename(Addition) operator+(Decimal &number, Decimal &number2);
%rename(Subtraction) operator-(Decimal &number, Decimal &number2);
%rename(Multiply) operator*(Decimal &number, Decimal &number2);
%rename(Division) operator/(Decimal &number, Decimal &number2);
%include "Decimal.h"