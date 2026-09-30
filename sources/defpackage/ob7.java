package defpackage;

import android.content.ClipData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ob7 extends gbe implements l26 {
    final /* synthetic */ ClipData $clip;
    final /* synthetic */ wb7 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob7(ClipData clipData, wb7 wb7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$clip = clipData;
        this.$viewModel = wb7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ob7(this.$clip, this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        CharSequence charSequenceCoerceToText;
        int iO;
        int iO2;
        String string = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$clip.getItemCount() > 0 && (charSequenceCoerceToText = this.$clip.getItemAt(0).coerceToText(cn1.z())) != null) {
            wb7 wb7Var = this.$viewModel;
            if (!v4e.F(charSequenceCoerceToText, "/guestpass-code?", false) && (iO = v4e.O(charSequenceCoerceToText, "code=", 0, false, 6)) >= 0 && (iO2 = v4e.O((string = charSequenceCoerceToText.subSequence(iO + 5, charSequenceCoerceToText.length()).toString()), "&", 0, false, 6)) > 0) {
                string = string.substring(0, iO2);
            }
            if (string != null) {
                wb7Var.getClass();
                wb7Var.g.setValue(string);
                wb7Var.v.setValue(Boolean.TRUE);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ob7 ob7Var = (ob7) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ob7Var.r(wefVar);
        return wefVar;
    }
}
