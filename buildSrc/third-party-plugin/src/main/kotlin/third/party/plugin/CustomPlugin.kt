package third.party.plugin

import core.api.Extension
import core.api.PublicPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        project.plugins.withType(PublicPlugin::class.java) {
            val extension = project.extensions.getByType(Extension::class.java)


        }
    }
}