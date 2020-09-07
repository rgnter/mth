# Mth
Math utilities for Spigot/PaperMC (Anything based on Bukkit API)

# Contents
- cartesian to polar coordinates 
- cartesian to spherical coordinates
- polar to cartesian coordinates 
- spherical to cartesian coordinates
- Yaw to degrees
- Pitch to degrees
- Degrees to yaw
- Degrees to pitch
- Decimal round
- RGB to encoded int

# For devs
This project is compiled via [Apache Maven](https://maven.apache.org/) (For more info see **Compiling**). 
We use [Jetbrains annotations](https://mvnrepository.com/artifact/org.jetbrains/annotations/16.0.1) for javadoc code documentation & inspection.
### Maven dependency
Repository:
```xml
<repository>
    <id>rgnt-repo</id>
    <url>http://nexus.realmland.eu/nexus/content/repositories/rgnt-repo/</url>
</repository>
```
Dependency:
```xml
<dependency>
  <groupId>xyz.rgnt</groupId>
  <artifactId>mth</artifactId>
  <version>1.0-release</version>
</dependency>
```


### Compiling
Project is compiled via maven command: `mvn clean package`. Resulting JAR file can be found in directory `target/mth-{VERSION}-{BUILD TYPE}.jar`

### Contributors
- *Project owner & developer*: [**rgnt**](https://rgnter.github.io)
