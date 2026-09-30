package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ix9 {
    public final m6c a;
    public final q69 b;
    public final r69 c;
    public final o69 d;
    public final q69 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final e08 n;
    public final gg7 o;

    public ix9(m6c m6cVar, e08 e08Var, f12 f12Var) {
        this.a = m6cVar;
        q69 q69Var = v67.a;
        this.b = new q69();
        this.c = new r69();
        int i = n67.a;
        this.d = new o69();
        this.e = new q69();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = e08Var;
        this.o = new gg7(17, f12Var);
    }

    public final int a(gg7 gg7Var, int i, boolean z) {
        List list;
        List list2;
        q69 q69Var = this.e;
        if (q69Var.a(i)) {
            Object objB = q69Var.b(i);
            objB.getClass();
            return ((w81) objB).b;
        }
        q69 q69Var2 = this.b;
        int i2 = 0;
        if (q69Var2.a(i)) {
            if (!z || (list2 = (List) q69Var2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((d08) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        r81 r81Var = new r81(this, gg7Var, 1);
        long j = gg7Var.n().u;
        e08 e08Var = (e08) gg7Var.d;
        if (e08Var == null) {
            pa7.g0("state");
            throw null;
        }
        q69Var2.i(i, t72.H(e08Var.a(i, j, true, new kz8(16, r81Var, gg7Var))));
        if (!z || (list = (List) q69Var2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((d08) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
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
    public final void c(gg7 gg7Var, int i, int i2) {
        int i3;
        int i4;
        q69 q69Var = this.e;
        w81 w81Var = (w81) q69Var.b(i);
        qfc qfcVar = w81.c;
        if (w81Var != null) {
            w81Var.b = i2;
            w81Var.a = qfcVar;
        } else {
            w81Var = new w81();
            w81Var.a = qfcVar;
            w81Var.b = i2;
        }
        q69Var.i(i, w81Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            } else {
                i4 = -1;
            }
        } else if (Math.signum(this.f) <= 0.0f || this.j <= 0) {
            i4 = -1;
        } else {
            i3 = this.h - 1;
            i4 = i3;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.m) {
            r81 r81Var = new r81(this, gg7Var, 0);
            long j = gg7Var.n().u;
            e08 e08Var = (e08) gg7Var.d;
            if (e08Var == null) {
                pa7.g0("state");
                throw null;
            }
            this.b.i(i4, t72.H(e08Var.a(i4, j, true, new kz8(16, r81Var, gg7Var))));
        }
        h();
    }

    public final void d(gg7 gg7Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iL = ym8.L(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (iL > i8) {
                    iL = i8;
                }
                this.j = iL;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(gg7Var, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iL2 = ym8.L(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (iL2 > i9) {
                iL2 = i9;
            }
            this.k = iL2;
        }
        while (this.k > 0 && (i7 = this.i) != -1 && i7 < this.m - 1) {
            int iA2 = a(gg7Var, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    public final void e(float f, qx9 qx9Var) {
        ix9 ix9Var;
        boolean z;
        int i;
        int i2;
        int i3;
        gg7 gg7Var = this.o;
        gg7Var.c = qx9Var;
        gg7Var.d = this.n;
        float f2 = -f;
        h();
        if (gg7Var.k()) {
            xo1.A(gg7Var.n());
            gg7Var.n();
            this.m = gg7Var.r();
            int iJ = gg7Var.j();
            int iM = gg7Var.m();
            int iR = gg7Var.r();
            int iP = gg7Var.p();
            int iO = gg7Var.o();
            q69 q69Var = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - iP;
                this.h = iJ;
                while (this.j > 0 && (i3 = this.h) > 0 && q69Var.a(i3 - 1)) {
                    Object objB = q69Var.b(this.h - 1);
                    objB.getClass();
                    int i4 = ((w81) objB).b;
                    this.h--;
                    this.j -= i4;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - iO;
                this.i = iM;
                while (this.k > 0 && (i2 = this.i) < iR - 1 && q69Var.a(i2 + 1)) {
                    Object objB2 = q69Var.b(this.i + 1);
                    objB2.getClass();
                    int i5 = ((w81) objB2).b;
                    this.i++;
                    this.k -= i5;
                }
                f(this.i + 1, iR - 1);
            }
        }
        if (gg7Var.k()) {
            xo1.A(gg7Var.n());
            if (gg7Var.n().t != null) {
                i = ((yx9) this.a.b).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            ix9Var = this;
            ix9Var.d(gg7Var, gg7Var.j(), gg7Var.m(), i, gg7Var.o(), gg7Var.p(), f2, f2 <= 0.0f ? true : z);
        } else {
            ix9Var = this;
        }
        ix9Var.f = f2;
        ix9Var.h();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        r69 r69Var = this.c;
        r69Var.b();
        q69 q69Var = this.b;
        int[] iArr2 = q69Var.b;
        long[] jArr2 = q69Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            r69Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        o69 o69Var = this.d;
        int[] iArr3 = o69Var.b;
        long[] jArr3 = o69Var.a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                r69Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        q69 q69Var2 = this.e;
        int[] iArr4 = q69Var2.b;
        long[] jArr4 = q69Var2.a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            r69Var.a(i3);
                        }
                        j6 >>= 8;
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
        int[] iArr5 = r69Var.b;
        long[] jArr5 = r69Var.a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) q69Var.g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((d08) list.get(i19)).cancel();
                            }
                        }
                        int iC = o69Var.c(i18);
                        if (iC >= 0) {
                            o69Var.e--;
                            long[] jArr6 = o69Var.a;
                            int i20 = o69Var.d;
                            int i21 = iC >> 3;
                            int i22 = (iC & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iC - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        q69Var2.g(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        q69 q69Var = this.b;
        long[] jArr = q69Var.a;
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
                        int i4 = (i << 3) + i3;
                        int i5 = q69Var.b[i4];
                        List list = (List) q69Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((d08) list.get(i6)).cancel();
                        }
                        q69Var.h(i4);
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

    public final void h() {
        bp.Y(this.j, "prefetchWindowStartExtraSpace");
        bp.Y(this.k, "prefetchWindowEndExtraSpace");
        bp.Y(this.h, "prefetchWindowStartIndex");
        bp.Y(this.i, "prefetchWindowEndIndex");
    }
}
