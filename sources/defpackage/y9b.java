package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y9b implements xj5 {
    public final /* synthetic */ xj5 a;

    public y9b(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        x9b x9bVar;
        QuotaUsage quotaUsage;
        if (xn2Var instanceof x9b) {
            x9bVar = (x9b) xn2Var;
            int i = x9bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9bVar.label = i - Integer.MIN_VALUE;
            } else {
                x9bVar = new x9b(this, xn2Var);
            }
        } else {
            x9bVar = new x9b(this, xn2Var);
        }
        Object obj2 = x9bVar.result;
        int i2 = x9bVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            String str = (String) obj;
            if (str.length() == 0) {
                quotaUsage = null;
            } else {
                xh7 xh7Var = fzc.a;
                quotaUsage = (QuotaUsage) xh7Var.b(hfc.m(xh7Var.b, job.c(QuotaUsage.class)), str);
            }
            x9bVar.L$0 = null;
            x9bVar.L$1 = null;
            x9bVar.L$2 = null;
            x9bVar.L$3 = null;
            x9bVar.label = 1;
            Object objA = this.a.a(quotaUsage, x9bVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
