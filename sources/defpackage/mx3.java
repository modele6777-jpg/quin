package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mx3 extends d1e implements h0e {
    public final x16 b;
    public final yrd c;
    public lx3 d = new lx3(qrd.h().g());

    public mx3(x16 x16Var, yrd yrdVar) {
        this.b = x16Var;
        this.c = yrdVar;
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.d;
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        this.d = (lx3) f1eVar;
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        a26 a26VarE = qrd.h().e();
        if (a26VarE != null) {
            a26VarE.d(this);
        }
        ird irdVarH = qrd.h();
        return j((lx3) qrd.g(this.d, irdVarH), irdVarH, true, this.b).f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final lx3 j(lx3 lx3Var, ird irdVar, boolean z, x16 x16Var) {
        lx3 lx3Var2;
        yrd yrdVar;
        int i;
        if (lx3Var.d(this, irdVar)) {
            if (z) {
                p89 p89VarA = zrd.a();
                Object[] objArr = p89VarA.a;
                int i2 = p89VarA.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((k46) objArr[i3]).b();
                }
                try {
                    e79 e79Var = lx3Var.e;
                    psd psdVar = zrd.a;
                    b77 b77Var = (b77) psdVar.get();
                    if (b77Var == null) {
                        b77Var = new b77();
                        psdVar.A(b77Var);
                    }
                    int i4 = b77Var.a;
                    Object[] objArr2 = e79Var.b;
                    int[] iArr = e79Var.c;
                    long[] jArr = e79Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        c1e c1eVar = (c1e) objArr2[i9];
                                        i = i6;
                                        b77Var.a = i4 + iArr[i9];
                                        a26 a26VarE = irdVar.e();
                                        if (a26VarE != null) {
                                            a26VarE.d(c1eVar);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    b77Var.a = i4;
                } finally {
                    Object[] objArr3 = p89VarA.a;
                    int i10 = p89VarA.c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((k46) objArr3[i11]).a();
                    }
                }
            }
            return lx3Var;
        }
        e79 e79Var2 = new e79();
        psd psdVar2 = zrd.a;
        b77 b77Var2 = (b77) psdVar2.get();
        if (b77Var2 == null) {
            b77Var2 = new b77();
            psdVar2.A(b77Var2);
        }
        b77 b77Var3 = b77Var2;
        int i12 = b77Var3.a;
        p89 p89VarA2 = zrd.a();
        Object[] objArr4 = p89VarA2.a;
        int i13 = p89VarA2.c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((k46) objArr4[i14]).b();
        }
        try {
            b77Var3.a = i12 + 1;
            Object objM = iqf.m(new kx3(i12, this, b77Var3, e79Var2, 0), x16Var);
            b77Var3.a = i12;
            Object[] objArr5 = p89VarA2.a;
            int i15 = p89VarA2.c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((k46) objArr5[i16]).a();
            }
            Object obj = qrd.c;
            synchronized (obj) {
                try {
                    ird irdVarH = qrd.h();
                    Object obj2 = lx3Var.f;
                    if (obj2 == lx3.h || (yrdVar = this.c) == null || !yrdVar.N(objM, obj2)) {
                        lx3 lx3Var3 = this.d;
                        synchronized (obj) {
                            f1e f1eVarK = qrd.k(lx3Var3, this);
                            f1eVarK.a(lx3Var3);
                            f1eVarK.a = irdVarH.g();
                            lx3Var2 = (lx3) f1eVarK;
                            lx3Var2.e = e79Var2;
                            lx3Var2.g = lx3Var2.e(this, irdVarH);
                            lx3Var2.f = objM;
                        }
                        return lx3Var2;
                    }
                    lx3Var.e = e79Var2;
                    lx3Var.g = lx3Var.e(this, irdVarH);
                    lx3Var2 = lx3Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b77 b77Var4 = (b77) zrd.a.get();
            if (b77Var4 == null || b77Var4.a != 0) {
                return lx3Var2;
            }
            qrd.h().m();
            synchronized (obj) {
                ird irdVarH2 = qrd.h();
                lx3Var2.c = irdVarH2.g();
                lx3Var2.d = irdVarH2.h();
                return lx3Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = p89VarA2.a;
            int i17 = p89VarA2.c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((k46) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    public final lx3 k() {
        ird irdVarH = qrd.h();
        return j((lx3) qrd.g(this.d, irdVarH), irdVarH, false, this.b);
    }

    public final String toString() {
        lx3 lx3Var = (lx3) qrd.f(this.d);
        return "DerivedState(value=" + (lx3Var.d(this, qrd.h()) ? String.valueOf(lx3Var.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
