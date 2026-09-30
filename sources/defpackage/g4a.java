package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g4a extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j4a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4a(j4a j4aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j4aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        g4a g4aVar = new g4a(this.this$0, xn2Var);
        g4aVar.L$0 = obj;
        return g4aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        QuotaUsage quotaUsage = (QuotaUsage) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.d().e("User subscription info updated: " + quotaUsage);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        g4a g4aVar = (g4a) k((xn2) obj2, (QuotaUsage) obj);
        wef wefVar = wef.a;
        g4aVar.r(wefVar);
        return wefVar;
    }
}
