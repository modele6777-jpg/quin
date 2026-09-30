package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zbb extends gbe implements a26 {
    final /* synthetic */ int $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbb(int i, xn2 xn2Var) {
        super(1, xn2Var);
        this.$result = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new zbb(this.$result, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.label = 1;
            Object objQ = vfh.q(5000L, this);
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
        return Boolean.valueOf(this.$result >= 2);
    }
}
