package defpackage;

import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gf4 extends gbe implements l26 {
    final /* synthetic */ Operation<?> $operation;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf4(xn2 xn2Var, r0 r0Var, Operation operation) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$operation = operation;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gf4(xn2Var, this.this$0, this.$operation);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.this$0.H() != null) {
                Operation<?> operation = this.$operation;
                if ((operation instanceof Operation.Ask) || (operation instanceof Operation.UpdateQuestion)) {
                    r0 r0Var = this.this$0;
                    uc4 uc4Var = r0Var.f;
                    yc4 yc4VarW = r0Var.w();
                    this.label = 1;
                    Object objH = ((gq3) uc4Var).h(yc4VarW, this);
                    bw2 bw2Var = bw2.a;
                    if (objH == bw2Var) {
                        return bw2Var;
                    }
                }
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
        return ((gf4) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
