package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z14 extends gbe implements l26 {
    final /* synthetic */ s7 $accountIdProvider;
    final /* synthetic */ nb4 $dao;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z14(nb4 nb4Var, s7 s7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$dao = nb4Var;
        this.$accountIdProvider = s7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z14(this.$dao, this.$accountIdProvider, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            nb4 nb4Var = this.$dao;
            this.$accountIdProvider.getClass();
            String strA = s7.a();
            this.label = 1;
            Instant instantNow = Instant.now();
            instantNow.getClass();
            obj = j13.a.a(nb4Var, strA, instantNow, this);
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
        h13 h13Var = (h13) obj;
        jcc.k(1, "已插入 " + h13Var.a + " (" + h13Var.c + " bytes)");
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z14) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
