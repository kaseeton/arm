package com.github.kaseeton.arm.services

import com.intellij.openapi.project.Project
import com.github.kaseeton.arm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
