# FlyWeight

Flyweight is a **structural design pattern** that lets you fit more objects into the available
amount of RAM by **sharing common parts of state between multiple objects** instead of keeping all
data in each object.

## Problem

You created a game with a realistic particle system featuring bullets, missiles, and shrapnel.

While it ran well on your computer, it often crashed on your friend’s computer due to insufficient
RAM.

The issue caused by the particle system: each particle was represented by a memory-heavy object, and
during intense gameplay, the high number of particles exceeded available memory, causing the crash.

## Solution

the color and sprite fields consume a lot more memory than other fields.

these two fields store almost identical data across all particles.

for example, all bullets have the same color and sprite.

other parts of a particle's state, such as coordinates, movement vector and speed, are unique to
each particle.

After all, the values of these fields change over time.

while the color and sprite remain constant for each particle.

This constant data of an object is usually called the **intrinsic state**.

it lives within the object; other obejcts can only read it, not change it.

The rest of the object's state, often altered from the outside by other objects, is called the
**extrinsic state**

The Flyweight pattern suggests that you **stop storing the extrinsic state inside the object**.

Instead, you should pass this state to specific methods which rely on it.

Only the intrinsic state stays within the object, letting you reuse it in different contexts.

As a result, you'd need fewer of these objects since they only differ in the intrinsic state, which
has much fewer variations than the extrinsic.

## Applicability

Use the Flyweight pattern **only when your program must support a huge number of objects** which
barely fit into available RAM.

## Pros and Cons

- You can save lots of RAM, assuming your program has tons of similar objects.
- You might be trading RAM over CPU cycles when some of the context data needs to be recalculated
  each
  time somebody calls a flyweight method.
- The code becomes much more complicated. New team members will always be wondering why the state of
  an entity was separated in such a way.