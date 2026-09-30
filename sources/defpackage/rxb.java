package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rxb implements sw3, tg2 {
    public vz X;
    public t5e Y;
    public float a;
    public z5e b;
    public a6e c;
    public a6e d;
    public a6e e;
    public a6e f;
    public q69 g;
    public q69 v;
    public q69 w;
    public long x;
    public int y;
    public vz z;

    public final void a(vz vzVar, vz vzVar2, x16 x16Var) {
        vz vzVar3 = this.z;
        vz vzVar4 = this.X;
        try {
            this.z = vzVar;
            this.X = vzVar2;
            x16Var.invoke();
        } finally {
            this.z = vzVar3;
            this.X = vzVar4;
        }
    }

    public final void b(long j) {
        e((byte) 34, this.z, this.X);
        vz vzVar = this.z;
        vz vzVar2 = this.X;
        ggf ggfVar = ggf.a;
        if (vzVar == ggfVar) {
            if ((this.y & 2) != 0) {
                q69 q69Var = this.g;
                if (q69Var == null || (vzVar = (vz) q69Var.b(51)) == null) {
                    vzVar = sxb.a;
                }
            } else {
                vzVar = null;
            }
        }
        if (vzVar2 == ggfVar) {
            if ((this.y & 2) != 0) {
                q69 q69Var2 = this.v;
                if (q69Var2 == null || (vzVar2 = (vz) q69Var2.b(51)) == null) {
                    vzVar2 = sxb.a;
                }
            } else {
                vzVar2 = null;
            }
        }
        this.y = (vzVar == null || vzVar2 == null) ? this.y & (-3) : this.y | 2;
        g(51, vzVar, vzVar2);
        a6e a6eVar = this.c;
        if (a6eVar != null) {
            a6eVar.b(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0100 A[EDGE_INSN: B:132:0x0100->B:61:0x0100 BREAK  A[LOOP:0: B:40:0x0098->B:59:0x00f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[Catch: all -> 0x011b, LOOP:0: B:40:0x0098->B:59:0x00f9, LOOP_END, TryCatch #1 {all -> 0x011b, blocks: (B:37:0x0084, B:40:0x0098, B:42:0x00ad, B:44:0x00bb, B:46:0x00c5, B:55:0x00ee, B:53:0x00e5, B:66:0x010c, B:68:0x0112, B:82:0x0138, B:87:0x0149, B:90:0x0155, B:93:0x015e, B:98:0x0175, B:94:0x0163, B:97:0x0174, B:96:0x016c, B:74:0x0120, B:78:0x012c, B:81:0x0136, B:99:0x0178, B:59:0x00f9), top: B:127:0x0084 }] */
    public final void c() {
        a6e a6eVar;
        long j;
        long j2;
        boolean z;
        vz vzVar;
        long j3;
        int i;
        boolean z2;
        z5e z5eVar = this.b;
        z5eVar.getClass();
        this.b = null;
        t5e t5eVar = this.Y;
        if (t5eVar != null) {
            synchronized (t5eVar.a) {
                z2 = t5eVar.b.e == 0;
            }
            if (z2) {
                if (this.x == 0 && this.y == 0) {
                    return;
                }
            }
        } else if (this.x == 0) {
            return;
        }
        a6e a6eVar2 = this.c;
        if (a6eVar2 == null || (a6eVar = this.d) == null) {
            return;
        }
        int iH = b6e.h(this.y, this.x);
        long jI = b6e.i(this.y, this.x);
        int iH2 = a6eVar.h(iH, a6eVar2);
        long jI2 = a6eVar.i(a6eVar2, jI);
        if (jI2 == 0 && iH2 == 0) {
            return;
        }
        t5e t5eVar2 = this.Y;
        if (t5eVar2 == null) {
            t5eVar2 = new t5e();
            this.Y = t5eVar2;
        }
        long jH = (((long) b6e.h(iH2, jI2)) << 50) | ((-257698037761L) & jI2);
        long j4 = (((long) iH) << 50) | jI;
        q69 q69Var = this.g;
        q69 q69Var2 = this.v;
        q69 q69Var3 = this.w;
        synchronized (t5eVar2.a) {
            try {
                q69 q69Var4 = t5eVar2.b;
                int[] iArr = q69Var4.b;
                Object[] objArr = q69Var4.c;
                long[] jArr = q69Var4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j5 = jArr[i2];
                        j = jH;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            } else {
                                i2++;
                                jH = j;
                            }
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j5 & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    int i6 = iArr[i5];
                                    j3 = j5;
                                    r5e r5eVar = (r5e) objArr[i5];
                                    int iOrdinal = r5eVar.c.ordinal();
                                    i = i4;
                                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                                        r5eVar.c = s5e.a;
                                    }
                                } else {
                                    j3 = j5;
                                    i = i4;
                                }
                                j5 = j3 >> 8;
                                i4 = i + 1;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                            jH = j;
                        }
                    }
                } else {
                    j = jH;
                }
                j2 = 0;
                if (j4 != 0) {
                    long j6 = j4;
                    while (j6 != 0) {
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                        if (q69Var == null || (vzVar = (vz) q69Var.b(iNumberOfTrailingZeros)) == null) {
                            vzVar = q69Var3 != null ? (vz) q69Var3.b(iNumberOfTrailingZeros) : null;
                            if (vzVar == null) {
                                vzVar = q69Var2 != null ? (vz) q69Var2.b(iNumberOfTrailingZeros) : null;
                                if (vzVar == null) {
                                    vzVar = sxb.a;
                                }
                            }
                        }
                        long j7 = 1 << iNumberOfTrailingZeros;
                        boolean z3 = (j & j7) != 0;
                        long j8 = j6;
                        q69 q69Var5 = t5eVar2.b;
                        r5e r5eVar2 = (r5e) q69Var5.b(iNumberOfTrailingZeros);
                        if (r5eVar2 != null) {
                            if (z3 || !pa7.t(r5eVar2.a, vzVar)) {
                                r5eVar2.a = vzVar;
                                r5eVar2.c = s5e.c;
                            } else {
                                r5eVar2.c = s5e.b;
                            }
                            j6 = j8 ^ j7;
                        } else if (z3) {
                            q69Var5.i(iNumberOfTrailingZeros, new r5e(t5eVar2, vzVar));
                        }
                        j2 |= j7;
                        j6 = j8 ^ j7;
                    }
                }
                t5eVar2.c(z5eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j2 != 0) {
            a6e a6eVar3 = this.f;
            if (a6eVar3 == null) {
                a6eVar3 = new a6e();
                this.f = a6eVar3;
            }
            long j9 = 2251799813685247L & j2;
            int i7 = (int) (j2 >> 50);
            long jI3 = b6e.i(i7, j9);
            int iH3 = b6e.h(i7, j9);
            a6eVar.g(a6eVar3, jI3, iH3);
            a6e a6eVar4 = this.e;
            if (a6eVar4 != null) {
                a6eVar4.g(a6eVar3, jI3, iH3);
            }
            this.e = null;
        }
        synchronized (t5eVar2.a) {
            z = t5eVar2.b.e == 0;
        }
        if (z) {
            this.Y = null;
        }
    }

    public final int d() {
        int i;
        t5e t5eVar = this.Y;
        int i2 = 0;
        if (t5eVar == null) {
            return 0;
        }
        q69 q69Var = t5eVar.b;
        int[] iArr = q69Var.b;
        Object[] objArr = q69Var.c;
        long[] jArr = q69Var.a;
        int length = jArr.length - 2;
        long j = 0;
        if (length < 0) {
            i = i2;
            break;
        }
        int i3 = 0;
        i = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr[i6];
                        if (i7 < 50) {
                            j |= 1 << ((byte) i7);
                        } else {
                            i |= 1 << (i7 - 50);
                        }
                    }
                    j2 >>= 8;
                }
                if (i4 != 8) {
                    break;
                }
            }
            if (i3 == length) {
                i2 = i;
                i = i2;
                break;
            }
            i3++;
        }
        return b6e.e(i) | b6e.g(j);
    }

    public final void e(byte b, vz vzVar, vz vzVar2) {
        ggf ggfVar = ggf.a;
        if (vzVar == ggfVar) {
            long j = this.x;
            if (b >= 50 || (j & (1 << b)) == 0) {
                vzVar = null;
            } else {
                q69 q69Var = this.g;
                if (q69Var == null || (vzVar = (vz) q69Var.b(b)) == null) {
                    vzVar = sxb.a;
                }
            }
        }
        if (vzVar2 == ggfVar) {
            long j2 = this.x;
            if (b >= 50 || (j2 & (1 << b)) == 0) {
                vzVar2 = null;
            } else {
                q69 q69Var2 = this.v;
                if (q69Var2 == null || (vzVar2 = (vz) q69Var2.b(b)) == null) {
                    vzVar2 = sxb.a;
                }
            }
        }
        this.x = (vzVar == null || vzVar2 == null) ? this.x & (~(1 << b)) : this.x | (1 << b);
        g(b, vzVar, vzVar2);
    }

    public final void g(int i, vz vzVar, vz vzVar2) {
        if (vzVar == null || vzVar.equals(sxb.a)) {
            q69 q69Var = this.g;
            if (q69Var != null) {
            }
        } else {
            q69 q69Var2 = this.g;
            if (q69Var2 == null) {
                q69 q69Var3 = v67.a;
                q69Var2 = new q69();
                this.g = q69Var2;
            }
            q69Var2.i(i, vzVar);
        }
        if (vzVar2 != null && !vzVar2.equals(sxb.a)) {
            q69 q69Var4 = this.v;
            if (q69Var4 == null) {
                q69 q69Var5 = v67.a;
                q69Var4 = new q69();
                this.v = q69Var4;
            }
            q69Var4.i(i, vzVar2);
            return;
        }
        q69 q69Var6 = this.v;
        if (q69Var6 != null) {
            vz vzVar3 = (vz) q69Var6.b(i);
            q69Var6.g(i);
            if (vzVar3 != null) {
                q69 q69Var7 = this.w;
                if (q69Var7 == null) {
                    q69 q69Var8 = v67.a;
                    q69Var7 = new q69();
                    this.w = q69Var7;
                }
                q69Var7.i(i, vzVar3);
            }
        }
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a;
    }

    public final void h(int i, a6e a6eVar) {
        boolean z;
        a6e a6eVar2 = this.c;
        if (a6eVar2 == null) {
            a6eVar2 = b6e.n;
        }
        a6e a6eVar3 = a6eVar2;
        a6eVar3.f(a6eVar);
        t5e t5eVar = this.Y;
        if (t5eVar == null) {
            return;
        }
        a6e a6eVar4 = this.f;
        if (a6eVar4 == null && (a6eVar4 = this.d) == null) {
            return;
        }
        a6e a6eVar5 = a6eVar4;
        synchronized (t5eVar.a) {
            z = t5eVar.b.e == 0;
        }
        if (z) {
            this.f = null;
            this.Y = null;
            return;
        }
        int i2 = i & 1;
        int i3 = i & 8;
        int i4 = i & 2;
        int i5 = i & 4;
        int i6 = i & 32;
        int i7 = i & 16;
        long j = (i2 != 0 ? b6e.b : 0L) | (i3 != 0 ? b6e.c : 0L) | (i4 != 0 ? b6e.d : 0L) | (i5 != 0 ? b6e.e : 0L) | (i6 != 0 ? b6e.f : 0L) | (i7 != 0 ? b6e.g : 0L);
        int i8 = (i2 != 0 ? b6e.h : 0) | (i3 != 0 ? b6e.i : 0) | (i4 != 0 ? b6e.j : 0) | (i5 != 0 ? b6e.k : 0) | (i6 != 0 ? b6e.l : 0);
        int i9 = i7 != 0 ? b6e.m : 0;
        long jB = t5eVar.b();
        int i10 = (int) (jB >> 50);
        long jI = b6e.i(i10, 2251799813685247L & jB) & j;
        int iH = b6e.h(i10, jI) & (i8 | i9);
        if (jI == 0 && iH == 0) {
            return;
        }
        b6e.a(a6eVar5, a6eVar3, t5eVar, jI, iH, a6eVar);
    }

    @Override // defpackage.sw3
    public final float h0() {
        return 1.0f;
    }

    public final void j(x4d x4dVar) {
        vz vzVar = this.z;
        vz vzVar2 = this.X;
        ggf ggfVar = ggf.a;
        if (vzVar == ggfVar) {
            if ((this.y & 8) != 0) {
                q69 q69Var = this.g;
                if (q69Var == null || (vzVar = (vz) q69Var.b(53)) == null) {
                    vzVar = sxb.a;
                }
            } else {
                vzVar = null;
            }
        }
        if (vzVar2 == ggfVar) {
            if ((this.y & 8) != 0) {
                q69 q69Var2 = this.v;
                if (q69Var2 == null || (vzVar2 = (vz) q69Var2.b(53)) == null) {
                    vzVar2 = sxb.a;
                }
            } else {
                vzVar2 = null;
            }
        }
        this.y = (vzVar == null || vzVar2 == null) ? this.y & (-9) : this.y | 8;
        g(53, vzVar, vzVar2);
        a6e a6eVar = this.c;
        if (a6eVar != null) {
            a6eVar.b |= 8;
            a6eVar.E = x4dVar;
        }
    }

    @Override // defpackage.tg2
    public final Object s0(b1b b1bVar) {
        z5e z5eVar = this.b;
        z5eVar.getClass();
        return eb3.H(z5eVar, b1bVar);
    }
}
