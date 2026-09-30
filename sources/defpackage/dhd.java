package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dhd extends gbe implements a26 {
    final /* synthetic */ s7a $record;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhd(s7a s7aVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$record = s7aVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new dhd(this.$record, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            chd chdVar = ihd.c;
            s7a s7aVar = this.$record;
            this.label = 1;
            Object objC = chdVar.c(s7aVar, this);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
