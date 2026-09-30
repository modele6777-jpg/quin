package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lsa extends gbe implements l26 {
    final /* synthetic */ l26 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsa(l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transform = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lsa lsaVar = new lsa(this.$transform, xn2Var);
        lsaVar.L$0 = obj;
        return lsaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p79 p79Var = (p79) this.L$0;
            jzb.q(obj);
            return p79Var;
        }
        jzb.q(obj);
        p79 p79Var2 = new p79(new LinkedHashMap(((p79) this.L$0).a()), false);
        l26 l26Var = this.$transform;
        this.L$0 = p79Var2;
        this.label = 1;
        Object objZ = l26Var.z(p79Var2, this);
        bw2 bw2Var = bw2.a;
        return objZ == bw2Var ? bw2Var : p79Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lsa) k((xn2) obj2, (p79) obj)).r(wef.a);
    }
}
