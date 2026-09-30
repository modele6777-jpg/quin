package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zo extends vq0 implements wn5 {
    public final vea a;
    public final bxc b;
    public final AndroidComposeView c;
    public final jkb d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final r69 v;
    public boolean w;

    public zo(vea veaVar, bxc bxcVar, AndroidComposeView androidComposeView, jkb jkbVar, String str) {
        this.a = veaVar;
        this.b = bxcVar;
        this.c = androidComposeView;
        this.d = jkbVar;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw kv2.d("Required value was null.");
        }
        this.g = autofillId;
        this.v = new r69();
    }

    @Override // defpackage.wn5
    public final void a(oo5 oo5Var, oo5 oo5Var2) {
        LayoutNode layoutNodeS0;
        twc twcVarH;
        LayoutNode layoutNodeS1;
        twc twcVarH2;
        AndroidComposeView androidComposeView = this.c;
        vea veaVar = this.a;
        if (oo5Var != null && (layoutNodeS1 = vd0.s0(oo5Var)) != null && (twcVarH2 = layoutNodeS1.H()) != null && k99.E(twcVarH2)) {
            veaVar.w().notifyViewExited(androidComposeView, layoutNodeS1.b);
        }
        if (oo5Var2 == null || (layoutNodeS0 = vd0.s0(oo5Var2)) == null || (twcVarH = layoutNodeS0.H()) == null || !k99.E(twcVarH)) {
            return;
        }
        int i = layoutNodeS0.b;
        jkb jkbVar = this.d;
        LayoutNode layoutNode = (LayoutNode) jkbVar.a.b(i);
        if (layoutNode == null || layoutNode.g == -4) {
            return;
        }
        os osVar = jkbVar.c;
        int iD = jkbVar.d(layoutNode);
        long[] jArr = (long[]) osVar.c;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        veaVar.w().notifyViewEntered(androidComposeView, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
