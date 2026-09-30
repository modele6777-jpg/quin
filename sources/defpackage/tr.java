package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tr implements lu9 {
    public final sw3 a;
    public long b = 9205357640488583168L;
    public final ls4 c;
    public final vz9 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final sv3 i;

    public tr(Context context, sw3 sw3Var, long j, bx9 bx9Var) {
        this.a = sw3Var;
        ls4 ls4Var = new ls4(context, abg.Z(j));
        this.c = ls4Var;
        this.d = new vz9(wef.a, qk6.L0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        sr srVar = new sr(0, this);
        hia hiaVar = ibe.a;
        obe obeVar = new obe(null, null, null, srVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new h4e(obeVar, this, ls4Var) : new ub6(obeVar, this, ls4Var, bx9Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
    
        if (r4 == r6) goto L51;
     */
    @Override // defpackage.lu9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r19, defpackage.l26 r21, defpackage.xn2 r22) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr.a(long, l26, xn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:105:0x020d  */
    /* JADX WARN: Code duplicated, block: B:108:0x021d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x022e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0237  */
    /* JADX WARN: Code duplicated, block: B:121:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0297  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:171:0x031b  */
    /* JADX WARN: Code duplicated, block: B:173:0x032c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0330  */
    /* JADX WARN: Code duplicated, block: B:180:0x0340  */
    /* JADX WARN: Code duplicated, block: B:187:0x034a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b A[PHI: r7
  0x012b: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x0159, B:62:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    @Override // defpackage.lu9
    public final long b(long j, int i, a26 a26Var) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fJ;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jF;
        long jF2;
        boolean z;
        boolean zF;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        tb6 tb6Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        tb6 tb6Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        tb6 tb6Var3;
        float f3;
        int i3;
        long j3;
        boolean z2;
        int i4;
        boolean z3;
        if (ald.e(this.g)) {
            return ((hl9) a26Var.d(new hl9(j))).a;
        }
        boolean z4 = this.f;
        boolean z5 = true;
        ls4 ls4Var = this.c;
        if (!z4) {
            if (ls4.g(ls4Var.f)) {
                i(0L);
            }
            if (ls4.g(ls4Var.g)) {
                j(0L);
            }
            if (ls4.g(ls4Var.d)) {
                k(0L);
            }
            if (ls4.g(ls4Var.e)) {
                h(0L);
            }
            this.f = true;
        }
        int i5 = pt.a;
        float f4 = i == 2 ? 4.0f : 1.0f;
        long jH = hl9.h(j, f4);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!ls4.g(ls4Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (ls4.g(ls4Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fH = h(jH);
                    if (!ls4.g(ls4Var.e)) {
                        ls4Var.b().finish();
                    }
                    fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jH & 4294967295L)) ? Float.intBitsToFloat(i6) : fH / f4;
                }
            } else {
                float fK = k(jH);
                j2 = 4294967295L;
                if (!ls4.g(ls4Var.d)) {
                    ls4Var.e().finish();
                }
                fIntBitsToFloat = fK == Float.intBitsToFloat((int) (jH & 4294967295L)) ? Float.intBitsToFloat(i6) : fK / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!ls4.g(ls4Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fJ = i(jH);
                if (!ls4.g(ls4Var.f)) {
                    ls4Var.c().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jH >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f4;
                }
            } else if (ls4.g(ls4Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fJ = j(jH);
                if (!ls4.g(ls4Var.g)) {
                    ls4Var.d().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jH >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!hl9.c(jFloatToRawIntBits, 0L)) {
                g();
            }
            jF = hl9.f(j, jFloatToRawIntBits);
            long j4 = ((hl9) a26Var.d(new hl9(jF))).a;
            jF2 = hl9.f(jF, j4);
            if ((Float.intBitsToFloat((int) (jF >> 32)) == 0.0f || Float.intBitsToFloat((int) (jF & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (ls4.g(ls4Var.f) || ls4.g(ls4Var.d) || ls4.g(ls4Var.g) || ls4.g(ls4Var.e)))) {
                e();
            }
            if (i == 1) {
                i3 = (int) (jF2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j3 = jF2;
                    i(j3);
                } else {
                    j3 = jF2;
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        j(j3);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        k(j3);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            h(j3);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!hl9.c(jF, 0L)) {
                if (ls4.f(ls4Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = ls4Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof tb6) {
                        tb6 tb6Var4 = (tb6) edgeEffectC;
                        float f5 = tb6Var4.b + fIntBitsToFloat6;
                        tb6Var4.b = f5;
                        if (Math.abs(f5) > tb6Var4.a) {
                            tb6Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = ls4.f(ls4Var.f);
                }
                if (ls4.f(ls4Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = ls4Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof tb6) {
                        tb6Var3 = (tb6) edgeEffectD;
                        f3 = tb6Var3.b + fIntBitsToFloat5;
                        tb6Var3.b = f3;
                        if (Math.abs(f3) > tb6Var3.a) {
                            tb6Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || ls4.f(ls4Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (ls4.f(ls4Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    edgeEffectE = ls4Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof tb6) {
                        tb6Var2 = (tb6) edgeEffectE;
                        f2 = tb6Var2.b + fIntBitsToFloat4;
                        tb6Var2.b = f2;
                        if (Math.abs(f2) > tb6Var2.a) {
                            tb6Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || ls4.f(ls4Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (ls4.f(ls4Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    edgeEffectB = ls4Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof tb6) {
                        tb6Var = (tb6) edgeEffectB;
                        f = tb6Var.b + fIntBitsToFloat3;
                        tb6Var.b = f;
                        if (Math.abs(f) > tb6Var.a) {
                            tb6Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || ls4.f(ls4Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                g();
            }
            return hl9.g(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!ls4.g(ls4Var.f)) {
            if (ls4.g(ls4Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (ls4.g(ls4Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!hl9.c(jFloatToRawIntBits, 0L)) {
            g();
        }
        jF = hl9.f(j, jFloatToRawIntBits);
        long j5 = ((hl9) a26Var.d(new hl9(jF))).a;
        jF2 = hl9.f(jF, j5);
        if (Float.intBitsToFloat((int) (jF >> 32)) == 0.0f) {
            e();
        } else {
            e();
        }
        if (i == 1) {
            i3 = (int) (jF2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j3 = jF2;
                i(j3);
            } else {
                j3 = jF2;
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    j(j3);
                } else {
                    z2 = false;
                }
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (j3 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                k(j3);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    h(j3);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!hl9.c(jF, 0L)) {
            if (ls4.f(ls4Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (ls4.f(ls4Var.g)) {
                edgeEffectD = ls4Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof tb6) {
                    tb6Var3 = (tb6) edgeEffectD;
                    f3 = tb6Var3.b + fIntBitsToFloat5;
                    tb6Var3.b = f3;
                    if (Math.abs(f3) > tb6Var3.a) {
                        tb6Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (ls4.f(ls4Var.d)) {
                edgeEffectE = ls4Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                if (edgeEffectE instanceof tb6) {
                    tb6Var2 = (tb6) edgeEffectE;
                    f2 = tb6Var2.b + fIntBitsToFloat4;
                    tb6Var2.b = f2;
                    if (Math.abs(f2) > tb6Var2.a) {
                        tb6Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (ls4.f(ls4Var.e)) {
                edgeEffectB = ls4Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                if (edgeEffectB instanceof tb6) {
                    tb6Var = (tb6) edgeEffectB;
                    f = tb6Var.b + fIntBitsToFloat3;
                    tb6Var.b = f;
                    if (Math.abs(f) > tb6Var.a) {
                        tb6Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (!zF) {
                z5 = false;
            }
            z = z5;
        }
        if (z) {
            g();
        }
        return hl9.g(jFloatToRawIntBits, j5);
    }

    @Override // defpackage.lu9
    public final rv3 c() {
        return this.i;
    }

    @Override // defpackage.lu9
    public final boolean d() {
        ls4 ls4Var = this.c;
        EdgeEffect edgeEffect = ls4Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? xq.m(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = ls4Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? xq.m(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = ls4Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? xq.m(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = ls4Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? xq.m(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void e() {
        boolean z;
        ls4 ls4Var = this.c;
        EdgeEffect edgeEffect = ls4Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ls4Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ls4Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ls4Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            g();
        }
    }

    public final long f() {
        long jF = this.b;
        if ((9223372034707292159L & jF) == 9205357640488583168L) {
            jF = dec.f(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jF & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void g() {
        if (this.e) {
            this.d.setValue(wef.a);
        }
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fW = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fW = xq.w(edgeEffectB, fW, f);
        } else {
            edgeEffectB.onPull(fW, f);
        }
        return (i2 >= 31 ? xq.m(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fW) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = xq.w(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? xq.m(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fW = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fW = xq.w(edgeEffectD, fW, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fW, fIntBitsToFloat);
        }
        return (i2 >= 31 ? xq.m(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fW) : Float.intBitsToFloat(i);
    }

    public final float k(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = xq.w(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? xq.m(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void l(long j) {
        boolean zA = ald.a(this.g, 0L);
        boolean zA2 = ald.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iL = ym8.L(Float.intBitsToFloat((int) (j >> 32)));
            long jL = (((long) ym8.L(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iL) << 32);
            ls4 ls4Var = this.c;
            ls4Var.c = jL;
            EdgeEffect edgeEffect = ls4Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ls4Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ls4Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect4 = ls4Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect5 = ls4Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ls4Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ls4Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect8 = ls4Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jL), (int) (jL >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        e();
    }
}
