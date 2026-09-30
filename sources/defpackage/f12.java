package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f12 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx9 b;

    public /* synthetic */ f12(yx9 yx9Var, int i) {
        this.a = i;
        this.b = yx9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int iJ;
        int i = this.a;
        yx9 yx9Var = this.b;
        switch (i) {
            case 0:
                iJ = ((sz9) yx9Var.d.c).j();
                break;
            case 1:
                iJ = yx9Var.o();
                break;
            case 2:
                iJ = yx9Var.l();
                break;
            case 3:
                iJ = yx9Var.l();
                break;
            case 4:
                return Integer.valueOf(yx9Var.k.a() ? yx9Var.r.j() : ((sz9) yx9Var.d.c).j());
            case 5:
                iJ = yx9Var.l();
                break;
            case 6:
                iJ = yx9Var.o();
                break;
            case 7:
                iJ = yx9Var.o();
                break;
            default:
                return new iy9(Boolean.valueOf(yx9Var.k.a()), Integer.valueOf(yx9Var.o()));
        }
        return Integer.valueOf(iJ);
    }
}
