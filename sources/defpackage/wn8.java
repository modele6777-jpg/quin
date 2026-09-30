package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wn8 extends cea implements tn8, dj, r39 {
    public ke6 E0;
    public float F0;
    public Object H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean Q0;
    public final vn8 S0;
    public final vn8 T0;
    public float U0;
    public boolean V0;
    public a26 W0;
    public boolean X;
    public ke6 X0;
    public a26 Z;
    public float Z0;
    public final vn8 a1;
    public boolean b1;
    public final xv7 f;
    public boolean g;
    public boolean x;
    public boolean y;
    public int v = Integer.MAX_VALUE;
    public int w = Integer.MAX_VALUE;
    public sv7 z = sv7.c;
    public long Y = 0;
    public boolean G0 = true;
    public final uv7 N0 = new uv7(this, 0);
    public final p89 O0 = new p89(0, new wn8[16]);
    public boolean P0 = true;
    public long R0 = ll2.b(0, 0, 0, 0, 15);
    public long Y0 = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [vn8] */
    /* JADX WARN: Type inference failed for: r2v4, types: [vn8] */
    /* JADX WARN: Type inference failed for: r7v4, types: [vn8] */
    public wn8(xv7 xv7Var) {
        this.f = xv7Var;
        final int i = 1;
        final int i2 = 0;
        this.S0 = new x16(this) { // from class: vn8
            public final /* synthetic */ wn8 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                wef wefVar = wef.a;
                wn8 wn8Var = this.b;
                switch (i3) {
                    case 0:
                        wn8Var.f.a().v(wn8Var.R0);
                        break;
                    case 1:
                        xv7 xv7Var2 = wn8Var.f;
                        xv7Var2.i = 0;
                        LayoutNode layoutNode = xv7Var2.a;
                        p89 p89VarL = layoutNode.L();
                        Object[] objArr = p89VarL.a;
                        int i4 = p89VarL.c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            wn8 wn8VarZ = ((LayoutNode) objArr[i5]).z();
                            wn8VarZ.v = wn8VarZ.w;
                            wn8VarZ.w = Integer.MAX_VALUE;
                            wn8VarZ.J0 = false;
                            if (wn8VarZ.z == sv7.b) {
                                wn8VarZ.z = sv7.c;
                            }
                        }
                        p89 p89VarL2 = layoutNode.L();
                        Object[] objArr2 = p89VarL2.a;
                        int i6 = p89VarL2.c;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((LayoutNode) objArr2[i7]).getLayoutDelegate().p.N0.d = false;
                        }
                        if (wn8Var.d().Z) {
                            List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                            int size = children$ui.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                children$ui.get(i8).getOuterCoordinator$ui().Z = true;
                            }
                        }
                        wn8Var.d().B0().b();
                        if (wn8Var.d().Z) {
                            List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                children$ui2.get(i9).getOuterCoordinator$ui().Z = false;
                            }
                        }
                        p89 p89VarL3 = layoutNode.L();
                        Object[] objArr3 = p89VarL3.a;
                        int i10 = p89VarL3.c;
                        for (int i11 = 0; i11 < i10; i11++) {
                            LayoutNode layoutNode2 = (LayoutNode) objArr3[i11];
                            if (layoutNode2.z().v != layoutNode2.G()) {
                                layoutNode.k0();
                                layoutNode.P();
                                if (layoutNode2.G() == Integer.MAX_VALUE) {
                                    if (layoutNode2.getLayoutDelegate().c || b21.G(layoutNode2)) {
                                        rg8 rg8VarY = layoutNode2.y();
                                        rg8VarY.getClass();
                                        rg8VarY.o0(false);
                                    }
                                    layoutNode2.z().q0();
                                }
                            }
                        }
                        p89 p89VarL4 = layoutNode.L();
                        Object[] objArr4 = p89VarL4.a;
                        int i12 = p89VarL4.c;
                        for (int i13 = 0; i13 < i12; i13++) {
                            uv7 uv7Var = ((LayoutNode) objArr4[i13]).getLayoutDelegate().p.N0;
                            uv7Var.e = uv7Var.d;
                        }
                        break;
                    default:
                        xv7 xv7Var3 = wn8Var.f;
                        yf9 yf9Var = xv7Var3.a().N0;
                        bea placementScope = yf9Var != null ? yf9Var.E0 : wv7.a(xv7Var3.a).getPlacementScope();
                        a26 a26Var = wn8Var.W0;
                        ke6 ke6Var = wn8Var.X0;
                        if (ke6Var != null) {
                            yf9 yf9VarA = xv7Var3.a();
                            long j = wn8Var.Y0;
                            float f = wn8Var.Z0;
                            placementScope.e(yf9VarA);
                            yf9VarA.e0(w67.d(j, yf9VarA.e), f, ke6Var);
                        } else if (a26Var == null) {
                            yf9 yf9VarA2 = xv7Var3.a();
                            long j2 = wn8Var.Y0;
                            float f2 = wn8Var.Z0;
                            placementScope.e(yf9VarA2);
                            yf9VarA2.b0(w67.d(j2, yf9VarA2.e), f2, null);
                        } else {
                            yf9 yf9VarA3 = xv7Var3.a();
                            long j3 = wn8Var.Y0;
                            float f3 = wn8Var.Z0;
                            placementScope.e(yf9VarA3);
                            yf9VarA3.b0(w67.d(j3, yf9VarA3.e), f3, a26Var);
                        }
                        break;
                }
                return wefVar;
            }
        };
        this.T0 = new x16(this) { // from class: vn8
            public final /* synthetic */ wn8 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i;
                wef wefVar = wef.a;
                wn8 wn8Var = this.b;
                switch (i3) {
                    case 0:
                        wn8Var.f.a().v(wn8Var.R0);
                        break;
                    case 1:
                        xv7 xv7Var2 = wn8Var.f;
                        xv7Var2.i = 0;
                        LayoutNode layoutNode = xv7Var2.a;
                        p89 p89VarL = layoutNode.L();
                        Object[] objArr = p89VarL.a;
                        int i4 = p89VarL.c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            wn8 wn8VarZ = ((LayoutNode) objArr[i5]).z();
                            wn8VarZ.v = wn8VarZ.w;
                            wn8VarZ.w = Integer.MAX_VALUE;
                            wn8VarZ.J0 = false;
                            if (wn8VarZ.z == sv7.b) {
                                wn8VarZ.z = sv7.c;
                            }
                        }
                        p89 p89VarL2 = layoutNode.L();
                        Object[] objArr2 = p89VarL2.a;
                        int i6 = p89VarL2.c;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((LayoutNode) objArr2[i7]).getLayoutDelegate().p.N0.d = false;
                        }
                        if (wn8Var.d().Z) {
                            List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                            int size = children$ui.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                children$ui.get(i8).getOuterCoordinator$ui().Z = true;
                            }
                        }
                        wn8Var.d().B0().b();
                        if (wn8Var.d().Z) {
                            List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                children$ui2.get(i9).getOuterCoordinator$ui().Z = false;
                            }
                        }
                        p89 p89VarL3 = layoutNode.L();
                        Object[] objArr3 = p89VarL3.a;
                        int i10 = p89VarL3.c;
                        for (int i11 = 0; i11 < i10; i11++) {
                            LayoutNode layoutNode2 = (LayoutNode) objArr3[i11];
                            if (layoutNode2.z().v != layoutNode2.G()) {
                                layoutNode.k0();
                                layoutNode.P();
                                if (layoutNode2.G() == Integer.MAX_VALUE) {
                                    if (layoutNode2.getLayoutDelegate().c || b21.G(layoutNode2)) {
                                        rg8 rg8VarY = layoutNode2.y();
                                        rg8VarY.getClass();
                                        rg8VarY.o0(false);
                                    }
                                    layoutNode2.z().q0();
                                }
                            }
                        }
                        p89 p89VarL4 = layoutNode.L();
                        Object[] objArr4 = p89VarL4.a;
                        int i12 = p89VarL4.c;
                        for (int i13 = 0; i13 < i12; i13++) {
                            uv7 uv7Var = ((LayoutNode) objArr4[i13]).getLayoutDelegate().p.N0;
                            uv7Var.e = uv7Var.d;
                        }
                        break;
                    default:
                        xv7 xv7Var3 = wn8Var.f;
                        yf9 yf9Var = xv7Var3.a().N0;
                        bea placementScope = yf9Var != null ? yf9Var.E0 : wv7.a(xv7Var3.a).getPlacementScope();
                        a26 a26Var = wn8Var.W0;
                        ke6 ke6Var = wn8Var.X0;
                        if (ke6Var != null) {
                            yf9 yf9VarA = xv7Var3.a();
                            long j = wn8Var.Y0;
                            float f = wn8Var.Z0;
                            placementScope.e(yf9VarA);
                            yf9VarA.e0(w67.d(j, yf9VarA.e), f, ke6Var);
                        } else if (a26Var == null) {
                            yf9 yf9VarA2 = xv7Var3.a();
                            long j2 = wn8Var.Y0;
                            float f2 = wn8Var.Z0;
                            placementScope.e(yf9VarA2);
                            yf9VarA2.b0(w67.d(j2, yf9VarA2.e), f2, null);
                        } else {
                            yf9 yf9VarA3 = xv7Var3.a();
                            long j3 = wn8Var.Y0;
                            float f3 = wn8Var.Z0;
                            placementScope.e(yf9VarA3);
                            yf9VarA3.b0(w67.d(j3, yf9VarA3.e), f3, a26Var);
                        }
                        break;
                }
                return wefVar;
            }
        };
        final int i3 = 2;
        this.a1 = new x16(this) { // from class: vn8
            public final /* synthetic */ wn8 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                wef wefVar = wef.a;
                wn8 wn8Var = this.b;
                switch (i4) {
                    case 0:
                        wn8Var.f.a().v(wn8Var.R0);
                        break;
                    case 1:
                        xv7 xv7Var2 = wn8Var.f;
                        xv7Var2.i = 0;
                        LayoutNode layoutNode = xv7Var2.a;
                        p89 p89VarL = layoutNode.L();
                        Object[] objArr = p89VarL.a;
                        int i5 = p89VarL.c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            wn8 wn8VarZ = ((LayoutNode) objArr[i6]).z();
                            wn8VarZ.v = wn8VarZ.w;
                            wn8VarZ.w = Integer.MAX_VALUE;
                            wn8VarZ.J0 = false;
                            if (wn8VarZ.z == sv7.b) {
                                wn8VarZ.z = sv7.c;
                            }
                        }
                        p89 p89VarL2 = layoutNode.L();
                        Object[] objArr2 = p89VarL2.a;
                        int i7 = p89VarL2.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            ((LayoutNode) objArr2[i8]).getLayoutDelegate().p.N0.d = false;
                        }
                        if (wn8Var.d().Z) {
                            List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                            int size = children$ui.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                children$ui.get(i9).getOuterCoordinator$ui().Z = true;
                            }
                        }
                        wn8Var.d().B0().b();
                        if (wn8Var.d().Z) {
                            List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                children$ui2.get(i10).getOuterCoordinator$ui().Z = false;
                            }
                        }
                        p89 p89VarL3 = layoutNode.L();
                        Object[] objArr3 = p89VarL3.a;
                        int i11 = p89VarL3.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            LayoutNode layoutNode2 = (LayoutNode) objArr3[i12];
                            if (layoutNode2.z().v != layoutNode2.G()) {
                                layoutNode.k0();
                                layoutNode.P();
                                if (layoutNode2.G() == Integer.MAX_VALUE) {
                                    if (layoutNode2.getLayoutDelegate().c || b21.G(layoutNode2)) {
                                        rg8 rg8VarY = layoutNode2.y();
                                        rg8VarY.getClass();
                                        rg8VarY.o0(false);
                                    }
                                    layoutNode2.z().q0();
                                }
                            }
                        }
                        p89 p89VarL4 = layoutNode.L();
                        Object[] objArr4 = p89VarL4.a;
                        int i13 = p89VarL4.c;
                        for (int i14 = 0; i14 < i13; i14++) {
                            uv7 uv7Var = ((LayoutNode) objArr4[i14]).getLayoutDelegate().p.N0;
                            uv7Var.e = uv7Var.d;
                        }
                        break;
                    default:
                        xv7 xv7Var3 = wn8Var.f;
                        yf9 yf9Var = xv7Var3.a().N0;
                        bea placementScope = yf9Var != null ? yf9Var.E0 : wv7.a(xv7Var3.a).getPlacementScope();
                        a26 a26Var = wn8Var.W0;
                        ke6 ke6Var = wn8Var.X0;
                        if (ke6Var != null) {
                            yf9 yf9VarA = xv7Var3.a();
                            long j = wn8Var.Y0;
                            float f = wn8Var.Z0;
                            placementScope.e(yf9VarA);
                            yf9VarA.e0(w67.d(j, yf9VarA.e), f, ke6Var);
                        } else if (a26Var == null) {
                            yf9 yf9VarA2 = xv7Var3.a();
                            long j2 = wn8Var.Y0;
                            float f2 = wn8Var.Z0;
                            placementScope.e(yf9VarA2);
                            yf9VarA2.b0(w67.d(j2, yf9VarA2.e), f2, null);
                        } else {
                            yf9 yf9VarA3 = xv7Var3.a();
                            long j3 = wn8Var.Y0;
                            float f3 = wn8Var.Z0;
                            placementScope.e(yf9VarA3);
                            yf9VarA3.b0(w67.d(j3, yf9VarA3.e), f3, a26Var);
                        }
                        break;
                }
                return wefVar;
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
            Owner ownerA = wv7.a(layoutNode2);
            LayoutNode layoutNodeF = layoutNode2.F();
            boolean z = true;
            layoutNode2.U0 = layoutNode2.U0 || (layoutNodeF != null && layoutNodeF.U0);
            if (!layoutNode2.A() && kl2.b(this.d, j)) {
                ((AndroidComposeView) ownerA).g(layoutNode2, false);
                layoutNode2.w0();
                return false;
            }
            this.N0.f = false;
            p89 p89VarL = layoutNode2.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).getLayoutDelegate().p.N0.c = false;
            }
            this.x = true;
            long j2 = xv7Var.a().c;
            i0(j);
            qv7 qv7Var = xv7Var.d;
            qv7 qv7Var2 = qv7.e;
            if (qv7Var != qv7Var2) {
                i37.c("layout state is not idle before measure starts");
            }
            this.R0 = j;
            qv7 qv7Var3 = qv7.a;
            xv7Var.d = qv7Var3;
            this.K0 = false;
            gw9 snapshotObserver = wv7.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.d(layoutNode2, snapshotObserver.c, this.S0);
            if (xv7Var.d == qv7Var3) {
                this.L0 = true;
                this.M0 = true;
                xv7Var.d = qv7Var2;
            }
            if (e77.b(xv7Var.a().c, j2) && xv7Var.a().a == this.a && xv7Var.a().b == this.b) {
                z = false;
            }
            f0((((long) xv7Var.a().b) & 4294967295L) | (((long) xv7Var.a().a) << 32));
            return z;
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }

    public final void B0() {
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNode2 = xv7Var.a;
        if (!layoutNode.X() || xv7Var.l <= 0) {
            return;
        }
        xv7 layoutDelegate = layoutNode2.getLayoutDelegate();
        if ((layoutDelegate.j || layoutDelegate.k) && !layoutDelegate.p.L0) {
            layoutNode2.t0(false);
        }
        p89 p89VarL = layoutNode2.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).z().B0();
        }
    }

    @Override // defpackage.dj
    public final void D(c1 c1Var) {
        p89 p89VarL = this.f.a.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            c1Var.d(((LayoutNode) objArr[i2]).getLayoutDelegate().p);
        }
    }

    @Override // defpackage.cea, defpackage.tn8
    public final Object E() {
        return this.H0;
    }

    @Override // defpackage.r39
    public final void H(boolean z) {
        xv7 xv7Var = this.f;
        if (z != xv7Var.a().z) {
            xv7Var.a().z = z;
            this.b1 = true;
        }
    }

    @Override // defpackage.dj
    public final void J() {
        this.Q0 = true;
        uv7 uv7Var = this.N0;
        uv7Var.h();
        boolean z = this.L0;
        xv7 xv7Var = this.f;
        if (z) {
            p89 p89VarL = xv7Var.a.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.A() && layoutNode.B() == sv7.a && LayoutNode.n0(layoutNode)) {
                    LayoutNode.u0(xv7Var.a, false, 7);
                }
            }
        }
        if (this.M0 || (!this.X && !d().Z && this.L0)) {
            this.L0 = false;
            qv7 qv7Var = xv7Var.d;
            xv7Var.d = qv7.c;
            xv7Var.g(false);
            LayoutNode layoutNode2 = xv7Var.a;
            gw9 snapshotObserver = wv7.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.d(layoutNode2, snapshotObserver.e, this.T0);
            xv7Var.d = qv7Var;
            this.M0 = false;
        }
        if (uv7Var.d) {
            uv7Var.e = true;
        }
        if (uv7Var.b && uv7Var.e()) {
            uv7Var.g();
        }
        this.Q0 = false;
    }

    @Override // defpackage.dj
    public final void U() {
        LayoutNode.u0(this.f.a, false, 7);
    }

    @Override // defpackage.tn8
    public final int V(int i) {
        xv7 xv7Var = this.f;
        if (!b21.G(xv7Var.a)) {
            r0();
            return xv7Var.a().V(i);
        }
        rg8 rg8Var = xv7Var.q;
        rg8Var.getClass();
        return rg8Var.V(i);
    }

    @Override // defpackage.cea
    public final int W(zi ziVar) {
        xv7 xv7Var = this.f;
        LayoutNode layoutNodeF = xv7Var.a.F();
        qv7 qv7VarU = layoutNodeF != null ? layoutNodeF.u() : null;
        qv7 qv7Var = qv7.a;
        uv7 uv7Var = this.N0;
        if (qv7VarU == qv7Var) {
            uv7Var.c = true;
        } else {
            LayoutNode layoutNodeF2 = xv7Var.a.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.u() : null) == qv7.c) {
                uv7Var.d = true;
            }
        }
        this.X = true;
        int iW = xv7Var.a().W(ziVar);
        this.X = false;
        return iW;
    }

    @Override // defpackage.cea
    public final int X() {
        return this.f.a().X();
    }

    @Override // defpackage.cea
    public final int Y() {
        return this.f.a().Y();
    }

    @Override // defpackage.dj
    public final uv7 a() {
        return this.N0;
    }

    @Override // defpackage.tn8
    public final int b(int i) {
        xv7 xv7Var = this.f;
        if (!b21.G(xv7Var.a)) {
            r0();
            return xv7Var.a().b(i);
        }
        rg8 rg8Var = xv7Var.q;
        rg8Var.getClass();
        return rg8Var.b(i);
    }

    @Override // defpackage.cea
    public final void b0(long j, float f, a26 a26Var) throws Throwable {
        u0(j, f, a26Var, null);
    }

    @Override // defpackage.dj
    public final c47 d() {
        return (c47) this.f.a.V0.d;
    }

    @Override // defpackage.cea
    public final void e0(long j, float f, ke6 ke6Var) throws Throwable {
        u0(j, f, null, ke6Var);
    }

    @Override // defpackage.dj
    public final dj g() {
        xv7 layoutDelegate;
        LayoutNode layoutNodeF = this.f.a.F();
        if (layoutNodeF == null || (layoutDelegate = layoutNodeF.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.p;
    }

    public final List l0() {
        xv7 xv7Var = this.f;
        xv7Var.a.E0();
        boolean z = this.P0;
        p89 p89Var = this.O0;
        if (!z) {
            return p89Var.f();
        }
        LayoutNode layoutNode = xv7Var.a;
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (p89Var.c <= i2) {
                p89Var.b(layoutNode2.getLayoutDelegate().p);
            } else {
                wn8 wn8Var = layoutNode2.getLayoutDelegate().p;
                Object[] objArr2 = p89Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = wn8Var;
            }
        }
        p89Var.l(layoutNode.getChildren$ui().size(), p89Var.c);
        this.P0 = false;
        return p89Var.f();
    }

    @Override // defpackage.tn8
    public final int n(int i) {
        xv7 xv7Var = this.f;
        if (!b21.G(xv7Var.a)) {
            r0();
            return xv7Var.a().n(i);
        }
        rg8 rg8Var = xv7Var.q;
        rg8Var.getClass();
        return rg8Var.n(i);
    }

    public final void o0() {
        boolean z = this.I0;
        this.I0 = true;
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        wo0 wo0Var = layoutNode.V0;
        if (!z) {
            ((c47) wo0Var.d).t1();
            wv7.a(layoutNode).getRectManager().g(xv7Var.a);
            if (layoutNode.A()) {
                LayoutNode.u0(layoutNode, true, 6);
            } else if (layoutNode.x()) {
                LayoutNode.s0(layoutNode, true, 6);
            }
        }
        yf9 yf9Var = ((c47) wo0Var.d).M0;
        for (yf9 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); !pa7.t(outerCoordinator$ui, yf9Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.M0) {
            if (outerCoordinator$ui.j1) {
                outerCoordinator$ui.p1();
            }
        }
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.G() != Integer.MAX_VALUE) {
                layoutNode2.z().o0();
                LayoutNode.v0(layoutNode2);
            }
        }
    }

    @Override // defpackage.dj
    public final int p() {
        return this.w;
    }

    @Override // defpackage.tn8
    public final int q(int i) {
        xv7 xv7Var = this.f;
        if (!b21.G(xv7Var.a)) {
            r0();
            return xv7Var.a().q(i);
        }
        rg8 rg8Var = xv7Var.q;
        rg8Var.getClass();
        return rg8Var.q(i);
    }

    public final void q0() {
        if (this.I0) {
            this.I0 = false;
            xv7 xv7Var = this.f;
            LayoutNode layoutNode = xv7Var.a;
            LayoutNode layoutNode2 = xv7Var.a;
            wv7.a(layoutNode).getRectManager().h(layoutNode2);
            yf9 yf9Var = ((c47) layoutNode2.V0.d).M0;
            for (yf9 outerCoordinator$ui = layoutNode2.getOuterCoordinator$ui(); !pa7.t(outerCoordinator$ui, yf9Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.M0) {
                outerCoordinator$ui.v1();
                outerCoordinator$ui.A1();
            }
            p89 p89VarL = layoutNode2.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).z().q0();
            }
        }
    }

    public final void r0() {
        sv7 sv7Var;
        xv7 xv7Var = this.f;
        LayoutNode.u0(xv7Var.a, false, 7);
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

    @Override // defpackage.dj
    public final void requestLayout() {
        this.f.a.t0(false);
    }

    public final void s0() {
        this.V0 = true;
        xv7 xv7Var = this.f;
        LayoutNode layoutNodeF = xv7Var.a.F();
        float f = d().X0;
        LayoutNode layoutNode = xv7Var.a;
        yf9 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        c47 c47Var = (c47) layoutNode.V0.d;
        while (outerCoordinator$ui != c47Var) {
            outerCoordinator$ui.getClass();
            nv7 nv7Var = (nv7) outerCoordinator$ui;
            f += nv7Var.X0;
            outerCoordinator$ui = nv7Var.M0;
        }
        if (f != this.U0) {
            this.U0 = f;
            if (layoutNodeF != null) {
                layoutNodeF.k0();
            }
            if (layoutNodeF != null) {
                layoutNodeF.P();
            }
        }
        if (!d().Z) {
            boolean z = this.I0;
            if (!z || this.N0.d()) {
                o0();
            }
            if (z) {
                ((c47) layoutNode.V0.d).t1();
            } else {
                if (layoutNodeF != null) {
                    layoutNodeF.P();
                }
                if (this.g && layoutNodeF != null) {
                    layoutNodeF.t0(false);
                }
            }
        }
        if (layoutNodeF == null) {
            this.w = 0;
        } else if (!this.g && layoutNodeF.u() == qv7.c) {
            if (this.w != Integer.MAX_VALUE) {
                i37.c("Place was called on a node which was placed already");
            }
            this.w = layoutNodeF.getLayoutDelegate().i;
            layoutNodeF.getLayoutDelegate().i++;
        }
        J();
    }

    public final void t0(long j, float f, a26 a26Var, ke6 ke6Var) {
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNode2 = xv7Var.a;
        if (layoutNode.f1) {
            i37.a("place is called on a deactivated node");
        }
        xv7Var.d = qv7.c;
        this.Y = j;
        this.F0 = f;
        this.Z = a26Var;
        this.E0 = ke6Var;
        this.V0 = false;
        Owner ownerA = wv7.a(layoutNode2);
        if (this.L0 || !this.I0) {
            this.N0.g = false;
            xv7Var.f(false);
            this.W0 = a26Var;
            this.Y0 = j;
            this.Z0 = f;
            this.X0 = ke6Var;
            gw9 snapshotObserver = ownerA.getSnapshotObserver();
            snapshotObserver.a.d(layoutNode2, snapshotObserver.f, this.a1);
        } else {
            yf9 yf9VarA = xv7Var.a();
            yf9VarA.y1(w67.d(j, yf9VarA.e), f, a26Var, ke6Var);
            s0();
        }
        xv7Var.d = qv7.e;
        if (xv7Var.a().Z && (xv7Var.k || xv7Var.j)) {
            requestLayout();
        }
        this.y = true;
    }

    public final void u0(long j, float f, a26 a26Var, ke6 ke6Var) throws Throwable {
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNode2 = xv7Var.a;
        try {
            this.J0 = true;
            if (!w67.b(j, this.Y) || a26Var != this.Z || this.b1) {
                if (xv7Var.k || xv7Var.j || this.b1) {
                    this.L0 = true;
                    this.b1 = false;
                }
            }
            rg8 rg8Var = xv7Var.q;
            if (rg8Var != null) {
                xv7 xv7Var2 = rg8Var.f;
                if (rg8Var.G0 == qg8.c && !b21.G(xv7Var2.a)) {
                    xv7Var2.c = true;
                }
            }
            rg8 rg8Var2 = xv7Var.q;
            if (rg8Var2 != null && rg8Var2.l0()) {
                yf9 yf9Var = xv7Var.a().N0;
                bea placementScope = yf9Var != null ? yf9Var.E0 : wv7.a(layoutNode2).getPlacementScope();
                rg8 rg8Var3 = xv7Var.q;
                rg8Var3.getClass();
                LayoutNode layoutNodeF = layoutNode2.F();
                if (layoutNodeF != null) {
                    layoutNodeF.getLayoutDelegate().h = 0;
                }
                rg8Var3.w = Integer.MAX_VALUE;
                placementScope.g(rg8Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            rg8 rg8Var4 = xv7Var.q;
            if (rg8Var4 != null && !rg8Var4.z) {
                i37.c("Error: Placement happened before lookahead.");
            }
            t0(j, f, a26Var, ke6Var);
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }

    @Override // defpackage.tn8
    public final cea v(long j) throws Throwable {
        sv7 sv7Var;
        xv7 xv7Var = this.f;
        LayoutNode layoutNode = xv7Var.a;
        LayoutNode layoutNode2 = xv7Var.a;
        sv7 sv7Var2 = layoutNode.S0;
        sv7 sv7Var3 = sv7.c;
        if (sv7Var2 == sv7Var3) {
            layoutNode.f();
        }
        if (b21.G(layoutNode2)) {
            rg8 rg8Var = xv7Var.q;
            rg8Var.getClass();
            rg8Var.x = sv7Var3;
            rg8Var.v(j);
        }
        LayoutNode layoutNodeF = layoutNode2.F();
        if (layoutNodeF != null) {
            if (this.z != sv7Var3 && !layoutNode2.U0) {
                i37.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = layoutNodeF.u().ordinal();
            if (iOrdinal == 0) {
                sv7Var = sv7.a;
            } else {
                if (iOrdinal != 2) {
                    s8f.h(layoutNodeF.u(), "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                sv7Var = sv7.b;
            }
            this.z = sv7Var;
        } else {
            this.z = sv7Var3;
        }
        A0(j);
        return this;
    }
}
