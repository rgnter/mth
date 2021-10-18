# Mth
*// math //*

Math library for Spigot(or anything based on SpigotAPI - PaperMC, SSSpigot).

# Contents
- Tuples
  - Single, Pair, Triple
  - Complex Single, Complex Pair, Complex Triple
- Cartesian to polar coordinates 
- Cartesian to spherical coordinates
- Polar to cartesian coordinates 
- Spherical to cartesian coordinates
- Two vectors to most/least vectors 
- Yaw to degrees
- Pitch to degrees
- Degrees to yaw
- Degrees to pitch
- Decimal round
- ARGB to int (big-endian)
- RGB to int  (big-endian)
- TriConsumer

# For devs
### Maven dependency
Repository:
```xml
<repository>
    <id>nexus@ethernal</id>
    <url>https://nexus.ethernal.cz/repository/maven/</url>
</repository>
```
Dependency:
```xml
<!-- Source -->
<dependency>
  <groupId>xyz.rgnt</groupId>
  <artifactId>mth</artifactId>
  <version>1.5-release</version>
</dependency>

<!-- JavaDocs -->
<dependency>
  <groupId>xyz.rgnt</groupId>
  <artifactId>mth</artifactId>
  <version>1.5-release</version>
  <classifier>javadoc</classifier>
</dependency>
```
### Compiling
This project requires [lombok plugin](https://plugins.jetbrains.com/plugin/6317-lombok/) for getter/setter code generation and is compiled via [Apache Maven](https://maven.apache.org/). 
We use [Jetbrains annotations](https://mvnrepository.com/artifact/org.jetbrains/annotations/16.0.1) for javadoc code documentation & inspection.
Project can be compiled with shell script `./mth-build`. Resulting JAR file can be found in directory `target/mth-{VERSION}-{BUILD TYPE}.jar`

### Contributors
- *Project owner & developer*: [**rgnt**](https://rgnter.github.io)
