package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class da3 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ iy9 $previousToday;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da3(Context context, iy9 iy9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$previousToday = iy9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new da3(this.$context, this.$previousToday, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ta3 ta3Var = ta3.a;
            Context context = this.$context;
            iy9 iy9Var = this.$previousToday;
            this.label = 1;
            Object objL = ta3.l(context, iy9Var, this);
            bw2 bw2Var = bw2.a;
            if (objL == bw2Var) {
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
        return ((da3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
