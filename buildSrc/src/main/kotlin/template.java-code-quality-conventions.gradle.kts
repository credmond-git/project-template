import net.ltgt.gradle.errorprone.errorprone

// Add to all modules to apply multiple code quality plugins to your module.

repositories {
    mavenCentral()
}

plugins {
    id("net.ltgt.errorprone")
    checkstyle
    pmd
}

dependencies {
    errorprone(Plugins.errorProne)
}

tasks.withType<JavaCompile>().configureEach {
    options.errorprone.disableWarningsInGeneratedCode.set(true)
}

checkstyle {
    toolVersion = "8.36.2"
    configFile = file(rootDir.path + "/config/checkstyle/google_checks.xml")
    isIgnoreFailures = true
}

pmd {
    isConsoleOutput = true
    toolVersion = "6.21.0"
    rulePriority = 5
    ruleSets = listOf(rootDir.path + "/config/pmd/custom_ruleset.xml")
}
