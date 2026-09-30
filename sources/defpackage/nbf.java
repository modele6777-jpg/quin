package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nbf extends gbe implements o26 {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            Throwable th = (Throwable) this.L$0;
            long j = this.J$0;
            ff8.h().g(pbf.a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, pbf.b);
            this.label = 1;
            Object objQ = vfh.q(jMin, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        nbf nbfVar = new nbf(4, (xn2) obj4);
        nbfVar.L$0 = (Throwable) obj2;
        nbfVar.J$0 = jLongValue;
        return nbfVar.r(wef.a);
    }
}
