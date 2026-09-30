package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nf2 extends k1 {
    public final vz9 x;
    public boolean y;

    public nf2(Context context) {
        super(context);
        this.x = q1c.f(null);
    }

    @Override // defpackage.k1
    public final void a(int i, l46 l46Var) {
        l46Var.h0(420213850);
        int i2 = (l46Var.i(this) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l26 l26Var = (l26) this.x.getValue();
            if (l26Var == null) {
                l46Var.f0(-1238823553);
            } else {
                l46Var.f0(98585282);
                l26Var.z(l46Var, 0);
            }
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i1(this, i, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return nf2.class.getName();
    }

    @Override // defpackage.k1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.y;
    }

    public final void setContent(l26 l26Var) {
        this.y = true;
        this.x.setValue(l26Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
