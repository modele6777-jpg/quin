package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class it2 extends gbe implements l26 {
    final /* synthetic */ xn5 $focusManager;
    final /* synthetic */ e89 $isInputExpanded$delegate;
    final /* synthetic */ e89 $isInputFocused$delegate;
    final /* synthetic */ vsd $keyboardController;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it2(r0 r0Var, xn5 xn5Var, vsd vsdVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = r0Var;
        this.$focusManager = xn5Var;
        this.$keyboardController = vsdVar;
        this.$isInputExpanded$delegate = e89Var;
        this.$isInputFocused$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new it2(this.$vm, this.$focusManager, this.$keyboardController, this.$isInputExpanded$delegate, this.$isInputFocused$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$vm.h0() || !this.$vm.e0()) {
            xn5 xn5Var = this.$focusManager;
            vsd vsdVar = this.$keyboardController;
            e89 e89Var = this.$isInputExpanded$delegate;
            e89 e89Var2 = this.$isInputFocused$delegate;
            Boolean bool = Boolean.FALSE;
            e89Var.setValue(bool);
            e89Var2.setValue(bool);
            ((bo5) xn5Var).c(8, true, true);
            if (vsdVar != null) {
                ((dw3) vsdVar).a();
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        it2 it2Var = (it2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        it2Var.r(wefVar);
        return wefVar;
    }
}
