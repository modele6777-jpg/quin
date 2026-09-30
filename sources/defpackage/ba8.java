package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ba8 extends ewf {
    public static final hu3 d = new hu3(2);
    public final fud b = new fud(0);
    public boolean c = false;

    @Override // defpackage.ewf
    public final void e() {
        fud fudVar = this.b;
        int iD = fudVar.d();
        for (int i = 0; i < iD; i++) {
            z98 z98Var = (z98) fudVar.e(i);
            djg djgVar = z98Var.l;
            djgVar.c();
            djgVar.c = true;
            aa8 aa8Var = z98Var.n;
            if (aa8Var != null) {
                z98Var.j(aa8Var);
            }
            z98 z98Var2 = djgVar.a;
            if (z98Var2 == null) {
                qc0.p("No listener register");
                return;
            }
            if (z98Var2 != z98Var) {
                qc0.j("Attempting to unregister the wrong listener");
                return;
            }
            djgVar.a = null;
            if (aa8Var != null) {
                boolean z = aa8Var.b;
            }
            djgVar.d = true;
            djgVar.b = false;
            djgVar.c = false;
            djgVar.e = false;
        }
        int i2 = fudVar.d;
        Object[] objArr = fudVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        fudVar.d = 0;
        fudVar.a = false;
    }
}
