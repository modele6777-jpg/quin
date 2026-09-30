package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class if4 extends gbe implements n26 {
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if4(r0 r0Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = r0Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        if4 if4Var = new if4(this.this$0, (xn2) obj3);
        wef wefVar = wef.a;
        if4Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r0 r0Var = this.this$0;
        int i = r0.j2;
        r0Var.q1();
        return wef.a;
    }
}
