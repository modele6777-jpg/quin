package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dv0 extends gbe implements a26 {
    final /* synthetic */ cv0 $localSession;
    int label;
    final /* synthetic */ ev0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ev0 ev0Var, cv0 cv0Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ev0Var;
        this.$localSession = cv0Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new dv0(this.this$0, this.$localSession, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [vz9] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                ev0 ev0Var = this.this$0;
                ev0Var.c.setValue(this.$localSession);
                cv0 cv0Var = this.$localSession;
                this.label = 1;
                Object objM = cv0Var.b.m(this);
                bw2 bw2Var = bw2.a;
                if (objM != bw2Var) {
                    objM = wefVar;
                }
                if (objM == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            this = this.this$0.c;
            this.setValue(null);
            return wefVar;
        } catch (Throwable th) {
            this.this$0.c.setValue(null);
            throw th;
        }
    }
}
