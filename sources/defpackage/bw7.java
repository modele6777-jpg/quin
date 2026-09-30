package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bw7 implements r6e {
    public cv7 a = cv7.b;
    public float b;
    public float c;
    public final /* synthetic */ gw7 d;

    public bw7(gw7 gw7Var) {
        this.d = gw7Var;
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.b;
    }

    @Override // defpackage.ga7
    public final cv7 getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.c;
    }

    @Override // defpackage.ga7
    public final boolean k0() {
        LayoutNode layoutNode = this.d.a;
        return layoutNode.u() == qv7.d || layoutNode.u() == qv7.b;
    }

    @Override // defpackage.zn8
    public final yn8 y(int i, int i2, Map map, a26 a26Var, a26 a26Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            i37.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new aw7(i, i2, map, a26Var, this, this.d, a26Var2);
    }

    @Override // defpackage.r6e
    public final List z0(l26 l26Var, Object obj) {
        gw7 gw7Var = this.d;
        gw7Var.h();
        LayoutNode layoutNode = gw7Var.a;
        qv7 qv7VarU = layoutNode.u();
        qv7 qv7Var = qv7.c;
        qv7 qv7Var2 = qv7.a;
        if (qv7VarU != qv7Var2 && qv7VarU != qv7Var && qv7VarU != qv7.b && qv7VarU != qv7.d) {
            i37.c("subcompose can only be used inside the measure or layout blocks");
        }
        w79 w79Var = gw7Var.g;
        Object objG = w79Var.g(obj);
        if (objG == null) {
            objG = (LayoutNode) gw7Var.x.k(obj);
            if (objG != null) {
                if (gw7Var.Z <= 0) {
                    i37.c("Check failed.");
                }
                gw7Var.Z--;
            } else {
                objG = gw7Var.n(obj);
                if (objG == null) {
                    int i = gw7Var.d;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.G0 = true;
                    layoutNode.N(i, layoutNode2);
                    layoutNode.G0 = false;
                    objG = layoutNode2;
                }
            }
            w79Var.m(obj, objG);
        }
        LayoutNode layoutNode3 = (LayoutNode) objG;
        if (s72.y0(gw7Var.d, layoutNode.q()) != layoutNode3) {
            int i2 = ((p89) ((g79) layoutNode.q()).b).i(layoutNode3);
            if (i2 < gw7Var.d) {
                i37.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = gw7Var.d;
            if (i3 != i2) {
                gw7Var.j(i2, i3);
            }
        }
        gw7Var.d++;
        gw7Var.m(layoutNode3, obj, false, l26Var);
        return (qv7VarU == qv7Var2 || qv7VarU == qv7Var) ? layoutNode3.p() : layoutNode3.o();
    }
}
