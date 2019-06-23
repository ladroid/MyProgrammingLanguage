%module Dictionary
%{
  #include "Dictionary.h"
%}
%include <std_string.i>
%include <std_vector.i>
%include "stl.i"
%template(_string_list) std::vector< std::string >;
%include "Dictionary.h"
%template(dictint) Dictionary<int, int>;
%template(dictstr) Dictionary<string, string>;
%template(dictflo) Dictionary<float, float>;

%template(dictintstr) Dictionary<int, string>;
%template(dictintflo) Dictionary<int, float>;

%template(dictstrflo) Dictionary<string, float>;
%template(dictstrint) Dictionary<string, int>;

%template(dictfloint) Dictionary<float, int>;
%template(dictflostr) Dictionary<float, string>;