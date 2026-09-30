package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sh implements xs4 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public k1f h;
    public k1f i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public k1f v;
    public long w;
    public final zu1 b = new zu1(new byte[7], 7);
    public final d0a c = new d0a(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public sh(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xs4
    public final void c(d0a d0aVar) {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.h.getClass();
        String str = pqf.a;
        while (d0aVar.a() > 0) {
            int i7 = this.j;
            byte b2 = -1;
            d0a d0aVar2 = this.c;
            int i8 = 3;
            zu1 zu1Var = this.b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = d0aVar.a;
                int i12 = d0aVar.b;
                int i13 = d0aVar.c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        int i16 = bArr[i12];
                        int i17 = i16 & 255;
                        if (this.l == 512 && (((65280 | ((((byte) i17) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i18 = i12 - 1;
                                d0aVar.M(i12);
                                byte[] bArr2 = zu1Var.b;
                                if (d0aVar.a() < i11) {
                                    b = -1;
                                } else {
                                    d0aVar.k(bArr2, i9, i11);
                                    zu1Var.m(i10);
                                    int iG = zu1Var.g(i11);
                                    int i19 = this.o;
                                    if (i19 == -1 || iG == i19) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = zu1Var.b;
                                            if (d0aVar.a() >= i11) {
                                                d0aVar.k(bArr3, i9, i11);
                                                zu1Var.m(2);
                                                i4 = 4;
                                                if (zu1Var.g(4) != this.p) {
                                                    b = -1;
                                                } else {
                                                    d0aVar.M(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = zu1Var.b;
                                        if (d0aVar.a() >= i4) {
                                            d0aVar.k(bArr4, i9, i4);
                                            zu1Var.m(14);
                                            int iG2 = zu1Var.g(13);
                                            if (iG2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = d0aVar.a;
                                                int i20 = d0aVar.c;
                                                int i21 = i18 + iG2;
                                                if (i21 < i20) {
                                                    byte b3 = bArr5[i21];
                                                    b = -1;
                                                    if (b3 == -1) {
                                                        int i22 = i21 + 1;
                                                        if (i22 != i20) {
                                                            int i23 = bArr5[i22];
                                                            if ((((65280 | ((i23 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((i23 & 8) >> 3) == iG) {
                                                            }
                                                        }
                                                    } else if (b3 == 73 && ((i5 = i21 + 1) == i20 || (bArr5[i5] == 68 && ((i6 = i21 + 2) == i20 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (i16 & 8) >> 3;
                            this.m = (i16 & 1) == 0;
                            if (this.n) {
                                this.j = i15;
                                this.k = 0;
                            } else {
                                this.j = 1;
                                this.k = 0;
                            }
                            d0aVar.M(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i24 = this.l;
                        int i25 = i17 | i24;
                        if (i25 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 768;
                        } else if (i25 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 512;
                        } else if (i25 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        } else if (i25 != 1075) {
                            c = 256;
                            if (i24 != 256) {
                                this.l = 256;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            d0aVar2.M(0);
                            d0aVar.M(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        d0aVar.M(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = d0aVar2.a;
                    int iMin = Math.min(d0aVar.a(), 10 - this.k);
                    d0aVar.k(bArr6, this.k, iMin);
                    int i26 = this.k + iMin;
                    this.k = i26;
                    if (i26 == 10) {
                        this.i.e(10, d0aVar2);
                        d0aVar2.M(6);
                        k1f k1fVar = this.i;
                        int iY = d0aVar2.y() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = k1fVar;
                        this.w = 0L;
                        this.t = iY;
                    }
                } else if (i7 == 3) {
                    int i27 = this.m ? 7 : 5;
                    byte[] bArr7 = zu1Var.b;
                    int iMin2 = Math.min(d0aVar.a(), i27 - this.k);
                    d0aVar.k(bArr7, this.k, iMin2);
                    int i28 = this.k + iMin2;
                    this.k = i28;
                    if (i28 == i27) {
                        zu1Var.m(0);
                        if (this.r) {
                            zu1Var.o(10);
                        } else {
                            int iG3 = zu1Var.g(2) + 1;
                            if (iG3 != 2) {
                                xo1.V("AdtsReader", "Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = 2;
                            }
                            zu1Var.o(5);
                            int iG4 = zu1Var.g(3);
                            int i29 = this.p;
                            byte[] bArr8 = {(byte) (((iG3 << 3) & 248) | ((i29 >> 1) & 7)), (byte) (((iG4 << 3) & 120) | ((i29 << 7) & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS))};
                            i iVarC0 = jgb.c0(new zu1(bArr8, 2), false);
                            qr5 qr5Var = new qr5();
                            qr5Var.a = this.g;
                            qr5Var.n = qv8.l(this.f);
                            qr5Var.o = qv8.l("audio/mp4a-latm");
                            qr5Var.k = iVarC0.c;
                            qr5Var.I = iVarC0.b;
                            qr5Var.K = iVarC0.a;
                            qr5Var.r = Collections.singletonList(bArr8);
                            qr5Var.d = this.d;
                            qr5Var.f = this.e;
                            rr5 rr5Var = new rr5(qr5Var);
                            this.s = 1024000000 / ((long) rr5Var.L);
                            this.h.g(rr5Var);
                            this.r = true;
                        }
                        zu1Var.o(4);
                        int iG5 = zu1Var.g(13);
                        int i30 = iG5 - 7;
                        if (this.m) {
                            i30 = iG5 - 9;
                        }
                        k1f k1fVar2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = k1fVar2;
                        this.w = j;
                        this.t = i30;
                    }
                } else {
                    if (i7 != 4) {
                        r3.l();
                        return;
                    }
                    int iMin3 = Math.min(d0aVar.a(), this.t - this.k);
                    this.v.e(iMin3, d0aVar);
                    int i31 = this.k + iMin3;
                    this.k = i31;
                    if (i31 == this.t) {
                        pa7.J(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (d0aVar.a() != 0) {
                zu1Var.b[0] = d0aVar.a[d0aVar.b];
                zu1Var.m(2);
                int iG6 = zu1Var.g(4);
                int i32 = this.p;
                if (i32 == -1 || iG6 == i32) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = iG6;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        xg3Var.d();
        xg3Var.i();
        this.g = (String) xg3Var.e;
        xg3Var.i();
        k1f k1fVarN = n95Var.n(xg3Var.c, 1);
        this.h = k1fVarN;
        this.v = k1fVarN;
        if (!this.a) {
            this.i = new l94();
            return;
        }
        xg3Var.d();
        xg3Var.i();
        k1f k1fVarN2 = n95Var.n(xg3Var.c, 5);
        this.i = k1fVarN2;
        qr5 qr5Var = new qr5();
        xg3Var.i();
        qr5Var.a = (String) xg3Var.e;
        qr5Var.n = qv8.l(this.f);
        qr5Var.o = qv8.l("application/id3");
        k1fVarN2.g(new rr5(qr5Var));
    }
}
