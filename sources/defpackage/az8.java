package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class az8 extends k1 {
    public final vz9 x;
    public boolean y;

    public az8(Context context) {
        super(context);
        this.x = q1c.f(be2.a);
    }

    @Override // defpackage.k1
    public final void a(int i, l46 l46Var) {
        l46Var.h0(576708319);
        int i2 = (l46Var.i(this) ? 4 : 2) | i;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            ((l26) this.x.getValue()).z(l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wf8(this, i, i3);
        }
    }

    @Override // defpackage.k1
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.y;
    }
}
