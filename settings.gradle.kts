enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "multiproject"

include(":project1", ":project2")

includeBuild("build-logic")

