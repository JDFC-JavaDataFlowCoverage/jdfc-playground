# jdfc-playground

This project serves as a testing ground for [JDFC](https://github.com/blochmat/jdfc) and the [JDFC Intellij plugin](https://github.com/blochmat/jdfc-intellij-plugin).

## Use JDFC Maven Plugin

### Clean Project
```
delete all directories despite .idea and src
```

### Checkout JDFC
```shell
git checkout git@github.com:blochmat/jdfc.git
```

### Build JDFC and add it to local Maven Repository
```shell
cd <path-to-jdfc>
mvn clean install
```

### Configure Maven Plugin in pom.xml
```
<plugin>
    <groupId>com.jdfc</groupId>
    <artifactId>jdfc-maven-plugin</artifactId>
    <version>1.0-SNAPSHOT</version>
    <configuration>
        <scope>intra or inter</scope>
        <createXml>true or false</createXml>
        <createHtml>true or false</createHtml>
    </configuration>
    <executions>
        <execution>
            <id>jdfc-instrument</id>
            <phase>validate</phase>
            <goals>
                <goal>instrument</goal>
            </goals>
        </execution>
        <execution>
            <id>jdfc-report</id>
            <phase>prepare-package</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

### Run analysis
```shell
cd <path-to-jdfc-playground>
mvn clean install
```

### Find results
```
- instrumented classes: ./.jdfc-instrumented
- debug info: ./jdfc-debug
- report: ./target/jdfc-report
```

## Use JDFC Intellij Plugin (unavailable)
Install JDFC Maven plugin:
mvn install:install-file -Dfile=./external_jars/jdfc-maven-plugin-1.0-SNAPSHOT-jar-with-dependencies.jar -DgroupId=com.jdfc -DartifactId=jdfc-maven-plugin -Dversion=1.0-SNAPSHOT -Dpackaging=jar

Install JDFC IntelliJ plugin: 
- Open IntelliJ
- Select File -> Settings -> Plugins
- Select the gear wheel at the top of the window
- Select "Install Plugin from Disk"
- In the project select "external_jars/jdfc-intellij-plugin-1.0-SNAPSHOT.jar"

Executing the analysis:
- Run "mvn clean install"

Open a class file via JDFC IntelliJ Plugin:
- Prerequisite: Test file is open
- Select "JDFC" -> "Open class file"
