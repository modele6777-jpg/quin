package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aw7 implements yn8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ bw7 e;
    public final /* synthetic */ gw7 f;
    public final /* synthetic */ a26 g;

    public aw7(int i, int i2, Map map, a26 a26Var, bw7 bw7Var, gw7 gw7Var, a26 a26Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = a26Var;
        this.e = bw7Var;
        this.f = gw7Var;
        this.g = a26Var2;
    }

    @Override // defpackage.yn8
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.yn8
    public final void b() {
        b47 b47Var;
        LayoutNode layoutNode = this.f.a;
        boolean zK0 = this.e.k0();
        a26 a26Var = this.g;
        if (!zK0 || (b47Var = ((c47) layoutNode.V0.d).u1) == null) {
            a26Var.d(((c47) layoutNode.V0.d).E0);
        } else {
            a26Var.d(b47Var.E0);
        }
    }

    @Override // defpackage.yn8
    public final int c() {
        return this.b;
    }

    @Override // defpackage.yn8
    public final int d() {
        return this.a;
    }

    @Override // defpackage.yn8
    public final a26 g() {
        return this.d;
    }
}
