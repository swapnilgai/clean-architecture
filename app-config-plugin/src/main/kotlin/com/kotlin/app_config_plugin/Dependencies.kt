package com.kotlin.app_config_plugin

object Dependencies {
    const val androidXCore = "androidx.core:core-ktx:${Version.androidXCore}"
    const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val junit = "junit:junit:${Version.junit}"
    const val junitTestExt = "androidx.test.ext:junit:${Version.junitTestExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
    const val material = "com.google.android.material:material:${Version.material}"
    const val koinAndroid = "io.insert-koin:koin-android:${Version.koinVersion}"
    const val koinTest = "io.insert-koin:koin-android-test:${Version.koinVersion}"
    const val androidCoreKtx = "androidx.core:core-ktx:${Version.androidktxCore}"
    const val androidKotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlinVersion}"
    const val koin = "io.insert-koin:koin-core:${Version.koin}"

    object Shared {

        val androidNetwork = listOf(
            "org.jetbrains.kotlinx:kotlinx-serialization-core:${Version.serialization}",
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}",
            "io.ktor:ktor-client-core:${Version.ktor}",
            "io.ktor:ktor-client-content-negotiation:${Version.ktor}",
            "io.ktor:ktor-serialization-kotlinx-json:${Version.ktor}",
            "io.ktor:ktor-client-logging:${Version.ktor}",
            koin,
            "co.touchlab:kermit:${Version.kermit}",
        )

        val androidDefault = listOf(
            "androidx.compose.ui:ui:${Version.compose}",
            "androidx.compose.ui:ui-tooling:${Version.compose}",
            "androidx.compose.ui:ui-tooling-preview:${Version.compose}",
            "androidx.compose.foundation:foundation:${Version.compose}",
            "androidx.compose.material:material-icons-extended:${Version.compose}",
            "androidx.compose.material3:material3:${Version.material3}",
            "androidx.activity:activity-compose:${Version.activity}",
            "androidx.navigation:navigation-compose:${Version.navigation}",
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}",
            "io.insert-koin:koin-android:${Version.koinVersion}",
            "io.insert-koin:koin-androidx-compose:${Version.koinCompose}",
            "io.coil-kt:coil-compose:${Version.coil}",
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}",
            "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}",
            "androidx.lifecycle:lifecycle-runtime-compose:${Version.lifecycle}",
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.lifecycle}",
            "androidx.compose.runtime:runtime:${Version.compose}",
            "androidx.compose.compiler:compiler:${Version.compose}"
        )

    }
}