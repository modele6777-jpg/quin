package defpackage;

import androidx.compose.ui.graphics.shadow.InnerShadowPainter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kjd extends i09 implements pn4, al9 {
    public n4d E0;
    public InnerShadowPainter F0;
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
        if (obj == null || kjd.class != obj.getClass()) {
            return false;
        }
        kjd kjdVar = (kjd) obj;
        return pa7.t(this.Z, kjdVar.Z) && pa7.t(this.E0, kjdVar.E0);
    }

    public final int hashCode() {
        return this.E0.hashCode() + (this.Z.hashCode() * 31);
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        InnerShadowPainter innerShadowPainter;
        InnerShadowPainter innerShadowPainter2 = this.F0;
        if (innerShadowPainter2 == null) {
            ta0 ta0VarB = vd0.q0(this).b();
            x4d x4dVar = this.Z;
            n4d n4dVar = this.E0;
            ta0VarB.getClass();
            InnerShadowPainter innerShadowPainter3 = new InnerShadowPainter(x4dVar, n4dVar, ta0VarB);
            this.F0 = innerShadowPainter3;
            innerShadowPainter = innerShadowPainter3;
        } else {
            innerShadowPainter = innerShadowPainter2;
        }
        vv7 vv7Var = (vv7) im2Var;
        fy9.h(innerShadowPainter, im2Var, vv7Var.a.f(), 0.0f, 6);
        vv7Var.a();
    }
}
