package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xv7 {
    public final LayoutNode a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public rg8 q;
    public qv7 d = qv7.e;
    public final wn8 p = new wn8(this);

    public xv7(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    public final yf9 a() {
        return (yf9) this.a.V0.e;
    }

    public final void b() {
        qv7 qv7VarU = this.a.u();
        qv7 qv7Var = qv7.c;
        qv7 qv7Var2 = qv7.d;
        if (qv7VarU == qv7Var || qv7VarU == qv7Var2) {
            if (this.p.Q0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (qv7VarU == qv7Var2) {
            rg8 rg8Var = this.q;
            if (rg8Var == null || !rg8Var.K0) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        rg8 rg8Var = this.q;
        if (rg8Var != null) {
            xv7 xv7Var = rg8Var.f;
            xv7Var.d = qv7.b;
            LayoutNode layoutNode = xv7Var.a;
            xv7Var.e = false;
            rg8Var.O0 = j;
            gw9 snapshotObserver = wv7.a(layoutNode).getSnapshotObserver();
            pg8 pg8Var = rg8Var.P0;
            snapshotObserver.a.d(layoutNode, snapshotObserver.b, pg8Var);
            xv7Var.f = true;
            xv7Var.g = true;
            boolean zG = b21.G(layoutNode);
            wn8 wn8Var = xv7Var.p;
            if (zG) {
                wn8Var.L0 = true;
                wn8Var.M0 = true;
            } else {
                wn8Var.K0 = true;
            }
            xv7Var.d = qv7.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeF = this.a.F();
            xv7 layoutDelegate = layoutNodeF != null ? layoutNodeF.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                int i3 = layoutDelegate.l;
                if (i == 0) {
                    layoutDelegate.d(i3 - 1);
                } else {
                    layoutDelegate.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeF = this.a.F();
            xv7 layoutDelegate = layoutNodeF != null ? layoutNodeF.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                int i3 = layoutDelegate.o;
                if (i == 0) {
                    layoutDelegate.e(i3 - 1);
                } else {
                    layoutDelegate.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        wn8 wn8Var = this.p;
        xv7 xv7Var = wn8Var.f;
        Object obj = wn8Var.H0;
        LayoutNode layoutNode = this.a;
        if ((obj != null || xv7Var.a().E() != null) && wn8Var.G0) {
            wn8Var.G0 = false;
            wn8Var.H0 = xv7Var.a().E();
            LayoutNode layoutNodeF = layoutNode.F();
            if (layoutNodeF != null) {
                LayoutNode.u0(layoutNodeF, false, 7);
            }
        }
        rg8 rg8Var = this.q;
        if (rg8Var != null) {
            xv7 xv7Var2 = rg8Var.f;
            if (rg8Var.N0 == null) {
                ng8 ng8VarF1 = xv7Var2.a().f1();
                ng8VarF1.getClass();
                if (ng8VarF1.J0.E() == null) {
                    return;
                }
            }
            if (rg8Var.M0) {
                rg8Var.M0 = false;
                ng8 ng8VarF2 = xv7Var2.a().f1();
                ng8VarF2.getClass();
                rg8Var.N0 = ng8VarF2.J0.E();
                if (b21.G(layoutNode)) {
                    LayoutNode layoutNodeF2 = layoutNode.F();
                    if (layoutNodeF2 != null) {
                        LayoutNode.u0(layoutNodeF2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode layoutNodeF3 = layoutNode.F();
                if (layoutNodeF3 != null) {
                    LayoutNode.s0(layoutNodeF3, false, 7);
                }
            }
        }
    }
}
