package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ewd extends gbe implements l26 {
    final /* synthetic */ fo5 $focusRequester;
    final /* synthetic */ vsd $keyboardController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewd(fo5 fo5Var, vsd vsdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$focusRequester = fo5Var;
        this.$keyboardController = vsdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ewd(this.$focusRequester, this.$keyboardController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        fo5.a(this.$focusRequester);
        vsd vsdVar = this.$keyboardController;
        if (vsdVar != null) {
            ((dw3) vsdVar).b();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ewd ewdVar = (ewd) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ewdVar.r(wefVar);
        return wefVar;
    }
}
