plugins {
    jacoco
    id("template.kotlin-common-conventions")
}

dependencies {
    //Testing dependencies
    testImplementation(Test.junitAPI)
    testRuntimeOnly(Test.junitEngine)
    testImplementation(Test.mockk)
    testImplementation(Test.kotlinTestAssertions)
}

tasks.test {
    // Use junit platform for unit tests
    systemProperty("junit.jupiter.execution.parallel.enabled", "false")
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


