# jdfc-playground

This project serves as a testing ground for [JDFC](https://github.com/blochmat/jdfc) and the [JDFC Intellij plugin](https://github.com/blochmat/jdfc-intellij-plugin).


Install JDFC Maven plugin:
mvn install:install-file -Dfile=./external_jars/jdfc-maven-plugin-1.0-SNAPSHOT-jar-with-dependencies.jar -DgroupId=com.jdfc -DartifactId=jdfc-maven-plugin -Dversion=1.0-SNAPSHOT -Dpackaging=jar

Install JDFC IntelliJ plugin: 
- Open IntelliJ
- Select File -> Settings -> Plugins
- Select the gear wheel at the top of the window
- Select "Install Plugin from Disk"
- In the project select "external_jars/jdfc-intellij-plugin-1.0-SNAPSHOT.jar"