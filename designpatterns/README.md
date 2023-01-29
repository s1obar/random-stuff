# DESIGN PATTERNS MODULE

This module covers different design patterns and their implementation in some simple use cases.

## Patterns covered so far

### Creational:

* Factory Method - separates product's construction code from the code that uses this product
  and in this way loosens the coupling of a given code - ***TRANSPORT FACTORY***
* Abstract Factory - allows you to produce families of related objects without specifying their 
  concrete classes - ***VEHICLES FACTORY***
* Builder - produces different types of an objects using the same construction process - ***HOUSE BUILDER***
* Prototype - delegates the cloning process to the actual objects that are being cloned - ***CLONING A PERSON***
* Singleton - only one instance of its kind exists and provides one point of access to it - ***CREATING AN INSTANCE OF ANY OBJECT***
  * Single threaded version
  * multithreaded version will not work correctly if we do not do it with double-checked 
    locking(DCL - using keywords volatile and synchronized), 
    because multiple threads can get different instances of singleton simultaneously

### Structural:

* Adapter - it makes possible for 2 incompatible objects to collaborate - ***VOLTAGE ADAPTER***
* Bridge - divides a large class or a set of closely related classes into 2 separate hierarchies
  which can be developed independently(abstraction and implementation) - ***REMOTE CONTROL***



### Behavioral:



## How to run?

1) open project in your favorite code editor
2) check CustomRunner class 
3) choose which pattern you want to run
4) call the appropriate method for specific pattern

Usually these jobs just log some basic info. In order to see how specific pattern is constructed 
you need to check the code of course. 