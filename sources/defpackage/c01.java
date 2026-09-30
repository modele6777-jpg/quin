package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends i09 implements kv7, wwc {
    public a26 Z;

    public c01(a26 a26Var) {
        this.Z = a26Var;
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        x4d x4dVar;
        boolean z;
        yf9 yf9VarP0 = vd0.p0(this, 2);
        if (yf9VarP0.e1) {
            x4dVar = yf9VarP0.a1;
            z = yf9VarP0.d1;
        } else {
            g0c g0cVar = bzd.i;
            if (g0cVar == null) {
                bzd.i = new g0c();
            } else {
                g0cVar.a();
            }
            g0c g0cVar2 = bzd.i;
            g0cVar2.getClass();
            g0cVar2.I0 = yf9VarP0.J0.O0;
            g0cVar2.G0 = db6.Y0(yf9VarP0.c);
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                this.Z.d(g0cVar2);
                iqf.p(irdVarJ, irdVarL, a26VarE);
                x4dVar = g0cVar2.Z;
                z = g0cVar2.E0;
            } catch (Throwable th) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                throw th;
            }
        }
        if (z) {
            exc.n(hxcVar, x4dVar);
        }
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l0(21, ceaVarV, this));
    }

    @Override // defpackage.wwc
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.Z + ")";
    }
}
