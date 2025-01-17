// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellExport extends HaskellCompositeElement {

  @Nullable
  HaskellCname getCname();

  @NotNull
  List<HaskellCnameDotDot> getCnameDotDotList();

  @Nullable
  HaskellCon getCon();

  @Nullable
  HaskellConid getConid();

  @Nullable
  HaskellModid getModid();

  @Nullable
  HaskellQCon getQCon();

}
