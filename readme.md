Appengine, Scalatra and Twirl giter8 template
==============================================

> Naming stuff is hard!

This is a simple g8 template that you can use to build a simple AppEngine webapp that uses

   * [Scalatra](http://www.scalatra.org) for routing
   * [Twirl](https://github.com/spray/twirl) for templating
   * [Google AppEngine](http://appengine.google.com) for hosting

If that matches your requirements, then this is for you.

This does not include an ORM to access the datastore, so native datastore calls are expected.

Enjoy

Michael Brunton-Spall

Requirements
------------

  * [Giter8](https://github.com/n8han/giter8/)
  * [SBT 0.12.1](http://www.scala-sbt.org)

Usage
-----

```
(mbrunton-spall@GNM31330 ~/work)% g8 bruntonspall/appengine-scalatra-twirl.g8
(TODO Insert generated version here)
```
When running an appengine app from scala, you don't use container:start, you use appengine-dev-server.  
I pair it with JREBEL and ~package personally, but your mileage may vary.
