```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return 0 // Handle null gracefully
        }
        return param.length() // This will throw an exception if param is not a String
    }
}
```