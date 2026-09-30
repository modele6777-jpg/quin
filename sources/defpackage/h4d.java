package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h4d extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        h4d h4dVar = new h4d(3, (xn2) obj3);
        h4dVar.L$0 = (lb8) obj;
        h4dVar.L$1 = (QuotaUsage) obj2;
        return h4dVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        lb8 lb8Var = (lb8) this.L$0;
        QuotaUsage quotaUsage = (QuotaUsage) this.L$1;
        if (this.label == 0) {
            jzb.q(obj);
            return new iy9(lb8Var, quotaUsage);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
