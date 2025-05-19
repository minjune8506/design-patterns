# Factory Method

Factory Method is a **creational design pattern** that _provides an interface for creating objects
in a
superclass, but allows subclasses to alter the type of objects that will be created_.

## Problem

Imagine that you’re creating a logistics management application.

The first version of your app can only handle transportation by trucks, so the bulk of your code
lives inside the `Truck` class.

After a while, your app becomes pretty popular.

Each day you receive dozens of requests from sea transportation companies to incorporate sea
logistics into the app.

At present, most of your code is coupled to the Truck class.

Adding Ships into the app would require making changes to the entire codebase.

Moreover, if later you decide to add another type of transportation to the app, you will probably
need to make all of these changes again.

As a result, you will end up with pretty nasty code, riddled with conditionals that switch the app’s
behavior depending on the class of transportation objects.

## Solution

The Factory Method pattern suggests that you **replace direct object construction calls with calls
to a special factory method**.

the objects are still created via the new operator, but it’s being called from within the factory
method.

Objects returned by a factory method are often referred to as **products**.

**Subclasses can alter the class of objects being returned by the factory method**.

At first glance, this change may look pointless: we just moved the constructor call from one part of
the program to another.

However, now **you can override the factory method in a subclass and change the class
of products being created by the method**.

There’s a slight limitation though: **subclasses may return different types of products only if
these products have a common base class or interface**.

Also, the factory method in the base class should have its return type declared as this interface.

## Applicability

Use the Factory Method when you don’t know beforehand the exact types and dependencies of the
objects your code should work with.

Use the Factory Method when you want to provide users of your library or framework with a way to
extend its internal components.

Use the Factory Method when you want to save system resources by reusing existing objects instead of
rebuilding them each time.

## Pros and Cons

- avoid tight coupling between the creator and the concrete products.
- Single Responsibility Principle. You can move the product creation code into one place in the
  program, making the code easier to support.
- Open/Closed Principle. You can introduce new types of products into the program without breaking
  existing client code.
- The code may become more complicated since you need to introduce a lot of new subclasses to
  implement the pattern.