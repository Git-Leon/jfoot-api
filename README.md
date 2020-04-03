# JFoot Framework
The purpose of this repository is to provide an elegant solution for developing graphical computer programs,  such  as  simulations and games, using the Java Programming Language and the JFoot environment, a decoration of a Greenfoot environment.

## Usage
* This dependency is hosted on [packagecloud.io](https://packagecloud.io/git-leon/greenfoot/)

### Step 1 - Add Maven Repository to `pom.xml`
* Because this dependency is hosted on a private server, not MavenCentral, the `pom.xml` must be configured to search in the proper repository.

```xml
<repositories>
  <repository>
    <id>git-leon-greenfoot</id>
    <url>https://packagecloud.io/git-leon/greenfoot/maven2</url>
    <releases>
      <enabled>true</enabled>
    </releases>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
```

### Step 2 - Add Maven Dependency to `pom.xml`
* To use this project, add the dependency to your `pom.xml`

```xml
<dependency>
  <groupId>com.github.git-leon</groupId>
  <artifactId>jfoot-api</artifactId>
  <version>1.0.2</version>
</dependency>
```



## Background
For years, I have been fascinated with the idea of building Greenfoot applications without using the Greenfoot framework. Eventually, I stumbled upon [this blog post](https://blog.lerk.io/making-games-with-greenfoot-without-greenfoot/) which discusses how to "run Greenfoot environment independently of the Greenfoot framework". I was inspired to, not only follow this blog post to locally replicate what is being proposed, but also create a snapshot of the environment by jarring the application, and deploying it to a java artifact repository. Finally, I created `jfoot-api-1.0.1` and, iterations after it , to decorate the original `Greenfoot` framework with additional classes, and interfaces aimed at enabling development for scalable and maintainable applications.
