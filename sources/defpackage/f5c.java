package defpackage;

import androidx.compose.material.ripple.RippleNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f5c extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5c(RippleNode rippleNode, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rippleNode;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        f5c f5cVar = new f5c(this.this$0, xn2Var);
        f5cVar.L$0 = obj;
        return f5cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wef.a;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        RippleNode rippleNode = this.this$0;
        ncd ncdVar = ((u69) rippleNode.Z).a;
        qb1 qb1Var = new qb1(11, rippleNode, aw2Var);
        this.label = 1;
        ncdVar.b(qb1Var, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((f5c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
