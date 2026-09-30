package defpackage;

import ai.askquin.ui.popup.dailyfortune.b;
import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ema extends gbe implements l26 {
    int label;
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ema(mma mmaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ema(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            v vVar = this.this$0.f;
            this.label = 1;
            String strF = vVar.f();
            Object objU = (strF == null || v4e.Q(strF)) ? wefVar : vVar.u(strF, new b(1), this);
            bw2 bw2Var = bw2.a;
            if (objU == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ema) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
