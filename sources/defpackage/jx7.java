package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jx7 implements zhc {
    public static final vea w = i7h.B(new sz5(23), new tb7(12));
    public final or3 a;
    public boolean b;
    public zw7 c;
    public final cx7 d;
    public final vz9 e;
    public final u69 f;
    public float g;
    public final os3 h;
    public final boolean i;
    public LayoutNode j;
    public final gx7 k;
    public final rr0 l;
    public final oz7 m;
    public final ssg n;
    public final e08 o;
    public final mjg p;
    public final b08 q;
    public final e89 r;
    public final e89 s;
    public final vz9 t;
    public final vz9 u;
    public final h08 v;

    public jx7(int i, int i2) {
        or3 or3Var = new or3();
        or3Var.a = -1;
        or3Var.e = new p89(0, new d08[16]);
        or3Var.c = -1;
        this.a = or3Var;
        this.d = new cx7(i, i2, 0);
        this.e = new vz9(lx7.a, qk6.L0);
        this.f = new u69();
        this.h = new os3(new za6(16, this));
        this.i = true;
        this.k = new gx7(this, 0);
        this.l = new rr0();
        this.m = new oz7();
        this.n = new ssg(24);
        this.o = new e08(new vj(this, i, 4));
        this.p = new mjg(this);
        this.q = new b08();
        this.r = k99.v();
        this.s = k99.v();
        Boolean bool = Boolean.FALSE;
        this.t = q1c.f(bool);
        this.u = q1c.f(bool);
        this.v = new h08();
    }

    public static Object i(jx7 jx7Var, int i, gbe gbeVar) {
        jx7Var.getClass();
        Object objB = jx7Var.b(s89.a, new ix7(jx7Var, i, 0, null), gbeVar);
        return objB == bw2.a ? objB : wef.a;
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return this.h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r6.h.b(r7, r8, r0) == r5) goto L23;
     */
    @Override // defpackage.zhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.s89 r7, defpackage.l26 r8, defpackage.zn2 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.hx7
            if (r0 == 0) goto L13
            r0 = r9
            hx7 r0 = (defpackage.hx7) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hx7 r0 = new hx7
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
            vz9 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            zw7 r1 = defpackage.lx7.a
            if (r9 != r1) goto L5a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            rr0 r9 = r6.l
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r5) goto L5a
            goto L68
        L5a:
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            os3 r6 = r6.h
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r5) goto L69
        L68:
            return r5
        L69:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx7.b(s89, l26, zn2):java.lang.Object");
    }

    @Override // defpackage.zhc
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(zw7 zw7Var, boolean z, boolean z2) {
        ax7 ax7Var;
        ax7 ax7Var2;
        ax7 ax7Var3;
        List list = zw7Var.n;
        int i = zw7Var.q;
        bx7 bx7Var = zw7Var.a;
        int i2 = zw7Var.b;
        this.o.e = list.size();
        Object obj = null;
        obj = null;
        cx7 cx7Var = this.d;
        h08 h08Var = this.v;
        if (!z && this.b) {
            this.c = zw7Var;
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                if (!(((Number) h08Var.b.b.getValue()).floatValue() == 0.0f) && i2 == cx7Var.c.j() && bx7Var != null && (ax7Var3 = (ax7) qd0.m0(bx7Var.b)) != null && ax7Var3.a == cx7Var.b.j()) {
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
        this.g -= zw7Var.d;
        this.e.setValue(zw7Var);
        this.u.setValue(Boolean.valueOf(((bx7Var != null ? bx7Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(zw7Var.c));
        if (z2) {
            cx7Var.getClass();
            if (i2 < 0.0f) {
                l37.c("scrollOffset should be non-negative");
            }
            cx7Var.c.k(i2);
        } else {
            cx7Var.getClass();
            if (bx7Var != null && (ax7Var2 = (ax7) qd0.m0(bx7Var.b)) != null) {
                obj = ax7Var2.b;
            }
            cx7Var.e = obj;
            if (cx7Var.d || i > 0) {
                cx7Var.d = true;
                if (i2 < 0.0f) {
                    l37.c("scrollOffset should be non-negative (" + i2 + ")");
                }
                cx7Var.a((bx7Var == null || (ax7Var = (ax7) qd0.m0(bx7Var.b)) == null) ? 0 : ax7Var.a, i2);
            }
            if (this.i) {
                or3 or3Var = this.a;
                p89 p89Var = (p89) or3Var.e;
                int i3 = or3Var.a;
                boolean z3 = or3Var.b;
                if (i3 != -1 && !list.isEmpty() && i3 != or3.b(zw7Var, z3)) {
                    or3Var.a = -1;
                    Object[] objArr = p89Var.a;
                    int i4 = p89Var.c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((d08) objArr[i5]).cancel();
                    }
                    p89Var.g();
                }
                int i6 = or3Var.c;
                if (i6 != -1 && or3Var.d != 0.0f && i6 != i && !list.isEmpty()) {
                    int iB = or3.b(zw7Var, or3Var.d < 0.0f);
                    int i7 = or3Var.d < 0.0f ? ((ax7) s72.F0(list)).a + 1 : ((ax7) s72.v0(list)).a - 1;
                    if (i7 >= 0 && i7 < i && iB != or3Var.a && iB >= 0) {
                        or3Var.a = iB;
                        p89Var.g();
                        p89Var.d(p89Var.c, this.p.L(iB));
                    }
                }
                or3Var.c = i;
            }
        }
        if (z) {
            h08Var.b(zw7Var.f, zw7Var.i, zw7Var.h);
        }
    }

    public final zw7 g() {
        return (zw7) this.e.getValue();
    }

    public final void h(float f, zw7 zw7Var) {
        if (this.i) {
            or3 or3Var = this.a;
            p89 p89Var = (p89) or3Var.e;
            List list = zw7Var.n;
            List list2 = zw7Var.n;
            ks9 ks9Var = zw7Var.r;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iB = or3.b(zw7Var, z);
                int i2 = z ? ((ax7) s72.F0(list2)).a + 1 : ((ax7) s72.v0(list2)).a - 1;
                if (i2 >= 0 && i2 < zw7Var.q) {
                    if (iB != or3Var.a && iB >= 0) {
                        if (or3Var.b != z) {
                            Object[] objArr = p89Var.a;
                            int i3 = p89Var.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((d08) objArr[i4]).cancel();
                            }
                        }
                        or3Var.b = z;
                        or3Var.a = iB;
                        p89Var.g();
                        p89Var.d(p89Var.c, this.p.L(iB));
                    }
                    if (z) {
                        ax7 ax7Var = (ax7) s72.F0(list2);
                        if (((xo1.G(ax7Var, ks9Var) + ((int) (ks9Var == ks9.a ? ax7Var.v & 4294967295L : ax7Var.v >> 32))) + zw7Var.t) - zw7Var.p < (-f)) {
                            Object[] objArr2 = p89Var.a;
                            int i5 = p89Var.c;
                            while (i < i5) {
                                ((d08) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (zw7Var.o - xo1.G((ax7) s72.v0(list2), ks9Var) < f) {
                        Object[] objArr3 = p89Var.a;
                        int i6 = p89Var.c;
                        while (i < i6) {
                            ((d08) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            or3Var.d = f;
        }
    }
}
