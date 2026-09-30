package defpackage;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h2 implements jh7, om3, zf2 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final wg7 c;
    public final String d;
    public final dh7 e;

    public h2(wg7 wg7Var, String str) {
        this.c = wg7Var;
        this.d = str;
        this.e = wg7Var.a;
    }

    @Override // defpackage.om3
    public final byte A() {
        return I(U());
    }

    @Override // defpackage.om3
    public final short B() {
        return P(U());
    }

    @Override // defpackage.om3
    public final float C() {
        return L(U());
    }

    @Override // defpackage.zf2
    public final long D(nyc nycVar, int i) {
        nycVar.getClass();
        return O(S(nycVar, i));
    }

    @Override // defpackage.om3
    public final double E() {
        return K(U());
    }

    public abstract nh7 F(String str);

    public final nh7 G() {
        nh7 nh7VarF;
        String str = (String) s72.H0(this.a);
        return (str == null || (nh7VarF = F(str)) == null) ? T() : nh7VarF;
    }

    public final boolean H(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        if (nh7VarF instanceof yi7) {
            yi7 yi7Var = (yi7) nh7VarF;
            try {
                e37 e37Var = oh7.a;
                Boolean boolB = n4e.b(yi7Var.c());
                if (boolB != null) {
                    return boolB.booleanValue();
                }
                X(yi7Var, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                X(yi7Var, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        sb.append(" as the serialized body of boolean");
        String string = sb.toString();
        String strW = W(str);
        String string2 = this.c.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(string, strW, null, -1, string2), string, strW, -1, string2, null);
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        if (nh7VarF instanceof yi7) {
            yi7 yi7Var = (yi7) nh7VarF;
            try {
                long j = oh7.j(yi7Var);
                Byte bValueOf = (-128 > j || j > 127) ? null : Byte.valueOf((byte) j);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                X(yi7Var, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                X(yi7Var, "byte", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        sb.append(" as the serialized body of byte");
        String string = sb.toString();
        String strW = W(str);
        String string2 = this.c.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(string, strW, null, -1, string2), string, strW, -1, string2, null);
    }

    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        if (!(nh7VarF instanceof yi7)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kob kobVar = job.a;
            sb.append(kobVar.b(yi7.class).r());
            sb.append(", but had ");
            sb.append(kobVar.b(nh7VarF.getClass()).r());
            sb.append(" as the serialized body of char");
            String string = sb.toString();
            String strW = W(str);
            String string2 = this.c.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
            throw new lh7(kj0.b0(string, strW, null, -1, string2), string, strW, -1, string2, null);
        }
        yi7 yi7Var = (yi7) nh7VarF;
        try {
            String strC = yi7Var.c();
            strC.getClass();
            int length = strC.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strC.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(yi7Var, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        boolean z = nh7VarF instanceof yi7;
        wg7 wg7Var = this.c;
        if (z) {
            yi7 yi7Var = (yi7) nh7VarF;
            try {
                e37 e37Var = oh7.a;
                double d = Double.parseDouble(yi7Var.c());
                if (Math.abs(d) <= Double.MAX_VALUE) {
                    return d;
                }
                String strO0 = kj0.o0(str, Double.valueOf(d));
                String string = wg7Var.a.j ? kj0.n0(G().toString(), -1).toString() : null;
                throw new lh7(kj0.b0(strO0, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string), strO0, null, -1, string, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
            } catch (IllegalArgumentException unused) {
                X(yi7Var, "double", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        sb.append(" as the serialized body of double");
        String string2 = sb.toString();
        String strW = W(str);
        String string3 = wg7Var.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(string2, strW, null, -1, string3), string2, strW, -1, string3, null);
    }

    public final float L(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        boolean z = nh7VarF instanceof yi7;
        wg7 wg7Var = this.c;
        if (z) {
            yi7 yi7Var = (yi7) nh7VarF;
            try {
                e37 e37Var = oh7.a;
                float f = Float.parseFloat(yi7Var.c());
                if (Math.abs(f) <= Float.MAX_VALUE) {
                    return f;
                }
                String strO0 = kj0.o0(str, Float.valueOf(f));
                String string = wg7Var.a.j ? kj0.n0(G().toString(), -1).toString() : null;
                throw new lh7(kj0.b0(strO0, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string), strO0, null, -1, string, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
            } catch (IllegalArgumentException unused) {
                X(yi7Var, "float", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        sb.append(" as the serialized body of float");
        String string2 = sb.toString();
        String strW = W(str);
        String string3 = wg7Var.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(string2, strW, null, -1, string3), string2, strW, -1, string3, null);
    }

    public final om3 M(Object obj, nyc nycVar) {
        String str = (String) obj;
        str.getClass();
        nycVar.getClass();
        if (!s3e.a(nycVar)) {
            this.a.add(str);
            return this;
        }
        nh7 nh7VarF = F(str);
        String strA = nycVar.a();
        boolean z = nh7VarF instanceof yi7;
        wg7 wg7Var = this.c;
        if (z) {
            return new kh7(eec.f(wg7Var, ((yi7) nh7VarF).c()), wg7Var);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        String strL = ks0.l(sb, " as the serialized body of ", strA);
        String strW = W(str);
        String string = wg7Var.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(strL, strW, null, -1, string), strL, strW, -1, string, null);
    }

    public final int N(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        if (nh7VarF instanceof yi7) {
            yi7 yi7Var = (yi7) nh7VarF;
            try {
                long j = oh7.j(yi7Var);
                Integer numValueOf = (-2147483648L > j || j > 2147483647L) ? null : Integer.valueOf((int) j);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                X(yi7Var, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                X(yi7Var, "int", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        sb.append(" as the serialized body of int");
        String string = sb.toString();
        String strW = W(str);
        String string2 = this.c.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(string, strW, null, -1, string2), string, strW, -1, string2, null);
    }

    public final long O(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        if (nh7VarF instanceof yi7) {
            yi7 yi7Var = (yi7) nh7VarF;
            try {
                return oh7.j(yi7Var);
            } catch (IllegalArgumentException unused) {
                X(yi7Var, Constants.LONG, str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        sb.append(" as the serialized body of long");
        String string = sb.toString();
        String strW = W(str);
        String string2 = this.c.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(string, strW, null, -1, string2), string, strW, -1, string2, null);
    }

    public final short P(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        if (nh7VarF instanceof yi7) {
            yi7 yi7Var = (yi7) nh7VarF;
            try {
                long j = oh7.j(yi7Var);
                Short shValueOf = (-32768 > j || j > 32767) ? null : Short.valueOf((short) j);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                X(yi7Var, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                X(yi7Var, "short", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        sb.append(" as the serialized body of short");
        String string = sb.toString();
        String strW = W(str);
        String string2 = this.c.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(string, strW, null, -1, string2), string, strW, -1, string2, null);
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        nh7 nh7VarF = F(str);
        boolean z = nh7VarF instanceof yi7;
        wg7 wg7Var = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            kob kobVar = job.a;
            sb.append(kobVar.b(yi7.class).r());
            sb.append(", but had ");
            sb.append(kobVar.b(nh7VarF.getClass()).r());
            sb.append(" as the serialized body of string");
            String string = sb.toString();
            String strW = W(str);
            String string2 = wg7Var.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
            throw new lh7(kj0.b0(string, strW, null, -1, string2), string, strW, -1, string2, null);
        }
        yi7 yi7Var = (yi7) nh7VarF;
        if (!(yi7Var instanceof yh7)) {
            String strJ = ib8.j("Expected string value for a non-null key '", str, "', got null literal instead");
            String strW2 = W(str);
            String string3 = wg7Var.a.j ? kj0.n0(G().toString(), -1).toString() : null;
            throw new lh7(kj0.b0(strJ, strW2, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", -1, string3), strJ, strW2, -1, string3, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
        }
        yh7 yh7Var = (yh7) yi7Var;
        if (yh7Var.a) {
            return yh7Var.c;
        }
        String strJ2 = ib8.j("String literal for value of key '", str, "' should be quoted");
        String strW3 = W(str);
        String string4 = wg7Var.a.j ? kj0.n0(G().toString(), -1).toString() : null;
        throw new lh7(kj0.b0(strJ2, strW3, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", -1, string4), strJ2, strW3, -1, string4, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
    }

    public String R(nyc nycVar, int i) {
        nycVar.getClass();
        return nycVar.f(i);
    }

    public final String S(nyc nycVar, int i) {
        nycVar.getClass();
        String strR = R(nycVar, i);
        strR.getClass();
        return strR;
    }

    public abstract nh7 T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(arrayList.size() - 1);
        this.b = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : s72.D0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(yi7 yi7Var, String str, String str2) {
        String str3 = "Failed to parse literal '" + yi7Var + "' as " + (c5e.C(str, "i", false) ? "an " : "a ").concat(str) + " value";
        String strW = W(str2);
        String string = this.c.a.j ? kj0.n0(G().toString(), -1).toString() : null;
        throw new lh7(kj0.b0(str3, strW, null, -1, string), str3, strW, -1, string, null);
    }

    @Override // defpackage.om3, defpackage.zf2
    public final hzc a() {
        return this.c.b;
    }

    public void b(nyc nycVar) {
        nycVar.getClass();
    }

    @Override // defpackage.om3
    public zf2 c(nyc nycVar) {
        String string;
        nycVar.getClass();
        nh7 nh7VarG = G();
        iec iecVarG = nycVar.g();
        boolean zT = pa7.t(iecVarG, g5e.d);
        wg7 wg7Var = this.c;
        if (zT || (iecVarG instanceof zia)) {
            String strA = nycVar.a();
            if (nh7VarG instanceof yg7) {
                return new ej7(wg7Var, (yg7) nh7VarG);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            kob kobVar = job.a;
            sb.append(kobVar.b(yg7.class).r());
            sb.append(", but had ");
            sb.append(kobVar.b(nh7VarG.getClass()).r());
            String strL = ks0.l(sb, " as the serialized body of ", strA);
            String strV = V();
            String string2 = wg7Var.a.j ? kj0.n0(nh7VarG.toString(), -1).toString() : null;
            throw new lh7(kj0.b0(strL, strV, null, -1, string2), strL, strV, -1, string2, null);
        }
        if (!pa7.t(iecVarG, g5e.e)) {
            String strA2 = nycVar.a();
            if (nh7VarG instanceof ti7) {
                return new dj7(wg7Var, (ti7) nh7VarG, this.d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kob kobVar2 = job.a;
            sb2.append(kobVar2.b(ti7.class).r());
            sb2.append(", but had ");
            sb2.append(kobVar2.b(nh7VarG.getClass()).r());
            String strL2 = ks0.l(sb2, " as the serialized body of ", strA2);
            String strV2 = V();
            string = wg7Var.a.j ? kj0.n0(nh7VarG.toString(), -1).toString() : null;
            throw new lh7(kj0.b0(strL2, strV2, null, -1, string), strL2, strV2, -1, string, null);
        }
        nyc nycVarE = hcc.e(nycVar.i(0), wg7Var.b);
        iec iecVarG2 = nycVarE.g();
        if (!(iecVarG2 instanceof fua) && !pa7.t(iecVarG2, ryc.c)) {
            throw kj0.v(nycVarE);
        }
        String strA3 = nycVar.a();
        if (nh7VarG instanceof ti7) {
            return new fj7(wg7Var, (ti7) nh7VarG);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        kob kobVar3 = job.a;
        sb3.append(kobVar3.b(ti7.class).r());
        sb3.append(", but had ");
        sb3.append(kobVar3.b(nh7VarG.getClass()).r());
        String strL3 = ks0.l(sb3, " as the serialized body of ", strA3);
        String strV3 = V();
        string = wg7Var.a.j ? kj0.n0(nh7VarG.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(strL3, strV3, null, -1, string), strL3, strV3, -1, string, null);
    }

    @Override // defpackage.jh7
    public final wg7 d() {
        return this.c;
    }

    @Override // defpackage.zf2
    public final om3 e(dua duaVar, int i) {
        return M(S(duaVar, i), duaVar.i(i));
    }

    @Override // defpackage.om3
    public final boolean f() {
        return H(U());
    }

    @Override // defpackage.om3
    public final char g() {
        return J(U());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0091  */
    @Override // defpackage.om3
    public final Object h(xn7 xn7Var) {
        String strC;
        xn7Var.getClass();
        if (!(xn7Var instanceof k4)) {
            return xn7Var.c(this);
        }
        k4 k4Var = (k4) xn7Var;
        nyc nycVarE = k4Var.e();
        wg7 wg7Var = this.c;
        String strB = eb3.B(wg7Var, nycVarE);
        nh7 nh7VarG = G();
        String strA = k4Var.e().a();
        if (!(nh7VarG instanceof ti7)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kob kobVar = job.a;
            sb.append(kobVar.b(ti7.class).r());
            sb.append(", but had ");
            sb.append(kobVar.b(nh7VarG.getClass()).r());
            String strL = ks0.l(sb, " as the serialized body of ", strA);
            String strV = V();
            String string = wg7Var.a.j ? kj0.n0(nh7VarG.toString(), -1).toString() : null;
            throw new lh7(kj0.b0(strL, strV, null, -1, string), strL, strV, -1, string, null);
        }
        ti7 ti7Var = (ti7) nh7VarG;
        nh7 nh7Var = (nh7) ti7Var.get(strB);
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            if (yi7VarI instanceof qi7) {
                strC = null;
            } else {
                strC = yi7VarI.c();
            }
        } else {
            strC = null;
        }
        try {
            return drb.k(wg7Var, strB, ti7Var, mh3.v((k4) xn7Var, this, strC));
        } catch (yyc e) {
            String message = e.getMessage();
            message.getClass();
            String string2 = wg7Var.a.j ? kj0.n0(ti7Var.toString(), -1).toString() : null;
            throw new lh7(kj0.b0(message, null, null, -1, string2), message, null, -1, string2, null);
        }
    }

    @Override // defpackage.zf2
    public final float i(nyc nycVar, int i) {
        nycVar.getClass();
        return L(S(nycVar, i));
    }

    @Override // defpackage.zf2
    public final double k(dua duaVar, int i) {
        return K(S(duaVar, i));
    }

    @Override // defpackage.zf2
    public final char l(dua duaVar, int i) {
        return J(S(duaVar, i));
    }

    @Override // defpackage.jh7
    public final nh7 m() {
        return G();
    }

    @Override // defpackage.zf2
    public final byte n(dua duaVar, int i) {
        return I(S(duaVar, i));
    }

    @Override // defpackage.zf2
    public final String o(nyc nycVar, int i) {
        nycVar.getClass();
        return Q(S(nycVar, i));
    }

    @Override // defpackage.om3
    public final int p() {
        return N(U());
    }

    @Override // defpackage.zf2
    public final short q(dua duaVar, int i) {
        return P(S(duaVar, i));
    }

    @Override // defpackage.om3
    public final om3 r(nyc nycVar) {
        nycVar.getClass();
        if (s72.H0(this.a) != null) {
            return M(U(), nycVar);
        }
        return new zi7(this.c, T(), this.d).r(nycVar);
    }

    @Override // defpackage.zf2
    public final Object s(nyc nycVar, int i, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        this.a.add(S(nycVar, i));
        xn7Var.getClass();
        Object objH = h(xn7Var);
        if (!this.b) {
            U();
        }
        this.b = false;
        return objH;
    }

    @Override // defpackage.zf2
    public final int t(nyc nycVar, int i) {
        nycVar.getClass();
        return N(S(nycVar, i));
    }

    @Override // defpackage.om3
    public final String u() {
        return Q(U());
    }

    @Override // defpackage.om3
    public final int v(nyc nycVar) {
        nycVar.getClass();
        String str = (String) U();
        str.getClass();
        nh7 nh7VarF = F(str);
        String strA = nycVar.a();
        boolean z = nh7VarF instanceof yi7;
        wg7 wg7Var = this.c;
        if (z) {
            return pi7.b(nycVar, wg7Var, ((yi7) nh7VarF).c(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(yi7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarF.getClass()).r());
        String strL = ks0.l(sb, " as the serialized body of ", strA);
        String strW = W(str);
        String string = wg7Var.a.j ? kj0.n0(nh7VarF.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(strL, strW, null, -1, string), strL, strW, -1, string, null);
    }

    @Override // defpackage.om3
    public final long w() {
        return O(U());
    }

    @Override // defpackage.om3
    public boolean x() {
        return !(G() instanceof qi7);
    }

    @Override // defpackage.zf2
    public final Object y(nyc nycVar, int i, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        this.a.add(S(nycVar, i));
        Object objH = (xn7Var.e().c() || x()) ? h(xn7Var) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return objH;
    }

    @Override // defpackage.zf2
    public final boolean z(nyc nycVar, int i) {
        nycVar.getClass();
        return H(S(nycVar, i));
    }
}
