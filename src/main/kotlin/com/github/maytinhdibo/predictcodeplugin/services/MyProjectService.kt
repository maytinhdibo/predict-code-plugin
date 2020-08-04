package com.github.maytinhdibo.predictcodeplugin.services

import com.intellij.openapi.project.Project
import com.github.maytinhdibo.predictcodeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
