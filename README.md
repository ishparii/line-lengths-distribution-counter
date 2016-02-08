[![Build Status](https://travis-ci.org/LoyolaChicagoCode/processtree-scala.svg?branch=master)]
(https://travis-ci.org/LoyolaChicagoCode/processtree-scala)
[![Coverage Status](https://coveralls.io/repos/LoyolaChicagoCode/processtree-scala/badge.svg?branch=master)]
(https://coveralls.io/r/LoyolaChicagoCode/processtree-scala?branch=master)

# Overview

This program reads an arbitrary number of lines from the standard input, 
counts the lines, and keeps track of the distribution of line lengths (including whitespace).

After the end of the input is reached, it prints a text-based histogram 
of the distribution of line lengths: From zero up to the length of the longest line, 
prints the number of lines of that length as a number (possibly zero) and 
as a bar consisting of asterisks (possibly empty). 
It does this in ascending order of lengths. 
At the end, it prints an asterisk and the total number of lines.

# Extra credit

Flush-right align the numbers of lines of each length

# Nonfunctional requirements

language: Scala;
build tool: SBT;
test framework: ScalaTest;
imperative version: a version that uses Scala as a "better Java", 
with mutable variables and data structures;
purely functional version: a version that does not use any mutable state;
testability: the program is modularized in such a way that 
the main line length distribution functionality can be driven
from both an application and test cases and test cases 
do not have to look at unstructured (string) output;
test coverage: 100% (according to the sbt scoverage plugin);
maintainability: followed good style and design principles;
scalability: the program works with arbitrarily large input.

# Usage

To run the tests:

    $ sbt test
    
To run the tests with enabled coverage:

    $ sbt clean coverage test
    
To generate the coverage reports:

    $ sbt coverageReport

To run the main methods:

    $ ps -ef | sbt "runMain edu.luc.etl.osdi.processtree.scala.mutable.Main"
    $ ps -ef | sbt "runMain edu.luc.etl.osdi.processtree.scala.immutable.Main"

On Windows, if you installed [Git](http://git-scm.com/) with the recommended
third option,
*Use Git and optional Unix tools from the Windows Command Prompt*,
then you will have a `ps` command available.