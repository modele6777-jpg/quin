package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cwd implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iwd b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ cwd(a26 a26Var, iwd iwdVar) {
        this.a = 0;
        this.c = a26Var;
        this.b = iwdVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.c;
        iwd iwdVar = this.b;
        switch (i) {
            case 0:
                a26Var.d(iwdVar.g());
                break;
            case 1:
                if (iwdVar.c || iwdVar.h()) {
                    a26Var.d(iwdVar.g());
                } else {
                    sz9 sz9Var = iwdVar.d;
                    if (sz9Var.j() < iwdVar.b.size() - 1) {
                        sz9Var.k(sz9Var.j() + 1);
                    }
                }
                break;
            default:
                if (!iwdVar.h()) {
                    sz9 sz9Var2 = iwdVar.d;
                    if (sz9Var2.j() < iwdVar.b.size() - 1) {
                        sz9Var2.k(sz9Var2.j() + 1);
                    }
                } else {
                    a26Var.d(iwdVar.g());
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cwd(iwd iwdVar, a26 a26Var, int i) {
        this.a = i;
        this.b = iwdVar;
        this.c = a26Var;
    }
}
