package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y43 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6d b;

    public /* synthetic */ y43(x6d x6dVar, int i) {
        this.a = i;
        this.b = x6dVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        x6d x6dVar = this.b;
        int iIntValue = ((Integer) obj).intValue();
        l46 l46Var = (l46) obj2;
        ((Integer) obj3).getClass();
        switch (i) {
            case 0:
                l46Var.f0(-2099161404);
                String strQ = afc.q(h7d.i((e8d) x6dVar.c.get(iIntValue)), l46Var);
                l46Var.r(false);
                return strQ;
            case 1:
                l46Var.f0(-1873342379);
                String strQ2 = afc.q(h7d.i((e8d) x6dVar.c.get(iIntValue)), l46Var);
                l46Var.r(false);
                return strQ2;
            default:
                l46Var.f0(1933596486);
                String strQ3 = afc.q(h7d.i((e8d) x6dVar.c.get(iIntValue)), l46Var);
                l46Var.r(false);
                return strQ3;
        }
    }
}
