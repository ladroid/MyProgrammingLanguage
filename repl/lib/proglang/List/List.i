%module List
%{
  #include "List.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%template(_string_list) std::vector< std::string >;
%include "List.h"