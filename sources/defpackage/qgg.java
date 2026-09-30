package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qgg {
    public byte[] a = new byte[4096];
    public int b = 0;
    public int e = -1;
    public long c = -1;
    public boolean h = false;
    public int f = 30;
    public long d = -1;
    public int g = -1;
    public String i = null;

    public final int a(byte[] bArr, int i, int i2) {
        int iC = c(30, bArr, i, i2);
        if (iC != -1) {
            if (this.c == -1) {
                byte[] bArr2 = this.a;
                long jC = ((long) ((tgc.c(bArr2, 2) << 16) | tgc.c(bArr2, 0))) & 4294967295L;
                this.c = jC;
                if (jC == 67324752) {
                    this.h = false;
                    byte[] bArr3 = this.a;
                    this.d = ((long) ((tgc.c(bArr3, 20) << 16) | tgc.c(bArr3, 18))) & 4294967295L;
                    this.g = tgc.c(this.a, 8);
                    this.e = tgc.c(this.a, 26);
                    int iC2 = this.e + 30 + tgc.c(this.a, 28);
                    this.f = iC2;
                    int length = this.a.length;
                    if (length < iC2) {
                        do {
                            length += length;
                        } while (length < iC2);
                        this.a = Arrays.copyOf(this.a, length);
                    }
                } else {
                    this.h = true;
                }
            }
            int iC3 = c(this.f, bArr, i + iC, i2 - iC);
            if (iC3 != -1) {
                int i3 = iC + iC3;
                if (!this.h && this.i == null) {
                    this.i = new String(this.a, 30, this.e);
                }
                return i3;
            }
        }
        return -1;
    }

    public final pfg b() {
        int i = this.b;
        int i2 = this.f;
        String str = this.i;
        long j = this.d;
        int i3 = this.g;
        if (i < i2) {
            return new pfg(str, j, i3, true, this.h, Arrays.copyOf(this.a, i));
        }
        pfg pfgVar = new pfg(str, j, i3, false, this.h, Arrays.copyOf(this.a, i2));
        this.b = 0;
        this.e = -1;
        this.c = -1L;
        this.h = false;
        this.f = 30;
        this.d = -1L;
        this.g = -1;
        this.i = null;
        return pfgVar;
    }

    public final int c(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.b;
        if (i4 >= i) {
            return 0;
        }
        int iMin = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.a, this.b, iMin);
        int i5 = this.b + iMin;
        this.b = i5;
        if (i5 < i) {
            return -1;
        }
        return iMin;
    }
}
