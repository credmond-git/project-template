
plugins {
    base

    id("template.dependency-update-conventions")
    id("template.git-version-conventions")
    idea
}

allprojects {
    group = "template"
}
