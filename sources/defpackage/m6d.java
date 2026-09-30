package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m6d extends gbe implements l26 {
    final /* synthetic */ lbd $shareViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6d(lbd lbdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shareViewModel = lbdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new m6d(this.$shareViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        lbd lbdVar = this.$shareViewModel;
        vz9 vz9Var = lbdVar.v;
        abd abdVar = (abd) vz9Var.getValue();
        abd abdVar2 = abd.b;
        if (abdVar != abdVar2 && ((abd) vz9Var.getValue()) != abd.c) {
            vz9Var.setValue(abdVar2);
            lbdVar.f(new kbd(lbdVar, null));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        m6d m6dVar = (m6d) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        m6dVar.r(wefVar);
        return wefVar;
    }
}
