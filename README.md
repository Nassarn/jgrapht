# JGraphT

Released: January, 2012</p>

Written by [Barak Naveh](mailto:barak_naveh@users.sourceforge.net)  and Contributors

(C) Copyright 2003-2012, by Barak Naveh and Contributors. All rights
reserved.

Please address all contributions, suggestions, and inquiries to the current project administrator [John Sichi](mailto:perfecthash@users.sf.net)

## Introduction ##

JGraphT is a free Java class library that provides mathematical graph-theory objects and algorithms. It runs on Java 2 Platform (requires JDK 1.6 or later).

JGraphT is licensed under the terms of the GNU Lesser General Public License (LGPL). A copy of the [license](license-LGPL.txt) is included in the download.

Please note that JGraphT is distributed WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

Please refer to the license for details.

## Contents ##

- `README.md` this file
- `CONTRIBUTORS.md` list of contributors
- `HISTORY.md` changelog
- `licence-LGPL.txt` GNU Lesser General Public License
- `javadoc/` Javadoc documentation
- `lib/` JGraphT libraries:
- `jgrapht-core-x.y.z.jar` core library
- `jgrapht-demo-x.y.z.jar` demo classes
- `jgrapht-ext-x.y.z.jar` extensions
- `jgrapht-x.y.z-combined.jar` all libraries rolled into one
- `jgraph-a.b.c.jar` JGraph dependency library
- `source/` complete source tree used to build this release
- `pom.xml` Maven project file

## Getting Started ##

The package `org.jgrapht.demo` includes small demo applications to help you get started. If you spawn your own demo app and think others can use it, please send it to us and we will add it to that package.

## Upgrading Versions ##

To help upgrading, JGraphT maintains a one-version-backwards compatibility. While this compatibility is not a hard promise, it is generally respected. (This policy was not followed for the jump from `0.6.0` to `0.7.0` due to the pervasive changes required for generics.) You can upgrade via:

- **The safe way** : compile your app with the JGraphT version that immediately follows your existing version and follow the deprecation notes, if they exist, and modify your application accordingly. Then move to the next version, and on, until you're current.
- **The fast way** : go to the latest JGraphT right away - if it works, you're done.
  
Reading the [change history](HISTORY.md) is always recommended.

## Documentation ##

A local copy of the Javadoc HTML files is included in this distribution. The latest version of these files is also available [on-line](http://www.jgrapht.org/javadoc).

## Dependencies ##

- JGraphT requires JDK 1.6 or later to build.
- [JUnit](http://www.junit.org) is a unit testing framework. You need JUnit only if you want to run the unit tests.  JUnit is licensed under the terms of the IBM Common Public License.  The JUnit tests included with JGraphT have been created using JUnit `3.8.1`.
- [XMLUnit](http://xmlunit.sourceforge.net) extends JUnit with XML capabilities. You need XMLUnit only if you want to run the unit tests.  XMLUnit is licensed under the terms of the BSD
    License.
- [JGraph](http://sourceforge.net/projects/jgraph) is a graph visualization and editing component. You need JGraph only if you want to create graph visualizations using the JGraphT-to-JGraph adapter. JGraph is licensed     under the terms of the GNU Lesser General Public License (LGPL). 
- [Touchgraph](http://sourceforge.net/projects/touchgraph) is a graph visualization and layout component. You need Touchgraph only if you want to create graph visualizations using the JGraphT-to-Touchgraph converter. Touchgraph is licensed under the terms of an Apache-style License.

## Online Resources ##

The JGraphT website is at [http://www.jgrapht.org](http://www.jgrapht.org). You can use this site to:

- **Obtain the latest version**: latest version and all previous versions of JGraphT are available online.
- **Report bugs**: if you have any comments, suggestions or bugs you want to report.
- **Get support**: if you have questions or need help with JGraphT.

There is also a [wiki](http://wiki.jgrapht.org) set up for everyone in the JGraphT community to share information about the project.

Source code is hosted on [github](https://github.com/jgrapht/jgrapht). You can send contributions as pull requests there.

## Your Improvements ##

If you add improvements to JGraphT please send them to us as pull requests on github. We will add them to the next release so that everyone can enjoy them. You might also benefit from it: others may fix bugs in your source files or may continue to enhance them.

## Thanks ##

With regards from

[Barak Naveh](mailto:barak_naveh@users.sourceforge.net), JGraphT Project Creator

[John Sichi](mailto:perfecthash@users.sourceforge.net), JGraphT Project Administrator
