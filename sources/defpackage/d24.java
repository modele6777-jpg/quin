package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d24 extends gbe implements l26 {
    final /* synthetic */ nb4 $dao;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d24(nb4 nb4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$dao = nb4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d24(this.$dao, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hs3 hs3Var = xqa.A;
            String str2 = (String) z5c.I(nu4.a, new c24(hs3Var.a, hs3Var.b, null));
            nb4 nb4Var = this.$dao;
            this.L$0 = str2;
            this.label = 1;
            Object objK = urg.K(this, new ia(str2, 19), ((vb4) nb4Var).a, true, false);
            bw2 bw2Var = bw2.a;
            if (objK == bw2Var) {
                return bw2Var;
            }
            obj = objK;
            str = str2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            jzb.q(obj);
        }
        jcc.k(0, "Unsynced (" + str + "): " + ((List) obj).size());
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((d24) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
