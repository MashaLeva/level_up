# JP Solid Examples

## 1) Single Responsibility Principle(S.R.P)
The *PrintProperty* class is responsible of printing the "Properties", 
while *Property* is just responsible of the definition of a "Property".

## 2) Open-Closed Principle
The classes *Rental* and *Sale* are types of a *Property*, so we can 
add more types without adding code to the base class.

## 3) Liskov Substitution Principle
*IProperty*

## 4) Interface Segregation Principle
*HasRoom*, *HasKitchen* are interfaces to determine the spaces that a
*Property* has. *Apartment* and *House* could have rooms, but *Office* 
doesn't.

## 5) Dependency Inversion Principle



