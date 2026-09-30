package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kg6 implements xs4 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final vtc a;
    public final d0a b;
    public final boolean[] c = new boolean[4];
    public final ig6 d;
    public final d55 e;
    public jg6 f;
    public long g;
    public String h;
    public k1f i;
    public boolean j;
    public long k;

    public kg6(vtc vtcVar) {
        this.a = vtcVar;
        ig6 ig6Var = new ig6();
        ig6Var.e = new byte[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        this.d = ig6Var;
        this.k = -9223372036854775807L;
        this.e = new d55(178);
        this.b = new d0a();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0239  */
    @Override // defpackage.xs4
    public final void c(d0a d0aVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = d0aVar.b;
        int i6 = d0aVar.c;
        byte[] bArr = d0aVar.a;
        this.g += (long) d0aVar.a();
        this.i.e(d0aVar.a(), d0aVar);
        while (true) {
            int iB = n16.B(bArr, i5, i6, this.c);
            ig6 ig6Var = this.d;
            d55 d55Var = this.e;
            if (iB == i6) {
                if (!this.j) {
                    ig6Var.a(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (d55Var != null) {
                    d55Var.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iB + 3;
            byte b = d0aVar.a[i7];
            int i8 = b & 255;
            int i9 = iB - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    ig6Var.a(bArr, i5, iB);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = ig6Var.b;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            xo1.V("H263Reader", "Unexpected start code value");
                            ig6Var.a = false;
                            ig6Var.c = 0;
                            ig6Var.b = 0;
                        } else {
                            ig6Var.b = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                r3.l();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                ig6Var.c -= i10;
                                ig6Var.a = false;
                                k1f k1fVar = this.i;
                                int i12 = ig6Var.d;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(ig6Var.e, ig6Var.c);
                                zu1 zu1Var = new zu1(bArrCopyOf, bArrCopyOf.length);
                                zu1Var.p(i12);
                                zu1Var.p(4);
                                zu1Var.n();
                                zu1Var.o(8);
                                if (zu1Var.f()) {
                                    zu1Var.o(4);
                                    zu1Var.o(3);
                                }
                                int iG = zu1Var.g(4);
                                if (iG == 15) {
                                    int iG2 = zu1Var.g(8);
                                    int iG3 = zu1Var.g(8);
                                    if (iG3 == 0) {
                                        xo1.V("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iG2 / iG3;
                                    }
                                } else if (iG < 7) {
                                    f = l[iG];
                                } else {
                                    xo1.V("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (zu1Var.f()) {
                                    zu1Var.o(2);
                                    zu1Var.o(1);
                                    if (zu1Var.f()) {
                                        zu1Var.o(15);
                                        zu1Var.n();
                                        zu1Var.o(15);
                                        zu1Var.n();
                                        zu1Var.o(15);
                                        zu1Var.n();
                                        zu1Var.o(3);
                                        zu1Var.o(11);
                                        zu1Var.n();
                                        zu1Var.o(15);
                                        zu1Var.n();
                                    }
                                }
                                if (zu1Var.g(2) != 0) {
                                    xo1.V("H263Reader", "Unhandled video object layer shape");
                                }
                                zu1Var.n();
                                int iG4 = zu1Var.g(16);
                                zu1Var.n();
                                if (zu1Var.f()) {
                                    if (iG4 == 0) {
                                        xo1.V("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i13 = 0;
                                        for (int i14 = iG4 - 1; i14 > 0; i14 >>= 1) {
                                            i13++;
                                        }
                                        zu1Var.o(i13);
                                    }
                                }
                                zu1Var.n();
                                int iG5 = zu1Var.g(13);
                                zu1Var.n();
                                int iG6 = zu1Var.g(13);
                                zu1Var.n();
                                zu1Var.n();
                                qr5 qr5Var = new qr5();
                                qr5Var.a = str;
                                qr5Var.n = qv8.l("video/mp2t");
                                qr5Var.o = qv8.l("video/mp4v-es");
                                qr5Var.v = iG5;
                                qr5Var.w = iG6;
                                qr5Var.D = f;
                                qr5Var.r = Collections.singletonList(bArrCopyOf);
                                k1fVar.g(new rr5(qr5Var));
                                this.j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            xo1.V("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            ig6Var.a = false;
                            ig6Var.c = 0;
                            ig6Var.b = 0;
                        } else {
                            i4 = 0;
                            ig6Var.d = ig6Var.c;
                            ig6Var.b = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            xo1.V("H263Reader", "Unexpected start code value");
                            ig6Var.a = false;
                            ig6Var.c = 0;
                            ig6Var.b = 0;
                        } else {
                            ig6Var.b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        ig6Var.b = 1;
                        ig6Var.a = true;
                    }
                }
                ig6Var.a(ig6.f, i4, 3);
            }
            this.f.a(bArr, i5, iB);
            if (d55Var == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    d55Var.a(bArr, i5, iB);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (d55Var.d(i3)) {
                    int iA0 = n16.a0((byte[]) d55Var.f, d55Var.c);
                    String str2 = pqf.a;
                    byte[] bArr2 = (byte[]) d55Var.f;
                    d0a d0aVar2 = this.b;
                    d0aVar2.K(bArr2, iA0);
                    this.a.a(this.k, d0aVar2);
                }
                if (i8 == 178) {
                    z = true;
                    if (d0aVar.a[iB + 2] == 1) {
                        d55Var.g(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i - iB;
            this.f.b(i15, this.g - ((long) i15), this.j);
            jg6 jg6Var = this.f;
            long j = this.k;
            jg6Var.e = i8;
            jg6Var.d = false;
            jg6Var.b = (i8 == 182 || i8 == 179) ? z : false;
            jg6Var.c = i8 == 182 ? z : false;
            jg6Var.f = 0;
            jg6Var.h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        n16.z(this.c);
        ig6 ig6Var = this.d;
        ig6Var.a = false;
        ig6Var.c = 0;
        ig6Var.b = 0;
        jg6 jg6Var = this.f;
        if (jg6Var != null) {
            jg6Var.b = false;
            jg6Var.c = false;
            jg6Var.d = false;
            jg6Var.e = -1;
        }
        d55 d55Var = this.e;
        if (d55Var != null) {
            d55Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.xs4
    public final void f() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        jg6 jg6Var = this.f;
        jg6Var.b = false;
        jg6Var.c = false;
        jg6Var.d = false;
        jg6Var.e = -1;
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        xg3Var.d();
        xg3Var.i();
        this.h = (String) xg3Var.e;
        xg3Var.i();
        k1f k1fVarN = n95Var.n(xg3Var.c, 2);
        this.i = k1fVarN;
        this.f = new jg6(k1fVarN);
        this.a.b(n95Var, xg3Var);
    }
}
