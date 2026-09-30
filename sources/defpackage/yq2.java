package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yq2 extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ Map<String, Object> $snapshot;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq2(String str, Map map, xn2 xn2Var) {
        super(2, xn2Var);
        this.$chatId = str;
        this.$snapshot = map;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yq2 yq2Var = new yq2(this.$chatId, this.$snapshot, xn2Var);
        yq2Var.L$0 = obj;
        return yq2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                String str = this.$chatId;
                uo2 uo2Var = new uo2(2, this.$snapshot);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = hkg.J0(str, uo2Var, this);
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
            dzbVar = (Boolean) obj;
            dzbVar.getClass();
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("ConversationAnalytics").c("Failed to report conversation", thA);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yq2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
