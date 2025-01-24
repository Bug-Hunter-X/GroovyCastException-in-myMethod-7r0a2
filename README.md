# GroovyCastException Bug

This repository demonstrates a subtle bug in Groovy code that leads to a `GroovyCastException`. The `myMethod` in `MyClass` attempts to call `length()` on a parameter that might not be a String, resulting in a runtime exception. 

The solution involves adding a check to handle non-String inputs gracefully.