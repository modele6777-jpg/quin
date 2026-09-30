package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rg2 implements pjb, kg2 {
    public cfd E0;
    public p2a F0;
    public rg2 G0;
    public int H0;
    public final kb6 I0;
    public final bw J0;
    public final l46 K0;
    public int L0;
    public final w79 X;
    public w79 Y;
    public boolean Z;
    public final lg2 a;
    public final taf b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final a89 e;
    public final lpd f;
    public final w79 g;
    public final x79 v;
    public final x79 w;
    public final w79 x;
    public final uv1 y;
    public final uv1 z;

    public rg2(lg2 lg2Var, taf tafVar) {
        this.a = lg2Var;
        this.b = tafVar;
        a89 a89Var = new a89(new x79());
        this.e = a89Var;
        lpd lpdVar = new lpd();
        if (lg2Var.e()) {
            lpdVar.y = new q69();
        }
        if (lg2Var.g()) {
            lpdVar.d();
        }
        this.f = lpdVar;
        this.g = rfc.j();
        this.v = new x79();
        this.w = new x79();
        this.x = rfc.j();
        uv1 uv1Var = new uv1();
        this.y = uv1Var;
        uv1 uv1Var2 = new uv1();
        this.z = uv1Var2;
        this.X = rfc.j();
        this.Y = rfc.j();
        kb6 kb6Var = new kb6(10, lg2Var);
        this.I0 = kb6Var;
        this.J0 = new bw();
        l46 l46Var = new l46(tafVar, lg2Var, npd.a(lpdVar), a89Var, uv1Var, uv1Var2, kb6Var, this);
        lg2Var.s(l46Var);
        this.K0 = l46Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void A(Object obj) {
        synchronized (this.d) {
            try {
                w(obj);
                Object objG = this.x.g(obj);
                if (objG != null) {
                    if (objG instanceof x79) {
                        x79 x79Var = (x79) objG;
                        Object[] objArr = x79Var.b;
                        long[] jArr = x79Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            w((mx3) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        w((mx3) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(l26 l26Var) {
        boolean zK = k();
        t();
        lg2 lg2Var = this.a;
        if (!zK) {
            lg2Var.a(this, l26Var);
            return;
        }
        l46 l46Var = this.K0;
        l46Var.z = 0;
        l46Var.y = true;
        lg2Var.a(this, l26Var);
        if (l46Var.F || l46Var.z != 0) {
            epa.a("Cannot disable reuse from root if it was caused by other groups");
        }
        l46Var.z = -1;
        l46Var.y = false;
    }

    public final void a() {
        this.c.set(null);
        this.y.l.R();
        this.z.l.R();
        a89 a89Var = this.e;
        if (a89Var.a.c()) {
            return;
        }
        bw bwVar = this.J0;
        try {
            bwVar.k(a89Var, this.K0.D());
            bwVar.e();
        } finally {
            bwVar.d();
        }
    }

    @Override // defpackage.pjb
    public final void b() {
        this.Z = true;
        this.I0.l();
    }

    public final void c(Object obj, boolean z) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof x79;
        eb7 eb7Var = eb7.a;
        x79 x79Var = this.v;
        x79 x79Var2 = this.w;
        w79 w79Var = this.X;
        if (!z2) {
            ojb ojbVar = (ojb) objG;
            if (rfc.o(w79Var, obj, ojbVar) || ojbVar.b(obj) == eb7Var) {
                return;
            }
            if (ojbVar.g == null || z) {
                x79Var.e(ojbVar);
                return;
            } else {
                x79Var2.e(ojbVar);
                return;
            }
        }
        x79 x79Var3 = (x79) objG;
        Object[] objArr = x79Var3.b;
        long[] jArr = x79Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ojb ojbVar2 = (ojb) objArr[(i << 3) + i3];
                        if (!rfc.o(w79Var, obj, ojbVar2) && ojbVar2.b(obj) != eb7Var) {
                            if (ojbVar2.g == null || z) {
                                x79Var.e(ojbVar2);
                            } else {
                                x79Var2.e(ojbVar2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void d(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zA;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zC;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof oec;
        w79 w79Var = this.x;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            lec lecVar = ((oec) set).a;
            Object[] objArr = lecVar.b;
            long[] jArr9 = lecVar.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof ojb) {
                                    ((ojb) obj2).b(obj);
                                } else {
                                    c(obj2, z);
                                    Object objG = w79Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof x79) {
                                            x79 x79Var = (x79) objG;
                                            Object[] objArr2 = x79Var.b;
                                            long[] jArr10 = x79Var.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                c((mx3) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            c((mx3) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof ojb) {
                    ((ojb) obj3).b(null);
                } else {
                    c(obj3, z);
                    Object objG2 = w79Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof x79) {
                            x79 x79Var2 = (x79) objG2;
                            Object[] objArr3 = x79Var2.b;
                            long[] jArr12 = x79Var2.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                c((mx3) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            c((mx3) objG2, z);
                        }
                    }
                }
            }
        }
        w79 w79Var2 = this.g;
        x79 x79Var3 = this.v;
        if (z) {
            x79 x79Var4 = this.w;
            if (x79Var4.d()) {
                long[] jArr13 = w79Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = w79Var2.b[i18];
                                    Object obj5 = w79Var2.c[i18];
                                    if (obj5 instanceof x79) {
                                        x79 x79Var5 = (x79) obj5;
                                        Object[] objArr4 = x79Var5.b;
                                        long[] jArr14 = x79Var5.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            ojb ojbVar = (ojb) objArr5[i22];
                                                            if (x79Var4.a(ojbVar) || x79Var3.a(ojbVar)) {
                                                                x79Var5.n(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zC = x79Var5.c();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        ojb ojbVar2 = (ojb) obj5;
                                        zC = x79Var4.a(ojbVar2) || x79Var3.a(ojbVar2);
                                    }
                                    if (zC) {
                                        w79Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                x79Var4.f();
                j();
                return;
            }
        }
        if (x79Var3.d()) {
            long[] jArr16 = w79Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = w79Var2.b[i26];
                                Object obj7 = w79Var2.c[i26];
                                if (obj7 instanceof x79) {
                                    x79 x79Var6 = (x79) obj7;
                                    Object[] objArr6 = x79Var6.b;
                                    long[] jArr17 = x79Var6.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (x79Var3.a((ojb) objArr7[i30])) {
                                                            x79Var6.n(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zA = x79Var6.c();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zA = x79Var3.a((ojb) obj7);
                                }
                                if (zA) {
                                    w79Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            j();
            x79Var3.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // defpackage.pjb
    public final void e(Object obj) {
        ojb ojbVarB;
        int i;
        boolean z;
        l46 l46Var = this.K0;
        if (l46Var.A <= 0 && (ojbVarB = l46Var.B()) != null) {
            int i2 = ojbVarB.b | 1;
            ojbVarB.b = i2;
            if ((i2 & 32) == 0) {
                e79 e79Var = ojbVarB.f;
                if (e79Var == null) {
                    e79Var = new e79();
                    ojbVarB.f = e79Var;
                }
                int i3 = ojbVarB.e;
                int iC = e79Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = e79Var.c[iC];
                }
                e79Var.b[iC] = obj;
                e79Var.c[iC] = i3;
                if (i == ojbVarB.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.I0.l();
            if (z) {
                return;
            }
            if (obj instanceof d1e) {
                ((d1e) obj).i(1);
            }
            rfc.d(this.g, obj, ojbVarB);
            if (obj instanceof mx3) {
                mx3 mx3Var = (mx3) obj;
                lx3 lx3VarK = mx3Var.k();
                w79 w79Var = this.x;
                rfc.p(w79Var, obj);
                e79 e79Var2 = lx3VarK.e;
                Object[] objArr = e79Var2.b;
                long[] jArr = e79Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    c1e c1eVar = (c1e) objArr[(i4 << 3) + i7];
                                    if (c1eVar instanceof d1e) {
                                        ((d1e) c1eVar).i(1);
                                    }
                                    rfc.d(w79Var, c1eVar, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = lx3VarK.f;
                w79 w79Var2 = ojbVarB.g;
                if (w79Var2 == null) {
                    w79Var2 = new w79();
                    ojbVarB.g = w79Var2;
                }
                w79Var2.m(mx3Var, obj2);
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            try {
                g(this.y);
                r();
            } catch (Throwable th) {
                try {
                    if (!this.e.a.c()) {
                        bw bwVar = this.J0;
                        try {
                            bwVar.k(this.e, this.K0.D());
                            bwVar.e();
                        } finally {
                            bwVar.d();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:78:0x0136 BREAK  A[LOOP:2: B:146:0x00e9->B:76:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: all -> 0x011c, LOOP:2: B:146:0x00e9->B:76:0x012c, LOOP_END, TryCatch #6 {all -> 0x011c, blocks: (B:60:0x00e9, B:62:0x00f8, B:64:0x0102, B:66:0x0108, B:68:0x0118, B:72:0x0121, B:78:0x0136, B:86:0x0158, B:89:0x016b, B:76:0x012c, B:81:0x0140, B:95:0x0189, B:97:0x0195), top: B:146:0x00e9 }] */
    public final void g(uv1 uv1Var) throws Throwable {
        bw bwVar;
        long[] jArr;
        int i;
        long[] jArr2;
        bw bwVar2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zC;
        long j3;
        uv1 uv1Var2 = this.z;
        l46 l46Var = this.K0;
        og2 og2VarD = l46Var.D();
        bw bwVar3 = this.J0;
        bwVar3.k(this.e, og2VarD);
        try {
            if (uv1Var.l.T()) {
                try {
                    if (uv1Var2.l.T() && this.F0 == null) {
                        bwVar3.e();
                    }
                    return;
                } finally {
                    bwVar3.d();
                }
            }
            p2a p2aVar = this.F0;
            ac0 ac0Var = p2aVar != null ? p2aVar.l : this.b;
            try {
                Trace.beginSection(ac0Var.equals(p2aVar != null ? p2aVar.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    p2a p2aVar2 = this.F0;
                    bw bwVar4 = p2aVar2 != null ? p2aVar2.k : bwVar3;
                    lpd lpdVar = this.f;
                    og2 og2VarD2 = l46Var.D();
                    opd opdVarI = npd.a(lpdVar).i();
                    int i3 = 0;
                    try {
                        uv1Var.T0(ac0Var, opdVarI, bwVar4, og2VarD2);
                        opdVarI.e(true);
                        ac0Var.n();
                        Trace.endSection();
                        bwVar3.f();
                        bwVar3.g();
                        if (this.Z) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.Z = false;
                                w79 w79Var = this.g;
                                long[] jArr3 = w79Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = w79Var.b[i8];
                                                    Object obj2 = w79Var.c[i8];
                                                    if (obj2 instanceof x79) {
                                                        x79 x79Var = (x79) obj2;
                                                        Object[] objArr = x79Var.b;
                                                        long[] jArr4 = x79Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        bwVar2 = bwVar3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((ojb) objArr[i13]).a()) {
                                                                                    x79Var.n(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zC = x79Var.c();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        bwVar2 = bwVar3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zC = !((ojb) obj2).a();
                                                    }
                                                    if (zC) {
                                                        w79Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    bwVar2 = bwVar3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                bwVar3 = bwVar2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            bwVar = bwVar3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            bwVar = bwVar3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        bwVar3 = bwVar;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    bwVar = bwVar3;
                                }
                                j();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            bwVar = bwVar3;
                        }
                        try {
                            if (uv1Var2.l.T() && this.F0 == null) {
                                bwVar.e();
                            }
                            return;
                        } finally {
                            bwVar.d();
                        }
                    } catch (Throwable th3) {
                        try {
                            opdVarI.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (uv1Var2.l.T() && this.F0 == null) {
                bwVar3.e();
            }
            throw th;
        } finally {
            bwVar3.d();
        }
    }

    public final void h() {
        synchronized (this.d) {
            try {
                uv1 uv1Var = this.z;
                uv1Var.getClass();
                if (!uv1Var.l.T()) {
                    g(this.z);
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.c()) {
                        bw bwVar = this.J0;
                        try {
                            bwVar.k(this.e, this.K0.D());
                            bwVar.e();
                        } finally {
                            bwVar.d();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void i() {
        synchronized (this.d) {
            try {
                this.K0.v = null;
                if (!this.e.a.c()) {
                    bw bwVar = this.J0;
                    try {
                        bwVar.k(this.e, this.K0.D());
                        bwVar.e();
                        bwVar.d();
                    } catch (Throwable th) {
                        bwVar.d();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.e.a.c()) {
                        bw bwVar2 = this.J0;
                        try {
                            bwVar2.k(this.e, this.K0.D());
                            bwVar2.e();
                        } finally {
                            bwVar2.d();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void j() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zC;
        int i4;
        int i5;
        w79 w79Var = this.x;
        long[] jArr3 = w79Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = w79Var.b[i10];
                            Object obj2 = w79Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof x79;
                            j5 = j8;
                            w79 w79Var2 = this.g;
                            if (z) {
                                x79 x79Var = (x79) obj2;
                                Object[] objArr = x79Var.b;
                                long[] jArr4 = x79Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!w79Var2.c((mx3) objArr[i15])) {
                                                        x79Var.n(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zC = x79Var.c();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zC = !w79Var2.c((mx3) obj2);
                            }
                            if (zC) {
                                w79Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        x79 x79Var2 = this.w;
        if (!x79Var2.d()) {
            return;
        }
        Object[] objArr2 = x79Var2.b;
        long[] jArr5 = x79Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((ojb) objArr2[i20]).g == null) {
                            x79Var2.n(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.L0 != 1) {
                z = false;
            }
            if (z) {
                this.L0 = 0;
            }
        }
        return z;
    }

    public final void l(l26 l26Var) {
        try {
            synchronized (this.d) {
                q();
                w79 w79Var = this.Y;
                this.Y = rfc.j();
                try {
                    l46 l46Var = this.K0;
                    cfd cfdVar = this.E0;
                    if (!l46Var.e.l.T()) {
                        wf2.a("Expected applyChanges() to have been called");
                    }
                    l46Var.P = cfdVar;
                    try {
                        l46Var.p(w79Var, l26Var);
                        l46Var.P = null;
                    } catch (Throwable th) {
                        l46Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.Y = w79Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.e.a.c()) {
                    bw bwVar = this.J0;
                    try {
                        bwVar.k(this.e, this.K0.D());
                        bwVar.e();
                    } finally {
                        bwVar.d();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final p2a m(boolean z, l26 l26Var) {
        if (this.F0 != null) {
            epa.b("A pausable composition is in progress");
        }
        p2a p2aVar = new p2a(this, this.a, this.K0, this.e, l26Var, z, this.b, this.d);
        this.F0 = p2aVar;
        return p2aVar;
    }

    public final void n() {
        synchronized (this.d) {
            try {
                if (this.F0 != null) {
                    epa.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b == 0;
                if (!z || !this.e.a.c()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        bw bwVar = this.J0;
                        try {
                            bwVar.k(this.e, this.K0.D());
                            if (!z) {
                                lpd lpdVar = this.f;
                                bw bwVar2 = this.J0;
                                opd opdVarI = lpdVar.i();
                                try {
                                    opdVarI.m(opdVarI.t, new o14(24, bwVar2, opdVarI));
                                    opdVarI.e(true);
                                    this.b.n();
                                    bwVar.f();
                                } catch (Throwable th) {
                                    opdVarI.e(false);
                                    throw th;
                                }
                            }
                            bwVar.e();
                            bwVar.d();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            bwVar.d();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.g.a();
                this.x.a();
                this.Y.a();
                this.y.l.R();
                this.z.l.R();
                l46 l46Var = this.K0;
                l46Var.E.clear();
                l46Var.s.clear();
                l46Var.e.l.R();
                l46Var.v = null;
                this.L0 = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // defpackage.pjb
    public final eb7 o(ojb ojbVar, Object obj) {
        rg2 rg2Var;
        int i = ojbVar.b;
        if ((i & 2) != 0) {
            ojbVar.b = i | 4;
        }
        f46 f46Var = ojbVar.c;
        if (f46Var == null || !f46Var.a()) {
            return eb7.a;
        }
        lpd lpdVar = this.f;
        lpdVar.getClass();
        f46 f46Var2 = ojbVar.c;
        if (f46Var2 != null && lpdVar.j(nk8.l(f46Var2))) {
            if (ojbVar.d == null) {
                return eb7.a;
            }
            eb7 eb7VarV = v(ojbVar, f46Var, obj);
            if (eb7VarV != eb7.a) {
                this.I0.l();
            }
            return eb7VarV;
        }
        synchronized (this.d) {
            rg2Var = this.G0;
        }
        if (rg2Var != null) {
            l46 l46Var = rg2Var.K0;
            if (l46Var.F && l46Var.l0(ojbVar, obj)) {
                return eb7.d;
            }
        }
        return eb7.a;
    }

    public final void p() {
        synchronized (this.d) {
            try {
                if (this.K0.F) {
                    epa.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.L0 != 3) {
                    this.L0 = 3;
                    uv1 uv1Var = this.K0.L;
                    if (uv1Var != null) {
                        g(uv1Var);
                    }
                    boolean z = this.f.b == 0;
                    if (!z || !this.e.a.c()) {
                        bw bwVar = this.J0;
                        try {
                            bwVar.k(this.e, this.K0.D());
                            if (!z) {
                                lpd lpdVar = this.f;
                                bw bwVar2 = this.J0;
                                opd opdVarI = lpdVar.i();
                                try {
                                    opdVarI.m(opdVarI.t, new i1(8, bwVar2));
                                    opdVarI.I();
                                    opdVarI.e(true);
                                    this.b.b();
                                    this.b.n();
                                    bwVar.f();
                                } catch (Throwable th) {
                                    opdVarI.e(false);
                                    throw th;
                                }
                            }
                            bwVar.e();
                            bwVar.d();
                        } catch (Throwable th2) {
                            bwVar.d();
                            throw th2;
                        }
                    }
                    this.X.a();
                    l46 l46Var = this.K0;
                    l46Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        l46Var.b.x(l46Var);
                        l46Var.E.clear();
                        l46Var.s.clear();
                        l46Var.e.l.R();
                        l46Var.v = null;
                        l46Var.a.b();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.y(this);
    }

    public final void q() {
        Object obj = feg.g;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                wf2.b("pending composition has not been applied");
                oo3.f();
                return;
            }
            if (andSet instanceof Set) {
                d((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                wf2.b("corrupt pendingModifications drain: " + atomicReference);
                oo3.f();
                return;
            }
            for (Set set : (Set[]) andSet) {
                d(set, true);
            }
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (pa7.t(andSet, feg.g)) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                d(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.F0 == null) {
                wf2.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            wf2.b("corrupt pendingModifications drain: " + atomicReference);
            oo3.f();
        }
    }

    public final void s() {
        xu4 xu4Var = xu4.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(xu4Var);
        if (pa7.t(andSet, feg.g) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            wf2.b("corrupt pendingModifications drain: " + atomicReference);
            oo3.f();
            return;
        }
        for (Set set : (Set[]) andSet) {
            d(set, false);
        }
    }

    public final void t() {
        String str;
        int i = this.L0;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            epa.b(str);
        }
        if (this.F0 == null) {
            return;
        }
        epa.b("A pausable composition is in progress");
    }

    public final void u(ArrayList arrayList) {
        a89 a89Var = this.e;
        l46 l46Var = this.K0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((g49) ((iy9) arrayList.get(i)).d()).c != this) {
                wf2.a("Check failed");
                break;
            }
        }
        try {
            l46Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    l46Var.G(arrayList);
                    l46Var.j();
                    Trace.endSection();
                } catch (Throwable th) {
                    l46Var.a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!a89Var.a.c()) {
                    bw bwVar = this.J0;
                    try {
                        bwVar.k(a89Var, l46Var.D());
                        bwVar.e();
                    } finally {
                        bwVar.d();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final eb7 v(ojb ojbVar, f46 f46Var, Object obj) {
        synchronized (this.d) {
            try {
                rg2 rg2Var = this.G0;
                rg2 rg2Var2 = null;
                if (rg2Var != null) {
                    lpd lpdVar = this.f;
                    int i = this.H0;
                    if (lpdVar.g) {
                        wf2.a("Writer is active");
                    }
                    if (i < 0 || i >= lpdVar.b) {
                        wf2.a("Invalid group index");
                    }
                    f46 f46VarL = nk8.l(f46Var);
                    if (lpdVar.j(f46VarL)) {
                        int i2 = lpdVar.a[(i * 5) + 3] + i;
                        int i3 = f46VarL.a;
                        if (i > i3 || i3 >= i2) {
                            rg2Var = null;
                        }
                    } else {
                        rg2Var = null;
                    }
                    rg2Var2 = rg2Var;
                }
                if (rg2Var2 == null) {
                    l46 l46Var = this.K0;
                    if (l46Var.F && l46Var.l0(ojbVar, obj)) {
                        return eb7.d;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof mx3;
                        w79 w79Var = this.Y;
                        if (z) {
                            Object objG = w79Var.g(ojbVar);
                            if (objG == null) {
                                rfc.d(this.Y, ojbVar, obj);
                                break;
                            }
                            if (objG instanceof x79) {
                                x79 x79Var = (x79) objG;
                                Object[] objArr = x79Var.b;
                                long[] jArr = x79Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    rfc.d(this.Y, ojbVar, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == qfc.a) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        rfc.d(this.Y, ojbVar, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        rfc.d(this.Y, ojbVar, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objG != qfc.a) {
                                    rfc.d(this.Y, ojbVar, obj);
                                    break;
                                }
                            }
                        } else {
                            w79Var.m(ojbVar, qfc.a);
                        }
                    } else {
                        this.Y.m(ojbVar, qfc.a);
                    }
                }
                if (rg2Var2 != null) {
                    return rg2Var2.v(ojbVar, f46Var, obj);
                }
                this.a.n(this);
                return this.K0.F ? eb7.c : eb7.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Object obj) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof x79;
        eb7 eb7Var = eb7.d;
        w79 w79Var = this.X;
        if (!z) {
            ojb ojbVar = (ojb) objG;
            if (ojbVar.b(obj) != eb7Var || (obj instanceof mx3)) {
                return;
            }
            rfc.d(w79Var, obj, ojbVar);
            return;
        }
        x79 x79Var = (x79) objG;
        Object[] objArr = x79Var.b;
        long[] jArr = x79Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ojb ojbVar2 = (ojb) objArr[(i << 3) + i3];
                        if (ojbVar2.b(obj) == eb7Var && !(obj instanceof mx3)) {
                            rfc.d(w79Var, obj, ojbVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean x(Set set) {
        boolean z = set instanceof oec;
        w79 w79Var = this.x;
        w79 w79Var2 = this.g;
        if (z) {
            lec lecVar = ((oec) set).a;
            Object[] objArr = lecVar.b;
            long[] jArr = lecVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (w79Var2.c(obj) || w79Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (w79Var2.c(obj2) || w79Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean y() {
        synchronized (this.d) {
            p2a p2aVar = this.F0;
            boolean z = false;
            if (p2aVar != null && (p2aVar.h.get() != r2a.e || p2aVar.i != o8c.k())) {
                AtomicReference atomicReference = p2aVar.h;
                r2a r2aVar = r2a.f;
                r2a r2aVar2 = r2a.d;
                while (!atomicReference.compareAndSet(r2aVar, r2aVar2) && atomicReference.get() == r2aVar) {
                }
                p2aVar.l.a.c(9);
                return false;
            }
            q();
            try {
                w79 w79Var = this.Y;
                this.Y = rfc.j();
                try {
                    l46 l46Var = this.K0;
                    cfd cfdVar = this.E0;
                    rr9 rr9Var = l46Var.e.l;
                    if (!rr9Var.T()) {
                        wf2.a("Expected applyChanges() to have been called");
                    }
                    if (w79Var.e > 0 || !l46Var.s.isEmpty()) {
                        l46Var.P = cfdVar;
                        try {
                            l46Var.p(w79Var, null);
                            l46Var.P = null;
                            z = !rr9Var.T();
                        } catch (Throwable th) {
                            l46Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        r();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.Y = w79Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.a.c()) {
                        bw bwVar = this.J0;
                        try {
                            bwVar.k(this.e, this.K0.D());
                            bwVar.e();
                        } finally {
                            bwVar.d();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(oec oecVar) {
        Object obj;
        while (true) {
            Object obj2 = this.c.get();
            if (obj2 == null || obj2.equals(feg.g)) {
                obj = oecVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, oecVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    cva.k(this.c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = oecVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.c;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.d) {
                            r();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }
}
