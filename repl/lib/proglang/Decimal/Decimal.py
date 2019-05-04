# This file was automatically generated by SWIG (http://www.swig.org).
# Version 3.0.12
#
# Do not make changes to this file unless you know what you are doing--modify
# the SWIG interface file instead.

from sys import version_info as _swig_python_version_info
if _swig_python_version_info >= (2, 7, 0):
    def swig_import_helper():
        import importlib
        pkg = __name__.rpartition('.')[0]
        mname = '.'.join((pkg, '_Decimal')).lstrip('.')
        try:
            return importlib.import_module(mname)
        except ImportError:
            return importlib.import_module('_Decimal')
    _Decimal = swig_import_helper()
    del swig_import_helper
elif _swig_python_version_info >= (2, 6, 0):
    def swig_import_helper():
        from os.path import dirname
        import imp
        fp = None
        try:
            fp, pathname, description = imp.find_module('_Decimal', [dirname(__file__)])
        except ImportError:
            import _Decimal
            return _Decimal
        try:
            _mod = imp.load_module('_Decimal', fp, pathname, description)
        finally:
            if fp is not None:
                fp.close()
        return _mod
    _Decimal = swig_import_helper()
    del swig_import_helper
else:
    import _Decimal
del _swig_python_version_info

try:
    _swig_property = property
except NameError:
    pass  # Python < 2.2 doesn't have 'property'.

try:
    import builtins as __builtin__
except ImportError:
    import __builtin__

def _swig_setattr_nondynamic(self, class_type, name, value, static=1):
    if (name == "thisown"):
        return self.this.own(value)
    if (name == "this"):
        if type(value).__name__ == 'SwigPyObject':
            self.__dict__[name] = value
            return
    method = class_type.__swig_setmethods__.get(name, None)
    if method:
        return method(self, value)
    if (not static):
        if _newclass:
            object.__setattr__(self, name, value)
        else:
            self.__dict__[name] = value
    else:
        raise AttributeError("You cannot add attributes to %s" % self)


def _swig_setattr(self, class_type, name, value):
    return _swig_setattr_nondynamic(self, class_type, name, value, 0)


def _swig_getattr(self, class_type, name):
    if (name == "thisown"):
        return self.this.own()
    method = class_type.__swig_getmethods__.get(name, None)
    if method:
        return method(self)
    raise AttributeError("'%s' object has no attribute '%s'" % (class_type.__name__, name))


def _swig_repr(self):
    try:
        strthis = "proxy of " + self.this.__repr__()
    except __builtin__.Exception:
        strthis = ""
    return "<%s.%s; %s >" % (self.__class__.__module__, self.__class__.__name__, strthis,)

try:
    _object = object
    _newclass = 1
except __builtin__.Exception:
    class _object:
        pass
    _newclass = 0

class SwigPyIterator(_object):
    __swig_setmethods__ = {}
    __setattr__ = lambda self, name, value: _swig_setattr(self, SwigPyIterator, name, value)
    __swig_getmethods__ = {}
    __getattr__ = lambda self, name: _swig_getattr(self, SwigPyIterator, name)

    def __init__(self, *args, **kwargs):
        raise AttributeError("No constructor defined - class is abstract")
    __repr__ = _swig_repr
    __swig_destroy__ = _Decimal.delete_SwigPyIterator
    __del__ = lambda self: None

    def value(self) -> "PyObject *":
        return _Decimal.SwigPyIterator_value(self)

    def incr(self, n: 'size_t'=1) -> "swig::SwigPyIterator *":
        return _Decimal.SwigPyIterator_incr(self, n)

    def decr(self, n: 'size_t'=1) -> "swig::SwigPyIterator *":
        return _Decimal.SwigPyIterator_decr(self, n)

    def distance(self, x: 'SwigPyIterator') -> "ptrdiff_t":
        return _Decimal.SwigPyIterator_distance(self, x)

    def equal(self, x: 'SwigPyIterator') -> "bool":
        return _Decimal.SwigPyIterator_equal(self, x)

    def copy(self) -> "swig::SwigPyIterator *":
        return _Decimal.SwigPyIterator_copy(self)

    def next(self) -> "PyObject *":
        return _Decimal.SwigPyIterator_next(self)

    def __next__(self) -> "PyObject *":
        return _Decimal.SwigPyIterator___next__(self)

    def previous(self) -> "PyObject *":
        return _Decimal.SwigPyIterator_previous(self)

    def advance(self, n: 'ptrdiff_t') -> "swig::SwigPyIterator *":
        return _Decimal.SwigPyIterator_advance(self, n)

    def __eq__(self, x: 'SwigPyIterator') -> "bool":
        return _Decimal.SwigPyIterator___eq__(self, x)

    def __ne__(self, x: 'SwigPyIterator') -> "bool":
        return _Decimal.SwigPyIterator___ne__(self, x)

    def __iadd__(self, n: 'ptrdiff_t') -> "swig::SwigPyIterator &":
        return _Decimal.SwigPyIterator___iadd__(self, n)

    def __isub__(self, n: 'ptrdiff_t') -> "swig::SwigPyIterator &":
        return _Decimal.SwigPyIterator___isub__(self, n)

    def __add__(self, n: 'ptrdiff_t') -> "swig::SwigPyIterator *":
        return _Decimal.SwigPyIterator___add__(self, n)

    def __sub__(self, *args) -> "ptrdiff_t":
        return _Decimal.SwigPyIterator___sub__(self, *args)
    def __iter__(self):
        return self
SwigPyIterator_swigregister = _Decimal.SwigPyIterator_swigregister
SwigPyIterator_swigregister(SwigPyIterator)

class _string_list(_object):
    __swig_setmethods__ = {}
    __setattr__ = lambda self, name, value: _swig_setattr(self, _string_list, name, value)
    __swig_getmethods__ = {}
    __getattr__ = lambda self, name: _swig_getattr(self, _string_list, name)
    __repr__ = _swig_repr

    def iterator(self) -> "swig::SwigPyIterator *":
        return _Decimal._string_list_iterator(self)
    def __iter__(self):
        return self.iterator()

    def __nonzero__(self) -> "bool":
        return _Decimal._string_list___nonzero__(self)

    def __bool__(self) -> "bool":
        return _Decimal._string_list___bool__(self)

    def __len__(self) -> "std::vector< std::string >::size_type":
        return _Decimal._string_list___len__(self)

    def __getslice__(self, i: 'std::vector< std::string >::difference_type', j: 'std::vector< std::string >::difference_type') -> "std::vector< std::string,std::allocator< std::string > > *":
        return _Decimal._string_list___getslice__(self, i, j)

    def __setslice__(self, *args) -> "void":
        return _Decimal._string_list___setslice__(self, *args)

    def __delslice__(self, i: 'std::vector< std::string >::difference_type', j: 'std::vector< std::string >::difference_type') -> "void":
        return _Decimal._string_list___delslice__(self, i, j)

    def __delitem__(self, *args) -> "void":
        return _Decimal._string_list___delitem__(self, *args)

    def __getitem__(self, *args) -> "std::vector< std::string >::value_type const &":
        return _Decimal._string_list___getitem__(self, *args)

    def __setitem__(self, *args) -> "void":
        return _Decimal._string_list___setitem__(self, *args)

    def pop(self) -> "std::vector< std::string >::value_type":
        return _Decimal._string_list_pop(self)

    def append(self, x: 'std::vector< std::string >::value_type const &') -> "void":
        return _Decimal._string_list_append(self, x)

    def empty(self) -> "bool":
        return _Decimal._string_list_empty(self)

    def size(self) -> "std::vector< std::string >::size_type":
        return _Decimal._string_list_size(self)

    def swap(self, v: '_string_list') -> "void":
        return _Decimal._string_list_swap(self, v)

    def begin(self) -> "std::vector< std::string >::iterator":
        return _Decimal._string_list_begin(self)

    def end(self) -> "std::vector< std::string >::iterator":
        return _Decimal._string_list_end(self)

    def rbegin(self) -> "std::vector< std::string >::reverse_iterator":
        return _Decimal._string_list_rbegin(self)

    def rend(self) -> "std::vector< std::string >::reverse_iterator":
        return _Decimal._string_list_rend(self)

    def clear(self) -> "void":
        return _Decimal._string_list_clear(self)

    def get_allocator(self) -> "std::vector< std::string >::allocator_type":
        return _Decimal._string_list_get_allocator(self)

    def pop_back(self) -> "void":
        return _Decimal._string_list_pop_back(self)

    def erase(self, *args) -> "std::vector< std::string >::iterator":
        return _Decimal._string_list_erase(self, *args)

    def __init__(self, *args):
        this = _Decimal.new__string_list(*args)
        try:
            self.this.append(this)
        except __builtin__.Exception:
            self.this = this

    def push_back(self, x: 'std::vector< std::string >::value_type const &') -> "void":
        return _Decimal._string_list_push_back(self, x)

    def front(self) -> "std::vector< std::string >::value_type const &":
        return _Decimal._string_list_front(self)

    def back(self) -> "std::vector< std::string >::value_type const &":
        return _Decimal._string_list_back(self)

    def assign(self, n: 'std::vector< std::string >::size_type', x: 'std::vector< std::string >::value_type const &') -> "void":
        return _Decimal._string_list_assign(self, n, x)

    def resize(self, *args) -> "void":
        return _Decimal._string_list_resize(self, *args)

    def insert(self, *args) -> "void":
        return _Decimal._string_list_insert(self, *args)

    def reserve(self, n: 'std::vector< std::string >::size_type') -> "void":
        return _Decimal._string_list_reserve(self, n)

    def capacity(self) -> "std::vector< std::string >::size_type":
        return _Decimal._string_list_capacity(self)
    __swig_destroy__ = _Decimal.delete__string_list
    __del__ = lambda self: None
_string_list_swigregister = _Decimal._string_list_swigregister
_string_list_swigregister(_string_list)

class Decimal(_object):
    __swig_setmethods__ = {}
    __setattr__ = lambda self, name, value: _swig_setattr(self, Decimal, name, value)
    __swig_getmethods__ = {}
    __getattr__ = lambda self, name: _swig_getattr(self, Decimal, name)
    __repr__ = _swig_repr

    def __init__(self, number: 'std::string'):
        this = _Decimal.new_Decimal(number)
        try:
            self.this.append(this)
        except __builtin__.Exception:
            self.this = this
    __swig_destroy__ = _Decimal.delete_Decimal
    __del__ = lambda self: None

    def value(self) -> "void":
        return _Decimal.Decimal_value(self)
Decimal_swigregister = _Decimal.Decimal_swigregister
Decimal_swigregister(Decimal)

def Addition(number: 'Decimal', number2: 'Decimal') -> "Decimal":
    return _Decimal.Addition(number, number2)
Addition = _Decimal.Addition

def Subtraction(number: 'Decimal', number2: 'Decimal') -> "Decimal":
    return _Decimal.Subtraction(number, number2)
Subtraction = _Decimal.Subtraction

def Multiply(number: 'Decimal', number2: 'Decimal') -> "Decimal":
    return _Decimal.Multiply(number, number2)
Multiply = _Decimal.Multiply

def Division(number: 'Decimal', number2: 'Decimal') -> "Decimal":
    return _Decimal.Division(number, number2)
Division = _Decimal.Division

# This file is compatible with both classic and new-style classes.


