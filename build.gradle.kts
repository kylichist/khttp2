import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

//versions
val jsonVersion = "20200518"

val json = "org.json:json:$jsonVersion"

plugins {
    kotlin("jvm") version "1.4.0"
}

group = "com.github.kylichist"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(json)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}