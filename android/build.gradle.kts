import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
}

group = "com.example.flutter_pty"
version = "1.0"

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "com.example.flutter_pty"

    // Latest stable compile SDK
    compileSdk = 37

    // Latest NDK
    ndkVersion = "30.0.14904198"

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    externalNativeBuild {
        cmake {
            path = file("../src/CMakeLists.txt")
        }
    }

    buildFeatures {
        prefab = false
    }

    lint {
        abortOnError = false
    }
}