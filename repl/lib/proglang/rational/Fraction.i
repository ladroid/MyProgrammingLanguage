%module Fraction
%{
    #include "Fraction.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%rename(Addition) operator+(Fraction otherFrac);
%rename(Subtraction) operator-(Fraction otherFrac);
%rename(Multiplication) operator*(Fraction otherFrac);
%rename(Division) operator/(Fraction otherFrac);
%include "Fraction.h"