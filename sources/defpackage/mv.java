package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv b;
    public final /* synthetic */ ume c;

    public /* synthetic */ mv(rv rvVar, ume umeVar, int i) {
        this.a = i;
        this.b = rvVar;
        this.c = umeVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 6;
        ume umeVar = this.c;
        rv rvVar = this.b;
        switch (i) {
            case 0:
                lv lvVar = rvVar.f;
                p pVar = new p(5, umeVar);
                mmb mmbVar = new mmb();
                rvVar.e.d("dataBuilder", lvVar, new v6(i2, mmbVar, pVar));
                Object obj = mmbVar.element;
                if (obj != null) {
                    return (tme) obj;
                }
                pa7.g0("result");
                throw null;
            case 1:
                lv lvVar2 = rvVar.g;
                mv mvVar = new mv(rvVar, umeVar, 2);
                mmb mmbVar2 = new mmb();
                rvVar.e.d("positioner", lvVar2, new v6(i2, mmbVar2, mvVar));
                Object obj2 = mmbVar2.element;
                if (obj2 != null) {
                    return (hkb) obj2;
                }
                pa7.g0("result");
                throw null;
            default:
                Object objInvoke = rvVar.c.invoke();
                bv7 bv7Var = (bv7) (((bv7) objInvoke).h() ? objInvoke : null);
                return bv7Var == null ? hkb.e : umeVar.n(bv7Var).k(bv7Var.N(0L));
        }
    }
}
