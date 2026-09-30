package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2g b;

    public /* synthetic */ ck6(t2g t2gVar, int i) {
        this.a = i;
        this.b = t2gVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        t2g t2gVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(t2gVar.j.j.a());
            case 1:
                return (r2g) t2gVar.h.get(Integer.valueOf(t2gVar.j.e.b.j()));
            default:
                ec3 ec3Var = t2gVar.h;
                c18 c18Var = (c18) s72.H0(t2gVar.j.h().l);
                return (r2g) ec3Var.get(Integer.valueOf(c18Var != null ? c18Var.a : 0));
        }
    }
}
