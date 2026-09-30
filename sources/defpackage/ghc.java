package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ghc implements zhc {
    public static final vea k = new vea(7, new qdc(9), new pdc(15));
    public final sz9 a;
    public float g;
    public final sz9 b = new sz9(0);
    public final sz9 c = new sz9(0);
    public final vz9 d = q1c.f(Boolean.FALSE);
    public final u69 e = new u69();
    public final sz9 f = new sz9(Integer.MAX_VALUE);
    public final os3 h = new os3(new ckb(9, this));
    public final mx3 i = zrd.b(new xc2(this, 1));
    public final mx3 j = zrd.b(new xc2(this, 2));

    public ghc(int i) {
        this.a = new sz9(i);
    }

    public static Object f(ghc ghcVar, int i, gbe gbeVar) {
        Object objX = eb3.x(ghcVar, i - ghcVar.a.j(), new fxd(7, null), gbeVar);
        return objX == bw2.a ? objX : wef.a;
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.zhc
    public final Object b(s89 s89Var, l26 l26Var, zn2 zn2Var) {
        Object objB = this.h.b(s89Var, l26Var, zn2Var);
        return objB == bw2.a ? objB : wef.a;
    }

    @Override // defpackage.zhc
    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void g(int i) {
        sz9 sz9Var = this.a;
        this.f.k(i);
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            if (sz9Var.j() > i) {
                sz9Var.k(i);
            }
        } finally {
            iqf.p(irdVarJ, irdVarL, a26VarE);
        }
    }
}
