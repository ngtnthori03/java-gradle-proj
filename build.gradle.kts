
plugins {
    id("java")
    id("application")
}

repositories {
    mavenCentral()
}

group = "tigi"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

application {
    mainClass = "tigi.Main"
}
