# Test Automation Project using Cucumber Selenium Java

Project is created for Backbase, as test assignment.


## Getting Started

It is a Maven Java project that can be cloned, build and run directly.

To build and run all test: 
```$xslt
mvn clean install
```
To run feature specific scenarios. For example To run all scenarios of adding a computer:
```$xslt
mvn clean test -Dcucumber.options="src/test/resources --tags @add"
``` 

To run single scenario. For example To run scenario for mandatory field check:
```$xslt
mvn clean test -Dcucumber.options="src/test/resources --tags @emptyName"
``` 

## Summary

I tried to cover the core functionalities with E2E tests. 
I tried to make tests not flaky by adding proper expected conditions for webelements.

With given more time, code can be refactored and improved.

