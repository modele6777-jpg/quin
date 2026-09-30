package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class aj7 implements sh7, ev4, ag2 {
    public final ArrayList a;
    public final wg7 b;
    public final a26 c;
    public final dh7 d;
    public String e;
    public String f;
    public final /* synthetic */ int g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aj7(wg7 wg7Var, a26 a26Var, int i) {
        this(wg7Var, a26Var, (char) 0);
        this.g = i;
        a26Var.getClass();
        switch (i) {
            case 1:
                this(wg7Var, a26Var, (char) 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                this(wg7Var, a26Var, (char) 0);
                this.h = new ArrayList();
                break;
            default:
                this.a.add("primitive");
                break;
        }
    }

    @Override // defpackage.ag2
    public void A(nyc nycVar, int i, xn7 xn7Var, Object obj) {
        switch (this.g) {
            case 1:
                nycVar.getClass();
                xn7Var.getClass();
                if (obj != null || this.d.d) {
                    F(nycVar, i, xn7Var, obj);
                }
                break;
            default:
                F(nycVar, i, xn7Var, obj);
                break;
        }
    }

    @Override // defpackage.ev4
    public final void B(long j) {
        String str = (String) L();
        str.getClass();
        M(oh7.b(Long.valueOf(j)), str);
    }

    @Override // defpackage.ag2
    public final ev4 C(dua duaVar, int i) {
        return I(K(duaVar, i), duaVar.i(i));
    }

    @Override // defpackage.ev4
    public final void D(String str) {
        str.getClass();
        String str2 = (String) L();
        str2.getClass();
        M(oh7.c(str), str2);
    }

    @Override // defpackage.ag2
    public final void E(nyc nycVar, int i, float f) {
        nycVar.getClass();
        H(f, K(nycVar, i));
    }

    public final void F(nyc nycVar, int i, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        this.a.add(K(nycVar, i));
        if (xn7Var.e().c()) {
            h(xn7Var, obj);
        } else if (obj == null) {
            f();
        } else {
            h(xn7Var, obj);
        }
    }

    public final void G(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        M(oh7.b(Double.valueOf(d)), str);
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw kj0.u(str, Double.valueOf(d));
        }
    }

    public final void H(float f, Object obj) {
        String str = (String) obj;
        str.getClass();
        M(oh7.b(Float.valueOf(f)), str);
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw kj0.u(str, Float.valueOf(f));
        }
    }

    public final ev4 I(Object obj, nyc nycVar) {
        String str = (String) obj;
        str.getClass();
        nycVar.getClass();
        if (s3e.a(nycVar)) {
            return new i2(this, str);
        }
        if (nycVar.isInline() && nycVar.equals(oh7.a)) {
            return new i2(this, str, nycVar);
        }
        this.a.add(str);
        return this;
    }

    public nh7 J() {
        switch (this.g) {
            case 0:
                nh7 nh7Var = (nh7) this.h;
                if (nh7Var != null) {
                    return nh7Var;
                }
                qc0.j("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new ti7((LinkedHashMap) this.h);
            default:
                return new yg7((ArrayList) this.h);
        }
    }

    public final String K(nyc nycVar, int i) {
        String strValueOf;
        nycVar.getClass();
        int i2 = this.g;
        nycVar.getClass();
        switch (i2) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                pi7.d(this.b, nycVar);
                strValueOf = nycVar.f(i);
                break;
        }
        strValueOf.getClass();
        return strValueOf;
    }

    public final Object L() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new yyc("No tag in stack for requested element");
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    public void M(nh7 nh7Var, String str) {
        int i = this.g;
        str.getClass();
        nh7Var.getClass();
        switch (i) {
            case 0:
                if (str != "primitive") {
                    qc0.j("This output can only consume primitives with 'primitive' tag");
                } else if (((nh7) this.h) != null) {
                    qc0.j("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.h = nh7Var;
                    this.c.d(nh7Var);
                }
                break;
            case 1:
                ((LinkedHashMap) this.h).put(str, nh7Var);
                break;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), nh7Var);
                break;
        }
    }

    @Override // defpackage.ev4
    public final hzc a() {
        return this.b.b;
    }

    @Override // defpackage.ag2
    public final void b(nyc nycVar) {
        nycVar.getClass();
        if (!this.a.isEmpty()) {
            L();
        }
        this.c.d(J());
    }

    @Override // defpackage.ev4
    public final ag2 c(nyc nycVar) {
        aj7 aj7Var;
        nycVar.getClass();
        a26 c1Var = s72.H0(this.a) == null ? this.c : new c1(1, this);
        iec iecVarG = nycVar.g();
        boolean zT = pa7.t(iecVarG, g5e.d);
        wg7 wg7Var = this.b;
        if (zT || (iecVarG instanceof zia)) {
            aj7Var = new aj7(wg7Var, c1Var, 2);
        } else if (pa7.t(iecVarG, g5e.e)) {
            nyc nycVarE = hcc.e(nycVar.i(0), wg7Var.b);
            iec iecVarG2 = nycVarE.g();
            if (!(iecVarG2 instanceof fua) && !pa7.t(iecVarG2, ryc.c)) {
                throw kj0.v(nycVarE);
            }
            c1Var.getClass();
            gj7 gj7Var = new gj7(wg7Var, c1Var, 1);
            gj7Var.j = true;
            aj7Var = gj7Var;
        } else {
            aj7Var = new aj7(wg7Var, c1Var, 1);
        }
        String str = this.e;
        if (str != null) {
            if (aj7Var instanceof gj7) {
                gj7 gj7Var2 = (gj7) aj7Var;
                gj7Var2.M(oh7.c(str), "key");
                String strA = this.f;
                if (strA == null) {
                    strA = nycVar.a();
                }
                gj7Var2.M(oh7.c(strA), "value");
            } else {
                String strA2 = this.f;
                if (strA2 == null) {
                    strA2 = nycVar.a();
                }
                aj7Var.M(oh7.c(strA2), str);
            }
            this.e = null;
            this.f = null;
        }
        return aj7Var;
    }

    @Override // defpackage.sh7
    public final wg7 d() {
        return this.b;
    }

    @Override // defpackage.ag2
    public final void e(dua duaVar, int i, double d) {
        G(K(duaVar, i), d);
    }

    @Override // defpackage.ev4
    public final void f() {
        String str = (String) s72.H0(this.a);
        if (str == null) {
            this.c.d(qi7.INSTANCE);
        } else {
            M(qi7.INSTANCE, str);
        }
    }

    @Override // defpackage.ag2
    public final boolean g(nyc nycVar) {
        nycVar.getClass();
        return this.d.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    @Override // defpackage.ev4
    public final void h(xn7 xn7Var, Object obj) {
        String strB;
        xn7 xn7VarW;
        xn7Var.getClass();
        Object objH0 = s72.H0(this.a);
        wg7 wg7Var = this.b;
        if (objH0 == null) {
            nyc nycVarE = hcc.e(xn7Var.e(), wg7Var.b);
            if ((nycVarE.g() instanceof fua) || nycVarE.g() == ryc.c) {
                new aj7(wg7Var, this.c, 0).h(xn7Var, obj);
                return;
            }
        }
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
            this.e = strB;
            this.f = strA;
        }
        xn7VarW.a(this, obj);
    }

    @Override // defpackage.ev4
    public final void i(double d) {
        G(L(), d);
    }

    @Override // defpackage.ev4
    public final void j(short s) {
        String str = (String) L();
        str.getClass();
        M(oh7.b(Short.valueOf(s)), str);
    }

    @Override // defpackage.ag2
    public final void k(nyc nycVar, int i, long j) {
        nycVar.getClass();
        M(oh7.b(Long.valueOf(j)), K(nycVar, i));
    }

    @Override // defpackage.ev4
    public final void l(byte b) {
        String str = (String) L();
        str.getClass();
        M(oh7.b(Byte.valueOf(b)), str);
    }

    @Override // defpackage.ev4
    public final void m(boolean z) {
        String str = (String) L();
        str.getClass();
        M(oh7.a(Boolean.valueOf(z)), str);
    }

    @Override // defpackage.ev4
    public final ev4 n(nyc nycVar) {
        nycVar.getClass();
        if (s72.H0(this.a) == null) {
            return new aj7(this.b, this.c, 0).n(nycVar);
        }
        if (this.e != null) {
            this.f = nycVar.a();
        }
        return I(L(), nycVar);
    }

    @Override // defpackage.ag2
    public final void o(nyc nycVar, int i, boolean z) {
        nycVar.getClass();
        M(oh7.a(Boolean.valueOf(z)), K(nycVar, i));
    }

    @Override // defpackage.ag2
    public final void p(nyc nycVar, int i, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        this.a.add(K(nycVar, i));
        h(xn7Var, obj);
    }

    @Override // defpackage.ev4
    public final void q(float f) {
        H(f, L());
    }

    @Override // defpackage.ag2
    public final void r(dua duaVar, int i, byte b) {
        M(oh7.b(Byte.valueOf(b)), K(duaVar, i));
    }

    @Override // defpackage.ev4
    public final void s(char c) {
        String str = (String) L();
        str.getClass();
        M(oh7.c(String.valueOf(c)), str);
    }

    @Override // defpackage.ev4
    public final void t(nyc nycVar, int i) {
        nycVar.getClass();
        String str = (String) L();
        str.getClass();
        M(oh7.c(nycVar.f(i)), str);
    }

    @Override // defpackage.ag2
    public final void u(dua duaVar, int i, short s) {
        M(oh7.b(Short.valueOf(s)), K(duaVar, i));
    }

    @Override // defpackage.ag2
    public final void v(int i, int i2, nyc nycVar) {
        nycVar.getClass();
        M(oh7.b(Integer.valueOf(i2)), K(nycVar, i));
    }

    @Override // defpackage.ag2
    public final void w(nyc nycVar, int i, String str) {
        nycVar.getClass();
        str.getClass();
        M(oh7.c(str), K(nycVar, i));
    }

    @Override // defpackage.ag2
    public final void x(dua duaVar, int i, char c) {
        M(oh7.c(String.valueOf(c)), K(duaVar, i));
    }

    @Override // defpackage.ev4
    public final void y(int i) {
        String str = (String) L();
        str.getClass();
        M(oh7.b(Integer.valueOf(i)), str);
    }

    @Override // defpackage.sh7
    public final void z(ti7 ti7Var) {
        h(qh7.a, ti7Var);
    }

    public aj7(wg7 wg7Var, a26 a26Var, char c) {
        this.a = new ArrayList();
        this.b = wg7Var;
        this.c = a26Var;
        this.d = wg7Var.a;
    }
}
