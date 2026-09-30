package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class je6 extends gu7 implements a26 {
    final /* synthetic */ ke6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je6(ke6 ke6Var) {
        super(1);
        this.this$0 = ke6Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        sn4 sn4Var = (sn4) obj;
        ke6 ke6Var = this.this$0;
        zt ztVar = ke6Var.l;
        if (ke6Var.n && ke6Var.A && ztVar != null) {
            ta0 ta0VarV0 = sn4Var.v0();
            long jZ = ta0VarV0.z();
            ta0VarV0.p().g();
            try {
                ((vd9) ta0VarV0.c).k(ztVar, 1);
                ke6Var.c(sn4Var);
            } finally {
                ks0.t(ta0VarV0, jZ);
            }
        } else {
            ke6Var.c(sn4Var);
        }
        return wef.a;
    }
}
