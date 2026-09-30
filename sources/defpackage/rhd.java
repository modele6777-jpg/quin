package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rhd extends gbe implements l26 {
    final /* synthetic */ phd $event;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ shd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhd(shd shdVar, phd phdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = shdVar;
        this.$event = phdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rhd rhdVar = new rhd(this.this$0, this.$event, xn2Var);
        rhdVar.L$0 = obj;
        return rhdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        Object dzbVar2;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                shd shdVar = this.this$0;
                phd phdVar = this.$event;
                try {
                    dzbVar2 = shdVar.b.invoke();
                } catch (Throwable th) {
                    dzbVar2 = new dzb(th);
                }
                qu4 qu4Var = qu4.a;
                if (dzbVar2 instanceof dzb) {
                    dzbVar2 = qu4Var;
                }
                l26 l26Var = shdVar.a;
                LinkedHashMap linkedHashMapL = bm8.L((Map) dzbVar2, phdVar.a());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                Object objZ = l26Var.z(linkedHashMapL, this);
                bw2 bw2Var = bw2.a;
                if (objZ == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = wef.a;
        } catch (Throwable th2) {
            dzbVar = new dzb(th2);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("SignUpCompletedTracker").c("Failed to persist sign-up completion", thA);
        }
        return new ezb(dzbVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rhd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
