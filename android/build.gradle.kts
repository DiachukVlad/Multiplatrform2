plugins {
    id("org.jetbrains.compose") version "0.4.0"
    id("com.android.application")
    kotlin("android")
}

group = "me.vlad"
version = "1.0"

repositories {
    google()
    jcenter()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.3.1")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "me.vlad.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}