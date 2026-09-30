package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.ad1;
import defpackage.c47;
import defpackage.cv7;
import defpackage.cxc;
import defpackage.d59;
import defpackage.ew9;
import defpackage.fw9;
import defpackage.fz3;
import defpackage.g09;
import defpackage.g79;
import defpackage.gw7;
import defpackage.gw9;
import defpackage.i09;
import defpackage.i37;
import defpackage.i79;
import defpackage.j09;
import defpackage.jf6;
import defpackage.jkb;
import defpackage.ke6;
import defpackage.kl2;
import defpackage.kv2;
import defpackage.kv7;
import defpackage.l6c;
import defpackage.ld5;
import defpackage.lf2;
import defpackage.mb6;
import defpackage.mmb;
import defpackage.n09;
import defpackage.ne6;
import defpackage.nv7;
import defpackage.od4;
import defpackage.og2;
import defpackage.oo3;
import defpackage.ov7;
import defpackage.p89;
import defpackage.pa7;
import defpackage.pr4;
import defpackage.pu4;
import defpackage.pv7;
import defpackage.qc0;
import defpackage.qg2;
import defpackage.qg8;
import defpackage.qu;
import defpackage.qv7;
import defpackage.rg8;
import defpackage.ria;
import defpackage.rvf;
import defpackage.s8f;
import defpackage.sl6;
import defpackage.ssg;
import defpackage.sv3;
import defpackage.sv7;
import defpackage.sw3;
import defpackage.ta0;
import defpackage.tv7;
import defpackage.tw;
import defpackage.twc;
import defpackage.u8a;
import defpackage.ue2;
import defpackage.uf9;
import defpackage.uv7;
import defpackage.uvf;
import defpackage.uw;
import defpackage.vd0;
import defpackage.vg2;
import defpackage.vl1;
import defpackage.vwc;
import defpackage.vz9;
import defpackage.wg2;
import defpackage.wn8;
import defpackage.wo0;
import defpackage.wv7;
import defpackage.xn8;
import defpackage.xo1;
import defpackage.xv7;
import defpackage.y41;
import defpackage.yf9;
import defpackage.z7c;
import defpackage.zde;
import defpackage.zo;
import defpackage.zv6;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0003:\u0003\u0018\u0019\u001aJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lue2;", "Lfw9;", "", "Llf2;", "instance", "", "l", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "Lxv7;", "layoutDelegate", "Lxv7;", "s", "()Lxv7;", "", "getChildren$ui", "()Ljava/util/List;", "children", "Lyf9;", "getOuterCoordinator$ui", "()Lyf9;", "outerCoordinator", "getChildrenInfo", "childrenInfo", "rv7", "qv7", "sv7", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class LayoutNode implements ue2, fw9, lf2 {
    public static final l6c g1 = new l6c("Undefined intrinsics block and it is required", 1);
    public static final ov7 h1 = new ov7(0);
    public static final pv7 i1 = new pv7();
    public static final qu j1 = new qu(17);
    public uvf E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public twc I0;
    public boolean J0;
    public final p89 K0;
    public boolean L0;
    public xn8 M0;
    public fz3 N0;
    public sw3 O0;
    public cv7 P0;
    public rvf Q0;
    public wg2 R0;
    public sv7 S0;
    public sv7 T0;
    public boolean U0;
    public final wo0 V0;
    public gw7 W0;
    public boolean X;
    public yf9 X0;
    public LayoutNode Y;
    public boolean Y0;
    public Owner Z;
    public j09 Z0;
    public final boolean a;
    public j09 a1;
    public int b;
    public tw b1;
    public boolean c;
    public uw c1;
    public long d;
    public boolean d1;
    public boolean e;
    public int e1;
    public boolean f;
    public boolean f1;
    public int g;
    private final xv7 layoutDelegate;
    public boolean v;
    public LayoutNode w;
    public int x;
    public final fz3 y;
    public p89 z;

    public LayoutNode(boolean z, int i) {
        this.a = z;
        this.b = i;
        this.d = 9223372034707292159L;
        this.e = true;
        this.f = true;
        this.g = -4;
        this.y = new fz3(21, new p89(0, new LayoutNode[16]), new zv6(7, this));
        this.K0 = new p89(0, new LayoutNode[16]);
        this.L0 = true;
        this.M0 = g1;
        this.O0 = wv7.a;
        this.P0 = cv7.a;
        this.Q0 = i1;
        wg2.r.getClass();
        this.R0 = vg2.b;
        sv7 sv7Var = sv7.c;
        this.S0 = sv7Var;
        this.T0 = sv7Var;
        this.V0 = new wo0(this);
        this.layoutDelegate = new xv7(this);
        this.Y0 = true;
        this.Z0 = g09.a;
    }

    public static final void a(LayoutNode layoutNode) {
        xv7 xv7Var = layoutNode.layoutDelegate;
        xv7Var.p.P0 = true;
        rg8 rg8Var = xv7Var.q;
        if (rg8Var != null) {
            rg8Var.J0 = true;
        }
    }

    public static boolean b0(LayoutNode layoutNode) {
        rg8 rg8Var = layoutNode.layoutDelegate.q;
        return layoutNode.a0(rg8Var != null ? rg8Var.Y : null);
    }

    private final String l(LayoutNode instance) {
        String strH = h(0);
        LayoutNode layoutNode = instance.Y;
        return "Cannot insert " + instance + " because it already has a parent or an owner. This tree: " + strH + " Other tree: " + (layoutNode != null ? layoutNode.h(0) : null);
    }

    public static boolean n0(LayoutNode layoutNode) {
        wn8 wn8Var = layoutNode.layoutDelegate.p;
        return layoutNode.m0(wn8Var.x ? new kl2(wn8Var.d) : null);
    }

    public static void s0(LayoutNode layoutNode, boolean z, int i) {
        LayoutNode layoutNodeF;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.w == null) {
            i37.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = layoutNode.Z;
        if (owner == null || layoutNode.G0 || layoutNode.a) {
            return;
        }
        ((AndroidComposeView) owner).w(layoutNode, true, z, z2);
        if (z3) {
            rg8 rg8Var = layoutNode.layoutDelegate.q;
            rg8Var.getClass();
            xv7 xv7Var = rg8Var.f;
            LayoutNode layoutNodeF2 = xv7Var.a.F();
            sv7 sv7Var = xv7Var.a.S0;
            if (layoutNodeF2 == null || sv7Var == sv7.c) {
                return;
            }
            while (layoutNodeF2.S0 == sv7Var && (layoutNodeF = layoutNodeF2.F()) != null) {
                layoutNodeF2 = layoutNodeF;
            }
            int iOrdinal = sv7Var.ordinal();
            if (iOrdinal == 0) {
                if (layoutNodeF2.w != null) {
                    s0(layoutNodeF2, z, 6);
                    return;
                } else {
                    u0(layoutNodeF2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                qc0.p("Intrinsics isn't used by the parent");
            } else if (layoutNodeF2.w != null) {
                layoutNodeF2.r0(z);
            } else {
                layoutNodeF2.t0(z);
            }
        }
    }

    public static void u0(LayoutNode layoutNode, boolean z, int i) {
        Owner owner;
        LayoutNode layoutNodeF;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.G0 || layoutNode.a || (owner = layoutNode.Z) == null) {
            return;
        }
        ((AndroidComposeView) owner).w(layoutNode, false, z, z2);
        if (z3) {
            xv7 xv7Var = layoutNode.layoutDelegate.p.f;
            LayoutNode layoutNodeF2 = xv7Var.a.F();
            sv7 sv7Var = xv7Var.a.S0;
            if (layoutNodeF2 == null || sv7Var == sv7.c) {
                return;
            }
            while (layoutNodeF2.S0 == sv7Var && (layoutNodeF = layoutNodeF2.F()) != null) {
                layoutNodeF2 = layoutNodeF;
            }
            int iOrdinal = sv7Var.ordinal();
            if (iOrdinal == 0) {
                u0(layoutNodeF2, z, 6);
            } else if (iOrdinal == 1) {
                layoutNodeF2.t0(z);
            } else {
                qc0.p("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void v0(LayoutNode layoutNode) {
        int i = tv7.a[layoutNode.layoutDelegate.d.ordinal()];
        xv7 xv7Var = layoutNode.layoutDelegate;
        if (i != 1) {
            s8f.h(xv7Var.d, "Unexpected state ");
            return;
        }
        if (xv7Var.e) {
            s0(layoutNode, true, 6);
            return;
        }
        if (xv7Var.f) {
            layoutNode.r0(true);
        }
        if (layoutNode.A()) {
            u0(layoutNode, true, 6);
        } else if (layoutNode.t()) {
            layoutNode.t0(true);
        }
    }

    public final boolean A() {
        return this.layoutDelegate.p.K0;
    }

    public final void A0(LayoutNode layoutNode) {
        if (pa7.t(layoutNode, this.w)) {
            return;
        }
        this.w = layoutNode;
        xv7 xv7Var = this.layoutDelegate;
        if (layoutNode != null) {
            if (xv7Var.q == null) {
                xv7Var.q = new rg8(xv7Var);
            }
            yf9 yf9Var = ((c47) this.V0.d).M0;
            for (yf9 outerCoordinator$ui = getOuterCoordinator$ui(); !pa7.t(outerCoordinator$ui, yf9Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.M0) {
                outerCoordinator$ui.c1();
            }
        } else {
            xv7Var.q = null;
            xv7Var.f = false;
            xv7Var.e = false;
        }
        S();
    }

    public final sv7 B() {
        return this.layoutDelegate.p.z;
    }

    public final void B0(xn8 xn8Var) {
        if (pa7.t(this.M0, xn8Var)) {
            return;
        }
        this.M0 = xn8Var;
        fz3 fz3Var = this.N0;
        if (fz3Var != null) {
            ((vz9) fz3Var.c).setValue(xn8Var);
        }
        S();
    }

    public final sv7 C() {
        sv7 sv7Var;
        rg8 rg8Var = this.layoutDelegate.q;
        return (rg8Var == null || (sv7Var = rg8Var.x) == null) ? sv7.c : sv7Var;
    }

    public final void C0(j09 j09Var) {
        if (this.a && this.Z0 != g09.a) {
            i37.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f1) {
            i37.a("modifier is updated when deactivated");
        }
        if (!W()) {
            this.a1 = j09Var;
            return;
        }
        c(j09Var);
        if (this.H0) {
            U();
        }
    }

    public final List D() {
        wo0 wo0Var = this.V0;
        i79 i79Var = (i79) wo0Var.v;
        if (i79Var.d()) {
            return pu4.a;
        }
        i79 i79Var2 = new i79(i79Var.b);
        i09 i09Var = (i09) wo0Var.g;
        int i = 0;
        int i2 = 0;
        while (i09Var != null) {
            zde zdeVar = (zde) wo0Var.f;
            if (i09Var == zdeVar) {
                break;
            }
            yf9 yf9Var = i09Var.v;
            ew9 ew9Var = null;
            if (yf9Var == null) {
                qc0.j("getModifierInfo called on node with no coordinator");
                return null;
            }
            ew9 ew9Var2 = yf9Var.k1;
            ew9 ew9Var3 = ((c47) wo0Var.d).k1;
            i09 i09Var2 = i09Var.f;
            if (i09Var2 == zdeVar && yf9Var != i09Var2.v) {
                ew9Var = ew9Var3;
            }
            if (ew9Var2 == null) {
                ew9Var2 = ew9Var;
            }
            i79Var2.h(new n09((j09) i79Var.b(i2), yf9Var, ew9Var2));
            i09Var = i09Var.f;
            i2++;
        }
        g79 g79Var = i79Var2.c;
        if (g79Var != null) {
            return g79Var;
        }
        g79 g79Var2 = new g79(i, i79Var2);
        i79Var2.c = g79Var2;
        return g79Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void D0(rvf rvfVar) {
        if (pa7.t(this.Q0, rvfVar)) {
            return;
        }
        this.Q0 = rvfVar;
        i09 i09Var = (i09) this.V0.g;
        if ((i09Var.d & 16) != 0) {
            while (i09Var != null) {
                if ((i09Var.c & 16) != 0) {
                    ?? M0 = i09Var;
                    ?? p89Var = 0;
                    while (M0 != 0) {
                        if (M0 instanceof ria) {
                            ((ria) M0).P0();
                        } else if ((M0.c & 16) != 0 && (M0 instanceof sv3)) {
                            i09 i09Var2 = ((sv3) M0).E0;
                            int i = 0;
                            M0 = M0;
                            p89Var = p89Var;
                            while (i09Var2 != null) {
                                if ((i09Var2.c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        p89Var = p89Var;
                                        M0 = i09Var2;
                                    } else {
                                        if (p89Var == 0) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (M0 != 0) {
                                            p89Var.b(M0);
                                            M0 = 0;
                                        }
                                        p89Var.b(i09Var2);
                                    }
                                }
                                i09Var2 = i09Var2.f;
                                M0 = M0;
                                p89Var = p89Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M0 = vd0.m0(p89Var);
                    }
                }
                if ((i09Var.d & 16) == 0) {
                    return;
                } else {
                    i09Var = i09Var.f;
                }
            }
        }
    }

    public final fz3 E() {
        fz3 fz3Var = this.N0;
        if (fz3Var != null) {
            return fz3Var;
        }
        fz3 fz3Var2 = new fz3(this, this.M0);
        this.N0 = fz3Var2;
        return fz3Var2;
    }

    public final void E0() {
        if (this.x <= 0 || !this.X) {
            return;
        }
        this.X = false;
        p89 p89Var = this.z;
        if (p89Var == null) {
            p89Var = new p89(0, new LayoutNode[16]);
            this.z = p89Var;
        }
        p89Var.g();
        p89 p89Var2 = (p89) this.y.b;
        Object[] objArr = p89Var2.a;
        int i = p89Var2.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.a) {
                p89Var.c(p89Var.c, layoutNode.L());
            } else {
                p89Var.b(layoutNode);
            }
        }
        xv7 xv7Var = this.layoutDelegate;
        xv7Var.p.P0 = true;
        rg8 rg8Var = xv7Var.q;
        if (rg8Var != null) {
            rg8Var.J0 = true;
        }
    }

    public final LayoutNode F() {
        LayoutNode layoutNode = this.Y;
        while (layoutNode != null && layoutNode.a) {
            layoutNode = layoutNode.Y;
        }
        return layoutNode;
    }

    public final int G() {
        return this.layoutDelegate.p.w;
    }

    public final twc H() {
        if (W() && !this.f1 && this.V0.i(8)) {
            return this.I0;
        }
        return null;
    }

    public final int I() {
        return this.layoutDelegate.p.a;
    }

    public final float J() {
        return this.layoutDelegate.p.U0;
    }

    public final p89 K() {
        boolean z = this.L0;
        p89 p89Var = this.K0;
        if (z) {
            p89Var.g();
            p89Var.c(p89Var.c, L());
            Arrays.sort(p89Var.a, 0, p89Var.c, j1);
            this.L0 = false;
        }
        return p89Var;
    }

    public final p89 L() {
        E0();
        if (this.x == 0) {
            return (p89) this.y.b;
        }
        p89 p89Var = this.z;
        p89Var.getClass();
        return p89Var;
    }

    public final void M(long j, sl6 sl6Var, int i, boolean z) {
        yf9 outerCoordinator$ui = getOuterCoordinator$ui();
        d59 d59Var = yf9.m1;
        getOuterCoordinator$ui().n1(yf9.r1, outerCoordinator$ui.e1(j, true), sl6Var, i, z);
    }

    public final void N(int i, LayoutNode layoutNode) {
        if (layoutNode.Y != null && layoutNode.Z != null) {
            i37.c(l(layoutNode));
        }
        layoutNode.Y = this;
        fz3 fz3Var = this.y;
        ((p89) fz3Var.b).a(i, layoutNode);
        ((zv6) fz3Var.c).invoke();
        k0();
        if (layoutNode.a) {
            this.x++;
        }
        V();
        Owner owner = this.Z;
        if (owner != null) {
            layoutNode.e(owner);
        }
        if (layoutNode.layoutDelegate.l > 0) {
            xv7 xv7Var = this.layoutDelegate;
            xv7Var.d(xv7Var.l + 1);
        }
        if (layoutNode.e1 > 0) {
            z0(this.e1 + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [i09] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void O(boolean z) {
        if (z) {
            LayoutNode layoutNodeF = F();
            if (layoutNodeF != null) {
                layoutNodeF.P();
            } else {
                Owner owner = this.Z;
                if (owner != null) {
                    ((AndroidComposeView) owner).invalidate();
                }
            }
        }
        i09 i09Var = (i09) this.V0.g;
        if ((i09Var.d & 2) != 0) {
            while (i09Var != null) {
                if ((i09Var.c & 2) != 0) {
                    ?? M0 = i09Var;
                    ?? p89Var = 0;
                    while (M0 != 0) {
                        if (M0 instanceof kv7) {
                            ew9 ew9Var = vd0.p0((kv7) M0, 2).k1;
                            if (ew9Var != null) {
                                ((ne6) ew9Var).c();
                            }
                        } else if ((M0.c & 2) != 0 && (M0 instanceof sv3)) {
                            i09 i09Var2 = ((sv3) M0).E0;
                            int i = 0;
                            M0 = M0;
                            p89Var = p89Var;
                            while (i09Var2 != null) {
                                if ((i09Var2.c & 2) != 0) {
                                    i++;
                                    if (i == 1) {
                                        p89Var = p89Var;
                                        M0 = i09Var2;
                                    } else {
                                        if (p89Var == 0) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (M0 != 0) {
                                            p89Var.b(M0);
                                            M0 = 0;
                                        }
                                        p89Var.b(i09Var2);
                                    }
                                }
                                i09Var2 = i09Var2.f;
                                M0 = M0;
                                p89Var = p89Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M0 = vd0.m0(p89Var);
                    }
                }
                if ((i09Var.d & 2) == 0) {
                    break;
                } else {
                    i09Var = i09Var.f;
                }
            }
        }
        p89 p89VarL = L();
        Object[] objArr = p89VarL.a;
        int i2 = p89VarL.c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((LayoutNode) objArr[i3]).O(false);
        }
    }

    public final void P() {
        if (this.Y0) {
            yf9 yf9Var = (c47) this.V0.d;
            yf9 yf9Var2 = getOuterCoordinator$ui().N0;
            this.X0 = null;
            while (!pa7.t(yf9Var, yf9Var2)) {
                if ((yf9Var != null ? yf9Var.k1 : null) != null) {
                    this.X0 = yf9Var;
                    break;
                }
                yf9Var = yf9Var != null ? yf9Var.N0 : null;
            }
            this.Y0 = false;
        }
        yf9 yf9Var3 = this.X0;
        if (yf9Var3 != null && yf9Var3.k1 == null) {
            throw kv2.d("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (yf9Var3 != null) {
            yf9Var3.p1();
            return;
        }
        LayoutNode layoutNodeF = F();
        if (layoutNodeF != null) {
            layoutNodeF.P();
            return;
        }
        Owner owner = this.Z;
        if (owner != null) {
            ((AndroidComposeView) owner).invalidate();
        }
    }

    public final void Q() {
        yf9 outerCoordinator$ui = getOuterCoordinator$ui();
        wo0 wo0Var = this.V0;
        c47 c47Var = (c47) wo0Var.d;
        while (outerCoordinator$ui != c47Var) {
            outerCoordinator$ui.getClass();
            nv7 nv7Var = (nv7) outerCoordinator$ui;
            ew9 ew9Var = nv7Var.k1;
            if (ew9Var != null) {
                ((ne6) ew9Var).c();
            }
            outerCoordinator$ui = nv7Var.M0;
        }
        ew9 ew9Var2 = ((c47) wo0Var.d).k1;
        if (ew9Var2 != null) {
            ((ne6) ew9Var2).c();
        }
    }

    public final void R() {
        u0(this, false, 7);
        p89 p89VarL = L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).R();
        }
    }

    public final void S() {
        if (this.a) {
            LayoutNode layoutNodeF = F();
            if (layoutNodeF != null) {
                layoutNodeF.S();
                return;
            }
            return;
        }
        if (this.w != null) {
            s0(this, false, 7);
        } else {
            u0(this, false, 7);
        }
    }

    public final void T() {
        xv7 xv7Var = this.layoutDelegate;
        xv7Var.p.G0 = true;
        rg8 rg8Var = xv7Var.q;
        if (rg8Var != null) {
            rg8Var.M0 = true;
        }
    }

    public final void U() {
        if (this.J0) {
            return;
        }
        if (((uf9) this.V0.c).f != null || this.a1 != null) {
            this.H0 = true;
            return;
        }
        twc twcVar = this.I0;
        this.J0 = true;
        mmb mmbVar = new mmb();
        mmbVar.element = new twc();
        gw9 snapshotObserver = wv7.a(this).getSnapshotObserver();
        jf6 jf6Var = new jf6(14, this, mmbVar);
        snapshotObserver.a.d(this, snapshotObserver.d, jf6Var);
        this.J0 = false;
        this.I0 = (twc) mmbVar.element;
        this.H0 = false;
        Owner ownerA = wv7.a(this);
        ownerA.getSemanticsOwner().b(this, twcVar);
        ((AndroidComposeView) ownerA).y();
    }

    public final void V() {
        LayoutNode layoutNode;
        if (this.x > 0) {
            this.X = true;
        }
        if (!this.a || (layoutNode = this.Y) == null) {
            return;
        }
        layoutNode.V();
    }

    public final boolean W() {
        return this.Z != null;
    }

    public final boolean X() {
        return this.layoutDelegate.p.I0;
    }

    public final boolean Y() {
        return this.layoutDelegate.p.J0;
    }

    public final Boolean Z() {
        rg8 rg8Var = this.layoutDelegate.q;
        if (rg8Var != null) {
            return Boolean.valueOf(rg8Var.G0 != qg8.c);
        }
        return null;
    }

    public final boolean a0(kl2 kl2Var) {
        if (kl2Var == null || this.w == null) {
            return false;
        }
        rg8 rg8Var = this.layoutDelegate.q;
        rg8Var.getClass();
        return rg8Var.A0(kl2Var.a);
    }

    @Override // defpackage.ue2
    public final void b() {
        uvf uvfVar = this.E0;
        if (uvfVar != null) {
            uvfVar.b();
        }
        gw7 gw7Var = this.W0;
        if (gw7Var != null) {
            gw7Var.b();
        }
        yf9 yf9Var = ((c47) this.V0.d).M0;
        for (yf9 outerCoordinator$ui = getOuterCoordinator$ui(); !pa7.t(outerCoordinator$ui, yf9Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.M0) {
            outerCoordinator$ui.u1();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6001. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(defpackage.j09 r24) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.c(j09):void");
    }

    public final void c0() {
        LayoutNode layoutNodeF;
        if (this.S0 == sv7.c) {
            g();
        }
        rg8 rg8Var = this.layoutDelegate.q;
        rg8Var.getClass();
        boolean z = true;
        try {
            rg8Var.g = true;
            if (!rg8Var.z) {
                i37.c("replace() called on item that was not placed");
            }
            rg8Var.R0 = false;
            if (rg8Var.G0 == qg8.c) {
                z = false;
            }
            rg8Var.u0(rg8Var.Z, rg8Var.E0, rg8Var.F0);
            if (z && !rg8Var.R0 && (layoutNodeF = rg8Var.f.a.F()) != null) {
                layoutNodeF.r0(false);
            }
        } finally {
            rg8Var.g = false;
        }
    }

    @Override // defpackage.ue2
    public final void d() {
        zo autofillManager;
        uvf uvfVar = this.E0;
        if (uvfVar != null) {
            uvfVar.d();
        }
        gw7 gw7Var = this.W0;
        if (gw7Var != null) {
            gw7Var.i(true);
        }
        this.f1 = true;
        i09 i09Var = (zde) this.V0.f;
        for (i09 i09Var2 = i09Var; i09Var2 != null; i09Var2 = i09Var2.e) {
            if (i09Var2.Y) {
                i09Var2.g1();
            }
        }
        for (i09 i09Var3 = i09Var; i09Var3 != null; i09Var3 = i09Var3.e) {
            if (i09Var3.Y) {
                i09Var3.i1();
            }
        }
        while (i09Var != null) {
            if (i09Var.Y) {
                i09Var.c1();
            }
            i09Var = i09Var.e;
        }
        if (W()) {
            this.I0 = null;
            this.H0 = false;
        }
        Owner owner = this.Z;
        if (owner == null || (autofillManager = ((AndroidComposeView) owner).getAutofillManager()) == null || !autofillManager.v.f(this.b)) {
            return;
        }
        autofillManager.a.z(autofillManager.c, this.b, false);
    }

    public final void d0() {
        wn8 wn8Var = this.layoutDelegate.p;
        wn8Var.L0 = true;
        wn8Var.M0 = true;
    }

    public final void e(Owner owner) {
        LayoutNode layoutNode;
        twc twcVarH;
        if (this.Z != null) {
            i37.c("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        LayoutNode layoutNode2 = this.Y;
        if (layoutNode2 != null && !pa7.t(layoutNode2.Z, owner)) {
            LayoutNode layoutNodeF = F();
            Owner owner2 = layoutNodeF != null ? layoutNodeF.Z : null;
            String strH = h(0);
            LayoutNode layoutNode3 = this.Y;
            i37.c("Attaching to a different owner(" + owner + ") than the parent's owner(" + owner2 + "). This tree: " + strH + " Parent tree: " + (layoutNode3 != null ? layoutNode3.h(0) : null));
        }
        LayoutNode layoutNodeF2 = F();
        if (layoutNodeF2 == null) {
            this.layoutDelegate.p.I0 = true;
            owner.getRectManager().g(this);
            rg8 rg8Var = this.layoutDelegate.q;
            if (rg8Var != null) {
                rg8Var.G0 = qg8.a;
            }
        }
        getOuterCoordinator$ui().N0 = layoutNodeF2 != null ? (c47) layoutNodeF2.V0.d : null;
        this.Z = owner;
        this.F0 = (layoutNodeF2 != null ? layoutNodeF2.F0 : -1) + 1;
        j09 j09Var = this.a1;
        if (j09Var != null) {
            c(j09Var);
        }
        this.a1 = null;
        ((AndroidComposeView) owner).m3getLayoutNodes().i(this.b, this);
        boolean z = this.v;
        wo0 wo0Var = this.V0;
        if (z) {
            A0(this);
        } else {
            LayoutNode layoutNode4 = this.Y;
            if (layoutNode4 == null || (layoutNode = layoutNode4.w) == null) {
                layoutNode = this.w;
            }
            A0(layoutNode);
            if (this.w == null && wo0Var.i(512)) {
                A0(this);
            }
        }
        if (!this.f1) {
            for (i09 i09Var = (i09) wo0Var.g; i09Var != null; i09Var = i09Var.f) {
                i09Var.b1();
            }
        }
        p89 p89Var = (p89) this.y.b;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).e(owner);
        }
        if (!this.f1) {
            wo0Var.l();
        }
        S();
        if (layoutNodeF2 != null) {
            layoutNodeF2.S();
        }
        tw twVar = this.b1;
        if (twVar != null) {
            twVar.d(owner);
        }
        this.layoutDelegate.j();
        if (!this.f1 && wo0Var.i(8)) {
            U();
        }
        zo autofillManager = ((AndroidComposeView) owner).getAutofillManager();
        if (autofillManager == null || (twcVarH = H()) == null || !twcVarH.a.b(cxc.r)) {
            return;
        }
        autofillManager.v.a(this.b);
        autofillManager.a.z(autofillManager.c, this.b, true);
    }

    public final void e0() {
        xv7 xv7Var = this.layoutDelegate;
        xv7Var.f = true;
        xv7Var.g = true;
    }

    public final void f() {
        this.T0 = this.S0;
        sv7 sv7Var = sv7.c;
        this.S0 = sv7Var;
        p89 p89VarL = L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.S0 != sv7Var) {
                layoutNode.f();
            }
        }
    }

    public final void f0() {
        this.layoutDelegate.e = true;
    }

    public final void g() {
        this.T0 = this.S0;
        this.S0 = sv7.c;
        p89 p89VarL = L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.S0 == sv7.b) {
                layoutNode.g();
            }
        }
    }

    public final void g0() {
        this.layoutDelegate.p.K0 = true;
    }

    public final List<LayoutNode> getChildren$ui() {
        return L().f();
    }

    public List<LayoutNode> getChildrenInfo() {
        return getChildren$ui();
    }

    public final yf9 getOuterCoordinator$ui() {
        return (yf9) this.V0.e;
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        p89 p89VarL = L();
        Object[] objArr = p89VarL.a;
        int i3 = p89VarL.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((LayoutNode) objArr[i4]).h(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void h0(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            fz3 fz3Var = this.y;
            p89 p89Var = (p89) fz3Var.b;
            zv6 zv6Var = (zv6) fz3Var.c;
            Object objK = p89Var.k(i5);
            zv6Var.invoke();
            ((p89) fz3Var.b).a(i6, (LayoutNode) objK);
            zv6Var.invoke();
        }
        k0();
        V();
        S();
    }

    public final void i() {
        uv7 uv7Var;
        Owner owner = this.Z;
        if (owner == null) {
            LayoutNode layoutNodeF = F();
            i37.d("Cannot detach node that is already detached!  Tree: " + (layoutNodeF != null ? layoutNodeF.h(0) : null));
            oo3.f();
            return;
        }
        LayoutNode layoutNodeF2 = F();
        if (layoutNodeF2 != null) {
            layoutNodeF2.P();
            layoutNodeF2.S();
            xv7 xv7Var = this.layoutDelegate;
            wn8 wn8Var = xv7Var.p;
            sv7 sv7Var = sv7.c;
            wn8Var.z = sv7Var;
            rg8 rg8Var = xv7Var.q;
            if (rg8Var != null) {
                rg8Var.x = sv7Var;
            }
        }
        xv7 xv7Var2 = this.layoutDelegate;
        uv7 uv7Var2 = xv7Var2.p.N0;
        uv7Var2.b = true;
        uv7Var2.c = false;
        uv7Var2.e = false;
        uv7Var2.d = false;
        uv7Var2.f = false;
        uv7Var2.g = false;
        uv7Var2.h = null;
        rg8 rg8Var2 = xv7Var2.q;
        if (rg8Var2 != null && (uv7Var = rg8Var2.H0) != null) {
            uv7Var.b = true;
            uv7Var.c = false;
            uv7Var.e = false;
            uv7Var.d = false;
            uv7Var.f = false;
            uv7Var.g = false;
            uv7Var.h = null;
        }
        wo0 wo0Var = this.V0;
        c47 c47Var = (c47) wo0Var.d;
        i09 i09Var = (zde) wo0Var.f;
        yf9 yf9Var = c47Var.M0;
        for (yf9 outerCoordinator$ui = getOuterCoordinator$ui(); !pa7.t(outerCoordinator$ui, yf9Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.M0) {
            outerCoordinator$ui.A1();
            if (outerCoordinator$ui.J0.X()) {
                outerCoordinator$ui.v1();
            }
        }
        uw uwVar = this.c1;
        if (uwVar != null) {
            uwVar.d(owner);
        }
        for (i09 i09Var2 = i09Var; i09Var2 != null; i09Var2 = i09Var2.e) {
            if (i09Var2.Y) {
                i09Var2.i1();
            }
        }
        this.G0 = true;
        p89 p89Var = (p89) this.y.b;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).i();
        }
        this.G0 = false;
        while (i09Var != null) {
            if (i09Var.Y) {
                i09Var.c1();
            }
            i09Var = i09Var.e;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) owner;
        androidComposeView.m3getLayoutNodes().g(this.b);
        ld5 ld5Var = androidComposeView.i1;
        ta0 ta0Var = (ta0) ld5Var.e;
        ((ssg) ta0Var.c).N(this);
        ((ssg) ta0Var.d).N(this);
        ((ssg) ta0Var.b).N(this);
        ((p89) ((fz3) ld5Var.f).b).j(this);
        androidComposeView.c1 = true;
        zo autofillManager = androidComposeView.getAutofillManager();
        if (autofillManager != null && autofillManager.v.f(this.b)) {
            autofillManager.a.z(autofillManager.c, this.b, false);
        }
        owner.getRectManager().h(this);
        this.Z = null;
        A0(null);
        this.F0 = 0;
        xv7 xv7Var3 = this.layoutDelegate;
        wn8 wn8Var2 = xv7Var3.p;
        wn8Var2.w = Integer.MAX_VALUE;
        wn8Var2.v = Integer.MAX_VALUE;
        wn8Var2.I0 = false;
        rg8 rg8Var3 = xv7Var3.q;
        if (rg8Var3 != null) {
            rg8Var3.w = Integer.MAX_VALUE;
            rg8Var3.v = Integer.MAX_VALUE;
            rg8Var3.G0 = qg8.c;
        }
        if (wo0Var.i(8)) {
            twc twcVar = this.I0;
            this.I0 = null;
            this.H0 = false;
            owner.getSemanticsOwner().b(this, twcVar);
            androidComposeView.y();
        }
    }

    public final void i0(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.l > 0) {
            xv7 xv7Var = this.layoutDelegate;
            xv7Var.d(xv7Var.l - 1);
        }
        if (this.Z != null) {
            layoutNode.i();
        }
        layoutNode.Y = null;
        if (layoutNode.e1 > 0) {
            z0(this.e1 - 1);
        }
        layoutNode.getOuterCoordinator$ui().N0 = null;
        if (layoutNode.a) {
            this.x--;
            p89 p89Var = (p89) layoutNode.y.b;
            Object[] objArr = p89Var.a;
            int i = p89Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).getOuterCoordinator$ui().N0 = null;
            }
        }
        V();
        k0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final void j() {
        if (this.layoutDelegate.d != qv7.e || t() || A() || this.f1 || !X()) {
            return;
        }
        i09 i09Var = (i09) this.V0.g;
        if ((i09Var.d & 256) != 0) {
            while (i09Var != null) {
                if ((i09Var.c & 256) != 0) {
                    ?? M0 = i09Var;
                    ?? p89Var = 0;
                    while (M0 != 0) {
                        if (M0 instanceof mb6) {
                            mb6 mb6Var = (mb6) M0;
                            mb6Var.l0(vd0.p0(mb6Var, 256));
                        } else if ((M0.c & 256) != 0 && (M0 instanceof sv3)) {
                            i09 i09Var2 = ((sv3) M0).E0;
                            int i = 0;
                            M0 = M0;
                            p89Var = p89Var;
                            while (i09Var2 != null) {
                                if ((i09Var2.c & 256) != 0) {
                                    i++;
                                    if (i == 1) {
                                        p89Var = p89Var;
                                        M0 = i09Var2;
                                    } else {
                                        if (p89Var == 0) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (M0 != 0) {
                                            p89Var.b(M0);
                                            M0 = 0;
                                        }
                                        p89Var.b(i09Var2);
                                    }
                                }
                                i09Var2 = i09Var2.f;
                                M0 = M0;
                                p89Var = p89Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M0 = vd0.m0(p89Var);
                    }
                }
                if ((i09Var.d & 256) == 0) {
                    return;
                } else {
                    i09Var = i09Var.f;
                }
            }
        }
    }

    public final void j0(yf9 yf9Var) {
        Owner owner = this.Z;
        jkb rectManager = owner != null ? owner.getRectManager() : null;
        boolean z = this.layoutDelegate.d != qv7.e || A() || t();
        if (this.g != -4 && rectManager != null) {
            if (yf9Var == getOuterCoordinator$ui()) {
                this.f = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.e = true;
                p89 p89VarL = L();
                Object[] objArr = p89VarL.a;
                int i = p89VarL.c;
                for (int i2 = 0; i2 < i; i2++) {
                    LayoutNode layoutNode = (LayoutNode) objArr[i2];
                    layoutNode.f = true;
                    if (!z) {
                        rectManager.g(layoutNode);
                    }
                }
                if (this.g != -4) {
                    rectManager.f = true;
                    int iD = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.c;
                    int i3 = iD + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        this.layoutDelegate.p.B0();
    }

    public final void k(vl1 vl1Var, ke6 ke6Var) throws Throwable {
        try {
            getOuterCoordinator$ui().a1(vl1Var, ke6Var);
        } catch (Throwable th) {
            x0(th);
            throw null;
        }
    }

    public final void k0() {
        if (!this.a) {
            this.L0 = true;
            return;
        }
        LayoutNode layoutNodeF = F();
        if (layoutNodeF != null) {
            layoutNodeF.k0();
        }
    }

    public final void l0() {
        if (this.S0 == sv7.c) {
            g();
        }
        LayoutNode layoutNodeF = F();
        (layoutNodeF != null ? ((c47) layoutNodeF.V0.d).E0 : wv7.a(this).getPlacementScope()).k(this.layoutDelegate.p, 0, 0, 0.0f);
    }

    public final void m() {
        if (this.w != null) {
            s0(this, false, 5);
        } else {
            u0(this, false, 5);
        }
        wn8 wn8Var = this.layoutDelegate.p;
        kl2 kl2Var = wn8Var.x ? new kl2(wn8Var.d) : null;
        Owner owner = this.Z;
        if (kl2Var != null) {
            if (owner != null) {
                ((AndroidComposeView) owner).s(this, kl2Var.a);
            }
        } else if (owner != null) {
            ((AndroidComposeView) owner).r(true);
        }
    }

    public final boolean m0(kl2 kl2Var) {
        if (kl2Var == null) {
            return false;
        }
        if (this.S0 == sv7.c) {
            f();
        }
        return this.layoutDelegate.p.A0(kl2Var.a);
    }

    public final boolean n() {
        rg8 rg8Var;
        uv7 uv7Var;
        xv7 xv7Var = this.layoutDelegate;
        return xv7Var.p.N0.e() || !((rg8Var = xv7Var.q) == null || (uv7Var = rg8Var.H0) == null || !uv7Var.e());
    }

    public final List o() {
        rg8 rg8Var = this.layoutDelegate.q;
        rg8Var.getClass();
        p89 p89Var = rg8Var.I0;
        xv7 xv7Var = rg8Var.f;
        xv7Var.a.getChildren$ui();
        if (!rg8Var.J0) {
            return p89Var.f();
        }
        LayoutNode layoutNode = xv7Var.a;
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (p89Var.c <= i2) {
                rg8 rg8Var2 = layoutNode2.layoutDelegate.q;
                rg8Var2.getClass();
                p89Var.b(rg8Var2);
            } else {
                rg8 rg8Var3 = layoutNode2.layoutDelegate.q;
                rg8Var3.getClass();
                Object[] objArr2 = p89Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = rg8Var3;
            }
        }
        p89Var.l(layoutNode.getChildren$ui().size(), p89Var.c);
        rg8Var.J0 = false;
        return p89Var.f();
    }

    public final void o0() {
        fz3 fz3Var = this.y;
        int i = ((p89) fz3Var.b).c;
        while (true) {
            i--;
            p89 p89Var = (p89) fz3Var.b;
            if (-1 >= i) {
                p89Var.g();
                ((zv6) fz3Var.c).invoke();
                return;
            }
            i0((LayoutNode) p89Var.a[i]);
        }
    }

    public final List p() {
        return this.layoutDelegate.p.l0();
    }

    public final void p0(int i, int i2) {
        if (i2 < 0) {
            i37.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            fz3 fz3Var = this.y;
            i0((LayoutNode) ((p89) fz3Var.b).a[i3]);
            Object objK = ((p89) fz3Var.b).k(i3);
            ((zv6) fz3Var.c).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final List q() {
        return ((p89) this.y.b).f();
    }

    public final void q0() {
        LayoutNode layoutNodeF;
        if (this.S0 == sv7.c) {
            g();
        }
        wn8 wn8Var = this.layoutDelegate.p;
        xv7 xv7Var = wn8Var.f;
        try {
            wn8Var.g = true;
            if (!wn8Var.y) {
                i37.c("replace called on unplaced item");
            }
            boolean z = wn8Var.I0;
            wn8Var.t0(wn8Var.Y, wn8Var.F0, wn8Var.Z, wn8Var.E0);
            if (z && !wn8Var.V0 && (layoutNodeF = xv7Var.a.F()) != null) {
                layoutNodeF.t0(false);
            }
            wn8Var.g = false;
        } catch (Throwable th) {
            try {
                xv7Var.a.x0(th);
                throw null;
            } catch (Throwable th2) {
                wn8Var.g = false;
                throw th2;
            }
        }
    }

    public final int r() {
        return this.layoutDelegate.p.b;
    }

    public final void r0(boolean z) {
        Owner owner;
        if (this.a || (owner = this.Z) == null) {
            return;
        }
        ((AndroidComposeView) owner).x(this, true, z);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final xv7 getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final boolean t() {
        return this.layoutDelegate.p.L0;
    }

    public final void t0(boolean z) {
        Owner owner;
        if (this.a || (owner = this.Z) == null) {
            return;
        }
        ((AndroidComposeView) owner).x(this, false, z);
    }

    public final String toString() {
        return y41.S(this) + " children: " + getChildren$ui().size() + " measurePolicy: " + this.M0 + " deactivated: " + this.f1 + " isVirtual: " + this.a + " isPlaced: " + X();
    }

    public final qv7 u() {
        return this.layoutDelegate.d;
    }

    public final boolean v() {
        return this.layoutDelegate.f;
    }

    @Override // defpackage.fw9
    public final boolean w() {
        return W();
    }

    public final void w0() {
        p89 p89VarL = L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            sv7 sv7Var = layoutNode.T0;
            layoutNode.S0 = sv7Var;
            if (sv7Var != sv7.c) {
                layoutNode.w0();
            }
        }
    }

    public final boolean x() {
        return this.layoutDelegate.e;
    }

    public final void x0(Throwable th) throws Throwable {
        wg2 wg2Var = this.R0;
        pr4 pr4Var = qg2.a;
        u8a u8aVar = (u8a) wg2Var;
        u8aVar.getClass();
        og2 og2Var = (og2) od4.B(u8aVar, pr4Var);
        if (og2Var == null) {
            throw th;
        }
        xo1.S(th, new ad1(7, og2Var, this));
        throw th;
    }

    public final rg8 y() {
        return this.layoutDelegate.q;
    }

    public final void y0(sw3 sw3Var) {
        if (pa7.t(this.O0, sw3Var)) {
            return;
        }
        this.O0 = sw3Var;
        S();
        LayoutNode layoutNodeF = F();
        if (layoutNodeF != null) {
            layoutNodeF.P();
        } else {
            Owner owner = this.Z;
            if (owner != null) {
                ((AndroidComposeView) owner).invalidate();
            }
        }
        Q();
        for (i09 i09Var = (i09) this.V0.g; i09Var != null; i09Var = i09Var.f) {
            i09Var.e();
        }
    }

    public final wn8 z() {
        return this.layoutDelegate.p;
    }

    public final void z0(int i) {
        LayoutNode layoutNodeF;
        LayoutNode layoutNodeF2;
        int i2 = this.e1;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (layoutNodeF2 = F()) != null) {
                layoutNodeF2.z0(layoutNodeF2.e1 + 1);
            }
            if (i == 0 && this.e1 > 0 && (layoutNodeF = F()) != null) {
                layoutNodeF.z0(layoutNodeF.e1 - 1);
            }
            this.e1 = i;
        }
    }

    public LayoutNode(int i) {
        this((i & 1) == 0, vwc.a.addAndGet(1));
    }
}
