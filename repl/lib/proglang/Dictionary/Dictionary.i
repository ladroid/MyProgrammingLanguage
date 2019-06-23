%module Dictionary
%{
  #include "Dictionary.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%template(_string_list) std::vector< std::string >;
%include "Dictionary.h"
%template(dictint) Dictionary<int>;
%template(dictstr) Dictionary<string>;
%template(dictflo) Dictionary<float>;