package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev1 implements n26 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ ev1(float f, float f2, long j) {
        this.a = j;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        j09 j09Var = (j09) obj;
        l46 l46Var = (l46) obj2;
        ((Integer) obj3).getClass();
        j09Var.getClass();
        l46Var.f0(-1310589187);
        sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        float fP0 = sw3Var.p0(this.b);
        float fP1 = sw3Var.p0(this.c);
        boolean zD = l46Var.d(fP0) | l46Var.d(fP1);
        long j = this.a;
        boolean zF = l46Var.f(j) | zD;
        Object objR = l46Var.R();
        if (zF || objR == sf2.a) {
            kv1 kv1Var = new kv1(fP0, fP1, 0, j);
            l46Var.p0(kv1Var);
            objR = kv1Var;
        }
        j09 j09VarD = j09Var.D(b21.t(g09.a, (a26) objR));
        l46Var.r(false);
        return j09VarD;
    }
}
