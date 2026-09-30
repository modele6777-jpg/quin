package androidx.compose.ui.graphics.shadow;

import defpackage.c82;
import defpackage.cv7;
import defpackage.e47;
import defpackage.fy9;
import defpackage.g21;
import defpackage.gv;
import defpackage.mh3;
import defpackage.n4d;
import defpackage.sn4;
import defpackage.ta0;
import defpackage.w79;
import defpackage.x4d;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "Lfy9;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class InnerShadowPainter extends fy9 {
    public final x4d f;
    public final n4d g;
    public final ta0 v;
    public float w = 1.0f;
    public c82 x;

    public InnerShadowPainter(x4d x4dVar, n4d n4dVar, ta0 ta0Var) {
        this.f = x4dVar;
        this.g = n4dVar;
        this.v = ta0Var;
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
        e47 e47Var;
        ta0 ta0Var = this.v;
        x4d x4dVar = this.f;
        long jF = sn4Var.f();
        cv7 layoutDirection = sn4Var.getLayoutDirection();
        n4d n4dVar = this.g;
        synchronized (ta0Var) {
            gv gvVar = (gv) ta0Var.b;
            if (gvVar == null) {
                gv gvVar2 = new gv(g21.f, 0L, cv7.a, 1.0f, null);
                ta0Var.b = gvVar2;
                gvVar = gvVar2;
            }
            gvVar.a = x4dVar;
            gvVar.b = jF;
            gvVar.c = layoutDirection;
            gvVar.d = sn4Var.getDensity();
            gvVar.e = n4dVar;
            w79 w79Var = (w79) ta0Var.d;
            if (w79Var == null) {
                w79Var = new w79();
                ta0Var.d = w79Var;
            }
            e47 e47Var2 = (e47) w79Var.g(gvVar);
            if (e47Var2 == null) {
                e47Var2 = new e47(n4dVar, x4dVar.a(jF, layoutDirection, sn4Var));
                w79 w79Var2 = (w79) ta0Var.d;
                if (w79Var2 == null) {
                    w79Var2 = new w79();
                    ta0Var.d = w79Var2;
                }
                w79Var2.m(gv.a(gvVar), e47Var2);
            }
            e47Var = e47Var2;
        }
        c82 c82Var = this.x;
        long jF2 = sn4Var.f();
        n4d n4dVar2 = this.g;
        e47Var.b(sn4Var, c82Var, jF2, n4dVar2.e, n4dVar2.f, mh3.n(this.w * n4dVar2.g, 0.0f, 1.0f), this.g.d);
    }

    @Override // defpackage.fy9
    public final void f(cv7 cv7Var) {
    }
}
