package defpackage;

import android.content.ClipDescription;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cre {
    public boolean A;
    public final jbf a;
    public r38 d;
    public x16 f;
    public c52 g;
    public aw2 h;
    public rfa i;
    public eh6 j;
    public fo5 k;
    public final vz9 l;
    public final vz9 m;
    public long n;
    public eue o;
    public long p;
    public final vz9 q;
    public final vz9 r;
    public int s;
    public zse t;
    public mkd u;
    public eue v;
    public final vz9 w;
    public final tze x;
    public final are y;
    public final yqe z;
    public sl9 b = mrf.a;
    public a26 c = new ule(9);
    public final vz9 e = q1c.f(new zse(7, 0, (String) null));

    public cre(jbf jbfVar) {
        this.a = jbfVar;
        Boolean bool = Boolean.TRUE;
        this.l = q1c.f(bool);
        this.m = q1c.f(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = q1c.f(null);
        this.r = q1c.f(null);
        this.s = -1;
        this.t = new zse(7, 0L, (String) null);
        this.w = q1c.f(Boolean.FALSE);
        this.x = new tze();
        this.y = new are(this);
        this.z = new yqe(this);
    }

    public static zse b(k00 k00Var, long j) {
        return new zse(k00Var, j, (eue) null);
    }

    public final lyd a(boolean z) {
        aw2 aw2Var = this.h;
        if (aw2Var == null) {
            return null;
        }
        return ynb.V(aw2Var, null, dw2.d, new tqe(this, z, null), 1);
    }

    public final void c() {
        aw2 aw2Var = this.h;
        if (aw2Var != null) {
            ynb.V(aw2Var, null, dw2.d, new vqe(this, null), 1);
        }
    }

    public final void d(hl9 hl9Var) {
        if (!eue.d(l().b)) {
            r38 r38Var = this.d;
            tte tteVarD = r38Var != null ? r38Var.d() : null;
            int iF = (hl9Var == null || tteVarD == null) ? eue.f(l().b) : this.b.j(tteVarD.b(hl9Var.a, true));
            zse zseVarA = zse.a(l(), null, u3c.b(iF, iF), 5);
            this.c.d(zseVarA);
            this.v = new eue(zseVarA.b);
        }
        r((hl9Var == null || l().a.b.length() <= 0) ? ug6.a : ug6.c);
        u(false);
    }

    public final void e(boolean z) {
        fo5 fo5Var;
        r38 r38Var = this.d;
        if (r38Var != null && !r38Var.b() && (fo5Var = this.k) != null) {
            fo5.a(fo5Var);
        }
        this.t = l();
        u(z);
        r(ug6.b);
    }

    public final iy9 f() {
        String str;
        eue eueVar;
        k00 k00VarK = k();
        if (k00VarK == null || (str = k00VarK.b) == null || (eueVar = this.v) == null) {
            return null;
        }
        long j = eueVar.a;
        return new iy9(str, new eue(u3c.b(this.b.v((int) (j >> 32)), this.b.v((int) (j & 4294967295L)))));
    }

    public final hl9 g() {
        return (hl9) this.r.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        tte tteVarD;
        long j;
        r38 r38Var = this.d;
        if (r38Var == null || (tteVarD = r38Var.d()) == null) {
            return 9205357640488583168L;
        }
        ste steVar = tteVarD.a;
        k00 k00VarK = k();
        if (k00VarK == null) {
            return 9205357640488583168L;
        }
        if (!pa7.t(k00VarK.b, steVar.a.a.b)) {
            return 9205357640488583168L;
        }
        zse zseVarL = l();
        if (z) {
            long j2 = zseVarL.b;
            int i = eue.c;
            j = j2 >> 32;
        } else {
            long j3 = zseVarL.b;
            int i2 = eue.c;
            j = j3 & 4294967295L;
        }
        return t4c.s(steVar, this.b.v((int) j), z, eue.h(l().b));
    }

    public final k00 k() {
        r38 r38Var = this.d;
        if (r38Var != null) {
            return (k00) r38Var.a.b;
        }
        return null;
    }

    public final zse l() {
        return (zse) this.e.getValue();
    }

    public final void m() {
        lyd lydVar;
        lne lneVar = this.x.a;
        if (lneVar == null || (lydVar = lneVar.J0) == null) {
            return;
        }
        lydVar.h(null);
        lneVar.J0 = null;
    }

    public final void n(eue eueVar) {
        k00 k00VarK;
        String str;
        aw2 aw2Var;
        if (eueVar == null) {
            return;
        }
        long j = eueVar.a;
        rfa rfaVar = this.i;
        if (rfaVar == null || (k00VarK = k()) == null || (str = k00VarK.b) == null) {
            return;
        }
        sl9 sl9Var = this.b;
        long jB = u3c.b(sl9Var.v((int) (j >> 32)), sl9Var.v((int) (j & 4294967295L)));
        if (str.length() <= 0 || eue.d(jB) || (aw2Var = this.h) == null) {
            return;
        }
        ynb.V(aw2Var, null, null, new xqe(rfaVar, str, jB, eueVar, this, sl9Var, null), 3);
    }

    public final void o() {
        aw2 aw2Var = this.h;
        if (aw2Var != null) {
            ynb.V(aw2Var, null, dw2.d, new zqe(this, null), 1);
        }
    }

    public final void p(hl9 hl9Var) {
        this.r.setValue(hl9Var);
    }

    public final void q(sg6 sg6Var) {
        this.q.setValue(sg6Var);
    }

    public final void r(ug6 ug6Var) {
        r38 r38Var = this.d;
        if (r38Var != null) {
            if (r38Var.a() == ug6Var) {
                r38Var = null;
            }
            if (r38Var != null) {
                r38Var.k.setValue(ug6Var);
            }
        }
    }

    public final void s() {
        r38 r38Var;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            if (!i() || ((r38Var = this.d) != null && !((Boolean) r38Var.q.getValue()).booleanValue())) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
            } else {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                this.x.a();
            }
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(zn2 zn2Var) {
        bre breVar;
        if (zn2Var instanceof bre) {
            breVar = (bre) zn2Var;
            int i = breVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                breVar.label = i - Integer.MIN_VALUE;
            } else {
                breVar = new bre(this, zn2Var);
            }
        } else {
            breVar = new bre(this, zn2Var);
        }
        Object objValueOf = breVar.result;
        int i2 = breVar.label;
        if (i2 == 0) {
            jzb.q(objValueOf);
            c52 c52Var = this.g;
            if (c52Var != null) {
                breVar.L$0 = this;
                breVar.label = 1;
                ClipDescription primaryClipDescription = if9.y(c52Var).getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = bw2.a;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return wef.a;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (cre) breVar.L$0;
        jzb.q(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.w.setValue(bool);
        return wef.a;
    }

    public final void u(boolean z) {
        r38 r38Var = this.d;
        if (r38Var != null) {
            r38Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(zse zseVar, long j, boolean z, boolean z2, wuc wucVar, boolean z3, fh6 fh6Var) {
        tte tteVarD;
        char c;
        eh6 eh6Var;
        r38 r38Var = this.d;
        if (r38Var == null || (tteVarD = r38Var.d()) == null) {
            return eue.b;
        }
        sl9 sl9Var = this.b;
        long j2 = zseVar.b;
        k00 k00Var = zseVar.a;
        int i = eue.c;
        long jB = u3c.b(sl9Var.v((int) (j2 >> 32)), this.b.v((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int iB = tteVarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jB >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jB & 4294967295L);
        mkd mkdVar = this.u;
        int i4 = -1;
        if (z || mkdVar == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = this.s;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        mkd mkdVarH = hcc.h(tteVarD.a, i2, i3, i4, jB, z, z2);
        if (mkdVarH.m(mkdVar)) {
            this.u = mkdVarH;
            this.s = iB;
            vuc vucVarA = wucVar.a(mkdVarH);
            long jB2 = u3c.b(this.b.j(vucVarA.a.b), this.b.j(vucVarA.b.b));
            if (!eue.c(jB2, j2)) {
                boolean z5 = eue.h(jB2) != eue.h(j2) && eue.c(u3c.b((int) (4294967295L & jB2), (int) (jB2 >> c)), j2);
                boolean z6 = eue.d(jB2) && eue.d(j2);
                if (z3 && k00Var.b.length() > 0 && !z5 && !z6 && fh6Var != null && (eh6Var = this.j) != null) {
                    ((afa) eh6Var).a(fh6Var.a);
                }
                this.c.d(b(k00Var, jB2));
                this.v = new eue(jB2);
                if (!z3) {
                    u(!eue.d(jB2));
                }
                r38 r38Var2 = this.d;
                if (r38Var2 != null) {
                    r38Var2.q.setValue(Boolean.valueOf(z3));
                }
                r38 r38Var3 = this.d;
                if (r38Var3 != null) {
                    r38Var3.m.setValue(Boolean.valueOf(!eue.d(jB2) && aic.n(this, true)));
                }
                r38 r38Var4 = this.d;
                if (r38Var4 != null) {
                    r38Var4.n.setValue(Boolean.valueOf(!eue.d(jB2) && aic.n(this, false)));
                }
                r38 r38Var5 = this.d;
                if (r38Var5 != null) {
                    if (eue.d(jB2) && aic.n(this, true)) {
                        z4 = true;
                    }
                    r38Var5.o.setValue(Boolean.valueOf(z4));
                }
                return jB2;
            }
        }
        return j2;
    }
}
