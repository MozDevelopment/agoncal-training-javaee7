# Java EE 7 Training - Antonio Goncalves

[![Build Status][travis-image]][travis-url]

### Antonio Goncalves

Member of Java Community Process on Java EE 6, Java EE 7 and Java EE 8, [Antonio](http://www.antoniogoncalves.org) is primarily a hands on man who advises his customers and develops their architectures.

Co-leader of the [Paris Java User Group](http://www.parisjug.org), co-creator of [Devoxx France](http://www.devoxx.fr), animator of the French Java podcast [Les CastCodeurs](http://lescastcodeurs.com/) and [Java Champion](http://java-champions.java.net/), he will share his experience and passion for software.

Antonio is the author of the Java EE 5, Java EE 6 and Java EE 7 [books](http://antoniogoncalves.org/category/books/).

### Presentation of the course

[Java EE 7](http://jcp.org/en/jsr/summary?id=342) is a simple yet complete platform to build your application. It went all the way through EJB 1.0 with Home, Factories, RMI/IIOP... to simple injectable POJOs running on lightweight containers. Patterns of yesterday became anti-patterns and layering out of fashion.

This 3 days training aims to demystify the new Java EE platform. It combines presentations and hands-on labs to develop a comprehensive application with emphasis on good architecture. Patterns of yesterday becoming today's anti-pattern, the race of decoupling and over layering ... you will learn to use the technical blocks of Java EE 7 (JPA 2.1, EJB 3.2, JTA 1.2, JSF 2.2, Bean Validation 1.1, CDI 1.1, JAX-RS 2.0, JMS 2.0 and Batch 1.0) to best meet the needs of your users. For this training to better meet your expectations, you will have to fill out a brief form to adjust the training to the level of the group.

### Trainees will address the following questions:

* What's new in Java EE 7?
* How to quickly and simply develop an application ?
* Why and how to refactor your architecture to meet new needs?
* What architectures can be modeled with Java EE 7?

### Course Structure

* Day 1 : Java EE, JCP, Java EE 7, JPA 2.1
* Day 2 : EJB 3.2, JTA 1.2, CDI 1.1, Bean Validation 1.1
* Day 3 : JSF 2.2, JAX-RS 2.0, JMS 2.0, Batch 1.0

### Contact me

I mostly give this course in Europe (France/Luxembourg/Germany/UK) on site, [contact me](http://www.antoniogoncalves.org) if you want to have more information.

### Content of the code

The aim of this training course is to learn Java EE 7 while running some code. In an incremental way you will slowly build a web site to CRUD books and CDs through a JSF UI and REST interface. It is a bottom/up approch so in the first labs you will develop the JPA domain  model and then add EJB façades, REST, JSF with the help of Bean Validation and CDI.

### Maven commands

* `mvn clean test` runs all the tests
* `mvn versions:display-plugin-updates` checks plugin versions
* `mvn clean com.github.jeluard:plantuml-maven-plugin:generate` generates PNG images from the PUML files

# Virtual Box

## Content

Password : javaee7

### Commands

* java
* mvn
* standalone.sh (starts WildFly)

### Variables

* $CODE_HOME
* $TOOLS_HOME

## Installation 

Based on [Lubuntu](http://lubuntu.net/).

VBox Guest Addition
/media/osboxes/VBOXADDITIONS
sudo ./VBoxLinuxAdditions.run


Configuration :
* `setxkbmap fr`
* `sudo dpkg-reconfigure keyboard-configuration` (pwd sudo `javaee7`)

Installation :
* `sudo apt-get install openjdk-8-jdk-headless`
* `sudo apt-get install git`
* `sudo apt-get install maven`
* `sudo apt-get install docker.io`
* `sudo apt-get install tree`
* `sudo apt-get install httpie`
* `sudo apt-get install curl`
* `sudo apt-get install virtualbox-guest-additions-iso`
* `sudo apt-get install graphviz`

Update :
* `sudo apt-get update`

# Licensing

<a rel="license" href="http://creativecommons.org/licenses/by-sa/3.0/"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by-sa/3.0/88x31.png" /></a><br />This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-sa/3.0/">Creative Commons Attribution-ShareAlike 3.0 Unported License</a>.

Book - Beginning Java EE 6 with Glassfish
Antonio Goncalves
--
--

[travis-url]: https://travis-ci.org/agoncal/agoncal-training-javaee7
