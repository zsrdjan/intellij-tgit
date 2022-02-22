package com.github.mbinic.intellijtgit.actions

import com.github.mbinic.intellijtgit.TGit
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction

class PullAction : DumbAwareAction() {
    override fun actionPerformed(e: AnActionEvent) {
        TGit.command(e, "pull")
    }
}
