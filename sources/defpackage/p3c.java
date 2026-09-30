package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p3c extends ewf implements hf8 {
    public static final /* synthetic */ int L0 = 0;
    public r0c E0;
    public r0c F0;
    public r0c G0;
    public boolean H0;
    public boolean I0;
    public w2c J0;
    public Boolean K0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final s7 b;
    public final k2c c;
    public final s0e d;
    public final whb e;
    public String f;
    public long g;
    public long v;
    public o2c w;
    public r0c x;
    public r0c y;
    public final LinkedHashSet z;

    public p3c(s7 s7Var, k2c k2cVar, xof xofVar) {
        this.b = s7Var;
        this.c = k2cVar;
        s0e s0eVarA = t0e.a(new d3c(false, false));
        this.d = s0eVarA;
        this.e = if9.n(s0eVarA);
        this.f = s7.a();
        this.z = new LinkedHashSet();
        ynb.V(hwf.a(this), null, null, new e3c(this, null), 3);
        ynb.V(hwf.a(this), null, null, new f3c(xofVar, this, null), 3);
    }

    public final r0c f() {
        this.b.getClass();
        r(s7.a());
        return new r0c(this.f, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(o2c o2cVar, zn2 zn2Var) {
        g3c g3cVar;
        o2c o2cVar2;
        String str;
        boolean zN;
        if (zn2Var instanceof g3c) {
            g3cVar = (g3c) zn2Var;
            int i = g3cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3cVar.label = i - Integer.MIN_VALUE;
            } else {
                g3cVar = new g3c(this, zn2Var);
            }
        } else {
            g3cVar = new g3c(this, zn2Var);
        }
        Object obj = g3cVar.result;
        int i2 = g3cVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            if (o2cVar.c) {
                String str2 = o2cVar.a.a;
                g3cVar.L$0 = o2cVar;
                g3cVar.L$1 = str2;
                g3cVar.label = 1;
                k2c k2cVar = this.c;
                k2cVar.getClass();
                Object objF = v4e.Q(str2) ? Boolean.FALSE : k2cVar.f(str2, Boolean.FALSE, new c2c(k2cVar, str2, null), g3cVar);
                bw2 bw2Var = bw2.a;
                if (objF == bw2Var) {
                    return bw2Var;
                }
                o2cVar2 = o2cVar;
                str = str2;
            }
            zN = n(o2cVar);
            wef wefVar = wef.a;
            if (zN) {
                k(o2cVar);
                if (o2cVar.c) {
                    p();
                }
            }
            return wefVar;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) g3cVar.L$1;
        o2cVar2 = (o2c) g3cVar.L$0;
        jzb.q(obj);
        this.z.add(str);
        o2cVar = o2cVar2;
        zN = n(o2cVar);
        wef wefVar2 = wef.a;
        if (zN) {
            k(o2cVar);
            if (o2cVar.c) {
                p();
            }
        }
        return wefVar2;
    }

    public final void h() {
        f();
        if (((d3c) this.d.getValue()).b) {
            this.I0 = true;
            w2c w2cVar = this.J0;
            if (w2cVar != null) {
                String str = w2cVar.a.a;
                String str2 = w2cVar.b;
                k2c k2cVar = this.c;
                k2cVar.getClass();
                str.getClass();
                str2.getClass();
                k2cVar.d.remove(str, str2);
            }
            this.J0 = null;
            l();
        }
    }

    public final u0c i() {
        Boolean bool = this.K0;
        if (pa7.t(bool, Boolean.TRUE)) {
            return u0c.a;
        }
        if (pa7.t(bool, Boolean.FALSE)) {
            return u0c.b;
        }
        if (bool == null) {
            return u0c.c;
        }
        ap.c();
        return null;
    }

    public final void k(o2c o2cVar) {
        s0e s0eVar;
        Object value;
        if (o2cVar == null || pa7.t(this.w, o2cVar)) {
            this.v++;
            this.w = null;
            do {
                s0eVar = this.d;
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, d3c.a((d3c) value, false, false, 2)));
        }
    }

    public final void l() {
        s0e s0eVar;
        Object value;
        this.x = null;
        do {
            s0eVar = this.d;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, d3c.a((d3c) value, false, false, 1)));
    }

    public final boolean m(r0c r0cVar) {
        return pa7.t(r0cVar.a, this.f) && r0cVar.b == this.g;
    }

    public final boolean n(o2c o2cVar) {
        return m(o2cVar.a) && o2cVar.equals(this.w);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, u2c u2cVar, zn2 zn2Var) throws Throwable {
        n3c n3cVar;
        Object dzbVar;
        if (zn2Var instanceof n3c) {
            n3cVar = (n3c) zn2Var;
            int i = n3cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                n3cVar.label = i - Integer.MIN_VALUE;
            } else {
                n3cVar = new n3c(this, zn2Var);
            }
        } else {
            n3cVar = new n3c(this, zn2Var);
        }
        Object objE = n3cVar.result;
        int i2 = n3cVar.label;
        k2c k2cVar = this.c;
        if (i2 == 0) {
            jzb.q(objE);
            String str2 = u2cVar.a;
            n3cVar.L$0 = str;
            n3cVar.L$1 = null;
            n3cVar.label = 1;
            objE = k2cVar.e(str, str2, n3cVar);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) n3cVar.L$0;
            jzb.q(objE);
        }
        u2c u2cVar2 = (u2c) objE;
        wef wefVar = wef.a;
        if (u2cVar2 != null) {
            try {
                x1f x1fVar = x1f.a;
                x1f.g(new r05("popup_view"), m1f.a, new h6b(9, (Object) u2cVar2, str));
                dzbVar = wefVar;
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            Throwable thA = ezb.a(dzbVar);
            if (thA != null) {
                String str3 = u2cVar2.a;
                k2cVar.getClass();
                str3.getClass();
                k2cVar.c.remove(str3);
                d().c("Failed to track review reward Snackbar exposure", thA);
            }
        }
        return wefVar;
    }

    public final void p() {
        r0c r0cVarF = f();
        if (this.X && this.Y) {
            ca2.a.getClass();
            String str = ca2.d;
            Set set = r1c.a;
            str.getClass();
            if (r1c.a.contains(str)) {
                if (this.z.contains(this.f) || this.Z) {
                    r0c r0cVar = this.E0;
                    if ((r0cVar == null || !m(r0cVar)) && !((d3c) this.d.getValue()).b) {
                        this.E0 = r0cVarF;
                        ynb.V(hwf.a(this), null, null, new o3c(this, r0cVarF, null), 3);
                    }
                }
            }
        }
    }

    public final void q(r0c r0cVar) {
        s0e s0eVar;
        Object value;
        if (m(r0cVar)) {
            this.x = r0cVar;
            this.I0 = false;
            do {
                s0eVar = this.d;
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, d3c.a((d3c) value, false, true, 1)));
        }
    }

    public final void r(String str) {
        if (pa7.t(str, this.f)) {
            return;
        }
        this.f = str;
        this.g++;
        this.v++;
        this.K0 = null;
        this.w = null;
        this.x = null;
        this.H0 = false;
        this.I0 = false;
        this.J0 = null;
        d3c d3cVar = new d3c(false, false);
        s0e s0eVar = this.d;
        s0eVar.getClass();
        s0eVar.n(null, d3cVar);
    }
}
