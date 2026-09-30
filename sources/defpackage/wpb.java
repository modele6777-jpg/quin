package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wpb extends n1 implements tv2 {
    public final /* synthetic */ og2 b;
    public final /* synthetic */ xpb c;

    /* JADX WARN: Illegal instructions before constructor call */
    public wpb(og2 og2Var, xpb xpbVar) {
        qk6 qk6Var = qk6.w;
        this.b = og2Var;
        this.c = xpbVar;
        super(qk6Var);
    }

    @Override // defpackage.tv2
    public final void G(pv2 pv2Var, Throwable th) throws Throwable {
        og2 og2Var = this.b;
        xpb xpbVar = this.c;
        xo1.S(th, new ad1(7, og2Var, xpbVar));
        tv2 tv2Var = (tv2) xpbVar.a.F0(qk6.w);
        if (tv2Var == null) {
            throw th;
        }
        tv2Var.G(pv2Var, th);
    }
}
