package defpackage;

import java.util.List;
import tech.chatmind.api.ClaimReadingsResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h6a extends gbe implements l26 {
    final /* synthetic */ List<String> $chatIds;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i6a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6a(i6a i6aVar, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = i6aVar;
        this.$chatIds = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        h6a h6aVar = new h6a(this.this$0, this.$chatIds, xn2Var);
        h6aVar.L$0 = obj;
        return h6aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                i6a i6aVar = this.this$0;
                List<String> list = this.$chatIds;
                yt6 yt6Var = i6aVar.b;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = ((uke) yt6Var).a(list, this);
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
            dzbVar = (ClaimReadingsResponse) obj;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        i6a i6aVar2 = this.this$0;
        List<String> list2 = this.$chatIds;
        if (!(dzbVar instanceof dzb)) {
            ClaimReadingsResponse claimReadingsResponse = (ClaimReadingsResponse) dzbVar;
            m8b m8bVarD = i6aVar2.d();
            int claimedCount = claimReadingsResponse.getClaimedCount();
            int size = list2.size();
            int failedCount = claimReadingsResponse.getFailedCount();
            int size2 = k7a.c().size();
            StringBuilder sbN = ib8.n(claimedCount, size, "pending reading claim drained: ", "/", ", failed=");
            sbN.append(failedCount);
            sbN.append(", pending=");
            sbN.append(size2);
            m8bVarD.e(sbN.toString());
            if (claimReadingsResponse.getFailedCount() == 0) {
                k7a.a();
            } else {
                int size3 = list2.size();
                hs3 hs3Var = xqa.g;
                int iIntValue = ((Number) z5c.I(nu4.a, new w6a(hs3Var.a, hs3Var.b, null))).intValue() + 1;
                Integer numValueOf = Integer.valueOf(iIntValue);
                ynb.V(lw2.a, null, null, new f7a(hs3Var.a, numValueOf, null), 3);
                if (iIntValue >= 5) {
                    i6aVar2.d().b(kv2.h(iIntValue, size3, "pending reading claim given up after ", " attempts, dropping ", " ids"));
                    k7a.a();
                }
            }
        }
        i6a i6aVar3 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            i6aVar3.d().c("pending reading claim retry failed (transient); keeping for next launch", thA);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h6a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
