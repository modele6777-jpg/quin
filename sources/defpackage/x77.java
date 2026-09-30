package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x77 extends gbe implements l26 {
    final /* synthetic */ a26 $onProductSelected;
    final /* synthetic */ e89 $selected$delegate;
    final /* synthetic */ c87 $state;
    final /* synthetic */ boolean $subscriptionsOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x77(boolean z, c87 c87Var, e89 e89Var, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$subscriptionsOnly = z;
        this.$state = c87Var;
        this.$selected$delegate = e89Var;
        this.$onProductSelected = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new x77(this.$subscriptionsOnly, this.$state, this.$selected$delegate, this.$onProductSelected, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        e89 e89Var = this.$selected$delegate;
        int i = b87.a;
        puc pucVar = (puc) e89Var.getValue();
        wef wefVar = wef.a;
        if (pucVar == null || (this.$subscriptionsOnly && (((puc) this.$selected$delegate.getValue()) instanceof ouc))) {
            this.$selected$delegate.setValue(null);
            boolean z = this.$subscriptionsOnly;
            c87 c87Var = this.$state;
            if (z) {
                z6e z6eVar = c87Var.c;
                if (z6eVar != null) {
                    a26 a26Var = this.$onProductSelected;
                    this.$selected$delegate.setValue(new muc(z6eVar));
                    a26Var.d(z6eVar);
                    return wefVar;
                }
                z6e z6eVar2 = c87Var.b;
                if (z6eVar2 != null) {
                    a26 a26Var2 = this.$onProductSelected;
                    this.$selected$delegate.setValue(new nuc(z6eVar2));
                    a26Var2.d(z6eVar2);
                    return wefVar;
                }
            } else {
                z6e z6eVar3 = c87Var.b;
                if (z6eVar3 != null) {
                    a26 a26Var3 = this.$onProductSelected;
                    this.$selected$delegate.setValue(new nuc(z6eVar3));
                    a26Var3.d(z6eVar3);
                    return wefVar;
                }
                z6e z6eVar4 = c87Var.c;
                if (z6eVar4 != null) {
                    a26 a26Var4 = this.$onProductSelected;
                    this.$selected$delegate.setValue(new muc(z6eVar4));
                    a26Var4.d(z6eVar4);
                    return wefVar;
                }
                n07 n07Var = c87Var.a;
                if (n07Var != null) {
                    a26 a26Var5 = this.$onProductSelected;
                    this.$selected$delegate.setValue(new ouc(n07Var));
                    a26Var5.d(n07Var);
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        x77 x77Var = (x77) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        x77Var.r(wefVar);
        return wefVar;
    }
}
