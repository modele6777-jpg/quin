package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class dg9 {
    public final p89 a = new p89(0, new tf9[16]);
    public final i79 b = new i79(10);

    public boolean a(gg8 gg8Var, bv7 bv7Var, egh eghVar, boolean z) {
        p89 p89Var = this.a;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((tf9) objArr[i2]).a(gg8Var, bv7Var, eghVar, z) || z2;
        }
        return z2;
    }

    public void b(egh eghVar) {
        p89 p89Var = this.a;
        int i = p89Var.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((tf9) p89Var.a[i]).d.b == 0) {
                p89Var.k(i);
            }
        }
    }
}
