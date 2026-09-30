package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xo4 extends gbe implements l26 {
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ rcf $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo4(xn2 xn2Var, rcf rcfVar, r0 r0Var) {
        super(2, xn2Var);
        this.$divinationViewModel = r0Var;
        this.$vm = rcfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xo4(xn2Var, this.$vm, this.$divinationViewModel);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
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
        if (this.$divinationViewModel.m0()) {
            wj5 wj5VarI = dj6.I(jzb.p(new sk3(0, this.$vm, rcf.class, "save", "save()Lai/askquin/ui/draw/model/DrawCardSaves;", 0, 7)));
            vo4 vo4Var = new vo4(this.$divinationViewModel, 1);
            this.label = 1;
            Object objB = wj5VarI.b(vo4Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xo4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
