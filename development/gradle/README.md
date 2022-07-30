# Gradle Development

## Init
Gradle `init` initialises a new Gradle project in an empty folder.
The `init` task uses the `wrapper` task to create a Gradle wrapper
script, `gradlew`.

## Example
```bash
$ mkdir demo && cd demo
$ gradle init
$ select application, Java, Groovy, JUnit 4 (defaults)
```

## Project Generation
Gradle `init` generates different directories:

- gradle: Folder for the Gradle wrapper files
- gradlew && gradlew.bat: Gradle wrapper start scripts
- settings.gradle: Settings file to define build name and subprojects
- app/build.gradle: Build script of `app` project
- app/src/main/java: Default Java source folder
- app/test/java: Default test source folder

## Gradle Settings
The `settings.gradle` file has 2 interesting lines:

```groovy
rootProject.name = 'demo'
include('app')
```

- `rootProject.name`: assigns name to build, overrides default
behaviour of naming build after directory it's in.
- `include('app')`: defines that build consists of one subproject
called `app` that contains actual code and build logic. More 
subprojects can be added by additional `include(...)` statements.

## build.gradle

```groovy
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    id 'application'
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation 'org.junit.jupiter:junit-jupiter:5.8.1'

    // This dependency is used by the application.
    implementation 'com.google.guava:guava:30.1.1-jre'
}

application {
    // Define the main class for the application.
    mainClass = 'demo.App'
}

tasks.named('test') {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
```

## Run Application
With the `application` plugin, can run the application directly
from the command line. The `run` task tells Gradle to execute 
the `main` method in the class assigned to the `mainClass` property.