buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
}

tasks.existing(Wrapper::class) {
    gradleVersion = "4.10.2"
    distributionType = Wrapper.DistributionType.ALL
}

description = "Allure Gradle TestNG example"
group = "org.example.allure"
version = version

plugins {
    java
    id("io.qameta.allure") version "2.6.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

val allureVersion = "2.9.0"

allure {
    version = allureVersion
    useTestNG {
        version = allureVersion
    }
    downloadLink = "https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/$allureVersion/allure-commandline-$allureVersion.zip"
}

dependencies {
    implementation("org.testng:testng:6.14.3")
}

tasks.named<Test>("test") {
    useTestNG(closureOf<TestNGOptions> {
        suites("src/test/resources/testng.xml")
    })
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}

repositories {
    mavenLocal()
    jcenter()
}
