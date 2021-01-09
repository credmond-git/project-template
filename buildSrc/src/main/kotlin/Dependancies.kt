object Application {
    object Versions {
        const val log4j = "2.13.3"
    }

    object Logging {
        const val log4japi = "org.apache.logging.log4j:log4j-api:${Versions.log4j}"
        const val log4jCore = "org.apache.logging.log4j:log4j-core:${Versions.log4j}"
    }
}

object Test {
    private object Versions {
        const val junit5 = "5.7.0"
        const val mockk = "1.10.2"
        const val kotlinTestAssertions = "4.3.0"
    }

    const val junitAPI = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"

    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val kotlinTestAssertions = "io.kotest:kotest-assertions-core-jvm:${Versions.kotlinTestAssertions}"
}

object Plugins {
    object Versions {
        const val errorprone = "2.4.0"
        const val detekt = "1.15.0"
    }

    const val errorProne = "com.google.errorprone:error_prone_core:${Versions.errorprone}"
    const val detekt = "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.detekt}"
}
