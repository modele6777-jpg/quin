package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q45 implements c98, zbe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q45(int i, yga ygaVar, yga ygaVar2) {
        this.a = i;
        this.b = ygaVar;
        this.c = ygaVar2;
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        yga ygaVar = (yga) this.b;
        yga ygaVar2 = (yga) this.c;
        xga xgaVar = (xga) obj;
        xgaVar.getClass();
        xgaVar.t(this.a, ygaVar, ygaVar2);
    }

    @Override // defpackage.zbe
    public Object p() {
        lp0 lp0Var = (lp0) this.b;
        ((gg7) lp0Var.e).w((qq0) this.c, this.a + 1, false);
        return null;
    }

    public /* synthetic */ q45(lp0 lp0Var, qq0 qq0Var, int i) {
        this.b = lp0Var;
        this.c = qq0Var;
        this.a = i;
    }
}
