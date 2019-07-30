# kotlin cheatsheet
## Command line
```
kotlinc
kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar
```

# Geting start with Kotlin
## var vs val
var is a variable
val is a value. It is immutable

## Decompiler
[fernflower](https://github.com/fesh0r/fernflower)

## String Templates

## Using 'if' as an Expression
```
val message = if (str == str1 {
    "Correct"
} else {
    "Wrong"
}
```

## Handle null
```
var str:String? = null
str? = "Give a value"
```

## 'hen' statement is similar with 'switch'
```
when(str) {
    str1 -> print("Correct")
    else -> print("Wrong")
}
```

## 'try' statement
```
val number:Int = try {
    Integer.parseInt(int1)
} catch(e:NumberFormatException) {
    null
}
```

## Looping
```
for (i in 10 downTo 1 step 2 {
}

var ages = TreeMap<String, Int>()
ages = ["Kevin"] = 25
ages = ["Henry"] = 19
for((name, age) in ages) {

}
```

## Exception
var reader = FileReader("filename")
try {
    reader.read()
} catch (e :IOException) {

} finally {

}

# Functions in Kotlin
Don't need to be part of a class
Are introduced with the 'fun' keyword
Can have default parameters
Can have named parameters
Can 'extend' existing types
Support function expressions
```
fun max(a: Int, b: Int): Int = if(a>b) a else b
```

## Calling from Java
=======
# kotlin.demo
