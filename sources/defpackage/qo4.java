package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qo4 extends gbe implements l26 {
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ int $expectedSize;
    final /* synthetic */ eda $photoPatternViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo4(r0 r0Var, int i, eda edaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$divinationViewModel = r0Var;
        this.$expectedSize = i;
        this.$photoPatternViewModel = edaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qo4(this.$divinationViewModel, this.$expectedSize, this.$photoPatternViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5VarI = dj6.I(jzb.p(new qj2(this.$divinationViewModel, 9)));
            g12 g12Var = new g12(this.$expectedSize, this.$photoPatternViewModel, 1);
            this.label = 1;
            Object objB = wj5VarI.b(g12Var, this);
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qo4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
