// Root settings.gradle.kts
pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
    }

    resolutionStrategy {
        eachPlugin {
            Config.pluginsResolution[requested.id.id]?.let { classpathForRequestedPlugin ->
                useModule(classpathForRequestedPlugin)
            }
        }
    }
}
rootProject.name = "android-kotlin-magellan"
