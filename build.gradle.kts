buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("com.android.tools.build:gradle:4.2.0")
    }
}

group = "me.vlad"
version = "1.0"

allprojects {
    repositories {
        mavenCentral()
    }
}