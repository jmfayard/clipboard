// buildSrc/src/main/kotlin

import org.gradle.api.Task
import org.gradle.api.tasks.TaskContainer

/**
 * Replacement for groovy's deprecated left shift operator
 * https://docs.gradle.org/3.2/release-notes.html#the-left-shift-operator-on-the-task-interface
 *

```kotlin
tasks.newTask(name = "hello1", description = "Prints Hello World") {
println("Hello World 1")
}
tasks.newTask(name = "hello2", dependsOn = listOf(":hello1")) {
println("Hello World 2")
}
```

 */

const val CUSTOM = "Custom"

fun TaskContainer.newTask(
    name: String,
    description: String = "",
    group: String = CUSTOM,
    dependsOn: List<String> = emptyList(),
    dependsOnTasks: List<Task> = emptyList(),
    doLast: () -> Unit = {}
) {
    this.register(name) {
        this.group = group
        this.description = description
        this.dependsOn.addAll(dependsOn)
        this.dependsOn.addAll(dependsOnTasks)
        doLast {
            doLast()
        }
    }
}

// // missing in the kotlin dsl
// fun DependencyHandler.`api`(deps: List<String>) {
//    for (dep in deps) add("api", dep)
// }
