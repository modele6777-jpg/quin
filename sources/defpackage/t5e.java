package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t5e {
    public final Object a = new Object();
    public final q69 b;

    public t5e() {
        q69 q69Var = v67.a;
        this.b = new q69();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[LOOP:0: B:7:0x000e->B:24:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x005f A[EDGE_INSN: B:32:0x005f->B:25:0x005f BREAK  A[LOOP:0: B:7:0x000e->B:24:0x005c], SYNTHETIC] */
    public final void a() {
        synchronized (this.a) {
            q69 q69Var = this.b;
            long[] jArr = q69Var.a;
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
                                int i4 = (i << 3) + i3;
                                int i5 = q69Var.b[i4];
                                r5e r5eVar = (r5e) q69Var.c[i4];
                                if (r5eVar.c != s5e.e && !r5eVar.b.f()) {
                                    q69Var.h(i4);
                                }
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
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[DONT_INVERT, PHI: r5
  0x0068: PHI (r5v3 long) = (r5v2 long), (r5v4 long) binds: [B:8:0x0023, B:24:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:0: B:7:0x0015->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[EDGE_INSN: B:34:0x006d->B:27:0x006d BREAK  A[LOOP:0: B:7:0x0015->B:26:0x006a], SYNTHETIC] */
    public final long b() {
        long j;
        int i;
        synchronized (this.a) {
            q69 q69Var = this.b;
            int[] iArr = q69Var.b;
            Object[] objArr = q69Var.c;
            long[] jArr = q69Var.a;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                r5e r5eVar = (r5e) objArr[i6];
                                i = i3;
                                if (r5eVar.c == s5e.e || r5eVar.b.f()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                        }
                        if (i4 != i3) {
                            break;
                        }
                        if (i2 != length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return j;
    }

    public final void c(z5e z5eVar) {
        q69 q69Var = this.b;
        int[] iArr = q69Var.b;
        Object[] objArr = q69Var.c;
        long[] jArr = q69Var.a;
        int i = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        int i6 = iArr[i5];
                        r5e r5eVar = (r5e) objArr[i5];
                        s5e s5eVar = r5eVar.c;
                        t5e t5eVar = r5eVar.e;
                        int iOrdinal = s5eVar.ordinal();
                        if (iOrdinal == 0) {
                            r5eVar.c = s5e.f;
                        } else if (iOrdinal == i) {
                            r5eVar.c = s5e.e;
                            aw2 aw2VarZ0 = z5eVar.Z0();
                            lyd lydVar = r5eVar.d;
                            if (lydVar != null) {
                                lydVar.h(null);
                            }
                            r5eVar.d = ynb.V(aw2VarZ0, null, null, new q5e(t5eVar, r5eVar, null), 3);
                        } else if (iOrdinal == 3) {
                            aw2 aw2VarZ1 = z5eVar.Z0();
                            lyd lydVar2 = r5eVar.d;
                            if (lydVar2 != null) {
                                lydVar2.h(null);
                            }
                            r5eVar.d = ynb.V(aw2VarZ1, null, null, new q5e(t5eVar, r5eVar, null), 3);
                        }
                    }
                    j >>= 8;
                    i4++;
                    i = 2;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            }
            i2++;
            i = 2;
        }
    }

    public final float d(int i) {
        synchronized (this.a) {
            r5e r5eVar = (r5e) this.b.b(i);
            float fFloatValue = 0.0f;
            if (r5eVar == null) {
                return 0.0f;
            }
            if (r5eVar.c != s5e.e) {
                fFloatValue = ((Number) r5eVar.b.e()).floatValue();
            }
            return fFloatValue;
        }
    }
}
