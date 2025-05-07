# Composite

Composite is a **structural design pattern** that lets you compose objects into **tree structures**
and then work with these structures as if they were individual objects.

Using the composite pattern makes sense *only when the core model of your app can be represented as
a tree*

For example, imagine that you have two types of objects: Products and Boxes.

A Box can contain several Products as well as a number of smaller Boxes.

These little Boxes can also hold some Products or even smaller Boxes, and so on,

How would you determine the total price?

The Composite pattern suggests that you work with Products and Boxes through a common interface
which declares a method for calculating the total price.

## Applicability

- Use the Composite pattern when you have to implement a tree-like object structure.
- Use the pattern when you want the client code to treat both simple and complex elements uniformly.

## How to Implement

- Make sure that the core model of your app can be represented as a tree structure.
- Declare the component interface with a list of methods that make sense for both simple and
  acomplex components.
- Create a leaf class to represent simple elements.
- Create a container class to represent complex elements.
    - In this class, provide an array field for storing references to sub-elements.
    - The array must be able to store both leaves and containers
- Finally, define the methods for adding and removal of child elements in the container.

## Pros and Cons

- You can work with complex tree structures more conveniently
- Open/Closed Principle
    - You can introduce new element types into the app without breaking the existing code
- It might be difficult to provide a common interface for classes whose functionality differs too
  much.