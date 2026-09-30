package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fl9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public fl9(el9 el9Var) {
        boolean zF;
        boolean zF2;
        byte bG;
        byte bG2;
        byte bG3;
        int i = el9Var.a;
        ByteBuffer byteBuffer = el9Var.b;
        boolean z = false;
        boolean zF3 = true;
        pa7.A(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zu1 zu1Var = new zu1(bArr, iRemaining);
        this.g = zu1Var.g(3);
        zu1Var.n();
        boolean zF4 = zu1Var.f();
        this.a = zF4;
        if (zF4) {
            zu1Var.g(5);
            this.b = false;
            this.h = false;
        } else {
            if (zu1Var.f()) {
                zu1Var.o(64);
                if (zu1Var.f()) {
                    int i2 = 0;
                    while (!zu1Var.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        zu1Var.o(i2);
                    }
                }
                boolean zF5 = zu1Var.f();
                this.b = zF5;
                if (zF5) {
                    zu1Var.o(47);
                }
            } else {
                this.b = false;
            }
            this.h = zu1Var.f();
            int iG = zu1Var.g(5);
            for (int i3 = 0; i3 <= iG; i3++) {
                zu1Var.o(12);
                if (i3 == 0) {
                    if (zu1Var.g(5) > 7) {
                        zu1Var.f();
                    }
                } else if (zu1Var.g(5) > 7) {
                    zu1Var.n();
                }
                if (this.b) {
                    zu1Var.n();
                }
                if (this.h && zu1Var.f()) {
                    if (i3 == 0) {
                        zu1Var.g(4);
                    } else {
                        zu1Var.o(4);
                    }
                }
            }
        }
        int iG2 = zu1Var.g(4);
        int iG3 = zu1Var.g(4);
        zu1Var.o(iG2 + 1);
        zu1Var.o(iG3 + 1);
        if (this.a) {
            this.c = false;
            zF = false;
        } else {
            zF = zu1Var.f();
            this.c = zF;
        }
        if (zF) {
            zu1Var.o(4);
            zu1Var.o(3);
        }
        zu1Var.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            zu1Var.o(4);
            boolean zF6 = zu1Var.f();
            if (zF6) {
                zu1Var.o(2);
            }
            if (zu1Var.f()) {
                this.d = true;
                zF2 = true;
            } else {
                zF2 = zu1Var.f();
                this.d = zF2;
            }
            if (!zF2 || zu1Var.f()) {
                this.e = true;
            } else {
                this.e = zu1Var.f();
            }
            if (zF6) {
                this.f = zu1Var.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        zu1Var.o(3);
        boolean zF7 = (this.g == 2 && zu1Var.f()) ? zu1Var.f() : false;
        boolean zF8 = this.g != 1 ? zu1Var.f() : false;
        if (zu1Var.f()) {
            bG2 = (byte) zu1Var.g(8);
            bG3 = (byte) zu1Var.g(8);
            bG = (byte) zu1Var.g(8);
        } else {
            bG = 0;
            bG2 = 0;
            bG3 = 0;
        }
        if (zF8) {
            zu1Var.n();
        } else if (bG2 != 1 || bG3 != 13 || bG != 0) {
            zu1Var.n();
            int i4 = this.g;
            if (i4 == 0) {
                z = true;
            } else if (i4 == 1) {
                zF3 = false;
            } else if (zF7) {
                boolean zF9 = zu1Var.f();
                zF3 = zF9 ? zu1Var.f() : false;
                z = zF9;
            } else {
                zF3 = false;
                z = true;
            }
            if (z && zF3) {
                zu1Var.g(2);
            }
        }
        zu1Var.n();
    }
}
