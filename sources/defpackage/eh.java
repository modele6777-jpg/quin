package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eh extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ fh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(fh fhVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fhVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new eh(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        fh fhVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            fh fhVar2 = this.this$0;
            fab fabVar = fhVar2.Q0;
            this.L$0 = fhVar2;
            this.label = 1;
            Object objB = ((rab) fabVar).b(this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            obj = objB;
            fhVar = fhVar2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fhVar = (fh) this.L$0;
            jzb.q(obj);
        }
        fhVar.T0 = (QuotaUsage) obj;
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((eh) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
