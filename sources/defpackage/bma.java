package defpackage;

import ai.askquin.ui.popup.dailyfortune.b;
import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bma extends gbe implements l26 {
    int label;
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bma(mma mmaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bma(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
            } else {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        }
        jzb.q(obj);
        v vVar = this.this$0.f;
        this.label = 1;
        b bVar = new b(3);
        String strF = vVar.f();
        if ((strF == null ? wefVar : vVar.u(strF, bVar, this)) != bw2Var) {
        }
        v vVar2 = this.this$0.f;
        this.label = 2;
        String strF2 = vVar2.f();
        return ((strF2 != null && !v4e.Q(strF2)) ? vVar2.u(strF2, new b(1), this) : wefVar) == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bma) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
