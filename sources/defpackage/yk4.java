package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yk4 extends sv3 implements ria, h27, ug2, rl4 {
    public ks9 F0;
    public a26 G0;
    public boolean H0;
    public t69 I0;
    public r41 J0;
    public al4 K0;
    public boolean L0;
    public boolean M0;
    public pj4 N0;
    public long O0 = 0;
    public u66 P0;
    public u66 Q0;
    public sj4 R0;
    public rj4 S0;
    public qj4 T0;
    public i7h U0;
    public ctf V0;
    public u0f W0;
    public g27 X0;

    public yk4(a26 a26Var, boolean z, t69 t69Var, ks9 ks9Var) {
        this.F0 = ks9Var;
        this.G0 = a26Var;
        this.H0 = z;
        this.I0 = t69Var;
    }

    public static void s1(yk4 yk4Var, oia oiaVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        rj4 rj4Var = yk4Var.S0;
        if (rj4Var == null) {
            rj4Var = new rj4();
            rj4Var.K = null;
            rj4Var.L = Long.MAX_VALUE;
            rj4Var.M = false;
            yk4Var.S0 = rj4Var;
        }
        rj4Var.K = oiaVar;
        rj4Var.L = j;
        u0f u0fVar = yk4Var.W0;
        ks9 ks9Var = yk4Var.F0;
        if (u0fVar == null) {
            yk4Var.W0 = new u0f(ks9Var, 2);
        } else {
            u0fVar.a = ks9Var;
            u0fVar.b = j2;
        }
        rj4Var.M = false;
        yk4Var.U0 = rj4Var;
    }

    public final ctf A1() {
        ctf ctfVar = this.V0;
        if (ctfVar != null) {
            return ctfVar;
        }
        qc0.j("Velocity Tracker not initialized.");
        return null;
    }

    public final void B1(long j, oia oiaVar) {
        this.O0 = hl9.g(this.O0, j);
        z7c.h(A1(), oiaVar);
        z1().d(new uj4(j, false));
    }

    @Override // defpackage.h27
    public final void C(os osVar, iia iiaVar) {
        Object obj;
        Object obj2;
        Object obj3;
        char c;
        long j;
        float f;
        float fIntBitsToFloat;
        g27 g27Var;
        Object obj4;
        g27 g27Var2;
        Object obj5;
        Object obj6;
        b27 b27Var;
        int i = osVar.b;
        ArrayList arrayList = (ArrayList) osVar.c;
        if (this.H0) {
            g27 g27Var3 = this.X0;
            if (g27Var3 == null) {
                g27Var3 = new g27(this);
                this.X0 = g27Var3;
            }
            if (this.Q0 == null) {
                u66 u66Var = new u66(g27Var3);
                l1(u66Var);
                this.Q0 = u66Var;
            }
            g27 g27Var4 = this.X0;
            if (g27Var4 != null) {
                yk4 yk4Var = g27Var4.a;
                b21 b21Var = g27Var4.f;
                if (b21Var == null) {
                    b27 b27Var2 = g27Var4.b;
                    if (b27Var2 == null) {
                        obj = b21Var;
                        b27Var = b27Var2;
                        b27 b27Var3 = new b27();
                        b27Var3.o = a27.c;
                        b27Var3.p = false;
                        b27Var3.q = false;
                        g27Var4.b = b27Var3;
                        b27Var = b27Var3;
                    }
                    obj = b21Var;
                    b27Var = b27Var2;
                    g27Var4.f = b27Var;
                    obj = b27Var;
                }
                obj = b21Var;
                boolean z = obj instanceof b27;
                iia iiaVar2 = iia.a;
                boolean z2 = true;
                iia iiaVar3 = iia.b;
                if (z) {
                    b27 b27Var4 = (b27) obj;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!g21.z((z17) arrayList.get(i2))) {
                            return;
                        }
                    }
                    z17 z17Var = (z17) s72.v0(arrayList);
                    int i3 = f27.a[b27Var4.o.ordinal()];
                    a27 a27Var = a27.b;
                    a27 a27Var2 = a27.a;
                    a27 a27Var3 = i3 == 1 ? !yk4Var.D1() ? a27Var2 : a27Var : b27Var4.o;
                    b27Var4.o = a27Var3;
                    if (iiaVar == iiaVar2) {
                        if (a27Var3 == a27Var) {
                            z17Var.i = true;
                            b27Var4.p = true;
                        }
                        b27Var4.q = true;
                    }
                    if (iiaVar == iiaVar3) {
                        if (a27Var3 == a27Var2) {
                            g27.c(g27Var4, z17Var, z17Var.a, 0L, 12);
                            return;
                        }
                        if (b27Var4.p) {
                            g27Var4.f(z17Var, z17Var, new y17(i), 0L);
                            g27Var4.e(z17Var, new y17(i), 0L);
                            long j2 = z17Var.a;
                            e27 e27Var = g27Var4.c;
                            if (e27Var == null) {
                                e27Var = new e27();
                                e27Var.o = Long.MAX_VALUE;
                                g27Var4.c = e27Var;
                            }
                            e27Var.o = j2;
                            g27Var4.f = e27Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = obj instanceof d27;
                iia iiaVar4 = iia.c;
                if (z3) {
                    d27 d27Var = (d27) obj;
                    if (iiaVar == iiaVar2) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            g27Var = g27Var4;
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i4);
                        g27Var = g27Var4;
                        if (kn2.E(((z17) obj4).a, d27Var.p)) {
                            break;
                        }
                        i4++;
                        g27Var4 = g27Var;
                    }
                    z17 z17Var2 = (z17) obj4;
                    if (z17Var2 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj6 = null;
                                break;
                            }
                            obj6 = arrayList.get(i5);
                            if (((z17) obj6).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        z17Var2 = (z17) obj6;
                        if (z17Var2 == null) {
                            g27Var.a();
                            return;
                        }
                        d27Var.p = z17Var2.a;
                    }
                    z17 z17Var3 = z17Var2;
                    if (iiaVar != iiaVar3) {
                        g27Var2 = g27Var;
                    } else if (z17Var3.i) {
                        g27Var2 = g27Var;
                        z17 z17Var4 = d27Var.o;
                        if (z17Var4 == null) {
                            qc0.j("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = d27Var.p;
                        u0f u0fVar = g27Var2.v;
                        if (u0fVar == null) {
                            qc0.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        g27Var2.b(z17Var4, j3, u0fVar);
                    } else if (g21.A(z17Var3)) {
                        int size4 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                obj5 = null;
                                break;
                            }
                            Object obj7 = arrayList.get(i6);
                            if (((z17) obj7).d) {
                                obj5 = obj7;
                                break;
                            }
                            i6++;
                        }
                        z17 z17Var5 = (z17) obj5;
                        if (z17Var5 == null) {
                            g27Var.a();
                        } else {
                            d27Var.p = z17Var5.a;
                        }
                        g27Var2 = g27Var;
                    } else {
                        rvf rvfVar = (rvf) eb3.H(yk4Var, zg2.t);
                        float f2 = rk4.a;
                        float f3 = rvfVar.f();
                        g27Var2 = g27Var;
                        u0f u0fVar2 = g27Var2.v;
                        if (u0fVar2 == null) {
                            qc0.j("Touch slop detector not initialized.");
                            return;
                        }
                        long jA = u0f.a(u0fVar2, g21.X(z17Var3, yk4Var.F0, new y17(i), true), f3);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            z17Var3.i = true;
                            z17 z17Var6 = d27Var.o;
                            z17Var6.getClass();
                            g27Var2.f(z17Var6, z17Var3, new y17(i), jA);
                            g27Var2.e(z17Var3, new y17(i), jA);
                            long j4 = z17Var3.a;
                            e27 e27Var2 = g27Var2.c;
                            if (e27Var2 == null) {
                                e27Var2 = new e27();
                                e27Var2.o = Long.MAX_VALUE;
                                g27Var2.c = e27Var2;
                            }
                            e27Var2.o = j4;
                            g27Var2.f = e27Var2;
                        } else {
                            d27Var.q = true;
                        }
                    }
                    if (iiaVar == iiaVar4 && d27Var.q) {
                        if (!z17Var3.i) {
                            d27Var.q = false;
                            return;
                        }
                        z17 z17Var7 = d27Var.o;
                        if (z17Var7 == null) {
                            qc0.j("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j5 = d27Var.p;
                        u0f u0fVar3 = g27Var2.v;
                        if (u0fVar3 != null) {
                            g27Var2.b(z17Var7, j5, u0fVar3);
                            return;
                        } else {
                            qc0.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof c27) {
                    c27 c27Var = (c27) obj;
                    if (iiaVar != iiaVar4) {
                        return;
                    }
                    int size5 = arrayList.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        if (((z17) arrayList.get(i7)).i) {
                            z2 = false;
                            break;
                        }
                    }
                    int size6 = arrayList.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        if (((z17) arrayList.get(i8)).d) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long jY = g21.Y((z17) s72.v0(arrayList), yk4Var.F0, new y17(i));
                                z17 z17Var8 = c27Var.o;
                                z17Var8.getClass();
                                long jF = hl9.f(jY, g21.Y(z17Var8, yk4Var.F0, new y17(i)));
                                z17 z17Var9 = c27Var.o;
                                if (z17Var9 != null) {
                                    g27.c(g27Var4, z17Var9, c27Var.p, jF, 8);
                                    return;
                                } else {
                                    qc0.j("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g27Var4.a();
                    return;
                }
                if (!(obj instanceof e27)) {
                    ap.c();
                    return;
                }
                e27 e27Var3 = (e27) obj;
                if (iiaVar != iiaVar3) {
                    return;
                }
                long j6 = e27Var3.o;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i9);
                    if (kn2.E(((z17) obj2).a, j6)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                z17 z17Var10 = (z17) obj2;
                if (z17Var10 == null) {
                    return;
                }
                long j7 = z17Var10.c;
                boolean zA = g21.A(z17Var10);
                tj4 tj4Var = tj4.a;
                if (!zA) {
                    if (z17Var10.i) {
                        yk4Var.t1(tj4Var);
                        return;
                    } else {
                        if (hl9.d(g21.X(z17Var10, yk4Var.F0, new y17(i), true)) == 0.0f) {
                            return;
                        }
                        g27Var4.e(z17Var10, new y17(i), g21.X(z17Var10, yk4Var.F0, new y17(i), false));
                        z17Var10.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i10);
                    if (((z17) obj3).d) {
                        break;
                    } else {
                        i10++;
                    }
                }
                z17 z17Var11 = (z17) obj3;
                if (z17Var11 != null) {
                    e27Var3.o = z17Var11.a;
                    return;
                }
                if (z17Var10.i || !g21.A(z17Var10)) {
                    yk4Var.t1(tj4Var);
                } else {
                    ctf ctfVarD = g27Var4.d();
                    ks9 ks9Var = yk4Var.F0;
                    sug sugVar = g27Var4.w;
                    i79 i79Var = (i79) sugVar.c;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                    long j8 = 4294967295L;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    if (g21.z(z17Var10)) {
                        sugVar.b = 0;
                        i79Var.k();
                    }
                    if (g21.A(z17Var10) || g21.z(z17Var10)) {
                        c = ' ';
                        j = 4294967295L;
                        f = 0.0f;
                    } else {
                        if (i79Var.b == 3) {
                            int i11 = sugVar.b;
                            sugVar.b = i11 + 1;
                            i79Var.p(i11, z17Var10);
                        } else {
                            i79Var.h(z17Var10);
                        }
                        if (sugVar.b == 3) {
                            sugVar.b = 0;
                        }
                        Object[] objArr = i79Var.a;
                        int i12 = i79Var.b;
                        int i13 = 0;
                        float fIntBitsToFloat4 = 0.0f;
                        while (i13 < i12) {
                            char c3 = c2;
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (((z17) objArr[i13]).c >> c3)) + fIntBitsToFloat4;
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        f = 0.0f;
                        int i14 = i79Var.b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                        Object[] objArr2 = i79Var.a;
                        float fIntBitsToFloat5 = 0.0f;
                        int i15 = 0;
                        while (i15 < i14) {
                            long j9 = j8;
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((z17) objArr2[i15]).c & j9));
                            i15++;
                            j8 = j9;
                        }
                        j = j8;
                        fIntBitsToFloat3 = fIntBitsToFloat5 / i79Var.b;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j);
                    if (ks9Var != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                        }
                        jFloatToRawIntBits = ks9Var == ks9.b ? (((long) Float.floatToRawIntBits(f)) & j) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j);
                    }
                    ctfVarD.a.a(z17Var10.b, jFloatToRawIntBits);
                    float fE = ((rvf) eb3.H(yk4Var, zg2.t)).e();
                    long jA2 = g27Var4.d().a(q7c.j(fE, fE));
                    xj0 xj0Var = g27Var4.d().a;
                    btf btfVar = (btf) xj0Var.b;
                    qb3[] qb3VarArr = btfVar.d;
                    qd0.h0(0, qb3VarArr.length, null, qb3VarArr);
                    btfVar.e = 0;
                    btf btfVar2 = (btf) xj0Var.c;
                    qb3[] qb3VarArr2 = btfVar2.d;
                    qd0.h0(0, qb3VarArr2.length, null, qb3VarArr2);
                    btfVar2.e = 0;
                    xj0Var.a = 0L;
                    yk4Var.t1(new wj4(ul4.b(jA2), true));
                }
                g27Var4.a();
            }
        }
    }

    public final void C1(oia oiaVar, oia oiaVar2, long j) {
        if (this.V0 == null) {
            this.V0 = new ctf();
        }
        z7c.h(A1(), oiaVar);
        long jF = hl9.f(oiaVar2.c, j);
        if (((Boolean) this.G0.d(new xia(oiaVar.i))).booleanValue()) {
            if (!this.L0) {
                if (this.J0 == null) {
                    this.J0 = urg.a(Integer.MAX_VALUE, null, null, 6);
                }
                E1();
            }
            z1().d(new vj4(jF));
        }
    }

    public abstract boolean D1();

    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    public void E(hia hiaVar, iia iiaVar, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        pj4 pj4Var;
        boolean z2 = true;
        this.M0 = true;
        if (this.H0) {
            if (this.P0 == null) {
                u66 u66Var = new u66(this);
                l1(u66Var);
                this.P0 = u66Var;
            }
            i7h i7hVar = this.U0;
            Object obj6 = i7hVar;
            if (i7hVar == null) {
                pj4 pj4Var2 = this.N0;
                if (pj4Var2 == null) {
                    pj4Var = pj4Var2;
                    pj4 pj4Var3 = new pj4();
                    pj4Var3.K = oj4.c;
                    pj4Var3.L = false;
                    pj4Var3.M = false;
                    this.N0 = pj4Var3;
                    pj4Var = pj4Var3;
                }
                pj4Var = pj4Var2;
                this.U0 = pj4Var;
                obj6 = pj4Var;
            }
            boolean z3 = obj6 instanceof pj4;
            iia iiaVar2 = iia.a;
            iia iiaVar3 = iia.b;
            if (z3) {
                pj4 pj4Var4 = (pj4) obj6;
                if (!hiaVar.a.isEmpty() && ffe.f(hiaVar, false, false)) {
                    oia oiaVar = (oia) s72.v0(hiaVar.a);
                    int i = sk4.a[pj4Var4.K.ordinal()];
                    oj4 oj4Var = oj4.b;
                    oj4 oj4Var2 = oj4.a;
                    oj4 oj4Var3 = i == 1 ? !D1() ? oj4Var2 : oj4Var : pj4Var4.K;
                    pj4Var4.K = oj4Var3;
                    if (iiaVar == iiaVar2) {
                        if (oj4Var3 == oj4Var) {
                            oiaVar.a();
                            pj4Var4.L = true;
                        }
                        pj4Var4.M = true;
                    }
                    if (iiaVar == iiaVar3) {
                        if (oj4Var3 == oj4Var2) {
                            s1(this, oiaVar, oiaVar.a, 0L, 12);
                            return;
                        }
                        if (pj4Var4.L) {
                            C1(oiaVar, oiaVar, 0L);
                            B1(0L, oiaVar);
                            long j2 = oiaVar.a;
                            sj4 sj4Var = this.R0;
                            if (sj4Var == null) {
                                sj4Var = new sj4();
                                sj4Var.K = Long.MAX_VALUE;
                                this.R0 = sj4Var;
                            }
                            sj4Var.K = j2;
                            this.U0 = sj4Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z4 = obj6 instanceof rj4;
            iia iiaVar4 = iia.c;
            if (!z4) {
                if (obj6 instanceof qj4) {
                    qj4 qj4Var = (qj4) obj6;
                    if (iiaVar != iiaVar4) {
                        return;
                    }
                    List list = hiaVar.a;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((oia) list.get(i2)).c()) {
                            z2 = false;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (((oia) list.get(i3)).d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long j3 = ((oia) s72.v0(list)).c;
                                oia oiaVar2 = qj4Var.K;
                                oiaVar2.getClass();
                                long jF = hl9.f(j3, oiaVar2.c);
                                oia oiaVar3 = qj4Var.K;
                                if (oiaVar3 != null) {
                                    s1(this, oiaVar3, qj4Var.L, jF, 8);
                                    return;
                                } else {
                                    qc0.j("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    q1();
                    return;
                }
                if (!(obj6 instanceof sj4)) {
                    ap.c();
                    return;
                }
                sj4 sj4Var2 = (sj4) obj6;
                if (iiaVar != iiaVar3) {
                    return;
                }
                long j4 = sj4Var2.K;
                List list2 = hiaVar.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i4);
                    if (kn2.E(((oia) obj).a, j4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                oia oiaVar4 = (oia) obj;
                if (oiaVar4 == null) {
                    return;
                }
                boolean zN = xo1.n(oiaVar4);
                Object obj7 = tj4.a;
                if (!zN) {
                    if (oiaVar4.c()) {
                        z1().d(obj7);
                        return;
                    } else {
                        if (hl9.d(xo1.H(oiaVar4, true)) == 0.0f) {
                            return;
                        }
                        B1(xo1.H(oiaVar4, false), oiaVar4);
                        oiaVar4.a();
                        return;
                    }
                }
                List list3 = hiaVar.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i5);
                    if (((oia) obj2).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                oia oiaVar5 = (oia) obj2;
                if (oiaVar5 != null) {
                    sj4Var2.K = oiaVar5.a;
                    return;
                }
                if (oiaVar4.c() || !xo1.n(oiaVar4)) {
                    z1().d(obj7);
                } else {
                    float fE = ((rvf) eb3.H(this, zg2.t)).e();
                    z7c.h(A1(), oiaVar4);
                    long jA = A1().a(q7c.j(fE, fE));
                    xj0 xj0Var = A1().a;
                    btf btfVar = (btf) xj0Var.b;
                    qb3[] qb3VarArr = btfVar.d;
                    qd0.h0(0, qb3VarArr.length, null, qb3VarArr);
                    btfVar.e = 0;
                    btf btfVar2 = (btf) xj0Var.c;
                    qb3[] qb3VarArr2 = btfVar2.d;
                    qd0.h0(0, qb3VarArr2.length, null, qb3VarArr2);
                    btfVar2.e = 0;
                    xj0Var.a = 0L;
                    z1().d(new wj4(ul4.b(jA), false));
                    this.M0 = false;
                }
                q1();
                return;
            }
            rj4 rj4Var = (rj4) obj6;
            if (iiaVar == iiaVar2) {
                return;
            }
            List list4 = hiaVar.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i6);
                if (kn2.E(((oia) obj3).a, rj4Var.L)) {
                    break;
                } else {
                    i6++;
                }
            }
            oia oiaVar6 = (oia) obj3;
            if (oiaVar6 == null) {
                int size6 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list4.get(i7);
                    if (((oia) obj5).d) {
                        break;
                    } else {
                        i7++;
                    }
                }
                oiaVar6 = (oia) obj5;
                if (oiaVar6 == null) {
                    q1();
                    return;
                }
                rj4Var.L = oiaVar6.a;
            }
            if (iiaVar == iiaVar3) {
                if (oiaVar6.c()) {
                    oia oiaVar7 = rj4Var.K;
                    if (oiaVar7 == null) {
                        qc0.j("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = rj4Var.L;
                    u0f u0fVar = this.W0;
                    if (u0fVar == null) {
                        qc0.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    r1(oiaVar7, j5, u0fVar);
                } else if (xo1.n(oiaVar6)) {
                    int size7 = list4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj4 = null;
                            break;
                        }
                        Object obj8 = list4.get(i8);
                        if (((oia) obj8).d) {
                            obj4 = obj8;
                            break;
                        }
                        i8++;
                    }
                    oia oiaVar8 = (oia) obj4;
                    if (oiaVar8 == null) {
                        q1();
                    } else {
                        rj4Var.L = oiaVar8.a;
                    }
                } else {
                    float fN = rk4.n((rvf) eb3.H(this, zg2.t), oiaVar6.i);
                    u0f u0fVar2 = this.W0;
                    if (u0fVar2 == null) {
                        qc0.j("Touch slop detector not initialized.");
                        return;
                    }
                    long jA2 = u0f.a(u0fVar2, xo1.H(oiaVar6, true), fN);
                    if ((9223372034707292159L & jA2) != 9205357640488583168L) {
                        long jG = hl9.g(this.O0, xo1.H(oiaVar6, false));
                        this.O0 = jG;
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.O0 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jG >> 32))))) * 57.29578f;
                        ks9 ks9Var = this.F0;
                        if (ks9Var == null) {
                            z = true;
                        } else {
                            sl4 sl4Var = ul4.a;
                            if (ks9Var != ks9.b ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        imb imbVar = new imb();
                        tc2 tc2Var = new tc2(fAtan2, imbVar, 2);
                        sl4 sl4Var2 = ul4.a;
                        n3d.s(this, u66.E0, new hy0(new ot1(22, tc2Var), 10));
                        if (z || !imbVar.element) {
                            oiaVar6.a();
                            oia oiaVar9 = rj4Var.K;
                            oiaVar9.getClass();
                            C1(oiaVar9, oiaVar6, jA2);
                            B1(jA2, oiaVar6);
                            long j6 = oiaVar6.a;
                            sj4 sj4Var3 = this.R0;
                            if (sj4Var3 == null) {
                                sj4Var3 = new sj4();
                                sj4Var3.K = Long.MAX_VALUE;
                                this.R0 = sj4Var3;
                            }
                            sj4Var3.K = j6;
                            this.U0 = sj4Var3;
                        } else {
                            rj4Var.M = true;
                        }
                    } else {
                        rj4Var.M = true;
                        this.O0 = hl9.g(this.O0, xo1.H(oiaVar6, true));
                    }
                }
            }
            if (iiaVar == iiaVar4 && rj4Var.M) {
                if (!oiaVar6.c()) {
                    rj4Var.M = false;
                    return;
                }
                oia oiaVar10 = rj4Var.K;
                if (oiaVar10 == null) {
                    qc0.j("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = rj4Var.L;
                u0f u0fVar3 = this.W0;
                if (u0fVar3 != null) {
                    r1(oiaVar10, j7, u0fVar3);
                } else {
                    qc0.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    public final void E1() {
        this.L0 = true;
        if (this.J0 == null) {
            this.J0 = urg.a(Integer.MAX_VALUE, null, null, 6);
        }
        ynb.V(Z0(), null, null, new xk4(this, null), 3);
    }

    public final void F1(a26 a26Var, boolean z, t69 t69Var, ks9 ks9Var, boolean z2) {
        this.G0 = a26Var;
        boolean z3 = true;
        if (this.H0 != z) {
            this.H0 = z;
            if (!z) {
                u66 u66Var = this.Q0;
                if (u66Var != null) {
                    m1(u66Var);
                }
                u66 u66Var2 = this.P0;
                if (u66Var2 != null) {
                    m1(u66Var2);
                }
                this.Q0 = null;
                this.P0 = null;
                o1();
                this.X0 = null;
            }
            z2 = true;
        }
        if (!pa7.t(this.I0, t69Var)) {
            o1();
            this.I0 = t69Var;
        }
        if (this.F0 != ks9Var) {
            this.F0 = ks9Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.M0;
            tj4 tj4Var = tj4.a;
            if (z4) {
                q1();
                if (this.L0) {
                    z1().d(tj4Var);
                }
                this.V0 = null;
            }
            g27 g27Var = this.X0;
            if (g27Var != null) {
                g27Var.a();
                yk4 yk4Var = g27Var.a;
                if (yk4Var.L0) {
                    yk4Var.t1(tj4Var);
                }
                g27Var.g = null;
                sug sugVar = g27Var.x;
                sugVar.b = 0;
                ((x69) sugVar.c).b = 0;
            }
        }
    }

    @Override // defpackage.ria
    public final void N() {
        if (this.M0) {
            q1();
            if (this.L0) {
                z1().d(tj4.a);
            }
            this.V0 = null;
        }
        this.M0 = false;
    }

    @Override // defpackage.t66
    public final String Y() {
        if (!this.H0) {
            return "idle";
        }
        i7h i7hVar = this.U0;
        if (i7hVar instanceof pj4) {
            return ((pj4) i7hVar).M ? "waiting" : "idle";
        }
        if ((i7hVar instanceof rj4) || (i7hVar instanceof qj4)) {
            return "waiting";
        }
        return i7hVar instanceof sj4 ? "recognized" : "idle";
    }

    @Override // defpackage.i09
    public final void e1() {
        this.L0 = false;
        o1();
        u66 u66Var = this.Q0;
        if (u66Var != null) {
            m1(u66Var);
        }
        u66 u66Var2 = this.P0;
        if (u66Var2 != null) {
            m1(u66Var2);
        }
        this.Q0 = null;
        this.P0 = null;
    }

    @Override // defpackage.rl4
    public final ks9 f0() {
        return this.F0;
    }

    public final void o1() {
        al4 al4Var = this.K0;
        if (al4Var != null) {
            t69 t69Var = this.I0;
            if (t69Var != null) {
                ((u69) t69Var).b(new zk4(al4Var));
            }
            this.K0 = null;
        }
    }

    public abstract Object p1(wk4 wk4Var, xk4 xk4Var);

    public final void q1() {
        this.O0 = 0L;
        pj4 pj4Var = this.N0;
        oj4 oj4Var = oj4.c;
        if (pj4Var == null) {
            pj4Var = new pj4();
            pj4Var.K = oj4Var;
            pj4Var.L = false;
            pj4Var.M = false;
            this.N0 = pj4Var;
        }
        pj4Var.K = oj4Var;
        pj4Var.L = false;
        pj4Var.M = false;
        this.U0 = pj4Var;
    }

    public final void r1(oia oiaVar, long j, u0f u0fVar) {
        qj4 qj4Var = this.T0;
        if (qj4Var == null) {
            qj4Var = new qj4();
            qj4Var.K = null;
            qj4Var.L = Long.MAX_VALUE;
            this.T0 = qj4Var;
        }
        qj4Var.K = oiaVar;
        qj4Var.L = j;
        u0fVar.b = 0L;
        this.U0 = qj4Var;
    }

    @Override // defpackage.h27
    public final void t0() {
        g27 g27Var = this.X0;
        if (g27Var != null) {
            g27Var.a();
            yk4 yk4Var = g27Var.a;
            if (yk4Var.L0) {
                yk4Var.t1(tj4.a);
            }
            g27Var.g = null;
            sug sugVar = g27Var.x;
            sugVar.b = 0;
            ((x69) sugVar.c).b = 0;
        }
    }

    public final void t1(xj4 xj4Var) {
        if ((xj4Var instanceof vj4) && !this.L0) {
            this.L0 = true;
            E1();
        }
        z1().d(xj4Var);
    }

    public abstract void u1(long j);

    public abstract void v1(wj4 wj4Var);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w1(zn2 zn2Var) throws Throwable {
        tk4 tk4Var;
        if (zn2Var instanceof tk4) {
            tk4Var = (tk4) zn2Var;
            int i = tk4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tk4Var.label = i - Integer.MIN_VALUE;
            } else {
                tk4Var = new tk4(this, zn2Var);
            }
        } else {
            tk4Var = new tk4(this, zn2Var);
        }
        Object obj = tk4Var.result;
        int i2 = tk4Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            al4 al4Var = this.K0;
            if (al4Var != null) {
                t69 t69Var = this.I0;
                if (t69Var != null) {
                    zk4 zk4Var = new zk4(al4Var);
                    tk4Var.label = 1;
                    Object objA = ((u69) t69Var).a(zk4Var, tk4Var);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                }
            }
            v1(new wj4(0L, false));
            return wef.a;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.K0 = null;
        v1(new wj4(0L, false));
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(vj4 vj4Var, zn2 zn2Var) {
        uk4 uk4Var;
        t69 t69Var;
        al4 al4Var;
        vj4 vj4Var2;
        al4 al4Var2;
        if (zn2Var instanceof uk4) {
            uk4Var = (uk4) zn2Var;
            int i = uk4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk4Var.label = i - Integer.MIN_VALUE;
            } else {
                uk4Var = new uk4(this, zn2Var);
            }
        } else {
            uk4Var = new uk4(this, zn2Var);
        }
        Object obj = uk4Var.result;
        int i2 = uk4Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            al4 al4Var3 = this.K0;
            if (al4Var3 != null && (t69Var = this.I0) != null) {
                zk4 zk4Var = new zk4(al4Var3);
                uk4Var.L$0 = vj4Var;
                uk4Var.label = 1;
                if (((u69) t69Var).a(zk4Var, uk4Var) != bw2Var) {
                }
                return bw2Var;
            }
            this.K0 = al4Var;
            u1(vj4Var.a);
            return wef.a;
        }
        if (i2 == 1) {
            vj4Var = (vj4) uk4Var.L$0;
            jzb.q(obj);
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            al4Var2 = (al4) uk4Var.L$1;
            vj4Var2 = (vj4) uk4Var.L$0;
            jzb.q(obj);
        }
        al4Var = al4Var2;
        vj4Var = vj4Var2;
        this.K0 = al4Var;
        u1(vj4Var.a);
        return wef.a;
        al4Var = new al4();
        t69 t69Var2 = this.I0;
        if (t69Var2 != null) {
            uk4Var.L$0 = vj4Var;
            uk4Var.L$1 = al4Var;
            uk4Var.label = 2;
            if (((u69) t69Var2).a(al4Var, uk4Var) != bw2Var) {
                vj4Var2 = vj4Var;
                al4Var2 = al4Var;
                al4Var = al4Var2;
                vj4Var = vj4Var2;
            }
            return bw2Var;
        }
        this.K0 = al4Var;
        u1(vj4Var.a);
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(wj4 wj4Var, zn2 zn2Var) throws Throwable {
        vk4 vk4Var;
        if (zn2Var instanceof vk4) {
            vk4Var = (vk4) zn2Var;
            int i = vk4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk4Var.label = i - Integer.MIN_VALUE;
            } else {
                vk4Var = new vk4(this, zn2Var);
            }
        } else {
            vk4Var = new vk4(this, zn2Var);
        }
        Object obj = vk4Var.result;
        int i2 = vk4Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            al4 al4Var = this.K0;
            if (al4Var != null) {
                t69 t69Var = this.I0;
                if (t69Var != null) {
                    bl4 bl4Var = new bl4(al4Var);
                    vk4Var.L$0 = wj4Var;
                    vk4Var.label = 1;
                    Object objA = ((u69) t69Var).a(bl4Var, vk4Var);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                }
            }
            v1(wj4Var);
            return wef.a;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wj4Var = (wj4) vk4Var.L$0;
        jzb.q(obj);
        this.K0 = null;
        v1(wj4Var);
        return wef.a;
    }

    public final yv1 z1() {
        r41 r41Var = this.J0;
        if (r41Var != null) {
            return r41Var;
        }
        qc0.j("Events channel not initialized.");
        return null;
    }
}
