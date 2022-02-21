## Control Structures

So far, we have been writing relatively simple programs without much logic in them. They can take input and print output, which is interesting for a short time, but it quickly becomes apparent that computers wouldn't be much use if this was all they could do!  
In order to make a program more reactive and able to handle complex logic, the concept of **control structures** needs to be introduced. A control structure is a statement which creates a decision point in your program, and they come in a few flavors.  
  
An `if` statement is probably the most common example of a control structure. In an `if` statement, your program will check that some condition is true or false. In the case that the condition is true, the code within the `if` block is executed, otherwise the program will ignore the `if` block and continue past the code within.  
A simple example would be a statement that checks if a number is even.  
  
```java
  if (number % 2 == 0) {
    System.out.println("The number is even!");
  }
  System.out.println("Your number is " + number);
```  
  
In the snippet above, the `if` statement checks that a variable `number` is even by performing **modulo division**. If a number can be divided by two (using integer division) without a remainder, then that number is even. In that case, the print statement within the `if` block is executed and a message is printed to the console. If the number is divided by two, but has a remainder then the number is considered odd and the println within the `if` block is ignored. In either case, the println on line 4 is executed.  
  
An equally common control structure is the `if-else` statement. In this control structure, the `if` statement behaves the same as before, checking that some condition is true; however, the `else` block acts as an alternative choice in the case that the `if` statement is false. Continuing on with the even number example:  
  
```java
  if (number % 2 == 0) {
    System.out.println("The number is even!");
  } else {
    System.out.println("The number is odd!");
  }
  System.out.println("Your number is " + number);
```  
Much like the first code snippet, this snippet uses modulo division to check if the number variable is even. If the number is even, a println stating that the number is even is executed. In this snippet, we now have an alternative path to take in the case that the number variable is not even. In that case, we can assume that the number is odd and execute a println to state such. That is what the `else` block handles in this snippet. As before, the println on line 6 is executed in either case.  
  
`if-else` statements can also be chained together to form `if-else-if` statements which are able of handling multiple conditions. An `if-else-if` statement is capable of checking multiple conditions before resorting either to a final `else` statement, or some other section of code.  
  
```java
  if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz");
  } else if (number % 3 == 0) {
    System.out.println("Fizz");
  } else if (number % 5 == 0) {
    System.out.println("Buzz");
  } else {
    System.out.println(number);
  }
```  
In the code snippet above, multiple `else-if` statements follow the initial `if` statement to form a more complex example. The first `if` statement combines two condition checks. First, the number variable is checked to see if it is evenly divisible by three and then it is checked to see if it is *also* divisible by five. In the case that the number is evenly divisible by both three and five, the program prints "FizzBuzz" to the console. The following `else-if` statement will be checked in the case that the number *is not* divisible by both three and five. In this `else-if` statement, the number variable is only checked to see if it is evenly divisible by three. If it is, "Fizz" is printed to the console. Next, if the number is not divisible by three the program checks to see if it is divisible by five. If the number is divisible by five, "Buzz" is printed to the console. Finally, if none of the previous conditions were met, the number is simply printed to the console.  
  
This code snippet makes up the majority of a common interview question named **FizzBuzz** where a candidate is asked to list all numbers from 1 to 100. In the case that a number is divisible by three, print Fizz. In the case that a number is divisible by five, print Buzz. In the case where the number is divisible by both three and five, print FizzBuzz, otherwise print the number.  
  
The final control structure we'll cover today is the `switch-case` statement. `if-else-if` statements can be chained ad infinitum, but the code becomes a little hard to maintain when you have more than a handful chained together. In situations where you have multiple conditions to check, the `switch-case` statement is generally more appropriate.  
  
```java
  switch(userChoice) {
    case ("A"):
      System.out.println("Option A chosen");
      break;
    case ("B"):
      System.out.println("Option B chosen");
      break;
    case ("C"):
      System.out.println("Option C chosen");
      break;
    case ("D"):
      System.out.println("Option D chosen");
      break;
    case ("E"):
      System.out.println("Option E chosen");
      break;
    default:
      System.out.println("Default option chosen");
      break;
  }
```  
In the snippet above, some variable `userChoice` is checked against the various cases defined in the `switch-case` statement. In the event that the user has chosen "A", "Option A chosen" will be printed to the console. Similarly, if the user has chosen "B", "Option B chosen" will be printed to the console. These checks continue on down to the `default` case, which is an optional case in a `switch-case` statement. The `default` case will be chosen in the event that none of the cases above it have been met. While the `default` case is optional, it is generally good practice to include it as a catch-all in the event that none of the `case` checks are met. `switch-case` statements also require the `break` keyword to denote the end of each case, otherwise the program will "fall through" in to the next case. Here's a small example of that:  
  
```java
  switch(userChoice) {
    case ("deposit"):
      makeDeposit();
      break;
    case ("new account"):
      newAccount();
      break;
    case ("balance"):
      balance();
    default:
      System.out.println("Thanks for using ABC Bank!");
      break;
  }
```  
In the example above, let's say this code is handling a user's choice at an ATM. In the case that the user has chosen "deposit" or "new account", a function will be called to handle those interactions. In the case that the user has chosen "balance" this `switch-case` will print the user's balance and then *fall through* into the `default` case, which simply prints a message thanking the user for using the bank. While this example is a little contrived, there are some valid use cases for having fall through cases within a `switch-case` block.  
  
Happy coding!~  
