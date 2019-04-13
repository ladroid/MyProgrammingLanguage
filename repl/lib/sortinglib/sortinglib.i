/* sortinglib.i */
 %module sortinglib
 %{
   /* Put header files here or function declarations like below */
   #include "sortinglib.h"
 %}
 %include "std_vector.i"
 namespace std {
   %template(IntVector) vector<int>;
   %template (DoubleVector) vector<double>;
 }
 %include "sortinglib.h"