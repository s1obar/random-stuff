# DESIGN PATTERNS MODULE

This module covers different design patterns and their implementation in some simple use cases.

## Patterns covered so far

### Creational:

* Factory Method
* Abstract Factory
* Builder
* Prototype
* Singleton:
  * Single threaded version
  * multithreaded version will not work correctly if we do not do it with double-checked 
  locking(DCL - using keywords volatile and synchronized), 
  because multiple threads can get different instances of singleton simultaneously

### Structural:

* Adapter - it makes possible for 2 incompatible objects to collaborate
* Bridge - divides a large class or a set of closely related classes into 2 separate hierarchies
  which can be developed independently(abstraction and implementation)



### Behavioral:



## How to run?

1) open project in your favorite code editor
2) check CustomRunner class 
3) choose which pattern you want to run
4) call the appropriate method for specific pattern

Usually these jobs just log some basic info. In order to see how specific pattern is constructed 
you need to check the code of course. 