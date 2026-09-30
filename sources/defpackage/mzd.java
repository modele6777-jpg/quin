package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mzd extends js5 {
    public final /* synthetic */ xsc b;
    public final /* synthetic */ zy1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzd(zy1 zy1Var, xsc xscVar, xsc xscVar2) {
        super(xscVar);
        this.c = zy1Var;
        this.b = xscVar2;
    }

    @Override // defpackage.js5, defpackage.xsc
    public final wsc f(long j) {
        wsc wscVarF = this.b.f(j);
        zsc zscVar = wscVarF.a;
        long j2 = zscVar.a;
        long j3 = zscVar.b;
        long j4 = this.c.b;
        zsc zscVar2 = new zsc(j2, j3 + j4);
        zsc zscVar3 = wscVarF.b;
        return new wsc(zscVar2, new zsc(zscVar3.a, zscVar3.b + j4));
    }
}
