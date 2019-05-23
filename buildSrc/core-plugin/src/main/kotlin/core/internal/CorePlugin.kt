@file:Suppress("UnstableApiUsage")

package core.internal

import org.gradle.api.Plugin
import org.gradle.api.Project

class CorePlugin: Plugin<Project> {

    private lateinit var project: Project

    override fun apply(project: Project) {
        this.project = project
        val extension = project.extensions.create("artifacts", ExtensionImpl::class.java)

        project.afterEvaluate {
        }
    }
}