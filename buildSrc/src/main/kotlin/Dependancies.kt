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
    }

    const val junitAPI = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
}

object Plugins {
    private object Versions {
        const val errorprone = "2.4.0"
    }

    const val errorProne = "com.google.errorprone:error_prone_core:${Versions.errorprone}"
}
