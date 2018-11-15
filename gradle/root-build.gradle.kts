// build.gradle.kts

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


