# Java Basics

## Java Project Overview, Compilation and Execution
Java project contains single directory inside which all Java source
files are stored. Java files are usually not stored directly inside
source directory, but in subdirectories matching their package structure.

Source directory often called `src` but not required. In Maven, use
a different directory structure, where source code is stored in 
`src/main/java` directory.

Compile all source code in "source", compiler produces one .class file
for each .java file. The .class is the byte code for .java files.

.class files is what are executed by the JVM. Therefore it is normal
to separate .java files from .class files.

## Compile Java Source Code
Can use Java compiler that comes with the SDK. To compile Java source code:

- Open terminal
- Go to project root directory
- Ensure root directory has a source and class directory
- `javac {source}/{package}/*.java -d {class directory}`
- `java -cp out/production/basics basics.MyJavaApp`

## Java Core Concepts
Java is a platform with many subtopics and concepts. There a handful of
core concepts that are essential to understand.

### Variables
Each variable has a data type which determines what data can be stored,
along with what operations you can execute on it.

### Operations
Operations in Java are the instructions used to process data in variables.
Some can read and write values of variables, while others control the 
program flow. Most important operations are:

Variable operations:

- variable assignment of values
- variable reading of values
- variable arithmetic
- object instantiation

Program flow:

- for loops
- while loops
- if statement (branches)
- switch statement
- method calls

### Classes and Objects
Classes group variables and operations together in coherent modules. Can
have fields, constructors and methods.

Objects are instances of classes - creating an object will be an object of
a certain class. Class is a template showing how objects should look.

### Interfaces
Interfaces is a central concept in Java. Interface describes what methods a
certain object should have available on it. Class can implement an interface.
When class implements an interface, class has to implement all methods described
in the interface.

### Packages
A package is a directory containing 