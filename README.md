Spring Core with XML Configuration
=====================

Spring Core, Bean configuration and dependency injection with XML 


### Setup Eclipse Project

* Create New Java project
* Craete libs directory and add dependent Libery, Spring framework jar
* Copy all dependent Spring jar to the directory 
* Add External Jar, Project --> property --> Java Build Path --> Add External Libraries



### Steps

* Define the dependency interface and class
* Create a constructure in your class for injection
* Configure the dependency injection in Spring configuration file


#### Define Dependency class

* Create FortuneService interface
* implement FortuneService interface with HappyFortuneService
* Create Couch interface
* implement Couch interface with 


#### Create dependency injection

Create constructure dependency injection in HappyFortuneService

```
public BaseballCoach(FortuneService service) {
	fortuneService = service;
}
```

#### Configure the dependency injection

configure the Bean

```
	<bean id="baseballCouch"
			class="com.arifrajib.springcorexml.BaseballCoach">
		<!-- Setup Constructure Inhection -->	
	<constructor-arg ref="myFortune" />
```

#### Create application context container

Create application context

```
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
```

Call the Bean

```
System.out.println(theCoutch.getDailyFortune());
```
