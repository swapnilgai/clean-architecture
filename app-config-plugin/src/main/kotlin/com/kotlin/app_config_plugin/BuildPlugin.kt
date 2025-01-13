package com.kotlin.app_config_plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies

class BuildPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        // Add code to load artifacts/ keystore secrets
    }
}

fun Project.addAndroidDefaultLib(){
    dependencies {
        Dependencies.Shared.androidDefault.forEach { dependencies ->
            implementation(dependencies)
        }
    }

}
fun DependencyHandlerScope.implementation(dependency: Any) = add("implementation", dependency)
