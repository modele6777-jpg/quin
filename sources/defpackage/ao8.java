package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ao8 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final kx0 e;
    public final cv7 f;
    public final boolean g = false;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public ao8(int i, int i2, List list, long j, Object obj, kx0 kx0Var, cv7 cv7Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = kx0Var;
        this.f = cv7Var;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            cea ceaVar = (cea) list.get(i3);
            iMax = Math.max(iMax, !this.g ? ceaVar.b : ceaVar.a);
        }
        this.h = iMax;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            cea ceaVar = (cea) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f != cv7.a ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - ceaVar.a) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = ceaVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                kx0 kx0Var = this.e;
                if (kx0Var == null) {
                    throw ub3.e("null verticalAlignment");
                }
                iArr[i7] = kx0Var.a(ceaVar.b, i3);
                i4 = ceaVar.a;
            }
            i += i4;
        }
    }
}
