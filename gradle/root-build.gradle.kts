// build.gradle.kts
buildscript {
  repositories {
    jcenter()
    google()
    maven("https://jitpack.io")
  }
  dependencies {
    // Kotlin, Android, ......
  }
}

plugins {
    id("com.gradle.build-scan") version "1.16"
    id("jmfayard.github.io.gradle-kotlin-dsl-libs") version "0.2.6"
    id("org.jlleitschuh.gradle.ktlint") version "6.3.0" apply (false)
}
repositories {
    mavenCentral()
    jcenter()
    google()
    maven("https://jitpack.io")
}


allprojects {

    group = "de.fayard"
    version = "1.0-SNAPSHOT"

    repositories {
        jcenter()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    apply(plugin = "java")
    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
    publishAlways()
}

tasks.withType<Wrapper> {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = Versions.Gradle.currentVersion
}


