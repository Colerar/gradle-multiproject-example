plugins {
    id("dependency-update")
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.kotlinx.serialization) apply false
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
