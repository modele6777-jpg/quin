package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class or2 extends gbe implements l26 {
    final /* synthetic */ dc9 $navigationViewModel;
    final /* synthetic */ tr2 $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(tr2 tr2Var, dc9 dc9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scope = tr2Var;
        this.$navigationViewModel = dc9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new or2(this.$scope, this.$navigationViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$scope.c.H1.setValue(Boolean.valueOf(this.$navigationViewModel.f()));
        DrawCardSaves drawCardSaves = this.$navigationViewModel.w;
        if (drawCardSaves != null) {
            r0 r0Var = this.$scope.c;
            r0Var.getClass();
            ynb.V(hwf.a(r0Var), null, null, new ff4(r0Var, drawCardSaves, null), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        or2 or2Var = (or2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        or2Var.r(wefVar);
        return wefVar;
    }
}
