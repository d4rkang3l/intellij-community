/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.codeInsight.intention;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiModifierListOwner;
import com.intellij.psi.PsiNameValuePair;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

/**
 * @author ven
 */
public class AddAnnotationFix extends AddAnnotationPsiFix implements IntentionAction {
  public AddAnnotationFix(@NotNull String fqn, @NotNull PsiModifierListOwner modifierListOwner, @NotNull String... annotationsToRemove) {
    this(fqn, modifierListOwner, PsiNameValuePair.EMPTY_ARRAY, annotationsToRemove);
  }

  public AddAnnotationFix(@NotNull String fqn,
                          @NotNull PsiModifierListOwner modifierListOwner,
                          @NotNull PsiNameValuePair[] values,
                          @NotNull String... annotationsToRemove) {
    super(fqn, modifierListOwner, values, annotationsToRemove);
  }

  @Override
  public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
    return isAvailable();
  }

  @Override
  public void invoke(@NotNull Project project, Editor editor, PsiFile file) throws IncorrectOperationException {
    applyFix();
  }

}
