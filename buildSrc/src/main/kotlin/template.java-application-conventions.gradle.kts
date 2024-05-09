/*
 * Apply to create a module that can be run as a CLI application in Java.
 *
 * @author <a href="mailto:colin.redmond@outlook.com"> Colin Redmond </a> (c) 2024.
 */

plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("template.java-common-conventions")

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}
