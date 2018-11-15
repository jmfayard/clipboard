
// buildSrc/src/main/kotlin/Config.kt
object Config {
  const val applicationId = "de.fayard.xxx"
  const val compileSdkVersion = 27
  const val targetSdkVersion = 27
  const val minSdkVersion = 21
  const val versionName = "1.0"
  const val versionCode = 1


    val forceDependencyVersions = listOf(
            Libs.appcompat_v7, Libs.preference_v7, Libs.constraint_layout, Libs.design,
            Libs.design, Libs.percent, Libs.kotlin_reflect, Libs.kotlin_test, Libs.kotlin_stdlib,
            Libs.recyclerview_v7, Libs.support_core_utils
    )

    val pluginsResolution: Map<String, String> = mapOf(
        "com.android.application" to Libs.com_android_tools_build_gradle,
        "com.android.library" to Libs.com_android_tools_build_gradle,
        "kotlin-android" to Libs.kotlin_gradle_plugin,
        "kotlin-kapt" to Libs.kotlin_gradle_plugin,
        "io.fabric" to Libs.io_fabric_tools_gradle,
        "com.getkeepsafe.dexcount" to Libs.dexcount_gradle_plugin
    )
}

