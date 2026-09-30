package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lhf extends gbe implements l26 {
    int label;
    final /* synthetic */ mhf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhf(mhf mhfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mhfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lhf(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        Object value2;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                mhf mhfVar = this.this$0;
                this.label = 1;
                obj = mhfVar.i(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            QuotaUsage quotaUsage = (QuotaUsage) obj;
            if (quotaUsage != null) {
                mhf mhfVar2 = this.this$0;
                int i2 = mhf.a1;
                mhfVar2.S(quotaUsage);
            }
            s0e s0eVar = this.this$0.S0;
            do {
                value2 = s0eVar.getValue();
            } while (!s0eVar.l(value2, jhf.a((jhf) value2, null, null, false, false, false, false, 127)));
            return wef.a;
        } catch (Throwable th) {
            s0e s0eVar2 = this.this$0.S0;
            do {
                value = s0eVar2.getValue();
            } while (!s0eVar2.l(value, jhf.a((jhf) value, null, null, false, false, false, false, 127)));
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lhf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
