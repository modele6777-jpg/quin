package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o46 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final q69 e;
    public final ace f;

    public o46(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            epa.a("Invalid start index");
        }
        this.d = new ArrayList();
        q69 q69Var = new q69();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            oo7 oo7Var = (oo7) this.a.get(i3);
            int i4 = oo7Var.c;
            int i5 = oo7Var.d;
            q69Var.i(i4, new ef6(i3, i2, i5));
            i2 += i5;
        }
        this.e = q69Var;
        this.f = new ace(new j5(21, this));
    }

    public final boolean a(int i, int i2) {
        ef6 ef6Var;
        int i3;
        int i4;
        q69 q69Var = this.e;
        ef6 ef6Var2 = (ef6) q69Var.b(i);
        if (ef6Var2 == null) {
            return false;
        }
        int i5 = ef6Var2.b;
        int i6 = i2 - ef6Var2.c;
        ef6Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = q69Var.c;
        long[] jArr = q69Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (ef6Var = (ef6) objArr[(i7 << 3) + i9]).b) >= i5 && ef6Var != ef6Var2 && (i4 = i3 + i6) >= 0) {
                        ef6Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
