// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssIdiomStatement extends PsiElement {

  @NotNull
  JssIdentifier getIdentifier();

  @NotNull
  JssIdiomMark getIdiomMark();

  @NotNull
  JssValue getValue();

}