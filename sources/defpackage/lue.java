package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lue extends i09 implements kv7, pn4, wwc {
    public mue E0;
    public xp5 F0;
    public int G0;
    public boolean H0;
    public int I0;
    public int J0;
    public k82 K0;
    public HashMap L0;
    public ry9 M0;
    public jue N0;
    public kue O0;
    public String Z;

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        ry9 ry9VarL1;
        kue kueVar = this.O0;
        if (kueVar == null) {
            ry9VarL1 = l1();
        } else {
            if (!kueVar.c) {
                kueVar = null;
            }
            if (kueVar == null || (ry9VarL1 = kueVar.d) == null) {
                ry9VarL1 = l1();
            }
        }
        ry9VarL1.d(lg8Var);
        return gdc.c(ry9VarL1.e(lg8Var.getLayoutDirection()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a26] */
    /* JADX WARN: Type inference failed for: r0v2, types: [jue] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        jue jueVar = this.N0;
        ?? r0 = jueVar;
        if (jueVar == null) {
            final int i = 0;
            ?? r1 = new a26(this) { // from class: jue
                public final /* synthetic */ lue b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
                @Override // defpackage.a26
                public final Object d(Object obj) {
                    sw3 sw3Var;
                    ste steVar;
                    int i2 = i;
                    boolean z = true;
                    lue lueVar = this.b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            ry9 ry9VarL1 = lueVar.l1();
                            mue mueVar = lueVar.E0;
                            k82 k82Var = lueVar.K0;
                            mue mueVarF = mue.f(mueVar, k82Var != null ? k82Var.a() : y72.k, 0L, null, null, 0L, null, 0, 0L, 16777214);
                            cv7 cv7Var = ry9VarL1.o;
                            ste steVar2 = null;
                            if (cv7Var == null || (sw3Var = ry9VarL1.i) == null) {
                                steVar = null;
                            } else {
                                k00 k00Var = new k00(ry9VarL1.a);
                                if (ry9VarL1.j == null || ry9VarL1.n == null) {
                                    steVar = null;
                                } else {
                                    long j = ry9VarL1.p & (-8589934589L);
                                    int i3 = ry9VarL1.f;
                                    boolean z2 = ry9VarL1.e;
                                    int i4 = ry9VarL1.d;
                                    xp5 xp5Var = ry9VarL1.c;
                                    pu4 pu4Var = pu4.a;
                                    steVar = new ste(new rte(k00Var, mueVarF, pu4Var, i3, z2, i4, sw3Var, cv7Var, xp5Var, j), new b59(new a82(k00Var, sw3Var, xp5Var, mueVarF, pu4Var, z2), j, ry9VarL1.f, ry9VarL1.d), ry9VarL1.l);
                                }
                            }
                            if (steVar != null) {
                                list.add(steVar);
                                steVar2 = steVar;
                            }
                            return Boolean.valueOf(steVar2 != null);
                        case 1:
                            String str = ((k00) obj).b;
                            kue kueVar = lueVar.O0;
                            if (kueVar == null) {
                                kue kueVar2 = new kue(lueVar.Z, str);
                                ry9 ry9Var = new ry9(str, lueVar.E0, lueVar.F0, lueVar.G0, lueVar.H0, lueVar.I0, lueVar.J0);
                                ry9Var.d(lueVar.l1().i);
                                kueVar2.d = ry9Var;
                                lueVar.O0 = kueVar2;
                            } else if (!pa7.t(str, kueVar.b)) {
                                kueVar.b = str;
                                ry9 ry9Var2 = kueVar.d;
                                if (ry9Var2 != null) {
                                    mue mueVar2 = lueVar.E0;
                                    xp5 xp5Var2 = lueVar.F0;
                                    int i5 = lueVar.G0;
                                    boolean z3 = lueVar.H0;
                                    int i6 = lueVar.I0;
                                    int i7 = lueVar.J0;
                                    ry9Var2.a = str;
                                    ry9Var2.b = mueVar2;
                                    ry9Var2.c = xp5Var2;
                                    ry9Var2.d = i5;
                                    ry9Var2.e = z3;
                                    ry9Var2.f = i6;
                                    ry9Var2.g = i7;
                                    ry9Var2.s = (ry9Var2.s << 2) | 2;
                                    ry9Var2.c();
                                }
                            }
                            scc.k(lueVar);
                            rs0.F(lueVar);
                            qn4.G(lueVar);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            kue kueVar3 = lueVar.O0;
                            if (kueVar3 == null) {
                                z = false;
                            } else {
                                kueVar3.c = zBooleanValue;
                                scc.k(lueVar);
                                rs0.F(lueVar);
                                qn4.G(lueVar);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.N0 = r1;
            r0 = r1;
        }
        k00 k00Var = new k00(this.Z);
        wn7[] wn7VarArr = exc.a;
        hxcVar.c(cxc.C, t72.H(k00Var));
        kue kueVar = this.O0;
        if (kueVar != null) {
            boolean z = kueVar.c;
            gxc gxcVar = cxc.E;
            wn7[] wn7VarArr2 = exc.a;
            wn7 wn7Var = wn7VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            gxcVar.getClass();
            hxcVar.c(gxcVar, boolValueOf);
            k00 k00Var2 = new k00(kueVar.b);
            gxc gxcVar2 = cxc.D;
            wn7 wn7Var2 = wn7VarArr2[16];
            gxcVar2.getClass();
            hxcVar.c(gxcVar2, k00Var2);
        }
        final int i2 = 1;
        hxcVar.c(swc.l, new f6(null, new a26(this) { // from class: jue
            public final /* synthetic */ lue b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
            @Override // defpackage.a26
            public final Object d(Object obj) {
                sw3 sw3Var;
                ste steVar;
                int i3 = i2;
                boolean z2 = true;
                lue lueVar = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        ry9 ry9VarL1 = lueVar.l1();
                        mue mueVar = lueVar.E0;
                        k82 k82Var = lueVar.K0;
                        mue mueVarF = mue.f(mueVar, k82Var != null ? k82Var.a() : y72.k, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        cv7 cv7Var = ry9VarL1.o;
                        ste steVar2 = null;
                        if (cv7Var == null || (sw3Var = ry9VarL1.i) == null) {
                            steVar = null;
                        } else {
                            k00 k00Var3 = new k00(ry9VarL1.a);
                            if (ry9VarL1.j == null || ry9VarL1.n == null) {
                                steVar = null;
                            } else {
                                long j = ry9VarL1.p & (-8589934589L);
                                int i4 = ry9VarL1.f;
                                boolean z3 = ry9VarL1.e;
                                int i5 = ry9VarL1.d;
                                xp5 xp5Var = ry9VarL1.c;
                                pu4 pu4Var = pu4.a;
                                steVar = new ste(new rte(k00Var3, mueVarF, pu4Var, i4, z3, i5, sw3Var, cv7Var, xp5Var, j), new b59(new a82(k00Var3, sw3Var, xp5Var, mueVarF, pu4Var, z3), j, ry9VarL1.f, ry9VarL1.d), ry9VarL1.l);
                            }
                        }
                        if (steVar != null) {
                            list.add(steVar);
                            steVar2 = steVar;
                        }
                        return Boolean.valueOf(steVar2 != null);
                    case 1:
                        String str = ((k00) obj).b;
                        kue kueVar2 = lueVar.O0;
                        if (kueVar2 == null) {
                            kue kueVar3 = new kue(lueVar.Z, str);
                            ry9 ry9Var = new ry9(str, lueVar.E0, lueVar.F0, lueVar.G0, lueVar.H0, lueVar.I0, lueVar.J0);
                            ry9Var.d(lueVar.l1().i);
                            kueVar3.d = ry9Var;
                            lueVar.O0 = kueVar3;
                        } else if (!pa7.t(str, kueVar2.b)) {
                            kueVar2.b = str;
                            ry9 ry9Var2 = kueVar2.d;
                            if (ry9Var2 != null) {
                                mue mueVar2 = lueVar.E0;
                                xp5 xp5Var2 = lueVar.F0;
                                int i6 = lueVar.G0;
                                boolean z4 = lueVar.H0;
                                int i7 = lueVar.I0;
                                int i8 = lueVar.J0;
                                ry9Var2.a = str;
                                ry9Var2.b = mueVar2;
                                ry9Var2.c = xp5Var2;
                                ry9Var2.d = i6;
                                ry9Var2.e = z4;
                                ry9Var2.f = i7;
                                ry9Var2.g = i8;
                                ry9Var2.s = (ry9Var2.s << 2) | 2;
                                ry9Var2.c();
                            }
                        }
                        scc.k(lueVar);
                        rs0.F(lueVar);
                        qn4.G(lueVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        kue kueVar4 = lueVar.O0;
                        if (kueVar4 == null) {
                            z2 = false;
                        } else {
                            kueVar4.c = zBooleanValue;
                            scc.k(lueVar);
                            rs0.F(lueVar);
                            qn4.G(lueVar);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        hxcVar.c(swc.m, new f6(null, new a26(this) { // from class: jue
            public final /* synthetic */ lue b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
            @Override // defpackage.a26
            public final Object d(Object obj) {
                sw3 sw3Var;
                ste steVar;
                int i4 = i3;
                boolean z2 = true;
                lue lueVar = this.b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        ry9 ry9VarL1 = lueVar.l1();
                        mue mueVar = lueVar.E0;
                        k82 k82Var = lueVar.K0;
                        mue mueVarF = mue.f(mueVar, k82Var != null ? k82Var.a() : y72.k, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        cv7 cv7Var = ry9VarL1.o;
                        ste steVar2 = null;
                        if (cv7Var == null || (sw3Var = ry9VarL1.i) == null) {
                            steVar = null;
                        } else {
                            k00 k00Var3 = new k00(ry9VarL1.a);
                            if (ry9VarL1.j == null || ry9VarL1.n == null) {
                                steVar = null;
                            } else {
                                long j = ry9VarL1.p & (-8589934589L);
                                int i5 = ry9VarL1.f;
                                boolean z3 = ry9VarL1.e;
                                int i6 = ry9VarL1.d;
                                xp5 xp5Var = ry9VarL1.c;
                                pu4 pu4Var = pu4.a;
                                steVar = new ste(new rte(k00Var3, mueVarF, pu4Var, i5, z3, i6, sw3Var, cv7Var, xp5Var, j), new b59(new a82(k00Var3, sw3Var, xp5Var, mueVarF, pu4Var, z3), j, ry9VarL1.f, ry9VarL1.d), ry9VarL1.l);
                            }
                        }
                        if (steVar != null) {
                            list.add(steVar);
                            steVar2 = steVar;
                        }
                        return Boolean.valueOf(steVar2 != null);
                    case 1:
                        String str = ((k00) obj).b;
                        kue kueVar2 = lueVar.O0;
                        if (kueVar2 == null) {
                            kue kueVar3 = new kue(lueVar.Z, str);
                            ry9 ry9Var = new ry9(str, lueVar.E0, lueVar.F0, lueVar.G0, lueVar.H0, lueVar.I0, lueVar.J0);
                            ry9Var.d(lueVar.l1().i);
                            kueVar3.d = ry9Var;
                            lueVar.O0 = kueVar3;
                        } else if (!pa7.t(str, kueVar2.b)) {
                            kueVar2.b = str;
                            ry9 ry9Var2 = kueVar2.d;
                            if (ry9Var2 != null) {
                                mue mueVar2 = lueVar.E0;
                                xp5 xp5Var2 = lueVar.F0;
                                int i7 = lueVar.G0;
                                boolean z4 = lueVar.H0;
                                int i8 = lueVar.I0;
                                int i9 = lueVar.J0;
                                ry9Var2.a = str;
                                ry9Var2.b = mueVar2;
                                ry9Var2.c = xp5Var2;
                                ry9Var2.d = i7;
                                ry9Var2.e = z4;
                                ry9Var2.f = i8;
                                ry9Var2.g = i9;
                                ry9Var2.s = (ry9Var2.s << 2) | 2;
                                ry9Var2.c();
                            }
                        }
                        scc.k(lueVar);
                        rs0.F(lueVar);
                        qn4.G(lueVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        kue kueVar4 = lueVar.O0;
                        if (kueVar4 == null) {
                            z2 = false;
                        } else {
                            kueVar4.c = zBooleanValue;
                            scc.k(lueVar);
                            rs0.F(lueVar);
                            qn4.G(lueVar);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        hxcVar.c(swc.n, new f6(null, new h2e(11, this)));
        exc.a(hxcVar, r0);
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x003d, B:21:0x0045, B:22:0x006f, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        ry9 ry9VarL1;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            kue kueVar = this.O0;
            if (kueVar == null) {
                ry9VarL1 = l1();
            } else {
                if (!kueVar.c) {
                    kueVar = null;
                }
                if (kueVar == null || (ry9VarL1 = kueVar.d) == null) {
                    ry9VarL1 = l1();
                }
            }
            ry9VarL1.d(zn8Var);
            boolean zB = ry9VarL1.b(j, zn8Var.getLayoutDirection());
            qy9 qy9Var = ry9VarL1.n;
            if (qy9Var != null) {
                qy9Var.e();
            }
            tt ttVar = ry9VarL1.j;
            ttVar.getClass();
            qte qteVar = ttVar.d;
            long j2 = ry9VarL1.l;
            if (zB) {
                rs0.E(this);
                HashMap map = this.L0;
                if (map == null) {
                    map = new HashMap(2);
                    this.L0 = map;
                }
                map.put(cj.a, Integer.valueOf(Math.round(qteVar.d(0) + 0.0f)));
                map.put(cj.b, Integer.valueOf(Math.round(qteVar.d(qteVar.g - 1) + 0.0f)));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            cea ceaVarV = tn8Var.v(pa7.S(i, i, i2, i2));
            HashMap map2 = this.L0;
            map2.getClass();
            return zn8Var.n0(i, i2, map2, new l1(ceaVarV, 22));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        ry9 ry9VarL1;
        kue kueVar = this.O0;
        if (kueVar == null) {
            ry9VarL1 = l1();
        } else {
            if (!kueVar.c) {
                kueVar = null;
            }
            if (kueVar == null || (ry9VarL1 = kueVar.d) == null) {
                ry9VarL1 = l1();
            }
        }
        ry9VarL1.d(lg8Var);
        return gdc.c(ry9VarL1.e(lg8Var.getLayoutDirection()).i());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        ry9 ry9VarL1;
        kue kueVar = this.O0;
        if (kueVar == null) {
            ry9VarL1 = l1();
        } else {
            if (!kueVar.c) {
                kueVar = null;
            }
            if (kueVar == null || (ry9VarL1 = kueVar.d) == null) {
                ry9VarL1 = l1();
            }
        }
        ry9VarL1.d(lg8Var);
        return ry9VarL1.a(i, lg8Var.getLayoutDirection());
    }

    public final ry9 l1() {
        mue mueVar = this.E0;
        ry9 ry9Var = this.M0;
        if (ry9Var == null) {
            ry9Var = new ry9(this.Z, mueVar, this.F0, this.G0, this.H0, this.I0, this.J0);
            this.M0 = ry9Var;
        }
        ry9Var.getClass();
        return ry9Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        ry9 ry9VarL1;
        if (this.Y) {
            kue kueVar = this.O0;
            if (kueVar == null) {
                ry9VarL1 = l1();
            } else {
                if (!kueVar.c) {
                    kueVar = null;
                }
                if (kueVar == null || (ry9VarL1 = kueVar.d) == null) {
                    ry9VarL1 = l1();
                }
            }
            tt ttVar = ry9VarL1.j;
            if (ttVar == null) {
                l37.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.M0 + ", textSubstitution=" + this.O0 + ")");
                oo3.f();
                return;
            }
            vl1 vl1VarP = ((vv7) im2Var).a.b.p();
            boolean z = ry9VarL1.k;
            if (z) {
                long j = ry9VarL1.l;
                vl1VarP.g();
                vl1VarP.m(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                mue mueVar = this.E0;
                xtd xtdVar = mueVar.a;
                mne mneVar = xtdVar.m;
                if (mneVar == null) {
                    mneVar = mne.b;
                }
                mne mneVar2 = mneVar;
                o4d o4dVar = xtdVar.n;
                if (o4dVar == null) {
                    o4dVar = o4d.d;
                }
                o4d o4dVar2 = o4dVar;
                un4 un4Var = xtdVar.p;
                if (un4Var == null) {
                    un4Var = oe5.a;
                }
                un4 un4Var2 = un4Var;
                b41 b41VarB = mueVar.b();
                if (b41VarB != null) {
                    ttVar.f(vl1VarP, b41VarB, mueVar.a.a.a(), o4dVar2, mneVar2, un4Var2);
                } else {
                    k82 k82Var = this.K0;
                    long jA = k82Var != null ? k82Var.a() : y72.k;
                    if (jA == 16) {
                        jA = mueVar.c() != 16 ? mueVar.c() : y72.b;
                    }
                    ttVar.e(vl1VarP, jA, o4dVar2, mneVar2, un4Var2);
                }
            } finally {
                if (z) {
                    vl1VarP.o();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        ry9 ry9VarL1;
        kue kueVar = this.O0;
        if (kueVar == null) {
            ry9VarL1 = l1();
        } else {
            if (!kueVar.c) {
                kueVar = null;
            }
            if (kueVar == null || (ry9VarL1 = kueVar.d) == null) {
                ry9VarL1 = l1();
            }
        }
        ry9VarL1.d(lg8Var);
        return ry9VarL1.a(i, lg8Var.getLayoutDirection());
    }
}
