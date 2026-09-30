package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ome extends i09 implements kv7, pn4, wwc {
    public mue E0;
    public xp5 F0;
    public a26 G0;
    public int H0;
    public boolean I0;
    public int J0;
    public int K0;
    public List L0;
    public a26 M0;
    public hvc N0;
    public k82 O0;
    public co0 P0;
    public a26 Q0;
    public Map R0;
    public f59 S0;
    public mme T0;
    public nme U0;
    public k00 Z;

    public ome(k00 k00Var, mue mueVar, xp5 xp5Var, a26 a26Var, int i, boolean z, int i2, int i3, List list, a26 a26Var2, hvc hvcVar, k82 k82Var, co0 co0Var, a26 a26Var3) {
        this.Z = k00Var;
        this.E0 = mueVar;
        this.F0 = xp5Var;
        this.G0 = a26Var;
        this.H0 = i;
        this.I0 = z;
        this.J0 = i2;
        this.K0 = i3;
        this.L0 = list;
        this.M0 = a26Var2;
        this.N0 = hvcVar;
        this.O0 = k82Var;
        this.P0 = co0Var;
        this.Q0 = a26Var3;
    }

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        return gdc.c(n1(lg8Var).e(lg8Var.getLayoutDirection()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a26] */
    /* JADX WARN: Type inference failed for: r0v2, types: [mme] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        mme mmeVar = this.T0;
        ?? r0 = mmeVar;
        if (mmeVar == null) {
            final int i = 0;
            ?? r1 = new a26(this) { // from class: mme
                public final /* synthetic */ ome b;

                {
                    this.b = this;
                }

                @Override // defpackage.a26
                public final Object d(Object obj) {
                    boolean z;
                    int i2 = i;
                    ste steVar = null;
                    ome omeVar = this.b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            ste steVar2 = omeVar.m1().o;
                            if (steVar2 != null) {
                                rte rteVar = steVar2.a;
                                k00 k00Var = rteVar.a;
                                mue mueVar = omeVar.E0;
                                k82 k82Var = omeVar.O0;
                                ste steVar3 = new ste(new rte(k00Var, mue.f(mueVar, k82Var != null ? k82Var.a() : y72.k, 0L, null, null, 0L, null, 0, 0L, 16777214), rteVar.c, rteVar.d, rteVar.e, rteVar.f, rteVar.g, rteVar.h, rteVar.i, rteVar.j), steVar2.b, steVar2.c);
                                list.add(steVar3);
                                steVar = steVar3;
                            }
                            return Boolean.valueOf(steVar != null);
                        case 1:
                            k00 k00Var2 = (k00) obj;
                            nme nmeVar = omeVar.U0;
                            pu4 pu4Var = pu4.a;
                            if (nmeVar == null) {
                                nme nmeVar2 = new nme(omeVar.Z, k00Var2);
                                f59 f59Var = new f59(k00Var2, omeVar.E0, omeVar.F0, omeVar.H0, omeVar.I0, omeVar.J0, omeVar.K0, pu4Var, omeVar.P0);
                                f59Var.d(omeVar.m1().k);
                                nmeVar2.d = f59Var;
                                omeVar.U0 = nmeVar2;
                            } else if (!pa7.t(k00Var2, nmeVar.b)) {
                                nmeVar.b = k00Var2;
                                f59 f59Var2 = nmeVar.d;
                                if (f59Var2 != null) {
                                    mue mueVar2 = omeVar.E0;
                                    xp5 xp5Var = omeVar.F0;
                                    int i3 = omeVar.H0;
                                    boolean z2 = omeVar.I0;
                                    int i4 = omeVar.J0;
                                    int i5 = omeVar.K0;
                                    co0 co0Var = omeVar.P0;
                                    f59Var2.a = k00Var2;
                                    f59Var2.f(mueVar2);
                                    f59Var2.b = xp5Var;
                                    f59Var2.c = i3;
                                    f59Var2.d = z2;
                                    f59Var2.e = i4;
                                    f59Var2.f = i5;
                                    f59Var2.g = pu4Var;
                                    f59Var2.h = co0Var;
                                    f59Var2.s = (f59Var2.s << 2) | 2;
                                    f59Var2.m = null;
                                    f59Var2.o = null;
                                    f59Var2.q = -1;
                                    f59Var2.p = -1;
                                    f59Var2.r = null;
                                }
                            }
                            scc.k(omeVar);
                            rs0.F(omeVar);
                            qn4.G(omeVar);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            nme nmeVar3 = omeVar.U0;
                            if (nmeVar3 == null) {
                                z = false;
                            } else {
                                a26 a26Var = omeVar.Q0;
                                if (a26Var != null) {
                                    a26Var.d(nmeVar3);
                                }
                                nme nmeVar4 = omeVar.U0;
                                if (nmeVar4 != null) {
                                    nmeVar4.c = zBooleanValue;
                                }
                                scc.k(omeVar);
                                rs0.F(omeVar);
                                qn4.G(omeVar);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.T0 = r1;
            r0 = r1;
        }
        k00 k00Var = this.Z;
        wn7[] wn7VarArr = exc.a;
        hxcVar.c(cxc.C, t72.H(k00Var));
        nme nmeVar = this.U0;
        if (nmeVar != null) {
            k00 k00Var2 = nmeVar.b;
            gxc gxcVar = cxc.D;
            wn7[] wn7VarArr2 = exc.a;
            wn7 wn7Var = wn7VarArr2[16];
            gxcVar.getClass();
            hxcVar.c(gxcVar, k00Var2);
            boolean z = nmeVar.c;
            gxc gxcVar2 = cxc.E;
            wn7 wn7Var2 = wn7VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            gxcVar2.getClass();
            hxcVar.c(gxcVar2, boolValueOf);
        }
        final int i2 = 1;
        hxcVar.c(swc.l, new f6(null, new a26(this) { // from class: mme
            public final /* synthetic */ ome b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                boolean z2;
                int i3 = i2;
                ste steVar = null;
                ome omeVar = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        ste steVar2 = omeVar.m1().o;
                        if (steVar2 != null) {
                            rte rteVar = steVar2.a;
                            k00 k00Var3 = rteVar.a;
                            mue mueVar = omeVar.E0;
                            k82 k82Var = omeVar.O0;
                            ste steVar3 = new ste(new rte(k00Var3, mue.f(mueVar, k82Var != null ? k82Var.a() : y72.k, 0L, null, null, 0L, null, 0, 0L, 16777214), rteVar.c, rteVar.d, rteVar.e, rteVar.f, rteVar.g, rteVar.h, rteVar.i, rteVar.j), steVar2.b, steVar2.c);
                            list.add(steVar3);
                            steVar = steVar3;
                        }
                        return Boolean.valueOf(steVar != null);
                    case 1:
                        k00 k00Var4 = (k00) obj;
                        nme nmeVar2 = omeVar.U0;
                        pu4 pu4Var = pu4.a;
                        if (nmeVar2 == null) {
                            nme nmeVar3 = new nme(omeVar.Z, k00Var4);
                            f59 f59Var = new f59(k00Var4, omeVar.E0, omeVar.F0, omeVar.H0, omeVar.I0, omeVar.J0, omeVar.K0, pu4Var, omeVar.P0);
                            f59Var.d(omeVar.m1().k);
                            nmeVar3.d = f59Var;
                            omeVar.U0 = nmeVar3;
                        } else if (!pa7.t(k00Var4, nmeVar2.b)) {
                            nmeVar2.b = k00Var4;
                            f59 f59Var2 = nmeVar2.d;
                            if (f59Var2 != null) {
                                mue mueVar2 = omeVar.E0;
                                xp5 xp5Var = omeVar.F0;
                                int i4 = omeVar.H0;
                                boolean z3 = omeVar.I0;
                                int i5 = omeVar.J0;
                                int i6 = omeVar.K0;
                                co0 co0Var = omeVar.P0;
                                f59Var2.a = k00Var4;
                                f59Var2.f(mueVar2);
                                f59Var2.b = xp5Var;
                                f59Var2.c = i4;
                                f59Var2.d = z3;
                                f59Var2.e = i5;
                                f59Var2.f = i6;
                                f59Var2.g = pu4Var;
                                f59Var2.h = co0Var;
                                f59Var2.s = (f59Var2.s << 2) | 2;
                                f59Var2.m = null;
                                f59Var2.o = null;
                                f59Var2.q = -1;
                                f59Var2.p = -1;
                                f59Var2.r = null;
                            }
                        }
                        scc.k(omeVar);
                        rs0.F(omeVar);
                        qn4.G(omeVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        nme nmeVar4 = omeVar.U0;
                        if (nmeVar4 == null) {
                            z2 = false;
                        } else {
                            a26 a26Var = omeVar.Q0;
                            if (a26Var != null) {
                                a26Var.d(nmeVar4);
                            }
                            nme nmeVar5 = omeVar.U0;
                            if (nmeVar5 != null) {
                                nmeVar5.c = zBooleanValue;
                            }
                            scc.k(omeVar);
                            rs0.F(omeVar);
                            qn4.G(omeVar);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        hxcVar.c(swc.m, new f6(null, new a26(this) { // from class: mme
            public final /* synthetic */ ome b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                boolean z2;
                int i4 = i3;
                ste steVar = null;
                ome omeVar = this.b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        ste steVar2 = omeVar.m1().o;
                        if (steVar2 != null) {
                            rte rteVar = steVar2.a;
                            k00 k00Var3 = rteVar.a;
                            mue mueVar = omeVar.E0;
                            k82 k82Var = omeVar.O0;
                            ste steVar3 = new ste(new rte(k00Var3, mue.f(mueVar, k82Var != null ? k82Var.a() : y72.k, 0L, null, null, 0L, null, 0, 0L, 16777214), rteVar.c, rteVar.d, rteVar.e, rteVar.f, rteVar.g, rteVar.h, rteVar.i, rteVar.j), steVar2.b, steVar2.c);
                            list.add(steVar3);
                            steVar = steVar3;
                        }
                        return Boolean.valueOf(steVar != null);
                    case 1:
                        k00 k00Var4 = (k00) obj;
                        nme nmeVar2 = omeVar.U0;
                        pu4 pu4Var = pu4.a;
                        if (nmeVar2 == null) {
                            nme nmeVar3 = new nme(omeVar.Z, k00Var4);
                            f59 f59Var = new f59(k00Var4, omeVar.E0, omeVar.F0, omeVar.H0, omeVar.I0, omeVar.J0, omeVar.K0, pu4Var, omeVar.P0);
                            f59Var.d(omeVar.m1().k);
                            nmeVar3.d = f59Var;
                            omeVar.U0 = nmeVar3;
                        } else if (!pa7.t(k00Var4, nmeVar2.b)) {
                            nmeVar2.b = k00Var4;
                            f59 f59Var2 = nmeVar2.d;
                            if (f59Var2 != null) {
                                mue mueVar2 = omeVar.E0;
                                xp5 xp5Var = omeVar.F0;
                                int i5 = omeVar.H0;
                                boolean z3 = omeVar.I0;
                                int i6 = omeVar.J0;
                                int i7 = omeVar.K0;
                                co0 co0Var = omeVar.P0;
                                f59Var2.a = k00Var4;
                                f59Var2.f(mueVar2);
                                f59Var2.b = xp5Var;
                                f59Var2.c = i5;
                                f59Var2.d = z3;
                                f59Var2.e = i6;
                                f59Var2.f = i7;
                                f59Var2.g = pu4Var;
                                f59Var2.h = co0Var;
                                f59Var2.s = (f59Var2.s << 2) | 2;
                                f59Var2.m = null;
                                f59Var2.o = null;
                                f59Var2.q = -1;
                                f59Var2.p = -1;
                                f59Var2.r = null;
                            }
                        }
                        scc.k(omeVar);
                        rs0.F(omeVar);
                        qn4.G(omeVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        nme nmeVar4 = omeVar.U0;
                        if (nmeVar4 == null) {
                            z2 = false;
                        } else {
                            a26 a26Var = omeVar.Q0;
                            if (a26Var != null) {
                                a26Var.d(nmeVar4);
                            }
                            nme nmeVar5 = omeVar.U0;
                            if (nmeVar5 != null) {
                                nmeVar5.c = zBooleanValue;
                            }
                            scc.k(omeVar);
                            rs0.F(omeVar);
                            qn4.G(omeVar);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        hxcVar.c(swc.n, new f6(null, new h2e(4, this)));
        exc.a(hxcVar, r0);
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            f59 f59VarN1 = n1(zn8Var);
            boolean zC = f59VarN1.c(j, zn8Var.getLayoutDirection());
            ste steVar = f59VarN1.o;
            if (steVar == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + f59VarN1);
            }
            long j2 = steVar.c;
            steVar.b.a.e();
            if (zC) {
                rs0.E(this);
                a26 a26Var = this.G0;
                if (a26Var != null) {
                    a26Var.d(steVar);
                }
                hvc hvcVar = this.N0;
                if (hvcVar != null) {
                    hvcVar.c(steVar);
                }
                Map linkedHashMap = this.R0;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(cj.a, Integer.valueOf(Math.round(steVar.d)));
                linkedHashMap.put(cj.b, Integer.valueOf(Math.round(steVar.e)));
                this.R0 = linkedHashMap;
            }
            a26 a26Var2 = this.M0;
            if (a26Var2 != null) {
                a26Var2.d(steVar.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            cea ceaVarV = tn8Var.v(pa7.S(i, i, i2, i2));
            Map map = this.R0;
            map.getClass();
            yn8 yn8VarN0 = zn8Var.n0(i, i2, map, new l1(ceaVarV, 18));
            Trace.endSection();
            return yn8VarN0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        return gdc.c(n1(lg8Var).e(lg8Var.getLayoutDirection()).i());
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        return n1(lg8Var).a(i, lg8Var.getLayoutDirection());
    }

    public final void l1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            f59 f59VarM1 = m1();
            k00 k00Var = this.Z;
            mue mueVar = this.E0;
            xp5 xp5Var = this.F0;
            int i = this.H0;
            boolean z5 = this.I0;
            int i2 = this.J0;
            int i3 = this.K0;
            List list = this.L0;
            co0 co0Var = this.P0;
            f59VarM1.a = k00Var;
            f59VarM1.f(mueVar);
            f59VarM1.b = xp5Var;
            f59VarM1.c = i;
            f59VarM1.d = z5;
            f59VarM1.e = i2;
            f59VarM1.f = i3;
            f59VarM1.g = list;
            f59VarM1.h = co0Var;
            f59VarM1.s = (f59VarM1.s << 2) | 2;
            f59VarM1.m = null;
            f59VarM1.o = null;
            f59VarM1.q = -1;
            f59VarM1.p = -1;
            f59VarM1.r = null;
        }
        if (this.Y) {
            if (z2 || (z && this.T0 != null)) {
                scc.k(this);
            }
            if (z2 || z3 || z4) {
                rs0.F(this);
                qn4.G(this);
            }
            if (z) {
                qn4.G(this);
            }
        }
    }

    public final f59 m1() {
        f59 f59Var = this.S0;
        if (f59Var == null) {
            f59 f59Var2 = new f59(this.Z, this.E0, this.F0, this.H0, this.I0, this.J0, this.K0, this.L0, this.P0);
            this.S0 = f59Var2;
            f59Var = f59Var2;
        }
        f59Var.getClass();
        return f59Var;
    }

    public final f59 n1(sw3 sw3Var) {
        f59 f59Var;
        nme nmeVar = this.U0;
        if (nmeVar != null && nmeVar.c && (f59Var = nmeVar.d) != null) {
            f59Var.d(sw3Var);
            return f59Var;
        }
        f59 f59VarM1 = m1();
        f59VarM1.d(sw3Var);
        return f59VarM1;
    }

    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v21 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.pn4
    public final void o0(defpackage.im2 r21) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ome.o0(im2):void");
    }

    public final boolean o1(a26 a26Var, a26 a26Var2, hvc hvcVar, a26 a26Var3) {
        boolean z;
        if (this.G0 != a26Var) {
            this.G0 = a26Var;
            z = true;
        } else {
            z = false;
        }
        if (this.M0 != a26Var2) {
            this.M0 = a26Var2;
            z = true;
        }
        if (!pa7.t(this.N0, hvcVar)) {
            this.N0 = hvcVar;
            z = true;
        }
        if (this.Q0 == a26Var3) {
            return z;
        }
        this.Q0 = a26Var3;
        return true;
    }

    public final boolean p1(mue mueVar, List list, int i, int i2, boolean z, xp5 xp5Var, int i3, co0 co0Var) {
        boolean z2 = !this.E0.d(mueVar);
        this.E0 = mueVar;
        if (!pa7.t(this.L0, list)) {
            this.L0 = list;
            z2 = true;
        }
        if (this.K0 != i) {
            this.K0 = i;
            z2 = true;
        }
        if (this.J0 != i2) {
            this.J0 = i2;
            z2 = true;
        }
        if (this.I0 != z) {
            this.I0 = z;
            z2 = true;
        }
        if (!pa7.t(this.F0, xp5Var)) {
            this.F0 = xp5Var;
            z2 = true;
        }
        if (this.H0 != i3) {
            this.H0 = i3;
            z2 = true;
        }
        if (pa7.t(this.P0, co0Var)) {
            return z2;
        }
        this.P0 = co0Var;
        return true;
    }

    public final boolean q1(k00 k00Var) {
        boolean zT = pa7.t(this.Z.b, k00Var.b);
        boolean z = (zT && pa7.t(this.Z.a, k00Var.a)) ? false : true;
        if (z) {
            this.Z = k00Var;
        }
        if (!zT) {
            this.U0 = null;
        }
        return z;
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        return n1(lg8Var).a(i, lg8Var.getLayoutDirection());
    }
}
