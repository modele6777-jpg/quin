package defpackage;

import android.content.ClipDescription;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jse {
    public final z2f a;
    public final ute b;
    public sw3 c;
    public final tze d;
    public final aw2 e;
    public final rfa f;
    public c52 g;
    public boolean h;
    public boolean i;
    public eh6 j;
    public x16 l;
    public x16 m;
    public final vz9 r;
    public final vz9 s;
    public final vz9 t;
    public mkd u;
    public int v;
    public pta w;
    public final mx3 x;
    public final zw0 y;
    public final vz9 k = q1c.f(Boolean.TRUE);
    public final vz9 n = q1c.f(new hl9(9205357640488583168L));
    public final vz9 o = q1c.f(new hl9(9205357640488583168L));
    public final vz9 p = q1c.f(null);
    public final vz9 q = q1c.f(mre.a);

    public jse(z2f z2fVar, ute uteVar, sw3 sw3Var, boolean z, tze tzeVar, aw2 aw2Var, rfa rfaVar, c52 c52Var) {
        this.a = z2fVar;
        this.b = uteVar;
        this.c = sw3Var;
        this.d = tzeVar;
        this.e = aw2Var;
        this.f = rfaVar;
        this.g = c52Var;
        this.i = z;
        Boolean bool = Boolean.FALSE;
        this.r = q1c.f(bool);
        this.s = q1c.f(sue.a);
        this.t = q1c.f(bool);
        this.v = -1;
        this.x = zrd.b(new hv0(this, 3));
        c52 c52Var2 = this.g;
        zw0 zw0Var = new zw0();
        zw0Var.c = c52Var2;
        this.y = zw0Var;
    }

    public static final void f(lmb lmbVar, lmb lmbVar2, jse jseVar) {
        if ((lmbVar.element & 9223372034707292159L) != 9205357640488583168L) {
            lmbVar.element = 9205357640488583168L;
            lmbVar2.element = 9205357640488583168L;
            jseVar.b();
        }
    }

    public static final void h(lmb lmbVar, lmb lmbVar2, jse jseVar) {
        if ((lmbVar.element & 9223372034707292159L) != 9205357640488583168L) {
            jseVar.b();
            lmbVar.element = 9205357640488583168L;
            lmbVar2.element = 0L;
            jseVar.v = -1;
        }
    }

    public final void A(sg6 sg6Var, long j) {
        this.p.setValue(sg6Var);
        this.o.setValue(new hl9(j));
    }

    public final long B(vne vneVar, int i, int i2, boolean z, wuc wucVar, boolean z2, boolean z3, fh6 fh6Var) {
        long jB;
        eh6 eh6Var;
        long j = vneVar.d;
        eue eueVar = new eue(j);
        if (z3 || (!z2 && eue.d(j))) {
            eueVar = null;
        }
        ste steVarC = this.b.c();
        if (steVarC == null) {
            jB = eue.b;
        } else if (eueVar == null && pa7.t(wucVar, gec.d)) {
            jB = u3c.b(i, i2);
        } else {
            mkd mkdVarH = hcc.h(steVarC, i, i2, this.v, eueVar != null ? eueVar.a : eue.b, eueVar == null, z);
            if (eueVar == null || mkdVarH.m(this.u)) {
                vuc vucVarA = wucVar.a(mkdVarH);
                jB = u3c.b(vucVarA.a.b, vucVarA.b.b);
                this.u = mkdVarH;
                this.v = z ? i : i2;
            } else {
                jB = eueVar.a;
            }
        }
        if (fh6Var != null && ((eue.g(jB) != eue.g(j) || eue.f(jB) != eue.f(j)) && (eh6Var = this.j) != null)) {
            ((afa) eh6Var).a(fh6Var.a);
        }
        return jB;
    }

    public final hkb a(ste steVar, vne vneVar) {
        float f;
        if (!eue.d(vneVar.d)) {
            return hkb.e;
        }
        hkb hkbVarC = steVar.c((int) (vneVar.d >> 32));
        float fFloor = (float) Math.floor(this.c.p0(2.0f));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (steVar.a.h == cv7.a) {
            f = (fFloor / 2.0f) + hkbVarC.a;
        } else {
            f = hkbVarC.c - (fFloor / 2.0f);
        }
        float f2 = fFloor / 2.0f;
        float f3 = ((int) (steVar.c >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new hkb(fFloor2 - f2, hkbVarC.b, fFloor2 + f2, hkbVarC.d);
    }

    public final void b() {
        this.p.setValue(null);
        this.o.setValue(new hl9(9205357640488583168L));
        this.n.setValue(new hl9(9205357640488583168L));
    }

    public final Object c(boolean z, gbe gbeVar) {
        k00 k00Var;
        Object objA;
        z2f z2fVar = this.a;
        if (eue.d(z2fVar.d().d)) {
            k00Var = null;
        } else {
            vne vneVarD = z2fVar.d();
            k00Var = new k00(vneVarD.c.subSequence(eue.g(vneVarD.d), eue.f(vneVarD.d)).toString());
            if (z) {
                z2fVar.a();
            }
        }
        return (k00Var != null && (objA = this.g.a(pa7.h0(k00Var), gbeVar)) == bw2.a) ? objA : wef.a;
    }

    public final Object d(gbe gbeVar) {
        k00 k00Var;
        Object objA;
        z2f z2fVar = this.a;
        if (eue.d(z2fVar.d().d) || !m()) {
            k00Var = null;
        } else {
            vne vneVarD = z2fVar.d();
            k00Var = new k00(vneVarD.c.subSequence(eue.g(vneVarD.d), eue.f(vneVarD.d)).toString());
            z2fVar.c(false);
        }
        return (k00Var != null && (objA = this.g.a(pa7.h0(k00Var), gbeVar)) == bw2.a) ? objA : wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(tia tiaVar, zn2 zn2Var) throws Throwable {
        tre treVar;
        lmb lmbVar;
        Throwable th;
        lmb lmbVar2;
        if (zn2Var instanceof tre) {
            treVar = (tre) zn2Var;
            int i = treVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                treVar.label = i - Integer.MIN_VALUE;
            } else {
                treVar = new tre(this, zn2Var);
            }
        } else {
            treVar = new tre(this, zn2Var);
        }
        tre treVar2 = treVar;
        Object obj = treVar2.result;
        int i2 = treVar2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lmbVar2 = (lmb) treVar2.L$1;
            lmbVar = (lmb) treVar2.L$0;
            try {
                jzb.q(obj);
                f(lmbVar, lmbVar2, this);
                return wef.a;
            } catch (Throwable th2) {
                th = th2;
                f(lmbVar, lmbVar2, this);
                throw th;
            }
        }
        jzb.q(obj);
        lmb lmbVar3 = new lmb();
        lmbVar3.element = 9205357640488583168L;
        lmb lmbVar4 = new lmb();
        lmbVar4.element = 9205357640488583168L;
        try {
            bv9 bv9Var = new bv9(lmbVar3, this, lmbVar4, 19);
            lre lreVar = new lre(lmbVar3, lmbVar4, this, 1);
            lre lreVar2 = new lre(lmbVar3, lmbVar4, this, 2);
            o7b o7bVar = new o7b(lmbVar4, this, lmbVar3, 15);
            treVar2.L$0 = lmbVar3;
            treVar2.L$1 = lmbVar4;
            treVar2.label = 1;
            Object objH = rk4.h(tiaVar, bv9Var, lreVar, lreVar2, o7bVar, treVar2);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
            lmbVar = lmbVar3;
            lmbVar2 = lmbVar4;
            f(lmbVar, lmbVar2, this);
            return wef.a;
        } catch (Throwable th3) {
            lmbVar = lmbVar3;
            th = th3;
            lmbVar2 = lmbVar4;
            f(lmbVar, lmbVar2, this);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object g(tia tiaVar, boolean z, zn2 zn2Var) throws Throwable {
        ure ureVar;
        sg6 sg6Var;
        lmb lmbVar;
        lmb lmbVar2;
        lmb lmbVar3;
        if (zn2Var instanceof ure) {
            ureVar = (ure) zn2Var;
            int i = ureVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ureVar.label = i - Integer.MIN_VALUE;
            } else {
                ureVar = new ure(this, zn2Var);
            }
        } else {
            ureVar = new ure(this, zn2Var);
        }
        ure ureVar2 = ureVar;
        Object obj = ureVar2.result;
        int i2 = ureVar2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sg6Var = (sg6) ureVar2.L$2;
            lmbVar2 = (lmb) ureVar2.L$1;
            lmbVar3 = (lmb) ureVar2.L$0;
            try {
                jzb.q(obj);
                if (l() == sg6Var) {
                    h(lmbVar3, lmbVar2, this);
                }
                return wef.a;
            } catch (Throwable th) {
                th = th;
                if (l() == sg6Var) {
                    h(lmbVar3, lmbVar2, this);
                }
                throw th;
            }
        }
        jzb.q(obj);
        lmb lmbVar4 = new lmb();
        lmbVar4.element = 9205357640488583168L;
        lmb lmbVar5 = new lmb();
        lmbVar5.element = 0L;
        sg6 sg6Var2 = z ? sg6.b : sg6.c;
        try {
            try {
                fl0 fl0Var = new fl0(lmbVar4, this, z, sg6Var2, lmbVar5, 5);
                sg6Var2 = sg6Var2;
                lre lreVar = new lre(lmbVar4, this, lmbVar5, 3);
                lre lreVar2 = new lre(lmbVar4, this, lmbVar5, 0);
                lmbVar3 = lmbVar4;
                try {
                    l30 l30Var = new l30(lmbVar5, this, sg6Var2, lmbVar3, z);
                    lmbVar = lmbVar5;
                    sg6Var = sg6Var2;
                    lmbVar4 = lmbVar3;
                    try {
                        ureVar2.L$0 = lmbVar4;
                        ureVar2.L$1 = lmbVar;
                        ureVar2.L$2 = sg6Var;
                        ureVar2.label = 1;
                        Object objH = rk4.h(tiaVar, fl0Var, lreVar, lreVar2, l30Var, ureVar2);
                        bw2 bw2Var = bw2.a;
                        if (objH == bw2Var) {
                            return bw2Var;
                        }
                        lmbVar2 = lmbVar;
                        lmbVar3 = lmbVar4;
                        if (l() == sg6Var) {
                            h(lmbVar3, lmbVar2, this);
                        }
                        return wef.a;
                    } catch (Throwable th2) {
                        th = th2;
                        lmbVar2 = lmbVar;
                        lmbVar3 = lmbVar4;
                        if (l() == sg6Var) {
                            h(lmbVar3, lmbVar2, this);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sg6Var = sg6Var2;
                    lmbVar2 = lmbVar5;
                    if (l() == sg6Var) {
                        h(lmbVar3, lmbVar2, this);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                sg6Var = sg6Var2;
                lmbVar = lmbVar5;
                lmbVar2 = lmbVar;
                lmbVar3 = lmbVar4;
                if (l() == sg6Var) {
                    h(lmbVar3, lmbVar2, this);
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            sg6Var = sg6Var2;
        }
    }

    public final Object i(tia tiaVar, gbe gbeVar) {
        Object objL1 = ((obe) tiaVar).l1(new vre(this, null), gbeVar);
        return objL1 == bw2.a ? objL1 : wef.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if ((r0 != null ? defpackage.dj6.D(r5, defpackage.dj6.Z(r0)) : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gpe j(boolean r12) {
        /*
            r11 = this;
            z2f r0 = r11.a
            vne r0 = r0.d()
            vz9 r1 = r11.r
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            vz9 r2 = r11.q
            java.lang.Object r2 = r2.getValue()
            mre r2 = (defpackage.mre) r2
            mre r3 = defpackage.mre.a
            r4 = 0
            if (r2 != r3) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = r4
        L22:
            sg6 r3 = r11.l()
            if (r1 == 0) goto L93
            if (r2 == 0) goto L93
            long r1 = r0.d
            boolean r1 = defpackage.eue.d(r1)
            if (r1 == 0) goto L93
            iy9 r1 = r0.f
            if (r1 != 0) goto L93
            java.lang.CharSequence r0 = r0.c
            int r0 = r0.length()
            if (r0 <= 0) goto L93
            sg6 r0 = defpackage.sg6.a
            if (r3 == r0) goto L76
            ird r1 = defpackage.iqf.j()
            if (r1 == 0) goto L4e
            a26 r0 = r1.e()
        L4c:
            r2 = r0
            goto L50
        L4e:
            r0 = 0
            goto L4c
        L50:
            ird r3 = defpackage.iqf.l(r1)
            hkb r0 = r11.k()     // Catch: java.lang.Throwable -> L70
            long r5 = r0.c()     // Catch: java.lang.Throwable -> L70
            defpackage.iqf.p(r1, r3, r2)
            bv7 r0 = r11.q()
            if (r0 == 0) goto L6d
            hkb r0 = defpackage.dj6.Z(r0)
            boolean r4 = defpackage.dj6.D(r5, r0)
        L6d:
            if (r4 == 0) goto L93
            goto L76
        L70:
            r0 = move-exception
            r11 = r0
            defpackage.iqf.p(r1, r3, r2)
            throw r11
        L76:
            gpe r4 = new gpe
            if (r12 == 0) goto L84
            hkb r11 = r11.k()
            long r11 = r11.c()
        L82:
            r6 = r11
            goto L8a
        L84:
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            txb r9 = defpackage.txb.a
            r10 = 0
            r5 = 1
            r8 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L93:
            gpe r11 = defpackage.gpe.f
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jse.j(boolean):gpe");
    }

    public final hkb k() {
        ste steVarC = this.b.c();
        return steVarC == null ? hkb.e : a(steVarC, this.a.d());
    }

    public final sg6 l() {
        return (sg6) this.p.getValue();
    }

    public final boolean m() {
        return this.i;
    }

    public final long n() {
        vz9 vz9Var = this.o;
        if ((((hl9) vz9Var.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        vz9 vz9Var2 = this.n;
        if ((((hl9) vz9Var2.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return xxb.p(this.b, ((hl9) vz9Var.getValue()).a);
        }
        long j = ((hl9) vz9Var.getValue()).a;
        long j2 = ((hl9) vz9Var2.getValue()).a;
        bv7 bv7VarQ = q();
        return hl9.g(j, hl9.f(j2, bv7VarQ != null ? bv7VarQ.c(0L) : 9205357640488583168L));
    }

    public final long o(boolean z) {
        long j;
        ste steVarC = this.b.c();
        if (steVarC == null) {
            return 0L;
        }
        long j2 = this.a.d().d;
        if (z) {
            int i = eue.c;
            j = j2 >> 32;
        } else {
            int i2 = eue.c;
            j = 4294967295L & j2;
        }
        return t4c.s(steVarC, (int) j, z, eue.h(j2));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    public final gpe p(boolean z, boolean z2) {
        int iMax;
        long j;
        bv7 bv7VarQ;
        sg6 sg6Var = z ? sg6.b : sg6.c;
        ste steVarC = this.b.c();
        gpe gpeVar = gpe.f;
        if (steVarC == null) {
            return gpeVar;
        }
        z2f z2fVar = this.a;
        long j2 = z2fVar.d().d;
        if (eue.d(j2)) {
            return gpeVar;
        }
        long jO = o(z);
        if (((mre) this.q.getValue()) == mre.a) {
            if (l() != sg6Var) {
                bv7 bv7VarQ2 = q();
                if (bv7VarQ2 != null ? dj6.D(jO, dj6.Z(bv7VarQ2)) : false) {
                    if (z2fVar.d().f == null) {
                        if (z) {
                            iMax = (int) (j2 >> 32);
                        } else {
                            iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                        }
                        txb txbVarA = steVarC.a(iMax);
                        boolean zH = eue.h(j2);
                        if (z2) {
                            bv7VarQ = q();
                            if (bv7VarQ != null) {
                                jO = xxb.n(jO, dj6.Z(bv7VarQ));
                            }
                        } else {
                            jO = 9205357640488583168L;
                        }
                        long j3 = jO;
                        if (z) {
                            j = j2 >> 32;
                        } else {
                            j = j2 & 4294967295L;
                        }
                        return new gpe(true, j3, mxb.g(steVarC, (int) j), txbVarA, zH);
                    }
                }
            } else if (z2fVar.d().f == null) {
                if (z) {
                    iMax = (int) (j2 >> 32);
                } else {
                    iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                }
                txb txbVarA2 = steVarC.a(iMax);
                boolean zH2 = eue.h(j2);
                if (z2) {
                    bv7VarQ = q();
                    if (bv7VarQ != null) {
                        jO = xxb.n(jO, dj6.Z(bv7VarQ));
                    }
                } else {
                    jO = 9205357640488583168L;
                }
                long j4 = jO;
                if (z) {
                    j = j2 >> 32;
                } else {
                    j = j2 & 4294967295L;
                }
                return new gpe(true, j4, mxb.g(steVarC, (int) j), txbVarA2, zH2);
            }
        }
        return gpeVar;
    }

    public final bv7 q() {
        bv7 bv7VarE = this.b.e();
        if (bv7VarE == null || !bv7VarE.h()) {
            return null;
        }
        return bv7VarE;
    }

    public final void r() {
        rfa rfaVar = this.f;
        if (rfaVar == null) {
            return;
        }
        z2f z2fVar = this.a;
        CharSequence charSequence = z2fVar.d().c;
        long j = z2fVar.d().d;
        if (charSequence.length() <= 0 || eue.d(j)) {
            return;
        }
        ynb.V(this.e, null, dw2.d, new wre(rfaVar, charSequence, j, this, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(boolean z, zn2 zn2Var) {
        zre zreVar;
        yib yibVar;
        a52 a52Var;
        String strK;
        if (zn2Var instanceof zre) {
            zreVar = (zre) zn2Var;
            int i = zreVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zreVar.label = i - Integer.MIN_VALUE;
            } else {
                zreVar = new zre(this, zn2Var);
            }
        } else {
            zreVar = new zre(this, zn2Var);
        }
        Object objB = zreVar.result;
        int i2 = zreVar.label;
        int i3 = 2;
        wef wefVar = wef.a;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objB);
            x16 x16Var = this.m;
            if (x16Var == null || (yibVar = (yib) x16Var.invoke()) == null) {
                zreVar.label = 1;
                if (t(z, zreVar) != obj) {
                    return wefVar;
                }
            } else {
                c52 c52Var = this.g;
                zreVar.L$0 = yibVar;
                zreVar.Z$0 = z;
                zreVar.label = 2;
                objB = c52Var.b(zreVar);
                if (objB != obj) {
                }
            }
            return obj;
        }
        if (i2 == 1) {
            jzb.q(objB);
            return wefVar;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                jzb.q(objB);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = zreVar.Z$0;
        yibVar = (yib) zreVar.L$0;
        jzb.q(objB);
        a52 a52Var2 = (a52) objB;
        if (a52Var2 == null) {
            zreVar.L$0 = null;
            zreVar.label = 3;
            if (t(z, zreVar) == obj) {
                return obj;
            }
        } else {
            a52Var2.a.getDescription();
            sug sugVarD = ((wr4) yibVar).b.d(new sug(a52Var2, i3, 19));
            if (sugVarD != null && (a52Var = (a52) sugVarD.c) != null && (strK = hfc.k(a52Var)) != null) {
                z2f.h(this.a, strK, false, z, 10);
                return wefVar;
            }
        }
        return wefVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r10 == r7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(boolean r9, defpackage.zn2 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ase
            if (r0 == 0) goto L13
            r0 = r10
            ase r0 = (defpackage.ase) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ase r0 = new ase
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 0
            wef r4 = defpackage.wef.a
            r5 = 2
            r6 = 1
            bw2 r7 = defpackage.bw2.a
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L36
            if (r1 != r5) goto L30
            boolean r9 = r0.Z$0
            defpackage.jzb.q(r10)
            goto L6b
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r2
        L36:
            boolean r9 = r0.Z$0
            defpackage.jzb.q(r10)
            goto L4c
        L3c:
            defpackage.jzb.q(r10)
            c52 r10 = r8.g
            r0.Z$0 = r9
            r0.label = r6
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r7) goto L4c
            goto L6a
        L4c:
            a52 r10 = (defpackage.a52) r10
            if (r10 == 0) goto L77
            r0.Z$0 = r9
            r0.label = r5
            android.content.ClipData r10 = r10.a
            android.content.ClipData$Item r10 = r10.getItemAt(r3)
            if (r10 == 0) goto L67
            java.lang.CharSequence r10 = r10.getText()
            if (r10 == 0) goto L67
            java.lang.String r10 = r10.toString()
            goto L68
        L67:
            r10 = r2
        L68:
            if (r10 != r7) goto L6b
        L6a:
            return r7
        L6b:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L70
            goto L77
        L70:
            z2f r8 = r8.a
            r0 = 10
            defpackage.z2f.h(r8, r10, r3, r9, r0)
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jse.t(boolean, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    public final boolean u(long j) {
        int iG;
        l17 l17Var;
        boolean z;
        rwc rwcVar;
        int i;
        long jB;
        long j2;
        rwc rwcVar2;
        x2f x2fVar;
        ste steVarC = this.b.c();
        if (steVarC == null || (iG = steVarC.b.g(j)) == -1) {
            return false;
        }
        z2f z2fVar = this.a;
        mx3 mx3Var = z2fVar.d;
        vz9 vz9Var = z2fVar.e;
        f77 f77Var = (mx3Var == null || (x2fVar = (x2f) mx3Var.getValue()) == null) ? null : x2fVar.b;
        long jA = f77Var != null ? f77Var.a(iG, false) : u3c.b(iG, iG);
        long jF = z2fVar.f(jA);
        if (eue.d(jA) && eue.d(jF)) {
            l17Var = l17.a;
        } else if (eue.d(jA) || eue.d(jF)) {
            l17Var = (!eue.d(jA) || eue.d(jF)) ? l17.d : l17.b;
        } else {
            l17Var = l17.c;
        }
        int iOrdinal = l17Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                z = false;
                if (iOrdinal == 2) {
                    hkb hkbVarC = steVarC.c((int) (jF >> 32));
                    hkb hkbVarC2 = steVarC.c((int) (jF & 4294967295L));
                    float fV = cgg.v(j, hkbVarC);
                    float fV2 = cgg.v(j, hkbVarC2);
                    if (fV == fV2 || fV >= fV2) {
                        j2 = jA & 4294967295L;
                    }
                    i = (int) j2;
                    rwcVar = null;
                } else if (iOrdinal != 3) {
                    ap.c();
                    return false;
                }
            } else {
                z = false;
                hkb hkbVarC3 = steVarC.c((int) (jF >> 32));
                hkb hkbVarC4 = steVarC.c((int) (jF & 4294967295L));
                float fV3 = cgg.v(j, hkbVarC3);
                float fV4 = cgg.v(j, hkbVarC4);
                if (fV3 != fV4 && fV3 < fV4) {
                    q2g q2gVar = q2g.a;
                    rwcVar2 = new rwc(q2gVar, q2gVar);
                } else {
                    q2g q2gVar2 = q2g.b;
                    rwcVar2 = new rwc(q2gVar2, q2gVar2);
                }
                rwcVar = rwcVar2;
                i = (int) (jA >> 32);
            }
            jB = u3c.b(i, i);
            if (!eue.c(jB, z2fVar.a.d().d) && (rwcVar == null || rwcVar.equals((rwc) vz9Var.getValue()))) {
                return z;
            }
            z2fVar.k(jB);
            if (rwcVar != null) {
                vz9Var.setValue(rwcVar);
            }
            return true;
        }
        z = false;
        j2 = jA >> 32;
        i = (int) j2;
        rwcVar = null;
        jB = u3c.b(i, i);
        if (!eue.c(jB, z2fVar.a.d().d)) {
        }
        z2fVar.k(jB);
        if (rwcVar != null) {
            vz9Var.setValue(rwcVar);
        }
        return true;
    }

    public final void v(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void w(boolean z) {
        this.r.setValue(Boolean.valueOf(z));
    }

    public final void x(sue sueVar) {
        this.s.setValue(sueVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(zn2 zn2Var) {
        fse fseVar;
        lne lneVar;
        lyd lydVar;
        lne lneVar2;
        lyd lydVar2;
        if (zn2Var instanceof fse) {
            fseVar = (fse) zn2Var;
            int i = fseVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fseVar.label = i - Integer.MIN_VALUE;
            } else {
                fseVar = new fse(this, zn2Var);
            }
        } else {
            fseVar = new fse(this, zn2Var);
        }
        Object objO = fseVar.result;
        int i2 = fseVar.label;
        tze tzeVar = this.d;
        sue sueVar = sue.a;
        vz9 vz9Var = this.s;
        try {
            if (i2 == 0) {
                jzb.q(objO);
                ise iseVar = new ise(this, null);
                fseVar.label = 1;
                objO = jgb.O(iseVar, fseVar);
                bw2 bw2Var = bw2.a;
                if (objO == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objO);
            }
            w(false);
            if (((sue) vz9Var.getValue()) != sueVar && (lneVar2 = tzeVar.a) != null && (lydVar2 = lneVar2.J0) != null) {
                lydVar2.h(null);
                lneVar2.J0 = null;
            }
            return wef.a;
        } catch (Throwable th) {
            w(false);
            if (((sue) vz9Var.getValue()) != sueVar && (lneVar = tzeVar.a) != null && (lydVar = lneVar.J0) != null) {
                lydVar.h(null);
                lneVar.J0 = null;
            }
            throw th;
        }
    }

    public final wef z() {
        ClipDescription primaryClipDescription;
        zw0 zw0Var = this.y;
        c52 c52Var = (c52) zw0Var.c;
        boolean zHasPrimaryClip = if9.y(c52Var).hasPrimaryClip();
        zw0Var.a = zHasPrimaryClip;
        boolean z = false;
        if (zHasPrimaryClip && (primaryClipDescription = if9.y(c52Var).getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        zw0Var.b = z;
        return wef.a;
    }
}
