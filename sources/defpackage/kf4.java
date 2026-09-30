package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kf4 extends gbe implements l26 {
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf4(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kf4(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r0 r0Var = this.this$0;
        uc4 uc4Var = r0Var.f;
        fc4 fc4Var = r0Var.H0;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        ((gq3) uc4Var).i(fc4Var.a, true);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        kf4 kf4Var = (kf4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        kf4Var.r(wefVar);
        return wefVar;
    }
}
