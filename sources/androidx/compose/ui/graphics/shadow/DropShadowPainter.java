package androidx.compose.ui.graphics.shadow;

import defpackage.aj4;
import defpackage.c82;
import defpackage.fy9;
import defpackage.mh3;
import defpackage.n4d;
import defpackage.nq4;
import defpackage.oq4;
import defpackage.sn4;
import defpackage.vd9;
import defpackage.x4d;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "Lfy9;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class DropShadowPainter extends fy9 {
    public final x4d f;
    public final n4d g;
    public final oq4 v;
    public float w = 1.0f;
    public c82 x;

    public DropShadowPainter(x4d x4dVar, n4d n4dVar, oq4 oq4Var) {
        this.f = x4dVar;
        this.g = n4dVar;
        this.v = oq4Var;
    }

    @Override // defpackage.fy9
    public final boolean b(float f) {
        this.w = f;
        return true;
    }

    @Override // defpackage.fy9
    public final boolean e(c82 c82Var) {
        this.x = c82Var;
        return true;
    }

    @Override // defpackage.fy9
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // defpackage.fy9
    public final void j(sn4 sn4Var) {
        nq4 nq4VarB = this.v.B(this.f, sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var, this.g);
        n4d n4dVar = nq4VarB.i;
        n4d n4dVar2 = this.g;
        float fP0 = sn4Var.p0(aj4.a(n4dVar2.c));
        float fP1 = sn4Var.p0(aj4.b(n4dVar2.c));
        ((vd9) sn4Var.v0().c).I(fP0, fP1);
        try {
            nq4VarB.b(sn4Var, this.x, sn4Var.f(), n4dVar.e, n4dVar.f, mh3.n(this.w * n4dVar.g, 0.0f, 1.0f), n4dVar.d);
        } finally {
            ((vd9) sn4Var.v0().c).I(-fP0, -fP1);
        }
    }
}
