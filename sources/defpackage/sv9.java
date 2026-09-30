package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sv9 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfo;
    final /* synthetic */ j4a $paywallChecker;
    final /* synthetic */ tr2 $this_OverviewLayer;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv9(r0 r0Var, j4a j4aVar, t7 t7Var, tr2 tr2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = r0Var;
        this.$paywallChecker = j4aVar;
        this.$accountInfo = t7Var;
        this.$this_OverviewLayer = tr2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sv9(this.$vm, this.$paywallChecker, this.$accountInfo, this.$this_OverviewLayer, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            r0 r0Var = this.$vm;
            uhb uhbVar = r0Var.X0;
            tu2 tu2Var = new tu2(this.$paywallChecker, this.$accountInfo, r0Var, this.$this_OverviewLayer, 3);
            this.label = 1;
            Object objB = uhbVar.a.b(tu2Var, this);
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
        oo3.f();
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((sv9) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
