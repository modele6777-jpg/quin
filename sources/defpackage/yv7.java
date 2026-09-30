package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yv7 implements r6e, zn8 {
    public final /* synthetic */ bw7 a;
    public final /* synthetic */ gw7 b;

    public yv7(gw7 gw7Var) {
        this.b = gw7Var;
        this.a = gw7Var.v;
    }

    @Override // defpackage.sw3
    public final int D0(float f) {
        return this.a.D0(f);
    }

    @Override // defpackage.sw3
    public final float F(long j) {
        return this.a.F(j);
    }

    @Override // defpackage.sw3
    public final long N0(long j) {
        return this.a.N0(j);
    }

    @Override // defpackage.sw3
    public final long P(int i) {
        return this.a.P(i);
    }

    @Override // defpackage.sw3
    public final float Q0(long j) {
        return this.a.Q0(j);
    }

    @Override // defpackage.sw3
    public final long S(float f) {
        return this.a.S(f);
    }

    @Override // defpackage.sw3
    public final float Z(int i) {
        return this.a.Z(i);
    }

    @Override // defpackage.sw3
    public final float c0(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a.b;
    }

    @Override // defpackage.ga7
    public final cv7 getLayoutDirection() {
        return this.a.a;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.a.c;
    }

    @Override // defpackage.ga7
    public final boolean k0() {
        return this.a.k0();
    }

    @Override // defpackage.zn8
    public final yn8 n0(int i, int i2, Map map, a26 a26Var) {
        return this.a.y(i, i2, map, null, a26Var);
    }

    @Override // defpackage.sw3
    public final float p0(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.sw3
    public final long t(float f) {
        return this.a.t(f);
    }

    @Override // defpackage.sw3
    public final long u(long j) {
        return this.a.u(j);
    }

    @Override // defpackage.sw3
    public final int x0(long j) {
        return this.a.x0(j);
    }

    @Override // defpackage.zn8
    public final yn8 y(int i, int i2, Map map, a26 a26Var, a26 a26Var2) {
        return this.a.y(i, i2, map, a26Var, a26Var2);
    }

    @Override // defpackage.r6e
    public final List z0(l26 l26Var, Object obj) {
        gw7 gw7Var = this.b;
        LayoutNode layoutNode = gw7Var.a;
        w79 w79Var = gw7Var.g;
        LayoutNode layoutNode2 = (LayoutNode) w79Var.g(obj);
        if (layoutNode2 != null && ((p89) ((g79) layoutNode.q()).b).i(layoutNode2) < gw7Var.d) {
            return layoutNode2.p();
        }
        w79 w79Var2 = gw7Var.z;
        w79 w79Var3 = gw7Var.x;
        p89 p89Var = gw7Var.X;
        if (p89Var.c < gw7Var.e) {
            i37.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNode3 = (LayoutNode) w79Var.g(obj);
        int i = p89Var.c;
        int i2 = gw7Var.e;
        if (i == i2) {
            p89Var.b(obj);
        } else {
            Object[] objArr = p89Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        gw7Var.e++;
        boolean zB = w79Var3.b(obj);
        if (zB || layoutNode3 != null) {
            if (!zB && layoutNode3 != null) {
                gw7Var.j(((p89) ((g79) layoutNode.q()).b).i(layoutNode3), ((p89) ((g79) layoutNode.q()).b).c);
                gw7Var.Z++;
                w79Var.k(obj);
                w79Var3.m(obj, layoutNode3);
                w79Var2.m(obj, gw7Var.e(obj));
                if (layoutNode.W()) {
                    gw7Var.h();
                }
            }
            LayoutNode layoutNode4 = (LayoutNode) w79Var3.g(obj);
            zv7 zv7Var = layoutNode4 != null ? (zv7) gw7Var.f.g(layoutNode4) : null;
            if (zv7Var != null && zv7Var.d) {
                gw7Var.m(layoutNode4, obj, false, l26Var);
            }
            if ((zv7Var != null ? zv7Var.f : null) != null) {
                gw7Var.a(zv7Var, true);
            }
        } else {
            gw7Var.k(obj, l26Var, false);
            w79Var2.m(obj, gw7Var.e(obj));
        }
        LayoutNode layoutNode5 = (LayoutNode) w79Var3.g(obj);
        if (layoutNode5 == null) {
            return pu4.a;
        }
        List listL0 = layoutNode5.z().l0();
        g79 g79Var = (g79) listL0;
        int i3 = ((p89) g79Var.b).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((wn8) g79Var.get(i4)).f.b = true;
        }
        return listL0;
    }
}
