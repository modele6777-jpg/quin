package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gr6 {
    public long c;
    public final yhb d;
    public int g;
    public int h;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public oi6[] e = new oi6[8];
    public int f = 7;

    public gr6(fs6 fs6Var) {
        this.d = new yhb(fs6Var);
    }

    public final void a(oi6 oi6Var) {
        this.b.add(oi6Var);
        long jE = this.c + ((long) (oi6Var.b.e() + oi6Var.a.e()));
        this.c = jE;
        if (jE <= 262144) {
            return;
        }
        yg5.m("header byte count limit of 262144 exceeded");
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                oi6 oi6Var = this.e[length];
                oi6Var.getClass();
                int i4 = oi6Var.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            oi6[] oi6VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(oi6VarArr, i5, oi6VarArr, i5 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final a71 c(int i) throws IOException {
        if (i >= 0) {
            oi6[] oi6VarArr = ir6.a;
            if (i <= oi6VarArr.length - 1) {
                return oi6VarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - ir6.a.length);
        if (length >= 0) {
            oi6[] oi6VarArr2 = this.e;
            if (length < oi6VarArr2.length) {
                oi6 oi6Var = oi6VarArr2[length];
                oi6Var.getClass();
                return oi6Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void d(oi6 oi6Var) {
        a(oi6Var);
        int i = oi6Var.c;
        int i2 = this.a;
        if (i > i2) {
            oi6[] oi6VarArr = this.e;
            qd0.h0(0, oi6VarArr.length, null, oi6VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
        int i3 = this.g + 1;
        oi6[] oi6VarArr2 = this.e;
        if (i3 > oi6VarArr2.length) {
            oi6[] oi6VarArr3 = new oi6[oi6VarArr2.length * 2];
            System.arraycopy(oi6VarArr2, 0, oi6VarArr3, oi6VarArr2.length, oi6VarArr2.length);
            this.f = this.e.length - 1;
            this.e = oi6VarArr3;
            oi6VarArr2 = oi6VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        oi6VarArr2[i4] = oi6Var;
        this.g++;
        this.h += i;
    }

    public final a71 e() {
        yhb yhbVar = this.d;
        byte bU = yhbVar.u();
        byte[] bArr = ieg.a;
        int i = bU & 255;
        int i2 = 0;
        boolean z = (bU & 128) == 128;
        long jF = f(i, 127);
        if (this.c + jF > 262144) {
            yg5.m("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return yhbVar.x(jF);
        }
        f41 f41Var = new f41();
        yl9 yl9Var = et6.c;
        yl9 yl9Var2 = yl9Var;
        int i3 = 0;
        for (long j = 0; j < jF; j++) {
            byte bU2 = yhbVar.u();
            byte[] bArr2 = ieg.a;
            i2 = (i2 << 8) | (bU2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                yl9[] yl9VarArr = (yl9[]) yl9Var2.d;
                yl9VarArr.getClass();
                yl9Var2 = yl9VarArr[(i2 >>> (i3 - 8)) & 255];
                yl9Var2.getClass();
                if (((yl9[]) yl9Var2.d) == null) {
                    f41Var.i1(yl9Var2.b);
                    i3 -= yl9Var2.c;
                    yl9Var2 = yl9Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            yl9[] yl9VarArr2 = (yl9[]) yl9Var2.d;
            yl9VarArr2.getClass();
            yl9 yl9Var3 = yl9VarArr2[(i2 << (8 - i3)) & 255];
            yl9Var3.getClass();
            int i4 = yl9Var3.c;
            if (((yl9[]) yl9Var3.d) != null || i4 > i3) {
                break;
            }
            f41Var.i1(yl9Var3.b);
            i3 -= i4;
            yl9Var2 = yl9Var;
        }
        return f41Var.p0(f41Var.b);
    }

    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte bU = this.d.u();
            byte[] bArr = ieg.a;
            i4++;
            long j2 = ((long) (bU & 127)) << i5;
            if (j2 > 2147483647L - j) {
                yg5.m("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((bU & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        yg5.m("HPACK integer overflow");
        return 0;
    }
}
