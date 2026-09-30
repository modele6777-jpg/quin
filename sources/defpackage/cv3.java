package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cv3 extends gbe implements l26 {
    final /* synthetic */ int $index;
    final /* synthetic */ nu3 $submissionJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv3(nu3 nu3Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$submissionJob = nu3Var;
        this.$index = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cv3(this.$submissionJob, this.$index, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            nu3 nu3Var = this.$submissionJob;
            this.label = 1;
            obj = nu3Var.H0(this);
            if (obj != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List list = (List) obj;
        if (this.$index >= list.size()) {
            return null;
        }
        nu3 nu3Var2 = (nu3) list.get(this.$index);
        this.label = 2;
        Object objH0 = nu3Var2.H0(this);
        return objH0 == bw2Var ? bw2Var : objH0;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cv3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
