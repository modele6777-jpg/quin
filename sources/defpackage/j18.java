package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j18 implements zhc {
    public static final vea y = i7h.B(new sz5(24), new tb7(16));
    public final or3 a;
    public boolean b;
    public b18 c;
    public boolean d;
    public final cx7 e;
    public final vz9 f;
    public final u69 g;
    public float h;
    public boolean i;
    public final os3 j;
    public final boolean k;
    public LayoutNode l;
    public final gx7 m;
    public final rr0 n;
    public final oz7 o;
    public final ssg p;
    public final e08 q;
    public final m6c r;
    public final b08 s;
    public final e89 t;
    public final vz9 u;
    public final vz9 v;
    public final e89 w;
    public final h08 x;

    public j18(int i, int i2) {
        or3 or3Var = new or3();
        or3Var.a = -1;
        or3Var.c = -1;
        this.a = or3Var;
        this.e = new cx7(i, i2, 1);
        this.f = new vz9(k18.a, qk6.L0);
        this.g = new u69();
        this.j = new os3(new za6(19, this));
        this.k = true;
        this.m = new gx7(this, 1);
        this.n = new rr0();
        this.o = new oz7();
        this.p = new ssg(24);
        this.q = new e08(new xp(this, i));
        this.r = new m6c(21, this);
        this.s = new b08();
        this.t = k99.v();
        Boolean bool = Boolean.FALSE;
        this.u = q1c.f(bool);
        this.v = q1c.f(bool);
        this.w = k99.v();
        this.x = new h08();
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return this.j.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r6.j.b(r7, r8, r0) == r5) goto L23;
     */
    @Override // defpackage.zhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.s89 r7, defpackage.l26 r8, defpackage.zn2 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.h18
            if (r0 == 0) goto L13
            r0 = r9
            h18 r0 = (defpackage.h18) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            h18 r0 = new h18
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.jzb.q(r9)
            goto L69
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r2
        L31:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            l26 r8 = (defpackage.l26) r8
            java.lang.Object r7 = r0.L$0
            s89 r7 = (defpackage.s89) r7
            defpackage.jzb.q(r9)
            goto L5a
        L3e:
            defpackage.jzb.q(r9)
            vz9 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            b18 r1 = defpackage.k18.a
            if (r9 != r1) goto L5a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            rr0 r9 = r6.n
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r5) goto L5a
            goto L68
        L5a:
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            os3 r6 = r6.j
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r5) goto L69
        L68:
            return r5
        L69:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j18.b(s89, l26, zn2):java.lang.Object");
    }

    @Override // defpackage.zhc
    public final boolean c() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final boolean d() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, wef] */
    public final Object f(int i, zn2 zn2Var) {
        f18 f18Var;
        if (zn2Var instanceof f18) {
            f18Var = (f18) zn2Var;
            int i2 = f18Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f18Var.label = i2 - Integer.MIN_VALUE;
            } else {
                f18Var = new f18(this, zn2Var);
            }
        } else {
            f18Var = new f18(this, zn2Var);
        }
        Object obj = f18Var.result;
        int i3 = f18Var.label;
        try {
            if (i3 == 0) {
                jzb.q(obj);
                this.i = true;
                g18 g18Var = new g18(this, i, 0, null);
                f18Var.label = 1;
                Object objB = b(s89.a, g18Var, f18Var);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            this.i = false;
            this = wef.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    public final void g(b18 b18Var, boolean z, boolean z2) {
        List list = b18Var.l;
        int i = b18Var.o;
        int i2 = b18Var.b;
        c18 c18Var = b18Var.a;
        this.q.e = list.size();
        h08 h08Var = this.x;
        cx7 cx7Var = this.e;
        if (!z && this.b) {
            this.c = b18Var;
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                if (!(((Number) h08Var.b.b.getValue()).floatValue() == 0.0f) && c18Var != null && c18Var.a == cx7Var.b.j() && i2 == cx7Var.c.j()) {
                    h08Var.a();
                }
                return;
            } finally {
                iqf.p(irdVarJ, irdVarL, a26VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.v.setValue(Boolean.valueOf(((c18Var != null ? c18Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(b18Var.c));
        this.h -= b18Var.d;
        this.f.setValue(b18Var);
        if (z2) {
            cx7Var.getClass();
            if (i2 < 0.0f) {
                l37.c("scrollOffset should be non-negative");
            }
            cx7Var.c.k(i2);
        } else {
            c18 c18Var2 = (c18) s72.x0(list);
            c18 c18Var3 = (c18) s72.H0(list);
            bp.Y(c18Var2 != null ? c18Var2.a : -1L, "firstVisibleItem:index");
            bp.Y(c18Var3 != null ? c18Var3.a : -1L, "lastVisibleItem:index");
            cx7Var.getClass();
            cx7Var.e = c18Var != null ? c18Var.k : null;
            if (cx7Var.d || i > 0) {
                cx7Var.d = true;
                if (i2 < r6) {
                    l37.c("scrollOffset should be non-negative");
                }
                cx7Var.a(c18Var != null ? c18Var.a : 0, i2);
            }
            if (this.k) {
                or3 or3Var = this.a;
                int i3 = or3Var.a;
                boolean z3 = or3Var.b;
                if (i3 != -1 && !list.isEmpty() && i3 != or3.a(b18Var, z3)) {
                    or3Var.a = -1;
                    d08 d08Var = (d08) or3Var.e;
                    if (d08Var != null) {
                        d08Var.cancel();
                    }
                    or3Var.e = null;
                }
                int i4 = or3Var.c;
                if (i4 != -1 && or3Var.d != r6 && i4 != i && !list.isEmpty()) {
                    int iA = or3.a(b18Var, or3Var.d < 0);
                    if (iA >= 0 && iA < i) {
                        or3Var.a = iA;
                        or3Var.e = m6c.O(this.r, iA);
                    }
                }
                or3Var.c = i;
            }
        }
        if (z) {
            h08Var.b(b18Var.f, b18Var.i, b18Var.h);
        }
    }

    public final b18 h() {
        return (b18) this.f.getValue();
    }

    public final void i(float f, b18 b18Var) {
        d08 d08Var;
        d08 d08Var2;
        if (this.k) {
            boolean zIsEmpty = b18Var.l.isEmpty();
            or3 or3Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = or3.a(b18Var, z);
                if (iA >= 0 && iA < b18Var.o) {
                    if (iA != or3Var.a) {
                        if (or3Var.b != z) {
                            or3Var.a = -1;
                            d08 d08Var3 = (d08) or3Var.e;
                            if (d08Var3 != null) {
                                d08Var3.cancel();
                            }
                            or3Var.e = null;
                        }
                        or3Var.b = z;
                        or3Var.a = iA;
                        or3Var.e = m6c.O(this.r, iA);
                    }
                    List list = b18Var.l;
                    if (z) {
                        c18 c18Var = (c18) s72.F0(list);
                        if (((c18Var.o + c18Var.p) + b18Var.r) - b18Var.n < (-f) && (d08Var2 = (d08) or3Var.e) != null) {
                            d08Var2.a();
                        }
                    } else if (b18Var.m - ((c18) s72.v0(list)).o < f && (d08Var = (d08) or3Var.e) != null) {
                        d08Var.a();
                    }
                }
            }
            or3Var.d = f;
        }
    }

    public final Object j(int i, int i2, xn2 xn2Var) {
        Object objB = b(s89.a, new i18(this, i, i2, null), (zn2) xn2Var);
        return objB == bw2.a ? objB : wef.a;
    }

    public final void k(int i, int i2) {
        cx7 cx7Var = this.e;
        if (cx7Var.b.j() != i || cx7Var.c.j() != i2) {
            oz7 oz7Var = this.o;
            oz7Var.e();
            oz7Var.b = null;
            oz7Var.c = -1;
        }
        cx7Var.a(i, i2);
        cx7Var.e = null;
        LayoutNode layoutNode = this.l;
        if (layoutNode != null) {
            layoutNode.m();
        }
    }
}
