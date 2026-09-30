package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pi1 extends ewf implements hf8 {
    public dva E0;
    public i48 F0;
    public x48 G0;
    public boolean H0;
    public boolean I0;
    public final vz9 X;
    public final wta Y;
    public final hv6 Z;
    public final Integer b;
    public final gda c;
    public final s0e d;
    public final s0e e;
    public final s0e f;
    public final s0e g;
    public final s0e v;
    public final s0e w;
    public final s0e x;
    public final s0e y;
    public final s0e z;

    public pi1(Integer num, gda gdaVar) {
        this.b = num;
        this.c = gdaVar;
        s0e s0eVarA = t0e.a(null);
        this.d = s0eVarA;
        this.e = s0eVarA;
        s0e s0eVarA2 = t0e.a(new aee(null));
        this.f = s0eVarA2;
        this.g = s0eVarA2;
        Boolean bool = Boolean.FALSE;
        s0e s0eVarA3 = t0e.a(bool);
        this.v = s0eVarA3;
        this.w = s0eVarA3;
        this.x = t0e.a(bool);
        s0e s0eVarA4 = t0e.a(bool);
        this.y = s0eVarA4;
        this.z = s0eVarA4;
        this.X = q1c.f(bool);
        nxb nxbVar = new nxb(af8.d, null, 0);
        sk1 sk1Var = new sk1(2);
        no0 no0Var = ew6.N;
        k79 k79Var = sk1Var.b;
        k79Var.p(no0Var, nxbVar);
        yta ytaVar = new yta(bs9.d(k79Var));
        ew6.z(ytaVar);
        wta wtaVar = new wta(ytaVar);
        wtaVar.s = wta.z;
        wtaVar.F(new hi1(this, 1));
        this.Y = wtaVar;
        sk1 sk1Var2 = new sk1(1);
        sk1Var2.b.p(no0Var, nxbVar);
        this.Z = sk1Var2.a();
    }

    public final void f(x48 x48Var, boolean z) {
        xi1 xi1Var;
        i48 i48VarA;
        wta wtaVar = this.Y;
        dva dvaVar = this.E0;
        if (dvaVar == null) {
            return;
        }
        c78 c78VarU = n16.u(z, this.H0, this.I0);
        if (c78VarU.isEmpty()) {
            i(null);
            return;
        }
        int i = 0;
        ListIterator listIterator = c78VarU.listIterator(0);
        Exception e = null;
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                i(e);
                return;
            }
            wg1 wg1Var = (wg1) ql6Var.next();
            int iOrdinal = wg1Var.ordinal();
            if (iOrdinal == 0) {
                xi1Var = xi1.c;
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                xi1Var = xi1.b;
            }
            xi1Var.getClass();
            try {
                dvaVar.a.l();
                wtaVar.F(new hi1(this, i));
                hv6 hv6Var = this.Z;
                oif[] oifVarArr = new oif[2];
                oifVarArr[i] = wtaVar;
                oifVarArr[1] = hv6Var;
                i48VarA = dvaVar.a(x48Var, xi1Var, oifVarArr);
            } catch (Exception e2) {
                e = e2;
                m8b m8bVarD = d();
                String lowerCase = wg1Var.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String simpleName = e.getClass().getSimpleName();
                String message = e.getMessage();
                StringBuilder sbO = ib8.o("Failed to bind ", lowerCase, " camera; trying fallback: ", simpleName, ": ");
                sbO.append(message);
                m8bVarD.g(sbO.toString());
                i48VarA = null;
            }
            if (i48VarA != null) {
                this.F0 = i48VarA;
                Boolean boolValueOf = Boolean.valueOf(wg1Var == wg1.b);
                s0e s0eVar = this.x;
                s0eVar.getClass();
                s0eVar.n(null, boolValueOf);
                Boolean bool = Boolean.FALSE;
                s0e s0eVar2 = this.y;
                s0eVar2.getClass();
                s0eVar2.n(null, bool);
                ((vf) i48VarA.b()).b.e().e(x48Var, new qi1(new di1(this, 1)));
                return;
            }
            i = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(x48 x48Var, zn2 zn2Var) {
        ii1 ii1Var;
        if (zn2Var instanceof ii1) {
            ii1Var = (ii1) zn2Var;
            int i = ii1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ii1Var.label = i - Integer.MIN_VALUE;
            } else {
                ii1Var = new ii1(this, zn2Var);
            }
        } else {
            ii1Var = new ii1(this, zn2Var);
        }
        Object objZ = ii1Var.result;
        int i2 = ii1Var.label;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i2 == 0) {
                    jzb.q(objZ);
                    this.G0 = x48Var;
                    dva dvaVar = dva.b;
                    Context contextZ = cn1.z();
                    ii1Var.L$0 = x48Var;
                    ii1Var.label = 1;
                    objZ = ynb.z(contextZ, ii1Var);
                    if (objZ == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jzb.q(objZ);
                        throw new nt7();
                    }
                    x48Var = (x48) ii1Var.L$0;
                    jzb.q(objZ);
                }
                dva dvaVar2 = (dva) objZ;
                this.E0 = dvaVar2;
                xi1 xi1Var = xi1.c;
                xi1Var.getClass();
                this.H0 = h(dvaVar2, xi1Var);
                xi1 xi1Var2 = xi1.b;
                xi1Var2.getClass();
                this.I0 = h(dvaVar2, xi1Var2);
                f(x48Var, ((Boolean) this.x.getValue()).booleanValue());
                ii1Var.L$0 = null;
                ii1Var.L$1 = null;
                ii1Var.label = 2;
                vfh.o(ii1Var);
                return bw2Var;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                i(e2);
                return wef.a;
            }
        } catch (Throwable th) {
            try {
                dva dvaVar3 = this.E0;
                if (dvaVar3 != null) {
                    dvaVar3.a.l();
                }
            } catch (Exception e3) {
                d().g("Failed to unbind camera: " + e3.getClass().getSimpleName() + ": " + e3.getMessage());
            }
            this.F0 = null;
            this.G0 = null;
            throw th;
        }
    }

    public final boolean h(dva dvaVar, xi1 xi1Var) {
        boolean z;
        try {
            dvaVar.getClass();
            di2 di2Var = dvaVar.a;
            Trace.beginSection(xdc.v("CX:hasCamera"));
            try {
                rk1 rk1Var = (rk1) di2Var.d;
                rk1Var.getClass();
                xi1Var.c(rk1Var.a.c());
                z = true;
            } catch (IllegalArgumentException unused) {
                z = false;
            } finally {
                Trace.endSection();
            }
            return z;
        } catch (Exception e) {
            d().g("Failed to query camera availability: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return false;
        }
    }

    public final void i(Exception exc) {
        this.F0 = null;
        this.d.m(null);
        Boolean bool = Boolean.TRUE;
        s0e s0eVar = this.y;
        s0eVar.getClass();
        s0eVar.n(null, bool);
        if (exc == null) {
            d().b("No available camera can be found");
            return;
        }
        d().g("Failed to bind camera: " + exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }
}
