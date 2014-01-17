bug-extension-module-generics
=============================
This repository demonstrates a simple type checking issue for Groovy extension modules

The method "to" is defined as a static method in the classes Normal and ListExtension where ListExtension is a Groovy extension module and Normal a regular class.  Both are type checked.  The test class attempts to call both methods, but the "to" method in the extension class will not type check with the generic parameter.  The program works when type checking is removed.

Using:
* Groovy 2.1.9
* Gradle 1.10
* Java 1.7.0_45

Issue is: http://jira.codehaus.org/browse/GROOVY-6525
