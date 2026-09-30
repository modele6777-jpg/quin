package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r3e extends lmg implements sh7 {
    public final sh7[] A;
    public final hzc B;
    public final dh7 C;
    public boolean D;
    public String E;
    public String F;
    public final pk1 x;
    public final wg7 y;
    public final ucg z;

    public r3e(pk1 pk1Var, wg7 wg7Var, ucg ucgVar, sh7[] sh7VarArr) {
        pk1Var.getClass();
        this.x = pk1Var;
        this.y = wg7Var;
        this.z = ucgVar;
        this.A = sh7VarArr;
        this.B = wg7Var.b;
        this.C = wg7Var.a;
        int iOrdinal = ucgVar.ordinal();
        if (sh7VarArr != null) {
            sh7 sh7Var = sh7VarArr[iOrdinal];
            if (sh7Var == null && sh7Var == this) {
                return;
            }
            sh7VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.lmg, defpackage.ag2
    public final void A(nyc nycVar, int i, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        if (obj != null || this.C.d) {
            super.A(nycVar, i, xn7Var, obj);
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void B(long j) {
        if (this.D) {
            D(String.valueOf(j));
        } else {
            this.x.k(j);
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void D(String str) {
        str.getClass();
        this.x.m(str);
    }

    @Override // defpackage.ev4
    public final hzc a() {
        return this.B;
    }

    @Override // defpackage.lmg, defpackage.ag2
    public final void b(nyc nycVar) {
        nycVar.getClass();
        ucg ucgVar = this.z;
        if (ucgVar.end != 0) {
            pk1 pk1Var = this.x;
            pk1Var.o();
            pk1Var.g();
            pk1Var.i(ucgVar.end);
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final ag2 c(nyc nycVar) {
        sh7 sh7Var;
        nycVar.getClass();
        wg7 wg7Var = this.y;
        ucg ucgVarN = hcc.n(wg7Var, nycVar);
        char c = ucgVarN.begin;
        pk1 pk1Var = this.x;
        if (c != 0) {
            pk1Var.i(c);
            pk1Var.d();
        }
        String str = this.E;
        if (str != null) {
            String strA = this.F;
            if (strA == null) {
                strA = nycVar.a();
            }
            pk1Var.f();
            pk1Var.m(str);
            pk1Var.i(':');
            pk1Var.n();
            D(strA);
            this.E = null;
            this.F = null;
        }
        if (this.z == ucgVarN) {
            return this;
        }
        sh7[] sh7VarArr = this.A;
        return (sh7VarArr == null || (sh7Var = sh7VarArr[ucgVarN.ordinal()]) == null) ? new r3e(pk1Var, wg7Var, ucgVarN, sh7VarArr) : sh7Var;
    }

    @Override // defpackage.sh7
    public final wg7 d() {
        return this.y;
    }

    @Override // defpackage.lmg
    public final void d0(nyc nycVar, int i) {
        nycVar.getClass();
        int iOrdinal = this.z.ordinal();
        pk1 pk1Var = this.x;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!pk1Var.b) {
                pk1Var.i(',');
            }
            pk1Var.f();
            return;
        }
        if (iOrdinal == 2) {
            if (pk1Var.b) {
                this.D = true;
                pk1Var.f();
                return;
            }
            if (i % 2 == 0) {
                pk1Var.i(',');
                pk1Var.f();
            } else {
                pk1Var.i(':');
                pk1Var.n();
                z = false;
            }
            this.D = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!pk1Var.b) {
                pk1Var.i(',');
            }
            pk1Var.f();
            pi7.d(this.y, nycVar);
            D(nycVar.f(i));
            pk1Var.i(':');
            pk1Var.n();
            return;
        }
        if (i == 0) {
            this.D = true;
        }
        if (i == 1) {
            pk1Var.i(',');
            pk1Var.n();
            this.D = false;
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void f() {
        pk1 pk1Var = this.x;
        pk1Var.getClass();
        ((sug) pk1Var.c).y("null");
    }

    @Override // defpackage.ag2
    public final boolean g(nyc nycVar) {
        nycVar.getClass();
        return this.C.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    @Override // defpackage.ev4
    public final void h(xn7 xn7Var, Object obj) {
        String strB;
        xn7 xn7VarW;
        xn7Var.getClass();
        wg7 wg7Var = this.y;
        boolean z = xn7Var instanceof k4;
        i22 i22Var = wg7Var.a.i;
        if (!z) {
            int iOrdinal = i22Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    iec iecVarG = xn7Var.e().g();
                    strB = (pa7.t(iecVarG, g5e.c) || pa7.t(iecVarG, g5e.f)) ? eb3.B(wg7Var, xn7Var.e()) : null;
                } else if (iOrdinal != 2) {
                    ap.c();
                    return;
                }
            }
        } else if (i22Var != i22.a) {
        }
        if (z) {
            k4 k4Var = (k4) xn7Var;
            if (obj == null) {
                cva.u(k4Var.e(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            xn7VarW = mh3.w(k4Var, this, obj);
        } else {
            xn7VarW = xn7Var;
        }
        if (strB != null) {
            eb3.z(wg7Var, xn7Var, xn7VarW, strB);
            eb3.A(xn7VarW.e().g());
            String strA = xn7VarW.e().a();
            this.E = strB;
            this.F = strA;
        }
        xn7VarW.a(this, obj);
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void i(double d) {
        if (this.D) {
            D(String.valueOf(d));
        } else {
            ((sug) this.x.c).y(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw kj0.u(null, Double.valueOf(d));
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void j(short s) {
        if (this.D) {
            D(String.valueOf((int) s));
        } else {
            this.x.l(s);
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void l(byte b) {
        if (this.D) {
            D(String.valueOf((int) b));
        } else {
            this.x.h(b);
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void m(boolean z) {
        if (this.D) {
            D(String.valueOf(z));
        } else {
            ((sug) this.x.c).y(String.valueOf(z));
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final ev4 n(nyc nycVar) {
        nycVar.getClass();
        boolean zA = s3e.a(nycVar);
        ucg ucgVar = this.z;
        wg7 wg7Var = this.y;
        pk1 uf2Var = this.x;
        if (zA) {
            if (!(uf2Var instanceof vf2)) {
                uf2Var = new vf2((sug) uf2Var.c, this.D);
            }
            return new r3e(uf2Var, wg7Var, ucgVar, null);
        }
        if (nycVar.isInline() && nycVar.equals(oh7.a)) {
            if (!(uf2Var instanceof uf2)) {
                uf2Var = new uf2((sug) uf2Var.c, this.D);
            }
            return new r3e(uf2Var, wg7Var, ucgVar, null);
        }
        if (this.E != null) {
            this.F = nycVar.a();
        }
        return this;
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void q(float f) {
        if (this.D) {
            D(String.valueOf(f));
        } else {
            ((sug) this.x.c).y(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw kj0.u(null, Float.valueOf(f));
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void s(char c) {
        D(String.valueOf(c));
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void t(nyc nycVar, int i) {
        nycVar.getClass();
        D(nycVar.f(i));
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void y(int i) {
        if (this.D) {
            D(String.valueOf(i));
        } else {
            this.x.j(i);
        }
    }

    @Override // defpackage.sh7
    public final void z(ti7 ti7Var) {
        h(qh7.a, ti7Var);
    }
}
