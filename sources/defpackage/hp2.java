package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hp2 extends gbe implements l26 {
    final /* synthetic */ m7 $accountDataClear;
    final /* synthetic */ Context $context;
    final /* synthetic */ wt2 $mainViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp2(wt2 wt2Var, m7 m7Var, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$mainViewModel = wt2Var;
        this.$accountDataClear = m7Var;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hp2(this.$mainViewModel, this.$accountDataClear, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            jzb.q(obj);
            gp2 gp2Var = new gp2(jzb.p(new uo2(i2, this.$mainViewModel)));
            cp2 cp2Var = new cp2(this.$accountDataClear, this.$context);
            this.label = 1;
            Object objB = gp2Var.b(cp2Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((hp2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
