plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlinx.serialization)
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.gradle.catalog.update)
    implementation(libs.gradle.versions)
}
