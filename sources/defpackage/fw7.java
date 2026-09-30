package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fw7 implements p6e {
    public final r69 a;
    public final /* synthetic */ gw7 b;
    public final /* synthetic */ Object c;

    public fw7(gw7 gw7Var, Object obj) {
        this.b = gw7Var;
        this.c = obj;
        int[] iArr = d77.a;
        this.a = new r69();
    }

    @Override // defpackage.p6e
    public final void a() {
        this.b.g(this.c);
    }

    @Override // defpackage.p6e
    public final void b(up upVar) {
        wo0 wo0Var;
        LayoutNode layoutNode = (LayoutNode) this.b.x.g(this.c);
        i09 i09Var = (layoutNode == null || (wo0Var = layoutNode.V0) == null) ? null : (i09) wo0Var.g;
        if (i09Var == null || !i09Var.Y) {
            return;
        }
        n3d.u(i09Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", upVar);
    }

    @Override // defpackage.p6e
    public final long c(int i) {
        LayoutNode layoutNode = (LayoutNode) this.b.x.g(this.c);
        if (layoutNode == null || !layoutNode.W()) {
            return 0L;
        }
        int size = layoutNode.getChildren$ui().size();
        if (i < 0 || i >= size) {
            i37.e("Index (" + i + ") is out of bound of [0, " + size + ")");
        }
        if (!this.a.c(i)) {
            return 0L;
        }
        int I = layoutNode.getChildren$ui().get(i).I();
        return (((long) layoutNode.getChildren$ui().get(i).r()) & 4294967295L) | (((long) I) << 32);
    }

    @Override // defpackage.p6e
    public final int d() {
        List<LayoutNode> children$ui;
        LayoutNode layoutNode = (LayoutNode) this.b.x.g(this.c);
        if (layoutNode == null || (children$ui = layoutNode.getChildren$ui()) == null) {
            return 0;
        }
        return children$ui.size();
    }

    @Override // defpackage.p6e
    public final void e(int i, long j) {
        gw7 gw7Var = this.b;
        LayoutNode layoutNode = (LayoutNode) gw7Var.x.g(this.c);
        if (layoutNode == null || !layoutNode.W()) {
            return;
        }
        int size = layoutNode.getChildren$ui().size();
        if (i < 0 || i >= size) {
            i37.e("Index (" + i + ") is out of bound of [0, " + size + ")");
        }
        if (layoutNode.X()) {
            i37.a("Pre-measure called on node that is not placed");
        }
        LayoutNode layoutNode2 = gw7Var.a;
        layoutNode2.G0 = true;
        ((AndroidComposeView) wv7.a(layoutNode)).s(layoutNode.getChildren$ui().get(i), j);
        layoutNode2.G0 = false;
        this.a.a(i);
    }
}
