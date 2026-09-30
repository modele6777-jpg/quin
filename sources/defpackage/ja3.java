package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ja3 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ iy9 $previousToday;
    final /* synthetic */ iy9 $previousTomorrow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja3(Context context, iy9 iy9Var, iy9 iy9Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$previousToday = iy9Var;
        this.$previousTomorrow = iy9Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ja3(this.$context, this.$previousToday, this.$previousTomorrow, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ta3 ta3Var = ta3.a;
            Context context = this.$context;
            iy9 iy9Var = this.$previousToday;
            iy9 iy9Var2 = this.$previousTomorrow;
            this.label = 1;
            Object objK = ta3Var.k(context, iy9Var, iy9Var2, this);
            bw2 bw2Var = bw2.a;
            if (objK == bw2Var) {
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
        return ((ja3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
