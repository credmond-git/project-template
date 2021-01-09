/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()

    jcenter()
    mavenCentral()
}

dependencies {
    implementation("com.github.ben-manes:gradle-versions-plugin:0.33.0")
    implementation("com.palantir.gradle.gitversion:gradle-git-version:0.12.3")
    implementation("net.ltgt.gradle:gradle-errorprone-plugin:1.2.1")

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.15.0")
}
