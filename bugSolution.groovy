```groovy
class MyClass {
    def myMethod(param) {
        if (param == null || !(param instanceof String)) {
            return 0 // Handle null and non-String inputs gracefully
        }
        return param.length()
    }
}
```