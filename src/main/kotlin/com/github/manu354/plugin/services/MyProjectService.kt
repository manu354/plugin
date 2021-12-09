package com.github.manu354.plugin.services

import com.intellij.openapi.project.Project
import com.github.manu354.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
