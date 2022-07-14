package jss.intellij.ide.file_view

import jss.intellij.language.JssBundle
import jss.intellij.language.JssLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class JssFileType private constructor() : LanguageFileType(JssLanguage) {
    override fun getName(): String = JssBundle.message("filetype.name")

    override fun getDescription(): String = JssBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "jss"

    override fun getIcon(): Icon = JssIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = JssFileType()
    }
}