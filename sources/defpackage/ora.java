package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ora extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ora(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ora oraVar = new ora(this.$accountId, xn2Var);
        oraVar.L$0 = obj;
        return oraVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List list = bsa.a;
        String str = this.$accountId;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p79Var.d(bsa.j((hs3) it.next(), str).a);
        }
        p79Var.d(bsa.i(xqa.V0, this.$accountId).a);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ora oraVar = (ora) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        oraVar.r(wefVar);
        return wefVar;
    }
}
