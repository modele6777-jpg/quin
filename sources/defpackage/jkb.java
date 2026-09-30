package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jkb {
    public final u67 a;
    public final AndroidComposeView b;
    public final os c;
    public final u98 d;
    public final i79 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public wp i;
    public long j;
    public final hla k;
    public final v79 l;

    public jkb(q69 q69Var, AndroidComposeView androidComposeView) {
        this.a = q69Var;
        this.b = androidComposeView;
        os osVar = new os(9, (char) 0);
        osVar.c = new long[192];
        osVar.d = new long[192];
        this.c = osVar;
        this.d = new u98();
        this.e = new i79();
        this.j = -1L;
        this.k = new hla(7, this);
        this.l = new v79();
    }

    public static boolean c(yf9 yf9Var) {
        ew9 ew9Var = yf9Var.k1;
        return (ew9Var == null || lmg.k0(((ne6) ew9Var).b())) ? false : true;
    }

    public static long f(LayoutNode layoutNode) {
        yf9 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long jD = 0;
        for (yf9 yf9Var = (c47) layoutNode.V0.d; yf9Var != null && yf9Var != outerCoordinator$ui; yf9Var = yf9Var.N0) {
            if (c(yf9Var)) {
                return 9223372034707292159L;
            }
            jD = w67.d(jD, yf9Var.W0);
        }
        return jD;
    }

    public static void i(LayoutNode layoutNode) {
        if (!layoutNode.c || c(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.c = false;
        if (layoutNode.e) {
            layoutNode.d = f(layoutNode);
            layoutNode.e = false;
        }
        if (w67.b(layoutNode.d, 9223372034707292159L)) {
            return;
        }
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            i((LayoutNode) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0250  */
    /* JADX WARN: Code duplicated, block: B:103:0x0259 A[LOOP:11: B:102:0x0257->B:103:0x0259, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0264 A[LOOP:9: B:95:0x0233->B:107:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x026d A[ADDED_TO_REGION, LOOP:12: B:110:0x026d->B:111:0x026f, LOOP_START, PHI: r1
  0x026d: PHI (r1v9 rwe) = (r1v8 rwe), (r1v10 rwe) binds: [B:109:0x026b, B:111:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x026f A[LOOP:12: B:110:0x026d->B:111:0x026f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x027a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0267 A[EDGE_INSN: B:136:0x0267->B:108:0x0267 BREAK  A[LOOP:9: B:95:0x0233->B:107:0x0264], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0267 A[EDGE_INSN: B:137:0x0267->B:108:0x0267 BREAK  A[LOOP:9: B:95:0x0233->B:107:0x0264], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x0197 A[ADDED_TO_REGION, LOOP:7: B:73:0x0197->B:74:0x0199, LOOP_START, PHI: r3
  0x0197: PHI (r3v8 rwe) = (r3v7 rwe), (r3v9 rwe) binds: [B:72:0x0195, B:74:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0199 A[LOOP:7: B:73:0x0197->B:74:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0225  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:97:0x023f  */
    /* JADX WARN: Code duplicated, block: B:99:0x024a  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        rwe rweVar;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        rwe rweVar2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        rwe rweVar3;
        long[] jArr4;
        long j9;
        long j10;
        wp wpVar = this.i;
        if (wpVar != null) {
            this.b.removeCallbacks(wpVar);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        os osVar = this.c;
        boolean z4 = true;
        u98 u98Var = this.d;
        if (z2) {
            this.f = false;
            i79 i79Var = this.e;
            Object[] objArr2 = i79Var.a;
            int i9 = i79Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((x16) objArr2[i10]).invoke();
            }
            long[] jArr5 = (long[]) osVar.c;
            int i11 = osVar.b;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    rwe rweVar4 = (rwe) ((q69) u98Var.e).b(((int) j11) & 33554431);
                    while (rweVar4 != null) {
                        rwe rweVar5 = rweVar4.d;
                        boolean z6 = z3;
                        long j14 = rweVar4.g;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        rweVar4.e = j12;
                        rweVar4.f = j13;
                        if (z7) {
                            rweVar4.g = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            rweVar4.a(j9, j10, u98Var.b, u98Var.c, (float[]) u98Var.g);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        rweVar4 = rweVar5;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) osVar.c;
            int i14 = osVar.b;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j15 = u98Var.b;
            long j16 = u98Var.c;
            float[] fArr2 = (float[]) u98Var.g;
            q69 q69Var = (q69) u98Var.e;
            j2 = 128;
            Object[] objArr3 = q69Var.c;
            long[] jArr7 = q69Var.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    osVar = osVar;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                rwe rweVar6 = (rwe) objArr3[(i17 << 3) + i21];
                                while (rweVar6 != null) {
                                    u98Var.a(rweVar6, j17, j16, fArr2, jCurrentTimeMillis);
                                    rweVar6 = rweVar6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    osVar = osVar;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = u98Var.b;
                j8 = u98Var.c;
                fArr = (float[]) u98Var.g;
                rweVar3 = (rwe) u98Var.f;
                if (rweVar3 != null) {
                    while (rweVar3 != null) {
                        LayoutNode layoutNodeS0 = vd0.s0(rweVar3.b);
                        long jB = wv7.a(layoutNodeS0).getRectManager().b(layoutNodeS0);
                        rweVar3.e = jB;
                        rweVar3.f = (((long) (layoutNodeS0.I() + ((int) (jB >> 32)))) << 32) | (((long) (layoutNodeS0.r() + ((int) (jB & 4294967295L)))) & 4294967295L);
                        u98Var.a(rweVar3, j7, j8, fArr, jCurrentTimeMillis);
                        rweVar3 = rweVar3.d;
                    }
                }
            }
            if (this.h) {
                i2 = 0;
                this.h = false;
                os osVar2 = osVar;
                jArr2 = (long[]) osVar2.c;
                int i23 = osVar2.b;
                jArr3 = (long[]) osVar2.d;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != ikb.a) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                osVar2.b = i7;
                osVar2.c = jArr3;
                osVar2.d = jArr2;
            } else {
                i2 = 0;
            }
            j4 = u98Var.a;
            if (j4 <= jCurrentTimeMillis) {
                q69 q69Var2 = (q69) u98Var.e;
                objArr = q69Var2.c;
                jArr = q69Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (rweVar2 = (rwe) objArr[(i3 << 3) + i5]; rweVar2 != null; rweVar2 = rweVar2.d) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                rweVar = (rwe) u98Var.f;
                if (rweVar != null) {
                    while (rweVar != null) {
                        rweVar = rweVar.d;
                    }
                }
                j4 = -1;
                u98Var.a = -1L;
            }
            if (j4 > j) {
                j();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = u98Var.b;
            j8 = u98Var.c;
            fArr = (float[]) u98Var.g;
            rweVar3 = (rwe) u98Var.f;
            if (rweVar3 != null) {
                while (rweVar3 != null) {
                    LayoutNode layoutNodeS1 = vd0.s0(rweVar3.b);
                    long jB2 = wv7.a(layoutNodeS1).getRectManager().b(layoutNodeS1);
                    rweVar3.e = jB2;
                    rweVar3.f = (((long) (layoutNodeS1.I() + ((int) (jB2 >> 32)))) << 32) | (((long) (layoutNodeS1.r() + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    u98Var.a(rweVar3, j7, j8, fArr, jCurrentTimeMillis);
                    rweVar3 = rweVar3.d;
                }
            }
        }
        if (this.h) {
            i2 = 0;
            this.h = false;
            os osVar3 = osVar;
            jArr2 = (long[]) osVar3.c;
            int i24 = osVar3.b;
            jArr3 = (long[]) osVar3.d;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != ikb.a) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            osVar3.b = i7;
            osVar3.c = jArr3;
            osVar3.d = jArr2;
        } else {
            i2 = 0;
        }
        j4 = u98Var.a;
        if (j4 <= jCurrentTimeMillis) {
            q69 q69Var3 = (q69) u98Var.e;
            objArr = q69Var3.c;
            jArr = q69Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (rweVar2 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            rweVar = (rwe) u98Var.f;
            if (rweVar != null) {
                while (rweVar != null) {
                    rweVar = rweVar.d;
                }
            }
            j4 = -1;
            u98Var.a = -1L;
        }
        if (j4 > j) {
            j();
        }
    }

    public final long b(LayoutNode layoutNode) {
        if (layoutNode.g == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.c)[d(layoutNode)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int d(LayoutNode layoutNode) {
        int i = layoutNode.g;
        if (i != -4) {
            int i2 = layoutNode.b;
            os osVar = this.c;
            long[] jArr = (long[]) osVar.c;
            if (i < 0 || i >= osVar.b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = osVar.b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            i37.a("LayoutNode " + layoutNode.b + " not found in RectList");
        }
        layoutNode.g = i;
        return i;
    }

    public final void e(LayoutNode layoutNode) {
        layoutNode.c = true;
        wo0 wo0Var = layoutNode.V0;
        wn8 wn8VarZ = layoutNode.z();
        int iY = wn8VarZ.Y();
        float fX = wn8VarZ.X();
        v79 v79Var = this.l;
        v79Var.b = 0.0f;
        v79Var.c = 0.0f;
        v79Var.d = iY;
        v79Var.e = fX;
        for (yf9 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.N0) {
            LayoutNode layoutNode2 = outerCoordinator$ui.J0;
            if (outerCoordinator$ui == layoutNode2.getOuterCoordinator$ui() && !layoutNode2.c) {
                long jB = b(layoutNode2);
                if (!w67.b(jB, 9223372034707292159L)) {
                    v79Var.e((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            ew9 ew9Var = outerCoordinator$ui.k1;
            if (ew9Var != null) {
                float[] fArrB = ((ne6) ew9Var).b();
                if (!lmg.k0(fArrB)) {
                    zm8.c(fArrB, v79Var);
                }
            }
            long j = outerCoordinator$ui.W0;
            v79Var.e((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) v79Var.b;
        int i2 = (int) v79Var.c;
        int i3 = (int) v79Var.d;
        int i4 = (int) v79Var.e;
        int i5 = layoutNode.b;
        int i6 = layoutNode.g;
        os osVar = this.c;
        if (i6 != -4) {
            int iD = d(layoutNode);
            long[] jArr = (long[]) osVar.c;
            jArr[iD] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iD + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iD + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            LayoutNode layoutNodeF = layoutNode.F();
            layoutNode.g = osVar.k(i5, i, i2, i3, i4, layoutNodeF != null ? layoutNodeF.b : -1, layoutNodeF != null ? d(layoutNodeF) : -4, wo0Var.i(UserMetadata.MAX_ATTRIBUTE_SIZE), wo0Var.i(16), ((q69) this.d.e).a(i5));
        }
        layoutNode.f = false;
        this.f = true;
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i8 = p89VarL.c;
        for (int i9 = 0; i9 < i8; i9++) {
            LayoutNode layoutNode3 = (LayoutNode) objArr[i9];
            if (layoutNode3.X()) {
                e(layoutNode3);
            }
        }
    }

    public final void g(LayoutNode layoutNode) {
        long j;
        boolean zX = layoutNode.X();
        wo0 wo0Var = layoutNode.V0;
        if (zX && layoutNode.f) {
            LayoutNode layoutNodeF = layoutNode.F();
            if (layoutNodeF == null || layoutNodeF.c) {
                j = layoutNodeF == null ? 0L : 9223372034707292159L;
            } else {
                if (layoutNodeF.e) {
                    layoutNodeF.e = false;
                    layoutNodeF.d = f(layoutNodeF);
                }
                j = layoutNodeF.d;
            }
            yf9 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            if (w67.b(j, 9223372034707292159L) || c(outerCoordinator$ui)) {
                e(layoutNode);
            } else if (layoutNode.c) {
                e(layoutNode);
                i(layoutNode);
            } else {
                long jD = w67.d(j, outerCoordinator$ui.W0);
                wn8 wn8VarZ = layoutNode.z();
                int iY = wn8VarZ.Y();
                int iX = wn8VarZ.X();
                int i = layoutNode.g;
                os osVar = this.c;
                if (i != -4) {
                    int iD = d(layoutNode);
                    if (layoutNodeF != null) {
                        int iD2 = d(layoutNodeF);
                        long[] jArr = (long[]) osVar.c;
                        long j2 = jArr[iD2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jD >> 32));
                        int i3 = ((int) j2) + ((int) (jD & 4294967295L));
                        long j3 = jArr[iD];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iD + 2;
                        long j4 = jArr[i6];
                        jArr[iD] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iD + 1] = (((long) (iY + i2)) << 32) | (((long) (iX + i3)) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            osVar.s(iD, i4, i5, j4);
                        }
                    } else {
                        int iD3 = d(layoutNode);
                        int i7 = (int) (jD >> 32);
                        int i8 = (int) (jD & 4294967295L);
                        long[] jArr2 = (long[]) osVar.c;
                        long j5 = jArr2[iD3];
                        jArr2[iD3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iD3 + 1] = (((long) (iX + i8)) & 4294967295L) | (((long) (iY + i7)) << 32);
                        int i9 = iD3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            osVar.s(iD3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = layoutNode.b;
                    boolean zI = wo0Var.i(UserMetadata.MAX_ATTRIBUTE_SIZE);
                    boolean zI2 = wo0Var.i(16);
                    boolean zA = ((q69) this.d.e).a(i12);
                    if (layoutNodeF != null) {
                        int i13 = layoutNodeF.b;
                        int iD4 = d(layoutNodeF);
                        int i14 = (int) (jD >> 32);
                        int i15 = (int) (jD & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) osVar.c;
                        if ((((int) jArr3[iD4 + 2]) & 33554431) != (33554431 & i13)) {
                            i37.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iD4];
                        int i17 = ((int) (j7 >> 32)) + i14;
                        int i18 = ((int) j7) + i15;
                        layoutNode.g = osVar.k(i16, i17, i18, i17 + iY, i18 + iX, i13, iD4, zI, zI2, zA);
                    } else {
                        int i19 = (int) (jD >> 32);
                        int i20 = (int) (jD & 4294967295L);
                        layoutNode.g = osVar.k(i12, i19, i20, i19 + iY, i20 + iX, -1, -4, zI, zI2, zA);
                    }
                }
            }
            layoutNode.f = false;
            this.f = true;
            j();
        }
    }

    public final void h(LayoutNode layoutNode) {
        if (layoutNode.g != -4) {
            int iD = d(layoutNode);
            long[] jArr = (long[]) this.c.c;
            jArr[iD] = -1;
            jArr[iD + 1] = -1;
            jArr[iD + 2] = ikb.a;
            layoutNode.g = -4;
            layoutNode.f = true;
            this.f = true;
            this.h = true;
        }
    }

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
    public final void j() {
        wp wpVar = this.i;
        boolean z = wpVar != null;
        long j = this.d.a;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            AndroidComposeView androidComposeView = this.b;
            if (wpVar != null) {
                androidComposeView.removeCallbacks(wpVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            wp wpVar2 = new wp(1, this.k);
            androidComposeView.postDelayed(wpVar2, jMax - jCurrentTimeMillis);
            this.i = wpVar2;
        }
    }
}
