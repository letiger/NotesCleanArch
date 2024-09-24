plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.devtools.ksp)
    alias(libs.plugins.dagger.hilt.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.letier.brandon.notescleanarch"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.letier.brandon.notescleanarch"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        packaging {
            resources {
                excludes += arrayOf(
                    "/META-INF/{AL2.0,LGPL2.1}",
                    "META-INF/DEPENDENCIES",
                    "META-INF/AL2.0",
                    "META-INF/LGPL2",
                    "META-INF/LGPL2.1",
                    "META-INF/*.kotlin_module",
                    "**/attach_hotspot_windows.dll",
                    "META-INF/LICENSE.md",
                    "META-INF/licenses/ASM",
                    "META-INF/gradle/incremental.annotation.processors",
                    "META-INF/LICENSE-notice.md"
                )
            }
        }

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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures.compose = true
    buildToolsVersion = "34.0.0"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.room.ktx)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui.graphics.android)
    implementation(libs.hilt.compiler)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.activity.compose)
    annotationProcessor(libs.androidx.room.compiler)
    implementation(libs.androidx.runner)
    implementation(libs.hilt.android.testing)
    implementation(libs.androidx.annotation)
    testImplementation(libs.junit)
    kspAndroidTest(libs.hilt.compiler)
    androidTestImplementation(libs.hilt.android.testing)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    ksp(libs.hilt.android.compiler)
}