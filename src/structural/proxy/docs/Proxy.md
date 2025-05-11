# Proxy Pattern

Proxy is a **structural design pattern** that lets you provide a substitute or placeholder for another
object.

A proxy controls access to the original object, **allowing you to perform something either before or
after the request gets through to the original object**.

## Problem

you have a massive object that consumes a vast amount of system resources.

You need it from time to time, but not always.

You could implement **lazy initialization** : create this object only when it's actually needed.

object's clients would need to execute some deferred initialization code.

Unfortunately, this would probably cause a lot of code duplication.

In an ideal world, we'd want to put this code directly into our object's class, but that isn't
always possible.

For instance, class may be part of a closed 3rd-party library.

## Solution

_The Proxy pattern suggests that you create a new proxy class with the same interface as an original
service object._

Then you update your app so that it passes the proxy object to all the original object's clients.

Upon receiving a request from a client, the proxy creates a real service object and delegates all
the work to it.

If you need to execute something either before or after the primary logic of the class, the proxy
lets you do this without changing that class.

Since the proxy implements the same interface as the original class, it can be passed to any client
that expects a real service object.

## Applicability

Lazy initialization (**virtual proxy**). This is when you have a heavyweight service object that wastes
system resources by being always up, even though you only need it from time to time.

Access control (**protection proxy**). This is when you want only specific clients to be able to use the
service object.

Local execution of a remote service (**remote proxy**). This is when the service object is located on a
remote server.

Logging requests (**logging proxy**). This is when you want to keep a history of requests to the service
object.

Caching request results (**caching proxy**). This is when you need to cache results of client requests
and manage the life cycle of this cache, especially if results are quite large.

**Smart reference**. This is when you need to be able to dismiss a heavyweight object once there are no
clients that use it.

## How to Implement

- If there's no pre-existing service interface, create one to make proxy and service objects
  interchangeable. Extracting the interface from the service class isn't always possible, because
  you'd need to change all service's clients to use that interface.
- Create the proxy class. It should have a field for storing a reference to the service.
- Implement the proxy methods according to their purposes.
- Consider introducing a creation method that decides whether the client gets a proxy or a real
  service.
- Consider implementing lazy initialization for the service object.

## Pros and Cons

- You can control the service object without clients knowing about it.
- You can manage the lifecycle of the service object when clients don't care about it.
- The proxy works even if the service object isn't ready or is not available.
- You can introduce new proxies without changing the service or clients. (open / closed principle)
- The code may become more complicated since you need to introduce a lot of new classes.
- The response from the service might get delayed.