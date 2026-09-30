package defpackage;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gjd extends i09 implements pn4, al9 {
    public n4d E0;
    public DropShadowPainter F0;
    public x4d Z;

    @Override // defpackage.al9
    public final void A0() {
        this.F0 = null;
        qn4.G(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gjd)) {
            return false;
        }
        gjd gjdVar = (gjd) obj;
        return pa7.t(this.Z, gjdVar.Z) && pa7.t(this.E0, gjdVar.E0);
    }

    public final int hashCode() {
        return this.E0.hashCode() + (this.Z.hashCode() * 31);
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        DropShadowPainter dropShadowPainter;
        DropShadowPainter dropShadowPainter2 = this.F0;
        if (dropShadowPainter2 == null) {
            ta0 ta0VarB = vd0.q0(this).b();
            x4d x4dVar = this.Z;
            n4d n4dVar = this.E0;
            ta0VarB.getClass();
            DropShadowPainter dropShadowPainter3 = new DropShadowPainter(x4dVar, n4dVar, ta0VarB);
            this.F0 = dropShadowPainter3;
            dropShadowPainter = dropShadowPainter3;
        } else {
            dropShadowPainter = dropShadowPainter2;
        }
        vv7 vv7Var = (vv7) im2Var;
        fy9.h(dropShadowPainter, im2Var, vv7Var.a.f(), 0.0f, 6);
        vv7Var.a();
    }
}
