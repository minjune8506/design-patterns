# Facade Pattern

Facade is a structural design pattern that provides a **simplified** interface to a library, a
framework, or any other complex set of classes.

## Problem

Imagine that you must make your code with a broad set of objects that belong to a sophisticated
library or framework.

Ordinarily, you'd need to initialize all of those objects, keep track of dependencies, execute
methods in the correct order, and so on.

As a result, the business logic of your classes would become tightly coupled to the implementation
details of 3rd-party classes, making it hard to comprehend and maintain.

## Solution

A facade is a class that provides a simple interface to a complex subsystem which contains lots of
moving parts.

A facade might provide limited functionality in comparison to working with the subsystem directly.

However, it includes only those features that clients really care about.

Having a facade is handy when you need to integrate your app with a sophisticated library that has
dozens of features, **but you just need a tiny bit of its functionality**.

## Applicability

Use the Facade pattern when you need to have a limited but straightforward interface to a complex
subsystem.

Use the Facade when you want to structure a subsystem into layers.

## How to implement

- Check whether it's possible to provide a simpler interface than what an existing subsystem already
  provides.

- Declare and implement this interface in a new facade class. The facade should redirect the calls
  from the client code to appropriate objects of the subsystem.

- To get the full benefit from the pattern, make all the client code communicate with the subsystem
  only via the facade. Now the client code is protected from any changes in the subsystem code. For
  example, when a subsystem gets upgraded to a new version, you will only need to modify the code in
  the facade.

- If the facade becomes too big. consider extracting part of its behavior to a new, refined facade
  class.

## Pros and Cons

- You can isolate your code from the complexity of a subsystem.
- A facade can become a **god object** coupled to all classes of an app.
