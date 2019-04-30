/* unittesting.i */
 %module unittesting
 %{
   /* Put header files here or function declarations like below */
   #include "unittesting.h"
 %}
 %include <std_string.i>
 %include <std_vector.i>
 %include "stl.i"
 %template(_string_list) std::vector< std::string >;
 %include "unittesting.h"