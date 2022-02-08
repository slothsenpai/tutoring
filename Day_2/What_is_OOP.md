## What is Object-Oriented Programming?  
  
Object-oriented programming is an approach to writing software where data and the procedures used to manipulate that data  
are stored in something called an **object**.  
    
This approach allows programmers to package their procedures alongside the relevant data. These objects can then be created and  
used without the user needing to know the inner workings of said object. This "hiding" of the data and logic within an object is  
known as **encapsulation**.  
  
The data that an object contains are known as its **data members** or **members** while the procedures that an object can  
perform is known as its **methods**.  
  
Together, the data members and methods encapsulated within an object form a sort of contract for a programmer. As long as the programmer knows  
the externally facing fields and methods of an object, then they should be able to effectively use that object in their program!  
  
In Java, objects are defined via **classes**. You can think of these classes as blueprints which Java uses to create objects. Much like  
an actual blueprint, many objects can be created, or **instantiated** from a single class definition.
  
## Scope  
  
Since any programmer with access to your class is able to create an object from it and use it, there may be certain data members or methods  
you wish to expose. There may also be data members or methods you wish to hide from other programmers. Java has three keywords  
which you can use to control what is or isn't shown to the outside world. These keywords are **public**, **private**, **protected**, and none (literally nothing).  
These three keywords are used to define the **scope** of data members and methods within an object.  
  
If a data member or method is defined as public, then anyone who can instantiate that object can use those members or methods.  
  
If a data member or method is defined as private, then only the object itself can access that member or use that method.  
  
Protected is similar to private but we'll skip protected and none for now. Try to remember that they exist as we'll come back to them later when we cover **packages**.