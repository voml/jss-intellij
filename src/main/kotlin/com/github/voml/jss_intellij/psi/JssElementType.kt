package com.github.voml.jss_intellij.psi

import com.github.voml.jss_intellij.JssLanguage
import com.intellij.psi.tree.IElementType

class JssElementType(debugName: String) : IElementType(debugName, JssLanguage.INSTANCE)
