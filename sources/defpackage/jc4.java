package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jc4 extends gbe implements l26 {
    final /* synthetic */ h0e $crossfadeState$delegate;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc4(r0 r0Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = r0Var;
        this.$crossfadeState$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jc4(this.$vm, this.$crossfadeState$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((ib4) this.$crossfadeState$delegate.getValue()) instanceof hb4) {
            this.$vm.I1(false);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        jc4 jc4Var = (jc4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        jc4Var.r(wefVar);
        return wefVar;
    }
}
