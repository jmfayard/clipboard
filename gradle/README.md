// README.md


Gradle Links

-	https://blog.gradle.org/gradle-kotlin-dsl-release-candidate
-	https://github.com/gradle/kotlin-dsl
-	https://guides.gradle.org/creating-new-gradle-builds
-	https://guides.gradle.org/migrating-build-logic-from-groovy-to-kotlin/

My links

- https://github.com/jmfayard/gradle-kotlin-dsl-libs
- https://blog.kotlin-academy.com/gradle-kotlin-the-missing-piece-of-the-puzzle-7528a85f0d2c
- https://proandroiddev.com/android-studio-pro-tips-for-working-with-gradle-8a7aa61a8cc4
- https://plugins.gradle.org/plugin/jmfayard.github.io.gradle-kotlin-dsl-libs
- https://github.com/jmfayard/gradledemo
- [kotlin-dsl author:jmfayard](https://github.com/gradle/kotlin-dsl/issues?utf8=%E2%9C%93&q=author%3Ajmfayard+)



Commands:

```bash
alias gw="sh ./gradlew"

gw syncLibs
gw tasks
gw -m :app:installDebug
gw wrapper
gw help --task wrapper

./gradlew dependencies | pbcopy
pbpaste | grep -- --- | sed 's/^.*--- //' | sed 's# .*$##' | sort -u

# copy paste https://scans.gradle.com/s/royfru3lnamw6/plugins
pbpaste | awk '{print $1}' | sort -u
```
