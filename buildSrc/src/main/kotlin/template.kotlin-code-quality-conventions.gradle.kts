repositories {
    mavenCentral()
    jcenter()
}

plugins {
    id("io.gitlab.arturbosch.detekt")
}

dependencies {
    detektPlugins(Plugins.detekt)
}

detekt {
    toolVersion = Plugins.Versions.detekt
    config = files(project.rootDir.resolve("config/detekt/config.yml"))
    debug = false
    parallel = false
    reports {
        xml.enabled = true
        html.enabled = true
    }
}

tasks.withType<io.gitlab.arturbosch.detekt.Detekt> {
    exclude(".*/resources/.*")
    exclude(".*/tmp/.*")
    exclude(".*/build/.*")
}
