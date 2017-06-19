# Scala Giter8 Seed
This is a [Giter8][g8] template for Scala. It has a fairly idiomatic project setup, being only lightly opionated.
 
## Included
Here is what is included and a small rationale for why it is.

### Plugins
My common use case is for open source experimental projects.

- tut: Compiled code samples in your documentation are useful to others, and serve as a great reference for yourself
- header: Automating inserting the used license of the project for every file.
- scalariform: standardized source code formatting
- scalastyle: finds potential/recurrent problems in source code

### Libraries

I include libraries that I frequently use and/or that represent best practices and that themselves have small footprint (in terms of dependencies they include).

- Better-Files: The idiomatic Scala way of accessing filesystems
- Cats: Pure functional programming in Scala
- Enumeratum: De facto standard for writing enumerations (should be substituted with Scala 2.13?)
- Logback classic: No project is complete without logging
- Log4s: Efficient logging when using string interpolations
- Nscala-Time: Idiomatic Scala for date/time calculations
- PureConfig: An idiomatic Scala front-end for Typesafe config
- Refined: Refinement types, for when tagged types are not powerful enough (admittedly, not so frequently)
- Shapeless: De facto standard for generic programming in Scala
- Scalatest: My preferred test DSL
- Scalacheck: My preferred generative testing library
- Scalamock: My preferred mocking library

## Usage
```
sbt new mboogerd/scala-seed.g8
```

License
-------
Written in 2017 by Merlijn Boogerd. Based of [Lightbend's scala-seed](https://github.com/scala/scala-seed.g8).
To the extent possible under law, the author(s) have dedicated all copyright and related and neighboring rights to
this template to the public domain worldwide. This template is distributed without any warranty.
See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
