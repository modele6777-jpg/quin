package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zl9 {
    public final am9 a = new am9();
    public final d0a b = new d0a(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            am9 am9Var = this.a;
            if (i5 >= am9Var.c) {
                break;
            }
            int[] iArr = am9Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(m95 m95Var) {
        int i;
        pa7.J(m95Var != null);
        boolean z = this.e;
        d0a d0aVar = this.b;
        if (z) {
            this.e = false;
            d0aVar.J(0);
        }
        while (!this.e) {
            int i2 = this.c;
            am9 am9Var = this.a;
            if (i2 < 0) {
                if (am9Var.b(m95Var, -1L) && am9Var.a(m95Var, true)) {
                    int iA = am9Var.d;
                    if ((am9Var.a & 1) == 1 && d0aVar.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        m95Var.l(iA);
                        this.c = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(i2);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                d0aVar.c(d0aVar.c + iA2);
                try {
                    m95Var.readFully(d0aVar.a, d0aVar.c, iA2);
                    d0aVar.L(d0aVar.c + iA2);
                    this.e = am9Var.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == am9Var.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
