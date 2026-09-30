package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ce4 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce4(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ce4 ce4Var = new ce4(this.this$0, xn2Var);
        ce4Var.L$0 = obj;
        return ce4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        oyb oybVar = (oyb) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if ((oybVar instanceof lyb) || (oybVar instanceof myb)) {
            r0 r0Var = this.this$0;
            int i = r0.j2;
            r0Var.w1(true);
        } else if ((oybVar instanceof kyb) || (oybVar instanceof jyb)) {
            r0 r0Var2 = this.this$0;
            int i2 = r0.j2;
            r0Var2.w1(false);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ce4 ce4Var = (ce4) k((xn2) obj2, (oyb) obj);
        wef wefVar = wef.a;
        ce4Var.r(wefVar);
        return wefVar;
    }
}
