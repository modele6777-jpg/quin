package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mz7 {
    public kl2 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ oz7 h;
    public kz7[] a = kj0.i;
    public int e = 1;

    public mz7(oz7 oz7Var) {
        this.h = oz7Var;
    }

    public static void b(mz7 mz7Var, vz7 vz7Var, aw2 aw2Var, ie6 ie6Var, int i, int i2, boolean z) {
        mz7Var.h.getClass();
        long jM = vz7Var.m(0);
        mz7Var.a(vz7Var, aw2Var, ie6Var, i, i2, (int) (!z ? jM & 4294967295L : jM >> 32));
    }

    public final void a(vz7 vz7Var, aw2 aw2Var, ie6 ie6Var, int i, int i2, int i3) {
        kz7[] kz7VarArr;
        kz7[] kz7VarArr2 = this.a;
        int length = kz7VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                kz7 kz7Var = kz7VarArr2[i4];
                if (kz7Var != null && kz7Var.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = vz7Var.k().size();
        int length2 = this.a.length;
        while (true) {
            kz7VarArr = this.a;
            if (size >= length2) {
                break;
            }
            kz7 kz7Var2 = kz7VarArr[size];
            if (kz7Var2 != null) {
                kz7Var2.c();
            }
            size++;
        }
        if (kz7VarArr.length != vz7Var.k().size()) {
            this.a = (kz7[]) Arrays.copyOf(this.a, vz7Var.k().size());
        }
        this.b = new kl2(vz7Var.j());
        this.c = i3;
        this.d = vz7Var.n();
        this.e = vz7Var.b();
        int size2 = vz7Var.k().size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object objE = ((cea) vz7Var.k().get(i5)).E();
            ty7 ty7Var = objE instanceof ty7 ? (ty7) objE : null;
            kz7[] kz7VarArr3 = this.a;
            if (ty7Var == null) {
                kz7 kz7Var3 = kz7VarArr3[i5];
                if (kz7Var3 != null) {
                    kz7Var3.c();
                }
                this.a[i5] = null;
            } else {
                kz7 kz7Var4 = kz7VarArr3[i5];
                if (kz7Var4 == null) {
                    kz7Var4 = new kz7(aw2Var, ie6Var, new zv6(10, this.h));
                    this.a[i5] = kz7Var4;
                }
                kz7Var4.d = ty7Var.Z;
                kz7Var4.e = ty7Var.E0;
                kz7Var4.f = ty7Var.F0;
            }
        }
    }
}
