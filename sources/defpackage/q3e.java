package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q3e extends hkg implements jh7 {
    public final wg7 l;
    public final ucg m;
    public final a80 n;
    public final hzc o;
    public int p;
    public e4b q;
    public final dh7 r;
    public final ph7 s;

    public q3e(wg7 wg7Var, ucg ucgVar, a80 a80Var, nyc nycVar, e4b e4bVar) {
        nycVar.getClass();
        this.l = wg7Var;
        this.m = ucgVar;
        this.n = a80Var;
        this.o = wg7Var.b;
        this.p = -1;
        this.q = e4bVar;
        dh7 dh7Var = wg7Var.a;
        this.r = dh7Var;
        this.s = dh7Var.d ? null : new ph7(nycVar);
    }

    @Override // defpackage.hkg, defpackage.om3
    public final byte A() {
        a80 a80Var = this.n;
        long j = a80Var.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        a80.n(a80Var, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final short B() {
        a80 a80Var = this.n;
        long j = a80Var.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        a80.n(a80Var, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final float C() {
        a80 a80Var = this.n;
        String strL = a80Var.l();
        try {
            float f = Float.parseFloat(strL);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            a80.n(a80Var, kj0.o0(null, Float.valueOf(f)), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a80.n(a80Var, ks0.g('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hkg, defpackage.om3
    public final double E() {
        a80 a80Var = this.n;
        String strL = a80Var.l();
        try {
            double d = Double.parseDouble(strL);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            a80.n(a80Var, kj0.o0(null, Double.valueOf(d)), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a80.n(a80Var, ks0.g('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.om3, defpackage.zf2
    public final hzc a() {
        return this.o;
    }

    @Override // defpackage.hkg, defpackage.zf2
    public final void b(nyc nycVar) {
        nycVar.getClass();
        if (nycVar.e() == 0 && pi7.c(this.l, nycVar)) {
            while (j(nycVar) != -1) {
            }
        }
        a80 a80Var = this.n;
        if (a80Var.H()) {
            kj0.l0(a80Var, "");
            throw null;
        }
        a80Var.i(this.m.end);
        veh vehVar = (veh) a80Var.d;
        int i = vehVar.b;
        int[] iArr = (int[]) vehVar.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            vehVar.b = i;
        }
        if (i != -1) {
            vehVar.b = i - 1;
        }
    }

    @Override // defpackage.hkg, defpackage.om3
    public final zf2 c(nyc nycVar) {
        nycVar.getClass();
        wg7 wg7Var = this.l;
        ucg ucgVarN = hcc.n(wg7Var, nycVar);
        a80 a80Var = this.n;
        veh vehVar = (veh) a80Var.d;
        int i = vehVar.b + 1;
        vehVar.b = i;
        if (i == ((Object[]) vehVar.d).length) {
            vehVar.h();
        }
        ((Object[]) vehVar.d)[i] = nycVar;
        a80Var.i(ucgVarN.begin);
        if (a80Var.x() == 4) {
            a80.n(a80Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = ucgVarN.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new q3e(wg7Var, ucgVarN, a80Var, nycVar, this.q);
        }
        return (this.m == ucgVarN && wg7Var.a.d) ? this : new q3e(wg7Var, ucgVarN, a80Var, nycVar, this.q);
    }

    @Override // defpackage.jh7
    public final wg7 d() {
        return this.l;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final boolean f() {
        boolean z;
        boolean z2;
        a80 a80Var = this.n;
        int iG = a80Var.G();
        String str = (String) a80Var.g;
        if (iG == str.length()) {
            a80.n(a80Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iG) == '\"') {
            iG++;
            z = true;
        } else {
            z = false;
        }
        int iZ = a80Var.z(iG);
        if (iZ >= str.length() || iZ == -1) {
            a80.n(a80Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iZ + 1;
        int iCharAt = str.charAt(iZ) | ' ';
        if (iCharAt == 102) {
            a80Var.e(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                a80.n(a80Var, "Expected valid boolean literal prefix, but had '" + a80Var.l() + '\'', 0, null, 6);
                throw null;
            }
            a80Var.e(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (a80Var.b == str.length()) {
            a80.n(a80Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(a80Var.b) == '\"') {
            a80Var.b++;
            return z2;
        }
        a80.n(a80Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final char g() {
        a80 a80Var = this.n;
        String strL = a80Var.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        a80.n(a80Var, ks0.g('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0150  */
    /* JADX WARN: Code duplicated, block: B:48:0x0151  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0151, please report this as an issue */
    @Override // defpackage.om3
    public final Object h(xn7 xn7Var) {
        String message;
        String strC;
        String string;
        wg7 wg7Var = this.l;
        a80 a80Var = this.n;
        veh vehVar = (veh) a80Var.d;
        xn7Var.getClass();
        try {
            if (!(xn7Var instanceof k4)) {
                return xn7Var.c(this);
            }
            String strB = eb3.B(wg7Var, ((k4) xn7Var).e());
            String strW = a80Var.w(strB);
            if (strW != null) {
                try {
                    xn7 xn7VarV = mh3.v((k4) xn7Var, this, strW);
                    e4b e4bVar = new e4b();
                    e4bVar.a = strB;
                    this.q = e4bVar;
                    return xn7VarV.c(this);
                } catch (yyc e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strZ = v4e.Z(v4e.i0(message2, '\n'), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = "";
                    int iN = v4e.N(message3, '\n', 0, 6);
                    if (iN != -1) {
                        strSubstring = message3.substring(iN + 1, message3.length());
                    }
                    a80.n(a80Var, strZ, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strB2 = eb3.B(wg7Var, ((k4) xn7Var).e());
            nh7 nh7VarM = m();
            String strA = ((k4) xn7Var).e().a();
            if (nh7VarM instanceof ti7) {
                ti7 ti7Var = (ti7) nh7VarM;
                nh7 nh7Var = (nh7) ti7Var.get(strB2);
                if (nh7Var != null) {
                    yi7 yi7VarI = oh7.i(nh7Var);
                    strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
                }
                try {
                    return drb.k(wg7Var, strB2, ti7Var, mh3.v((k4) xn7Var, this, strC));
                } catch (yyc e2) {
                    String message4 = e2.getMessage();
                    message4.getClass();
                    string = wg7Var.a.j ? kj0.n0(ti7Var.toString(), -1).toString() : null;
                    throw new lh7(kj0.b0(message4, null, null, -1, string), message4, null, -1, string, null);
                }
            }
            StringBuilder sb = new StringBuilder("Expected ");
            kob kobVar = job.a;
            sb.append(kobVar.b(ti7.class).r());
            sb.append(", but had ");
            sb.append(kobVar.b(nh7VarM.getClass()).r());
            sb.append(" as the serialized body of ");
            sb.append(strA);
            String string2 = sb.toString();
            String strF = vehVar.f();
            string = wg7Var.a.j ? kj0.n0(nh7VarM.toString(), -1).toString() : null;
            throw new lh7(kj0.b0(string2, strF, null, -1, string), string2, strF, -1, string, null);
            message = e.getMessage();
            message.getClass();
            if (v4e.F(message, "at path", false)) {
                throw e;
            }
            throw e.b(e.getMessage() + " at path: " + vehVar.f());
        } catch (ew8 e3) {
            message = e3.getMessage();
            message.getClass();
            if (v4e.F(message, "at path", false)) {
                throw e3;
            }
            throw e3.b(e3.getMessage() + " at path: " + vehVar.f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zf2
    public final int j(nyc nycVar) {
        int iA;
        boolean z;
        boolean zH;
        boolean z2;
        boolean z3;
        String strY;
        a80 a80Var = this.n;
        veh vehVar = (veh) a80Var.d;
        nycVar.getClass();
        ucg ucgVar = this.m;
        int iOrdinal = ucgVar.ordinal();
        char c = ':';
        int i = 0;
        zH = false;
        boolean zH2 = false;
        boolean z4 = true;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zH3 = a80Var.H();
            while (true) {
                boolean zD = a80Var.d();
                ph7 ph7Var = this.s;
                if (zD) {
                    String strF = a80Var.f();
                    a80Var.i(c);
                    wg7 wg7Var = this.l;
                    iA = pi7.a(nycVar, wg7Var, strF);
                    if (iA != -3) {
                        if (this.r.f) {
                            boolean zJ = nycVar.j(iA);
                            nyc nycVarI = nycVar.i(iA);
                            if (zJ && !nycVarI.c() && a80Var.I(z4)) {
                                z = z4;
                            } else {
                                z = z4;
                                if (pa7.t(nycVarI.g(), ryc.c) && ((!nycVarI.c() || !a80Var.I(false)) && (strY = a80Var.y()) != null)) {
                                    int iA2 = pi7.a(nycVarI, wg7Var, strY);
                                    boolean z5 = (wg7Var.a.d || !nycVarI.c()) ? false : z;
                                    if (iA2 == -3 && (zJ || z5)) {
                                        a80Var.k();
                                    }
                                }
                            }
                            zH = a80Var.H();
                            z2 = false;
                        }
                        if (ph7Var != null) {
                            ws4 ws4Var = ph7Var.a;
                            if (iA < 64) {
                                ws4Var.a |= 1 << iA;
                            } else {
                                int i3 = (iA >>> 6) - 1;
                                long[] jArr = (long[]) ws4Var.d;
                                jArr[i3] = jArr[i3] | (1 << (iA & 63));
                            }
                        }
                    } else {
                        z = z4;
                        zH = false;
                        z2 = z;
                    }
                    if (z2) {
                        if (!pi7.c(wg7Var, nycVar)) {
                            e4b e4bVar = this.q;
                            if (e4bVar == null || !pa7.t(e4bVar.a, strF)) {
                                int i4 = vehVar.b;
                                int[] iArr = (int[]) vehVar.e;
                                if (iArr[i4] == -2) {
                                    iArr[i4] = i2;
                                    i4--;
                                    vehVar.b = i4;
                                }
                                int i5 = i2;
                                if (i4 != i5) {
                                    vehVar.b = i4 + i5;
                                }
                                a80Var.m(v4e.T(((String) a80Var.g).subSequence(0, a80Var.b).toString(), strF, 0, 6), ks0.g('\'', "Encountered an unknown key '", strF), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                                throw null;
                            }
                            e4bVar.a = null;
                        }
                        int i6 = i2;
                        ArrayList arrayList = new ArrayList();
                        byte bX = a80Var.x();
                        if (bX == 8 || bX == 6) {
                            while (true) {
                                byte bX2 = a80Var.x();
                                z3 = z;
                                if (bX2 == z3) {
                                    a80Var.f();
                                } else {
                                    if (bX2 == 8 || bX2 == 6) {
                                        arrayList.add(Byte.valueOf(bX2));
                                    } else if (bX2 == 9) {
                                        if (((Number) s72.F0(arrayList)).byteValue() != 8) {
                                            a80.n(a80Var, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        x72.k0(arrayList);
                                    } else if (bX2 == 7) {
                                        if (((Number) s72.F0(arrayList)).byteValue() != 6) {
                                            a80.n(a80Var, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        x72.k0(arrayList);
                                    } else if (bX2 == 10) {
                                        a80.n(a80Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    a80Var.g();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                z = z3;
                            }
                        } else {
                            a80Var.l();
                            z3 = z;
                        }
                        zH3 = a80Var.H();
                        z4 = z3;
                        i2 = i6;
                        c = ':';
                    } else {
                        zH3 = zH;
                        i2 = i2;
                        z4 = z;
                        c = ':';
                    }
                } else {
                    iA = i2;
                    if (zH3) {
                        kj0.l0(a80Var, "object");
                        throw null;
                    }
                    if (ph7Var != null) {
                        ws4 ws4Var2 = ph7Var.a;
                        gl glVar = (gl) ws4Var2.c;
                        nyc nycVar2 = (nyc) ws4Var2.b;
                        int iE = nycVar2.e();
                        while (true) {
                            long j = ws4Var2.a;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                ws4Var2.a |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) glVar.z(nycVar2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i2 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iE > 64) {
                                long[] jArr2 = (long[]) ws4Var2.d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (i < length) {
                                        int i7 = i + 1;
                                        int i8 = i7 * 64;
                                        long j2 = jArr2[i];
                                        while (true) {
                                            if (j2 != -1) {
                                                int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                                                j2 |= 1 << iNumberOfTrailingZeros2;
                                                int i9 = iNumberOfTrailingZeros2 + i8;
                                                if (((Boolean) glVar.z(nycVar2, Integer.valueOf(i9))).booleanValue()) {
                                                    jArr2[i] = j2;
                                                    i2 = i9;
                                                    break;
                                                }
                                            } else {
                                                jArr2[i] = j2;
                                                i = i7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = iA;
                break;
            }
        } else if (iOrdinal != 2) {
            boolean zH4 = a80Var.H();
            if (a80Var.d()) {
                int i10 = this.p;
                if (i10 != -1 && !zH4) {
                    a80.n(a80Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i10 + 1;
                this.p = i2;
            } else if (zH4) {
                kj0.l0(a80Var, "array");
                throw null;
            }
        } else {
            int i11 = this.p;
            byte b = i11 % 2 != 0;
            if (b != true) {
                a80Var.i(':');
            } else if (i11 != -1) {
                zH2 = a80Var.H();
            }
            if (a80Var.d()) {
                if (b != false) {
                    int i12 = this.p;
                    int i13 = a80Var.b;
                    if (i12 == -1) {
                        if (zH2) {
                            a80.n(a80Var, "Unexpected leading comma", i13, null, 4);
                            throw null;
                        }
                    } else if (!zH2) {
                        a80.n(a80Var, "Expected comma after the key-value pair", i13, null, 4);
                        throw null;
                    }
                }
                i2 = this.p + 1;
                this.p = i2;
            } else if (zH2) {
                kj0.l0(a80Var, "object");
                throw null;
            }
        }
        if (ucgVar != ucg.MAP) {
            ((int[]) vehVar.e)[vehVar.b] = i2;
        }
        return i2;
    }

    @Override // defpackage.jh7
    public final nh7 m() {
        return new jj7(this.l.a, this.n).a();
    }

    @Override // defpackage.hkg, defpackage.om3
    public final int p() {
        a80 a80Var = this.n;
        long j = a80Var.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        a80.n(a80Var, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final om3 r(nyc nycVar) {
        nycVar.getClass();
        return s3e.a(nycVar) ? new kh7(this.n, this.l) : this;
    }

    @Override // defpackage.hkg, defpackage.zf2
    public final Object s(nyc nycVar, int i, xn7 xn7Var, Object obj) {
        veh vehVar = (veh) this.n.d;
        nycVar.getClass();
        xn7Var.getClass();
        boolean z = this.m == ucg.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) vehVar.e;
            int i2 = vehVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) vehVar.d)[i2] = qk6.H0;
            }
        }
        Object objH = h(xn7Var);
        if (z) {
            int[] iArr2 = (int[]) vehVar.e;
            int i3 = vehVar.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                vehVar.b = i4;
                if (i4 == ((Object[]) vehVar.d).length) {
                    vehVar.h();
                }
            }
            Object[] objArr = (Object[]) vehVar.d;
            int i5 = vehVar.b;
            objArr[i5] = ((dh7) vehVar.c).j ? objH : hj6.M0;
            ((int[]) vehVar.e)[i5] = -2;
        }
        return objH;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final String u() {
        return this.n.k();
    }

    @Override // defpackage.hkg, defpackage.om3
    public final int v(nyc nycVar) {
        nycVar.getClass();
        a80 a80Var = this.n;
        return pi7.b(nycVar, this.l, a80Var.k(), " at path ".concat(((veh) a80Var.d).f()));
    }

    @Override // defpackage.hkg, defpackage.om3
    public final long w() {
        return this.n.j();
    }

    @Override // defpackage.hkg, defpackage.om3
    public final boolean x() {
        ph7 ph7Var = this.s;
        return ((ph7Var != null ? ph7Var.b : false) || this.n.I(true)) ? false : true;
    }
}
