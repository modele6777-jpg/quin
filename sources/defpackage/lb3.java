package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lb3 extends gbe implements l26 {
    final /* synthetic */ List<kb3> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb3(List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.$migrations = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lb3 lb3Var = new lb3(this.$migrations, xn2Var);
        lb3Var.L$0 = obj;
        return lb3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jc3 jc3Var = (jc3) this.L$0;
            pb3 pb3Var = rxg.g;
            List<kb3> list = this.$migrations;
            this.label = 1;
            Object objA = pb3Var.a(list, jc3Var, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lb3) k((xn2) obj2, (jc3) obj)).r(wef.a);
    }
}
