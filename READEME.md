# Java Notes

## Data types

### Primitive Data types

* byte : 1 byte long.
* short : 2 byte.
* int : 4 byte.
* long : 8 byte.
* float : 4 byte. *ends with f*
* double : 8 byte. *ends with d*
* boolean : 1 bit. **REALLY**
* char : 2 byte. *stores unicode*

### Non Primitive Data types

* Array : Contiguous sequence of data. **Homogenous data structure**.

    ```java
    int arr[] = new int[2];

* String : Character array. *(special data type primitive and non primitive)*
* Classes : User defined.  

## Tokens

>Reserved expressions or words or symbols which have a predefined meaning in the programming language. **cannot be redefined**

* Keywords : Reserved words, eg : boolean, byte, class.
* Identifiers : Variable names declared by the programmer. *(Standard cpp naming rules apply)*
* Constants : Immutable variables.
  
    ```java
    final int i = 5;

* Special symbols : [] , () {} ; * =
* Operators
  * Arithmetic
  * Bitwise
  * Logical
  * Comparison
  
## Data Type Conversions

* Implicit Type Conversion : Smaller size data types are implicitly converted to larger sized variable.
* Explicit Data Type Conversion : If larger sized data type is to be converted in smaller size variable, then it needs to be done explicitly by the programmer and some data would also be lost depending on the conversion.
  
    ```java


    double a = 50.5089898564;
    System.out.println("Double " + a);

    float b = (float)a;
    System.out.println("Float : " + b);

    int c = (int)a;
    System.out.println("Int : " + c);

    ```

    ```shell

    output : Double 50.5089898564
             Float : 50.50899
             Int : 50
    ```

## First Java Program

```java
package test.package1;

public class TestHelloWorld {
 
    public static void main(String commandLineArguments[]) {
        System.out.println("Hello, World");
    } 
}

```

* Package : Something that can group multiple related artifacts together. **First line of a java program**

*
