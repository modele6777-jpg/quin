package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pm2 extends i09 implements ug2, co8 {
    public final gic E0;
    public boolean F0;
    public w31 G0;
    public final rhc H0;
    public boolean J0;
    public boolean L0;
    public ks9 Z;
    public final m6c I0 = new m6c(6);
    public long K0 = -1;

    public pm2(ks9 ks9Var, gic gicVar, boolean z, w31 w31Var, rhc rhcVar) {
        this.Z = ks9Var;
        this.E0 = gicVar;
        this.F0 = z;
        this.G0 = w31Var;
        this.H0 = rhcVar;
    }

    public static boolean n1(pm2 pm2Var, hkb hkbVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = pm2Var.m1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jP1 = pm2Var.p1(hkbVar, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jP1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jP1 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.co8
    public final void a(long j) {
        int iL;
        long j2;
        long jM1 = m1();
        this.K0 = j;
        int iOrdinal = this.Z.ordinal();
        if (iOrdinal == 0) {
            iL = pa7.L((int) (j & 4294967295L), (int) (jM1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
            iL = pa7.L((int) (j >> 32), (int) (jM1 >> 32));
        }
        if (iL >= 0) {
            return;
        }
        if (this.F0) {
            j2 = 0;
        } else {
            j2 = this.Z == ks9.a ? ((long) (((int) (jM1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM1 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        hkb hkbVar = (hkb) this.H0.invoke();
        if (hkbVar == null || this.L0 || this.J0 || !n1(this, hkbVar, jM1, 0L, 2) || n1(this, hkbVar, 0L, j3, 1)) {
            return;
        }
        this.J0 = true;
        o1(j3);
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    public final float l1(w31 w31Var, long j) {
        float f;
        hkb hkbVar;
        int iCompare;
        long j2 = this.K0;
        p89 p89Var = (p89) this.I0.b;
        int i = p89Var.c - 1;
        Object[] objArr = p89Var.a;
        if (i < objArr.length) {
            hkbVar = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                hkb hkbVar2 = (hkb) ((mm2) objArr[i]).a.invoke();
                if (hkbVar2 != null) {
                    long jE = hkbVar2.e();
                    long jY0 = db6.Y0(m1());
                    f = 0.0f;
                    int iOrdinal = this.Z.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (jY0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            ap.c();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jY0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (hkbVar != null) {
                            break;
                        }
                        hkbVar = hkbVar2;
                        break;
                    }
                    hkbVar = hkbVar2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            hkbVar = null;
        }
        if (hkbVar == null) {
            hkb hkbVar3 = this.J0 ? (hkb) this.H0.invoke() : null;
            if (hkbVar3 == null) {
                return f;
            }
            hkbVar = hkbVar3;
        }
        long jY1 = db6.Y0(j2);
        int iOrdinal2 = this.Z.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = hkbVar.b;
            return w31Var.a(f2 - ((int) (j & 4294967295L)), hkbVar.d - f2, Float.intBitsToFloat((int) (jY1 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = hkbVar.a;
            return w31Var.a(f3 - ((int) (j >> 32)), hkbVar.c - f3, Float.intBitsToFloat((int) (jY1 >> 32)));
        }
        ap.c();
        return f;
    }

    public final long m1() {
        long j = this.K0;
        if (e77.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void o1(long j) {
        w31 w31Var = this.G0;
        if (w31Var == null) {
            w31Var = (w31) eb3.H(this, y31.a);
        }
        w31 w31Var2 = w31Var;
        if (this.L0) {
            l37.c("launchAnimation called when previous animation was running");
        }
        w31 w31Var3 = this.G0;
        if (w31Var3 == null) {
            w31Var3 = (w31) eb3.H(this, y31.a);
        }
        w31Var3.getClass();
        w31.a.getClass();
        lgf lgfVar = new lgf(v31.b);
        ynb.V(Z0(), null, dw2.d, new om2(this, lgfVar, w31Var2, j, null), 1);
    }

    public final long p1(hkb hkbVar, long j, long j2) {
        long jY0 = db6.Y0(j);
        int iOrdinal = this.Z.ordinal();
        if (iOrdinal == 0) {
            w31 w31Var = this.G0;
            if (w31Var == null) {
                w31Var = (w31) eb3.H(this, y31.a);
            }
            float f = hkbVar.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(w31Var.a(f - ((int) (j2 & 4294967295L)), hkbVar.d - f, Float.intBitsToFloat((int) (jY0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            ap.c();
            return 0L;
        }
        w31 w31Var2 = this.G0;
        if (w31Var2 == null) {
            w31Var2 = (w31) eb3.H(this, y31.a);
        }
        float f2 = hkbVar.a;
        return (((long) Float.floatToRawIntBits(w31Var2.a(f2 - ((int) (j2 >> 32)), hkbVar.c - f2, Float.intBitsToFloat((int) (jY0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
