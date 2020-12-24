import com.palantir.gradle.gitversion.VersionDetails

repositories {
    jcenter()
}

plugins {
    id("com.palantir.git-version")
}


val versionDetails: groovy.lang.Closure<VersionDetails> by extra

val details = versionDetails()

println("Git commit details")
println("Branch Name: ${details.branchName}")
println("Full Hash: ${details.gitHashFull}")
println("Git Hash: ${details.gitHash}")
println("Last Tag: ${details.lastTag}")
println("Is Clean Tag: ${details.isCleanTag}")
println("version: ${details.version}")

//Sets all project versions to the last git tag if clean, tag and the git hash otherwise
allprojects {
    version = if(details.isCleanTag) {
        details.lastTag
    } else {
        details.gitHash
    }
}
