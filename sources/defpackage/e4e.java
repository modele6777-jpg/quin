package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e4e extends gbe implements l26 {
    final /* synthetic */ vyb $response;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4e(vyb vybVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$response = vybVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new e4e(this.$response, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                this.label = 1;
                vfh.o(this);
                return bw2Var;
            }
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            throw new nt7();
        } catch (Throwable th) {
            this.$response.close();
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((e4e) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
