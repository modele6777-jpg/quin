package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fs3 {
    public final String a;
    public int b;
    public long c;
    public final zp8 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ gs3 g;

    public fs3(gs3 gs3Var, String str, int i, zp8 zp8Var) {
        this.g = gs3Var;
        this.a = str;
        this.b = i;
        this.c = zp8Var == null ? -1L : zp8Var.d;
        if (zp8Var == null || !zp8Var.c()) {
            return;
        }
        this.d = zp8Var;
    }

    public final boolean a(pl plVar) {
        zp8 zp8Var = plVar.d;
        gye gyeVar = plVar.b;
        if (zp8Var == null) {
            return this.b != plVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (zp8Var.d > j) {
            return true;
        }
        zp8 zp8Var2 = this.d;
        if (zp8Var2 == null) {
            return false;
        }
        int i = zp8Var2.b;
        int iB = gyeVar.b(zp8Var.a);
        int iB2 = gyeVar.b(zp8Var2.a);
        if (zp8Var.d < zp8Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!zp8Var.c()) {
            int i2 = zp8Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = zp8Var.b;
        int i4 = zp8Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > zp8Var2.c;
        }
        return true;
    }

    public final boolean b(gye gyeVar, gye gyeVar2) {
        zp8 zp8Var;
        int i = this.b;
        if (i < gyeVar.o()) {
            gs3 gs3Var = this.g;
            fye fyeVar = gs3Var.a;
            gyeVar.n(i, fyeVar);
            int i2 = fyeVar.l;
            while (true) {
                if (i2 > fyeVar.m) {
                    i = -1;
                    break;
                }
                int iB = gyeVar2.b(gyeVar.l(i2));
                if (iB != -1) {
                    i = gyeVar2.f(iB, gs3Var.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= gyeVar2.o()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((zp8Var = this.d) == null || gyeVar2.b(zp8Var.a) != -1);
    }
}
