// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import intellij.haskell.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import scala.Option;
import scala.collection.immutable.Seq;

public class HaskellDerivingDeclarationImpl extends HaskellCompositeElementImpl implements HaskellDerivingDeclaration {

  public HaskellDerivingDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitDerivingDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HaskellInst getInst() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellInst.class));
  }

  @Override
  @NotNull
  public HaskellQName getQName() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellQName.class));
  }

  @Override
  @Nullable
  public HaskellScontext getScontext() {
    return PsiTreeUtil.getChildOfType(this, HaskellScontext.class);
  }

  @Override
  public String getName() {
    return HaskellPsiImplUtil.getName(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return HaskellPsiImplUtil.getPresentation(this);
  }

  @Override
  public Seq<HaskellNamedElement> getIdentifierElements() {
    return HaskellPsiImplUtil.getIdentifierElements(this);
  }

  @Override
  public Option<String> getModuleName() {
    return HaskellPsiImplUtil.getModuleName(this);
  }

}
