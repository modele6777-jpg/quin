package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u49 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.g = qn4.h[3 - i3];
        int i6 = qn4.i[i5];
        this.c = i6;
        if (i2 == 2) {
            i6 /= 2;
            this.c = i6;
        } else if (i2 == 0) {
            i6 /= 4;
            this.c = i6;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    cva.s();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? qn4.j[i4 - 1] : qn4.k[i4 - 1];
            this.e = i9;
            this.b = (((i9 * 12) / i6) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? qn4.l[i4 - 1] : qn4.m[i4 - 1];
                this.e = i10;
                this.b = ((i10 * 144) / i6) + i7;
            } else {
                int i11 = qn4.n[i4 - 1];
                this.e = i11;
                this.b = (((i3 == 1 ? 72 : 144) * i11) / i6) + i7;
            }
        }
        this.d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
