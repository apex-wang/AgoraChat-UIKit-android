buildscript {
    dependencies {
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.9.10")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.android.library") version "8.1.0" apply false
}

if(!project.hasProperty("isAarRelease")){
    project.ext.set("isAarRelease", false)
}
if(!project.hasProperty("isLite")){
    project.ext.set("isLite", false)
}
if(!project.hasProperty("sdkVersion")){
    project.ext.set("sdkVersion", "4.6.1")
}
if(!project.hasProperty("isTravis")) {
    project.ext.set("isTravis", false)
}