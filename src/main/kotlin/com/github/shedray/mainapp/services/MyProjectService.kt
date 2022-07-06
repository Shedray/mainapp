package com.github.shedray.mainapp.services

import com.intellij.openapi.project.Project
import com.github.shedray.mainapp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
