# Allure Gradle TestNG Example

This example demonstrates how to use Allure [TestNG](http://testng.org/) adapter with [Gradle](http://www.gradle.org/) build tool.

## Usage

To launch this example install Gradle and run the following command from the root directory:

```bash
$ ./gradlew build
```

You should see failed tests and generated Allure Results files in **build/allure-results** directory.

In order to generate the report run:

```bash
$ ./gradlew allureReport
```

The report will be generated to **build/reports/allure-report** folder.
