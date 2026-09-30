package androidx.compose.ui.graphics.vector;

import defpackage.ald;
import defpackage.c82;
import defpackage.cv7;
import defpackage.df6;
import defpackage.fy9;
import defpackage.h2e;
import defpackage.jsf;
import defpackage.ks0;
import defpackage.q1c;
import defpackage.qk6;
import defpackage.sn4;
import defpackage.ta0;
import defpackage.vd9;
import defpackage.vz9;
import defpackage.wef;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lfy9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class VectorPainter extends fy9 {
    public final vz9 f = q1c.f(new ald(0));
    public final vz9 g = q1c.f(Boolean.FALSE);
    public final jsf v;
    public final vz9 w;
    public float x;
    public c82 y;

    public VectorPainter(df6 df6Var) {
        jsf jsfVar = new jsf(df6Var);
        jsfVar.f = new h2e(20, this);
        this.v = jsfVar;
        this.w = new vz9(wef.a, qk6.L0);
        this.x = 1.0f;
    }

    @Override // defpackage.fy9
    public final boolean b(float f) {
        this.x = f;
        return true;
    }

    @Override // defpackage.fy9
    public final boolean e(c82 c82Var) {
        this.y = c82Var;
        return true;
    }

    @Override // defpackage.fy9
    /* JADX INFO: renamed from: i */
    public final long getE0() {
        return ((ald) this.f.getValue()).a;
    }

    @Override // defpackage.fy9
    public final void j(sn4 sn4Var) {
        c82 c82Var = this.y;
        jsf jsfVar = this.v;
        if (c82Var == null) {
            c82Var = (c82) jsfVar.g.getValue();
        }
        if (((Boolean) this.g.getValue()).booleanValue() && sn4Var.getLayoutDirection() == cv7.b) {
            long jH0 = sn4Var.H0();
            ta0 ta0VarV0 = sn4Var.v0();
            long jZ = ta0VarV0.z();
            ta0VarV0.p().g();
            try {
                ((vd9) ta0VarV0.c).G(-1.0f, 1.0f, jH0);
                jsfVar.e(sn4Var, this.x, c82Var);
                ks0.t(ta0VarV0, jZ);
            } catch (Throwable th) {
                ks0.t(ta0VarV0, jZ);
                throw th;
            }
        } else {
            jsfVar.e(sn4Var, this.x, c82Var);
        }
        this.w.getValue();
    }
}
