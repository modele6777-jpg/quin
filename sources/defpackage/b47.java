package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b47 extends ng8 {
    @Override // defpackage.ng8
    public final void U0() {
        rg8 rg8VarY = this.J0.J0.y();
        rg8VarY.getClass();
        rg8VarY.t0();
    }

    @Override // defpackage.tn8
    public final int V(int i) {
        fz3 fz3VarE = this.J0.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.e(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // defpackage.tn8
    public final int b(int i) {
        fz3 fz3VarE = this.J0.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.d(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // defpackage.tn8
    public final int n(int i) {
        fz3 fz3VarE = this.J0.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.c(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // defpackage.lg8
    public final int o0(zi ziVar) {
        rg8 rg8Var = this.J0.J0.getLayoutDelegate().q;
        rg8Var.getClass();
        uv7 uv7Var = rg8Var.H0;
        if (!rg8Var.y) {
            xv7 xv7Var = rg8Var.f;
            if (xv7Var.d == qv7.b) {
                uv7Var.f = true;
                if (uv7Var.b) {
                    xv7Var.f = true;
                    xv7Var.g = true;
                }
            } else {
                uv7Var.g = true;
            }
        }
        b47 b47Var = rg8Var.d().u1;
        Boolean boolValueOf = b47Var != null ? Boolean.valueOf(b47Var.Z) : null;
        b47 b47Var2 = rg8Var.d().u1;
        if (b47Var2 != null) {
            b47Var2.Z = true;
        }
        rg8Var.J();
        b47 b47Var3 = rg8Var.d().u1;
        if (b47Var3 != null) {
            b47Var3.Z = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) uv7Var.i.get(ziVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.O0.g(iIntValue, ziVar);
        return iIntValue;
    }

    @Override // defpackage.tn8
    public final int q(int i) {
        fz3 fz3VarE = this.J0.J0.E();
        xn8 xn8VarS = fz3VarE.s();
        LayoutNode layoutNode = (LayoutNode) fz3VarE.b;
        return xn8VarS.a(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // defpackage.tn8
    public final cea v(long j) {
        i0(j);
        yf9 yf9Var = this.J0;
        p89 p89VarL = yf9Var.J0.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            rg8 rg8VarY = ((LayoutNode) objArr[i2]).y();
            rg8VarY.getClass();
            rg8VarY.x = sv7.c;
        }
        LayoutNode layoutNode = yf9Var.J0;
        a1(layoutNode.M0.b(this, layoutNode.o(), j));
        return this;
    }
}
