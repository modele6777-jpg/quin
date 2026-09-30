package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c47 extends yf9 {
    public static final rt v1;
    public final zde t1;
    public b47 u1;

    static {
        rt rtVarH = urg.h();
        rtVarH.f(y72.f);
        rtVarH.m(1.0f);
        rtVarH.n(1);
        v1 = rtVarH;
    }

    public c47(LayoutNode layoutNode) {
        super(layoutNode);
        zde zdeVar = new zde();
        zdeVar.d = 0;
        this.t1 = zdeVar;
        zdeVar.v = this;
        this.u1 = layoutNode.w != null ? new b47(this) : null;
    }

    @Override // defpackage.tn8
    public final int V(int i) {
        fz3 fz3VarE = this.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.e(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // defpackage.tn8
    public final int b(int i) {
        fz3 fz3VarE = this.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.d(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // defpackage.cea
    public final void b0(long j, float f, a26 a26Var) {
        if (this.K0) {
            ng8 ng8VarF1 = f1();
            ng8VarF1.getClass();
            y1(ng8VarF1.K0, f, a26Var, null);
        } else {
            y1(j, f, a26Var, null);
        }
        if (this.Y) {
            return;
        }
        this.J0.z().s0();
    }

    @Override // defpackage.yf9
    public final void c1() {
        if (this.u1 == null) {
            this.u1 = new b47(this);
        }
    }

    @Override // defpackage.yf9, defpackage.cea
    public final void e0(long j, float f, ke6 ke6Var) {
        c47 c47Var;
        if (this.K0) {
            ng8 ng8VarF1 = f1();
            ng8VarF1.getClass();
            c47Var = this;
            c47Var.y1(ng8VarF1.K0, f, null, ke6Var);
        } else {
            c47Var = this;
            c47Var.y1(j, f, null, ke6Var);
        }
        if (c47Var.Y) {
            return;
        }
        c47Var.J0.z().s0();
    }

    @Override // defpackage.yf9
    public final ng8 f1() {
        return this.u1;
    }

    @Override // defpackage.yf9
    public final i09 h1() {
        return this.t1;
    }

    @Override // defpackage.tn8
    public final int n(int i) {
        fz3 fz3VarE = this.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.c(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // defpackage.lg8
    public final int o0(zi ziVar) {
        b47 b47Var = this.u1;
        if (b47Var != null) {
            return b47Var.o0(ziVar);
        }
        wn8 wn8Var = this.J0.getLayoutDelegate().p;
        uv7 uv7Var = wn8Var.N0;
        if (!wn8Var.X) {
            if (wn8Var.f.d == qv7.a) {
                uv7Var.f = true;
                if (uv7Var.b) {
                    wn8Var.L0 = true;
                    wn8Var.M0 = true;
                }
            } else {
                uv7Var.g = true;
            }
        }
        c47 c47VarD = wn8Var.d();
        boolean z = c47VarD.Z;
        c47VarD.Z = true;
        wn8Var.J();
        c47VarD.Z = z;
        Integer num = (Integer) uv7Var.i.get(ziVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yf9
    public final void o1(xf9 xf9Var, long j, sl6 sl6Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        LayoutNode layoutNode;
        long jC;
        LayoutNode layoutNode2 = this.J0;
        boolean z3 = false;
        if (xf9Var.k(layoutNode2)) {
            if (!J1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(Z0(j, g1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = sl6Var.c;
                    p89 p89VarK = layoutNode2.K();
                    objArr = p89VarK.a;
                    i3 = p89VarK.c - 1;
                    while (i3 >= 0) {
                        layoutNode = (LayoutNode) objArr[i3];
                        if (layoutNode.X()) {
                            xf9Var.f(layoutNode, j, sl6Var, i2, z2);
                            jC = sl6Var.c();
                            if (dj6.K(jC) >= 0.0f && dj6.O(jC) && !dj6.N(jC) && !xf9Var.j(sl6Var, layoutNode)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    sl6Var.c = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = sl6Var.c;
                p89 p89VarK2 = layoutNode2.K();
                objArr = p89VarK2.a;
                i3 = p89VarK2.c - 1;
                while (i3 >= 0) {
                    layoutNode = (LayoutNode) objArr[i3];
                    if (layoutNode.X()) {
                        xf9Var.f(layoutNode, j, sl6Var, i2, z2);
                        jC = sl6Var.c();
                        if (dj6.K(jC) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                sl6Var.c = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = sl6Var.c;
            p89 p89VarK3 = layoutNode2.K();
            objArr = p89VarK3.a;
            i3 = p89VarK3.c - 1;
            while (i3 >= 0) {
                layoutNode = (LayoutNode) objArr[i3];
                if (layoutNode.X()) {
                    xf9Var.f(layoutNode, j, sl6Var, i2, z2);
                    jC = sl6Var.c();
                    if (dj6.K(jC) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            sl6Var.c = i6;
        }
    }

    @Override // defpackage.tn8
    public final int q(int i) {
        fz3 fz3VarE = this.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.a(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // defpackage.tn8
    public final cea v(long j) {
        if (this.L0) {
            b47 b47Var = this.u1;
            b47Var.getClass();
            j = b47Var.d;
        }
        i0(j);
        LayoutNode layoutNode = this.J0;
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).z().z = sv7.c;
        }
        B1(layoutNode.M0.b(this, layoutNode.p(), j));
        s1();
        return this;
    }

    @Override // defpackage.yf9
    public final void x1(vl1 vl1Var, ke6 ke6Var) throws Throwable {
        LayoutNode layoutNode = this.J0;
        Owner ownerA = wv7.a(layoutNode);
        p89 p89VarK = layoutNode.K();
        Object[] objArr = p89VarK.a;
        int i = p89VarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.X()) {
                layoutNode2.k(vl1Var, ke6Var);
            }
        }
        if (ownerA.getShowLayoutBounds()) {
            long j = this.c;
            vl1Var.s(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, v1);
        }
    }
}
