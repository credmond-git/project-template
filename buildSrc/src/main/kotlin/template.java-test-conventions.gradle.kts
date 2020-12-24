plugins {
    id("template.java-common-conventions")
    jacoco
}

dependencies {
    // Use JUnit Jupiter API for testing.
    testImplementation(Test.junitAPI)

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly(Test.junitEngine)
}

tasks.test {
    // Use junit platform for unit tests
    systemProperty("junit.jupiter.execution.parallel.enabled", "true")
    useJUnitPlatform()
    finalizedBy("jacocoTestReport")
}

//setup Jacoco
apply(plugin = "jacoco")
tasks.withType<JacocoReport> {
    reports {
        xml.isEnabled = true
        html.isEnabled = true
    }
}
