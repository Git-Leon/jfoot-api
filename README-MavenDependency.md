# greenfoot.maven-jetpacksurvivor
The purpose of this repository is to

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
  <artifactId>greenfoot-jetpacksurvivor</artifactId>
  <version>1.0</version>
</dependency>
```
