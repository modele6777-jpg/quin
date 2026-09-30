package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mo5 extends sv3 implements al9, ug2 {
    public final oo5 F0;
    public a08 G0;

    public mo5() {
        oo5 oo5Var = new oo5(0, 9, new gl(2, this, mo5.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 13));
        l1(oo5Var);
        this.F0 = oo5Var;
    }

    @Override // defpackage.al9
    public final void A0() {
        mmb mmbVar = new mmb();
        if9.C(this, new jt3(18, mmbVar, this));
        a08 a08Var = (a08) mmbVar.element;
        if (this.F0.q1().b()) {
            a08 a08Var2 = this.G0;
            if (a08Var2 != null) {
                a08Var2.b();
            }
            if (a08Var != null) {
                a08Var.a();
            } else {
                a08Var = null;
            }
            this.G0 = a08Var;
        }
    }
}
