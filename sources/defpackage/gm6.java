package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gm6 extends gbe implements l26 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ boolean $isLightMode;
    final /* synthetic */ h0e $progress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm6(boolean z, h0e h0eVar, Activity activity, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isLightMode = z;
        this.$progress$delegate = h0eVar;
        this.$activity = activity;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gm6(this.$isLightMode, this.$progress$delegate, this.$activity, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$isLightMode) {
            ybc ybcVarP = jzb.p(new zk1(8, this.$progress$delegate));
            ts tsVar = new ts(14, this.$activity);
            this.label = 1;
            Object objB = ybcVarP.b(tsVar, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gm6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
