package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rg8 extends cea implements tn8, dj, r39 {
    public a26 E0;
    public ke6 F0;
    public boolean K0;
    public final pg8 L0;
    public Object N0;
    public final pg8 P0;
    public final pg8 Q0;
    public boolean R0;
    public boolean X;
    public kl2 Y;
    public final xv7 f;
    public boolean g;
    public boolean y;
    public boolean z;
    public int v = Integer.MAX_VALUE;
    public int w = Integer.MAX_VALUE;
    public sv7 x = sv7.c;
    public long Z = 0;
    public qg8 G0 = qg8.c;
    public final uv7 H0 = new uv7(this, 1);
    public final p89 I0 = new p89(0, new rg8[16]);
    public boolean J0 = true;
    public boolean M0 = true;
    public long O0 = ll2.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [pg8] */
    /* JADX WARN: Type inference failed for: r5v4, types: [pg8] */
    /* JADX WARN: Type inference failed for: r5v5, types: [pg8] */
    public rg8(xv7 xv7Var) {
        this.f = xv7Var;
        final int i = 1;
        final int i2 = 0;
        this.L0 = new x16(this) { // from class: pg8
            public final /* synthetic */ rg8 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                ng8 ng8VarF1;
                int i3 = i2;
                wef wefVar = wef.a;
                i79 i79Var = null;
                placementScope = null;
                placementScope = null;
                bea placementScope = null;
                rg8 rg8Var = this.b;
                switch (i3) {
                    case 0:
                        xv7 xv7Var2 = rg8Var.f;
                        xv7Var2.h = 0;
                        LayoutNode layoutNode = xv7Var2.a;
                        p89 p89VarL = layoutNode.L();
                        Object[] objArr = p89VarL.a;
                        int i4 = p89VarL.c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            rg8 rg8Var2 = ((LayoutNode) objArr[i5]).getLayoutDelegate().q;
                            rg8Var2.getClass();
                            rg8Var2.v = rg8Var2.w;
                            rg8Var2.w = Integer.MAX_VALUE;
                            if (rg8Var2.x == sv7.b) {
                                rg8Var2.x = sv7.c;
                            }
                        }
                        p89 p89VarL2 = layoutNode.L();
                        Object[] objArr2 = p89VarL2.a;
                        int i6 = p89VarL2.c;
                        for (int i7 = 0; i7 < i6; i7++) {
                            rg8 rg8Var3 = ((LayoutNode) objArr2[i7]).getLayoutDelegate().q;
                            rg8Var3.getClass();
                            rg8Var3.H0.d = false;
                        }
                        b47 b47Var = rg8Var.d().u1;
                        if (b47Var == null) {
                            qc0.p("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            LayoutNode layoutNode2 = children$ui.get(i8);
                            ng8 ng8VarF2 = layoutNode2.getOuterCoordinator$ui().f1();
                            if (ng8VarF2 != null) {
                                if (ng8VarF2.Z) {
                                    if (i79Var == null) {
                                        i79Var = new i79();
                                    }
                                    i79Var.h(layoutNode2);
                                }
                                ng8VarF2.Z = b47Var.Z;
                            }
                        }
                        b47Var.B0().b();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                p89 p89VarL3 = layoutNode.L();
                                Object[] objArr3 = p89VarL3.a;
                                int i10 = p89VarL3.c;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    rg8 rg8Var4 = ((LayoutNode) objArr3[i11]).getLayoutDelegate().q;
                                    rg8Var4.getClass();
                                    int i12 = rg8Var4.v;
                                    int i13 = rg8Var4.w;
                                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                                        rg8Var4.o0(true);
                                    }
                                }
                                p89 p89VarL4 = layoutNode.L();
                                Object[] objArr4 = p89VarL4.a;
                                int i14 = p89VarL4.c;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    rg8 rg8Var5 = ((LayoutNode) objArr4[i15]).getLayoutDelegate().q;
                                    rg8Var5.getClass();
                                    uv7 uv7Var = rg8Var5.H0;
                                    uv7Var.e = uv7Var.d;
                                }
                                return wefVar;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i9);
                            boolean z = i79Var != null && i79Var.c(layoutNode3) >= 0;
                            ng8 ng8VarF3 = layoutNode3.getOuterCoordinator$ui().f1();
                            if (ng8VarF3 != null) {
                                ng8VarF3.Z = z;
                            }
                            i9++;
                        }
                        break;
                    case 1:
                        ng8 ng8VarF4 = rg8Var.f.a().f1();
                        ng8VarF4.getClass();
                        ng8VarF4.v(rg8Var.O0);
                        return wefVar;
                    default:
                        xv7 xv7Var3 = rg8Var.f;
                        if (b21.G(xv7Var3.a) || xv7Var3.c) {
                            yf9 yf9Var = xv7Var3.a().N0;
                            if (yf9Var != null) {
                                placementScope = yf9Var.E0;
                            }
                        } else {
                            yf9 yf9Var2 = xv7Var3.a().N0;
                            if (yf9Var2 != null && (ng8VarF1 = yf9Var2.f1()) != null) {
                                placementScope = ng8VarF1.E0;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = wv7.a(xv7Var3.a).getPlacementScope();
                        }
                        ng8 ng8VarF5 = xv7Var3.a().f1();
                        ng8VarF5.getClass();
                        bea.j(placementScope, ng8VarF5, rg8Var.Z);
                        return wefVar;
                }
            }
        };
        this.N0 = xv7Var.p.H0;
        this.P0 = new x16(this) { // from class: pg8
            public final /* synthetic */ rg8 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                ng8 ng8VarF1;
                int i3 = i;
                wef wefVar = wef.a;
                i79 i79Var = null;
                placementScope = null;
                placementScope = null;
                bea placementScope = null;
                rg8 rg8Var = this.b;
                switch (i3) {
                    case 0:
                        xv7 xv7Var2 = rg8Var.f;
                        xv7Var2.h = 0;
                        LayoutNode layoutNode = xv7Var2.a;
                        p89 p89VarL = layoutNode.L();
                        Object[] objArr = p89VarL.a;
                        int i4 = p89VarL.c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            rg8 rg8Var2 = ((LayoutNode) objArr[i5]).getLayoutDelegate().q;
                            rg8Var2.getClass();
                            rg8Var2.v = rg8Var2.w;
                            rg8Var2.w = Integer.MAX_VALUE;
                            if (rg8Var2.x == sv7.b) {
                                rg8Var2.x = sv7.c;
                            }
                        }
                        p89 p89VarL2 = layoutNode.L();
                        Object[] objArr2 = p89VarL2.a;
                        int i6 = p89VarL2.c;
                        for (int i7 = 0; i7 < i6; i7++) {
                            rg8 rg8Var3 = ((LayoutNode) objArr2[i7]).getLayoutDelegate().q;
                            rg8Var3.getClass();
                            rg8Var3.H0.d = false;
                        }
                        b47 b47Var = rg8Var.d().u1;
                        if (b47Var == null) {
                            qc0.p("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            LayoutNode layoutNode2 = children$ui.get(i8);
                            ng8 ng8VarF2 = layoutNode2.getOuterCoordinator$ui().f1();
                            if (ng8VarF2 != null) {
                                if (ng8VarF2.Z) {
                                    if (i79Var == null) {
                                        i79Var = new i79();
                                    }
                                    i79Var.h(layoutNode2);
                                }
                                ng8VarF2.Z = b47Var.Z;
                            }
                        }
                        b47Var.B0().b();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                p89 p89VarL3 = layoutNode.L();
                                Object[] objArr3 = p89VarL3.a;
                                int i10 = p89VarL3.c;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    rg8 rg8Var4 = ((LayoutNode) objArr3[i11]).getLayoutDelegate().q;
                                    rg8Var4.getClass();
                                    int i12 = rg8Var4.v;
                                    int i13 = rg8Var4.w;
                                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                                        rg8Var4.o0(true);
                                    }
                                }
                                p89 p89VarL4 = layoutNode.L();
                                Object[] objArr4 = p89VarL4.a;
                                int i14 = p89VarL4.c;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    rg8 rg8Var5 = ((LayoutNode) objArr4[i15]).getLayoutDelegate().q;
                                    rg8Var5.getClass();
                                    uv7 uv7Var = rg8Var5.H0;
                                    uv7Var.e = uv7Var.d;
                                }
                                return wefVar;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i9);
                            boolean z = i79Var != null && i79Var.c(layoutNode3) >= 0;
                            ng8 ng8VarF3 = layoutNode3.getOuterCoordinator$ui().f1();
                            if (ng8VarF3 != null) {
                                ng8VarF3.Z = z;
                            }
                            i9++;
                        }
                        break;
                    case 1:
                        ng8 ng8VarF4 = rg8Var.f.a().f1();
                        ng8VarF4.getClass();
                        ng8VarF4.v(rg8Var.O0);
                        return wefVar;
                    default:
                        xv7 xv7Var3 = rg8Var.f;
                        if (b21.G(xv7Var3.a) || xv7Var3.c) {
                            yf9 yf9Var = xv7Var3.a().N0;
                            if (yf9Var != null) {
                                placementScope = yf9Var.E0;
                            }
                        } else {
                            yf9 yf9Var2 = xv7Var3.a().N0;
                            if (yf9Var2 != null && (ng8VarF1 = yf9Var2.f1()) != null) {
                                placementScope = ng8VarF1.E0;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = wv7.a(xv7Var3.a).getPlacementScope();
                        }
                        ng8 ng8VarF5 = xv7Var3.a().f1();
                        ng8VarF5.getClass();
                        bea.j(placementScope, ng8VarF5, rg8Var.Z);
                        return wefVar;
                }
            }
        };
        final int i3 = 2;
        this.Q0 = new x16(this) { // from class: pg8
            public final /* synthetic */ rg8 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                ng8 ng8VarF1;
                int i4 = i3;
                wef wefVar = wef.a;
                i79 i79Var = null;
                placementScope = null;
                placementScope = null;
                bea placementScope = null;
                rg8 rg8Var = this.b;
                switch (i4) {
                    case 0:
                        xv7 xv7Var2 = rg8Var.f;
                        xv7Var2.h = 0;
                        LayoutNode layoutNode = xv7Var2.a;
                        p89 p89VarL = layoutNode.L();
                        Object[] objArr = p89VarL.a;
                        int i5 = p89VarL.c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            rg8 rg8Var2 = ((LayoutNode) objArr[i6]).getLayoutDelegate().q;
                            rg8Var2.getClass();
                            rg8Var2.v = rg8Var2.w;
                            rg8Var2.w = Integer.MAX_VALUE;
                            if (rg8Var2.x == sv7.b) {
                                rg8Var2.x = sv7.c;
                            }
                        }
                        p89 p89VarL2 = layoutNode.L();
                        Object[] objArr2 = p89VarL2.a;
                        int i7 = p89VarL2.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            rg8 rg8Var3 = ((LayoutNode) objArr2[i8]).getLayoutDelegate().q;
                            rg8Var3.getClass();
                            rg8Var3.H0.d = false;
                        }
                        b47 b47Var = rg8Var.d().u1;
                        if (b47Var == null) {
                            qc0.p("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            LayoutNode layoutNode2 = children$ui.get(i9);
                            ng8 ng8VarF2 = layoutNode2.getOuterCoordinator$ui().f1();
                            if (ng8VarF2 != null) {
                                if (ng8VarF2.Z) {
                                    if (i79Var == null) {
                                        i79Var = new i79();
                                    }
                                    i79Var.h(layoutNode2);
                                }
                                ng8VarF2.Z = b47Var.Z;
                            }
                        }
                        b47Var.B0().b();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size2) {
                                p89 p89VarL3 = layoutNode.L();
                                Object[] objArr3 = p89VarL3.a;
                                int i11 = p89VarL3.c;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    rg8 rg8Var4 = ((LayoutNode) objArr3[i12]).getLayoutDelegate().q;
                                    rg8Var4.getClass();
                                    int i13 = rg8Var4.v;
                                    int i14 = rg8Var4.w;
                                    if (i13 != i14 && i14 == Integer.MAX_VALUE) {
                                        rg8Var4.o0(true);
                                    }
                                }
                                p89 p89VarL4 = layoutNode.L();
                                Object[] objArr4 = p89VarL4.a;
                                int i15 = p89VarL4.c;
                                for (int i16 = 0; i16 < i15; i16++) {
                                    rg8 rg8Var5 = ((LayoutNode) objArr4[i16]).getLayoutDelegate().q;
                                    rg8Var5.getClass();
                                    uv7 uv7Var = rg8Var5.H0;
                                    uv7Var.e = uv7Var.d;
                                }
                                return wefVar;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i10);
                            boolean z = i79Var != null && i79Var.c(layoutNode3) >= 0;
                            ng8 ng8VarF3 = layoutNode3.getOuterCoordinator$ui().f1();
                            if (ng8VarF3 != null) {
                                ng8VarF3.Z = z;
                            }
                            i10++;
                        }
                        break;
                    case 1:
                        ng8 ng8VarF4 = rg8Var.f.a().f1();
                        ng8VarF4.getClass();
                        ng8VarF4.v(rg8Var.O0);
                        return wefVar;
                    default:
                        xv7 xv7Var3 = rg8Var.f;
                        if (b21.G(xv7Var3.a) || xv7Var3.c) {
                            yf9 yf9Var = xv7Var3.a().N0;
                            if (yf9Var != null) {
                                placementScope = yf9Var.E0;
                            }
                        } else {
                            yf9 yf9Var2 = xv7Var3.a().N0;
                            if (yf9Var2 != null && (ng8VarF1 = yf9Var2.f1()) != null) {
                                placementScope = ng8VarF1.E0;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = wv7.a(xv7Var3.a).getPlacementScope();
                        }
                        ng8 ng8VarF5 = xv7Var3.a().f1();
                        ng8VarF5.getClass();
                        bea.j(placementScope, ng8VarF5, rg8Var.Z);
                        return wefVar;
                }
            }
        };
    }

    public final boolean A0(long j) throws Throwable {
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNode2 = xv7Var.a;
        try {
            if (layoutNode.f1) {
                i37.a("measure is called on a deactivated node");
            }
            LayoutNode layoutNodeF = layoutNode2.F();
            layoutNode2.U0 = layoutNode2.U0 || (layoutNodeF != null && layoutNodeF.U0);
            if (!layoutNode2.x()) {
                kl2 kl2Var = this.Y;
                if (kl2Var == null ? false : kl2.b(kl2Var.a, j)) {
                    Owner owner = layoutNode2.Z;
                    if (owner != null) {
                        ((AndroidComposeView) owner).g(layoutNode2, true);
                    }
                    layoutNode2.w0();
                    return false;
                }
            }
            this.Y = new kl2(j);
            i0(j);
            this.H0.f = false;
            p89 p89VarL = layoutNode2.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                rg8 rg8Var = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
                rg8Var.getClass();
                rg8Var.H0.c = false;
            }
            long j2 = this.X ? this.c : -9223372034707292160L;
            this.X = true;
            ng8 ng8VarF1 = xv7Var.a().f1();
            if (ng8VarF1 == null) {
                i37.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            xv7Var.c(j);
            f0((((long) ng8VarF1.a) << 32) | (((long) ng8VarF1.b) & 4294967295L));
            return (((int) (j2 >> 32)) == ng8VarF1.a && ((int) (j2 & 4294967295L)) == ng8VarF1.b) ? false : true;
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }

    @Override // defpackage.dj
    public final void D(c1 c1Var) {
        p89 p89VarL = this.f.a.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            rg8 rg8Var = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
            rg8Var.getClass();
            c1Var.d(rg8Var);
        }
    }

    @Override // defpackage.cea, defpackage.tn8
    public final Object E() {
        return this.N0;
    }

    @Override // defpackage.r39
    public final void H(boolean z) {
        ng8 ng8VarF1;
        xv7 xv7Var = this.f;
        ng8 ng8VarF2 = xv7Var.a().f1();
        if (Boolean.valueOf(z).equals(ng8VarF2 != null ? Boolean.valueOf(ng8VarF2.z) : null) || (ng8VarF1 = xv7Var.a().f1()) == null) {
            return;
        }
        ng8VarF1.z = z;
    }

    @Override // defpackage.dj
    public final void J() {
        this.K0 = true;
        uv7 uv7Var = this.H0;
        uv7Var.h();
        xv7 xv7Var = this.f;
        boolean z = xv7Var.f;
        LayoutNode layoutNode = xv7Var.a;
        if (z) {
            p89 p89VarL = layoutNode.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                if (layoutNode2.x() && layoutNode2.C() == sv7.a) {
                    rg8 rg8Var = layoutNode2.getLayoutDelegate().q;
                    rg8Var.getClass();
                    rg8 rg8Var2 = layoutNode2.getLayoutDelegate().q;
                    kl2 kl2Var = rg8Var2 != null ? rg8Var2.Y : null;
                    kl2Var.getClass();
                    if (rg8Var.A0(kl2Var.a)) {
                        LayoutNode.s0(layoutNode, false, 7);
                    }
                }
            }
        }
        b47 b47Var = d().u1;
        b47Var.getClass();
        if (xv7Var.g || (!this.y && !b47Var.Z && xv7Var.f)) {
            xv7Var.f = false;
            qv7 qv7Var = xv7Var.d;
            xv7Var.d = qv7.d;
            xv7Var.i(false);
            gw9 snapshotObserver = wv7.a(layoutNode).getSnapshotObserver();
            snapshotObserver.a.d(layoutNode, snapshotObserver.h, this.L0);
            xv7Var.d = qv7Var;
            if (xv7Var.m && b47Var.Z) {
                requestLayout();
            }
            xv7Var.g = false;
        }
        if (uv7Var.d) {
            uv7Var.e = true;
        }
        if (uv7Var.b && uv7Var.e()) {
            uv7Var.g();
        }
        this.K0 = false;
    }

    @Override // defpackage.dj
    public final void U() {
        LayoutNode.s0(this.f.a, false, 7);
    }

    @Override // defpackage.tn8
    public final int V(int i) {
        s0();
        ng8 ng8VarF1 = this.f.a().f1();
        ng8VarF1.getClass();
        return ng8VarF1.V(i);
    }

    @Override // defpackage.cea
    public final int W(zi ziVar) {
        xv7 xv7Var = this.f;
        LayoutNode layoutNodeF = xv7Var.a.F();
        qv7 qv7VarU = layoutNodeF != null ? layoutNodeF.u() : null;
        qv7 qv7Var = qv7.b;
        uv7 uv7Var = this.H0;
        if (qv7VarU == qv7Var) {
            uv7Var.c = true;
        } else {
            LayoutNode layoutNodeF2 = xv7Var.a.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.u() : null) == qv7.d) {
                uv7Var.d = true;
            }
        }
        this.y = true;
        ng8 ng8VarF1 = xv7Var.a().f1();
        ng8VarF1.getClass();
        int iW = ng8VarF1.W(ziVar);
        this.y = false;
        return iW;
    }

    @Override // defpackage.cea
    public final int X() {
        ng8 ng8VarF1 = this.f.a().f1();
        ng8VarF1.getClass();
        return ng8VarF1.X();
    }

    @Override // defpackage.cea
    public final int Y() {
        ng8 ng8VarF1 = this.f.a().f1();
        ng8VarF1.getClass();
        return ng8VarF1.Y();
    }

    @Override // defpackage.dj
    public final uv7 a() {
        return this.H0;
    }

    @Override // defpackage.tn8
    public final int b(int i) {
        s0();
        ng8 ng8VarF1 = this.f.a().f1();
        ng8VarF1.getClass();
        return ng8VarF1.b(i);
    }

    @Override // defpackage.cea
    public final void b0(long j, float f, a26 a26Var) throws Throwable {
        u0(j, a26Var, null);
    }

    @Override // defpackage.dj
    public final c47 d() {
        return (c47) this.f.a.V0.d;
    }

    @Override // defpackage.cea
    public final void e0(long j, float f, ke6 ke6Var) throws Throwable {
        u0(j, null, ke6Var);
    }

    @Override // defpackage.dj
    public final dj g() {
        xv7 layoutDelegate;
        LayoutNode layoutNodeF = this.f.a.F();
        if (layoutNodeF == null || (layoutDelegate = layoutNodeF.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.q;
    }

    public final boolean l0() {
        xv7 xv7Var = this.f;
        return b21.G(xv7Var.a) || xv7Var.c;
    }

    @Override // defpackage.tn8
    public final int n(int i) {
        s0();
        ng8 ng8VarF1 = this.f.a().f1();
        ng8VarF1.getClass();
        return ng8VarF1.n(i);
    }

    public final void o0(boolean z) {
        if (z && l0()) {
            return;
        }
        if (z || l0()) {
            this.G0 = qg8.c;
            p89 p89VarL = this.f.a.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                rg8 rg8Var = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
                rg8Var.getClass();
                rg8Var.o0(true);
            }
        }
    }

    @Override // defpackage.dj
    public final int p() {
        return this.w;
    }

    @Override // defpackage.tn8
    public final int q(int i) {
        s0();
        ng8 ng8VarF1 = this.f.a().f1();
        ng8VarF1.getClass();
        return ng8VarF1.q(i);
    }

    public final void q0() {
        qg8 qg8Var = this.G0;
        xv7 xv7Var = this.f;
        boolean z = xv7Var.c;
        LayoutNode layoutNode = xv7Var.a;
        qg8 qg8Var2 = qg8.a;
        if (z) {
            this.G0 = qg8.b;
        } else {
            this.G0 = qg8Var2;
        }
        if (qg8Var != qg8Var2 && xv7Var.e) {
            LayoutNode.s0(layoutNode, true, 6);
        }
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            rg8 rg8VarY = layoutNode2.y();
            if (rg8VarY == null) {
                qc0.j("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (rg8VarY.w != Integer.MAX_VALUE) {
                rg8VarY.q0();
                LayoutNode.v0(layoutNode2);
            }
        }
    }

    public final void r0() {
        xv7 xv7Var = this.f;
        if (xv7Var.o > 0) {
            p89 p89VarL = xv7Var.a.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                xv7 layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.m || layoutDelegate.n) && !layoutDelegate.f) {
                    layoutNode.r0(false);
                }
                rg8 rg8Var = layoutDelegate.q;
                if (rg8Var != null) {
                    rg8Var.r0();
                }
            }
        }
    }

    @Override // defpackage.dj
    public final void requestLayout() {
        this.f.a.r0(false);
    }

    public final void s0() {
        sv7 sv7Var;
        xv7 xv7Var = this.f;
        LayoutNode.s0(xv7Var.a, false, 7);
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNodeF = layoutNode.F();
        if (layoutNodeF == null || layoutNode.S0 != sv7.c) {
            return;
        }
        int iOrdinal = layoutNodeF.u().ordinal();
        if (iOrdinal != 0) {
            sv7Var = iOrdinal != 2 ? layoutNodeF.S0 : sv7.b;
        } else {
            sv7Var = sv7.a;
        }
        layoutNode.S0 = sv7Var;
    }

    public final void t0() {
        this.R0 = true;
        xv7 xv7Var = this.f;
        LayoutNode layoutNodeF = xv7Var.a.F();
        qg8 qg8Var = this.G0;
        if ((qg8Var != qg8.a && !xv7Var.c) || (qg8Var != qg8.b && xv7Var.c)) {
            q0();
            if (this.g && layoutNodeF != null) {
                layoutNodeF.r0(false);
            }
        }
        if (layoutNodeF == null) {
            this.w = 0;
        } else if (!this.g && (layoutNodeF.u() == qv7.c || layoutNodeF.u() == qv7.d)) {
            if (this.w != Integer.MAX_VALUE) {
                i37.c("Place was called on a node which was placed already");
            }
            this.w = layoutNodeF.getLayoutDelegate().h;
            layoutNodeF.getLayoutDelegate().h++;
        }
        J();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0007, B:5:0x000d, B:9:0x0016, B:11:0x001b, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0082, B:31:0x006e), top: B:36:0x0007 }] */
    public final void u0(long j, a26 a26Var, ke6 ke6Var) throws Throwable {
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNode2 = xv7Var.a;
        try {
            LayoutNode layoutNodeF = layoutNode.F();
            qv7 qv7VarU = layoutNodeF != null ? layoutNodeF.u() : null;
            qv7 qv7Var = qv7.d;
            if (qv7VarU == qv7Var) {
                xv7Var.c = false;
            }
            if (layoutNode2.f1) {
                i37.a("place is called on a deactivated node");
            }
            xv7Var.d = qv7Var;
            boolean z = true;
            this.z = true;
            this.R0 = false;
            if (!w67.b(j, this.Z)) {
                if (xv7Var.n || xv7Var.m) {
                    xv7Var.f = true;
                }
                r0();
            }
            Owner ownerA = wv7.a(layoutNode2);
            this.Z = j;
            if (xv7Var.f) {
                xv7Var.h(false);
                this.H0.g = false;
                gw9 snapshotObserver = ownerA.getSnapshotObserver();
                snapshotObserver.a.d(layoutNode2, snapshotObserver.g, this.Q0);
            } else {
                if (this.G0 == qg8.c) {
                    z = false;
                }
                if (z) {
                    ng8 ng8VarF1 = xv7Var.a().f1();
                    ng8VarF1.getClass();
                    ng8VarF1.Y0(w67.d(j, ng8VarF1.e));
                    t0();
                } else {
                    xv7Var.h(false);
                    this.H0.g = false;
                    gw9 snapshotObserver2 = ownerA.getSnapshotObserver();
                    snapshotObserver2.a.d(layoutNode2, snapshotObserver2.g, this.Q0);
                }
            }
            this.E0 = a26Var;
            this.F0 = ke6Var;
            xv7Var.d = qv7.e;
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.tn8
    public final cea v(long j) {
        sv7 sv7Var;
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNode2 = xv7Var.a;
        LayoutNode layoutNodeF = layoutNode.F();
        if ((layoutNodeF != null ? layoutNodeF.u() : null) == qv7.b) {
            xv7Var.b = false;
        } else {
            LayoutNode layoutNodeF2 = layoutNode2.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.u() : null) == qv7.d) {
                xv7Var.b = false;
            }
        }
        LayoutNode layoutNodeF3 = layoutNode2.F();
        sv7 sv7Var2 = sv7.c;
        if (layoutNodeF3 != null) {
            if (this.x != sv7Var2 && !layoutNode2.U0) {
                i37.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = layoutNodeF3.u().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                sv7Var = sv7.a;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    s8f.h(layoutNodeF3.u(), "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                sv7Var = sv7.b;
            }
            this.x = sv7Var;
        } else {
            this.x = sv7Var2;
        }
        if (layoutNode2.S0 == sv7Var2) {
            layoutNode2.f();
        }
        A0(j);
        return this;
    }
}
