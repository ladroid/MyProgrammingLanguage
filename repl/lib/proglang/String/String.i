%module String
%{
  #include "String.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%template(_string_list) std::vector< std::string >;
%rename(Addition) operator+(String &str1, String &str2);
%include "String.h"