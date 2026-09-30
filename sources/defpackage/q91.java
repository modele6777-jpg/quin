package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q91 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r91 b;

    public /* synthetic */ q91(r91 r91Var, int i) {
        this.a = i;
        this.b = r91Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        r91 r91Var = this.b;
        switch (i) {
            case 0:
                return (m91) r91Var.i.get(Integer.valueOf(r91Var.f.e.b.j()));
            case 1:
                ec3 ec3Var = r91Var.i;
                c18 c18Var = (c18) s72.H0(r91Var.f.h().l);
                return (m91) ec3Var.get(Integer.valueOf(c18Var != null ? c18Var.a : 0));
            default:
                return Boolean.valueOf(r91Var.f.j.a());
        }
    }
}
