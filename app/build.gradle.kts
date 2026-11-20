plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.assignmentone"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.assignmentone"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.8.0")
}
