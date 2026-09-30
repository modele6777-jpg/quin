package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bi5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final w84 k;
    public final su8 l;

    public bi5(byte[] bArr, int i) {
        zu1 zu1Var = new zu1(bArr, bArr.length);
        zu1Var.m(i * 8);
        this.a = zu1Var.g(16);
        this.b = zu1Var.g(16);
        this.c = zu1Var.g(24);
        this.d = zu1Var.g(24);
        int iG = zu1Var.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = zu1Var.g(3) + 1;
        int iG2 = zu1Var.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = zu1Var.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final rr5 c(byte[] bArr, su8 su8Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        su8 su8Var2 = this.l;
        if (su8Var2 != null) {
            su8Var = su8Var2.b(su8Var);
        }
        qr5 qr5Var = new qr5();
        qr5Var.o = qv8.l("audio/flac");
        qr5Var.p = i;
        qr5Var.I = this.g;
        qr5Var.K = this.e;
        String str = pqf.a;
        qr5Var.L = pqf.w(this.h, ByteOrder.LITTLE_ENDIAN);
        qr5Var.r = Collections.singletonList(bArr);
        qr5Var.l = su8Var;
        return new rr5(qr5Var);
    }

    public bi5(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, w84 w84Var, su8 su8Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = w84Var;
        this.l = su8Var;
    }
}
