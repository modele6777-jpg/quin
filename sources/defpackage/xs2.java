package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xs2 extends gbe implements l26 {
    final /* synthetic */ xn5 $focusManager;
    final /* synthetic */ e89 $isInputExpanded$delegate;
    final /* synthetic */ e89 $isInputFocused$delegate;
    final /* synthetic */ String $it;
    final /* synthetic */ vsd $keyboardController;
    final /* synthetic */ kzd $startDrawCardHelper;
    final /* synthetic */ use $text;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs2(kzd kzdVar, r0 r0Var, String str, use useVar, xn5 xn5Var, vsd vsdVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$startDrawCardHelper = kzdVar;
        this.$vm = r0Var;
        this.$it = str;
        this.$text = useVar;
        this.$focusManager = xn5Var;
        this.$keyboardController = vsdVar;
        this.$isInputExpanded$delegate = e89Var;
        this.$isInputFocused$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xs2(this.$startDrawCardHelper, this.$vm, this.$it, this.$text, this.$focusManager, this.$keyboardController, this.$isInputExpanded$delegate, this.$isInputFocused$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            kzd kzdVar = this.$startDrawCardHelper;
            this.label = 1;
            kzdVar.getClass();
            obj = Boolean.TRUE;
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        wef wefVar = wef.a;
        if (!zBooleanValue || !this.$vm.u1(this.$it)) {
            return wefVar;
        }
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
        n3d.g(this.$text);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xs2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
