plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.testmvvm12"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.testmvvm12"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
//
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
//
//    // Room
    implementation ("androidx.room:room-runtime:2.2.5")
//    kapt "androidx.room:room-compiler:2.2.5"
//
//    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.2.5")
//
//    // Coroutines
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5'
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5'
//
//    // Coroutine Lifecycle Scopes
//    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
//    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"
//
//    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.6.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.6.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")
//
//    // Navigation Components
//    implementation "androidx.navigation:navigation-fragment-ktx:2.2.1"
//    implementation "androidx.navigation:navigation-ui-ktx:2.2.1"
//
//    // Glide
//    implementation 'com.github.bumptech.glide:glide:4.11.0'
//    kapt 'com.github.bumptech.glide:compiler:4.11.0'
}