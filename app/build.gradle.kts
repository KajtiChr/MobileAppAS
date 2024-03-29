plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "pl.chrzanowski.javademoapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "pl.chrzanowski.javademoapp"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
//        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(platform("com.google.firebase:firebase-bom:32.7.2"))

    implementation("com.google.firebase:firebase-analytics")

    implementation("com.google.firebase:firebase-core:21.1.1")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("info.hoang8f:fbutton:1.0.5")
    implementation("com.rengwuxian.materialedittext:library:2.1.4")



    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


}