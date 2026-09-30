package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q6e {
    public final t6e a;
    public gw7 b;
    public final n6e c;
    public final n6e d;
    public final n6e e;

    /* JADX WARN: Type inference failed for: r2v1, types: [n6e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [n6e] */
    /* JADX WARN: Type inference failed for: r2v3, types: [n6e] */
    public q6e(t6e t6eVar) {
        this.a = t6eVar;
        final int i = 0;
        this.c = new l26(this) { // from class: n6e
            public final /* synthetic */ q6e b;

            {
                this.b = this;
            }

            @Override // defpackage.l26
            public final Object z(Object obj, Object obj2) {
                int i2 = i;
                wef wefVar = wef.a;
                q6e q6eVar = this.b;
                switch (i2) {
                    case 0:
                        t6e t6eVar2 = q6eVar.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        gw7 gw7Var = layoutNode.W0;
                        if (gw7Var == null) {
                            gw7Var = new gw7(layoutNode, t6eVar2);
                            layoutNode.W0 = gw7Var;
                        }
                        q6eVar.b = gw7Var;
                        q6eVar.a().h();
                        gw7 gw7VarA = q6eVar.a();
                        if (gw7VarA.c != t6eVar2) {
                            gw7VarA.c = t6eVar2;
                            gw7VarA.i(false);
                            LayoutNode.u0(gw7VarA.a, false, 7);
                        }
                        break;
                    case 1:
                        q6eVar.a().b = (lg2) obj2;
                        break;
                    default:
                        gw7 gw7VarA2 = q6eVar.a();
                        ((LayoutNode) obj).B0(new dw7(gw7VarA2, (l26) obj2, gw7VarA2.E0));
                        break;
                }
                return wefVar;
            }
        };
        final int i2 = 1;
        this.d = new l26(this) { // from class: n6e
            public final /* synthetic */ q6e b;

            {
                this.b = this;
            }

            @Override // defpackage.l26
            public final Object z(Object obj, Object obj2) {
                int i3 = i2;
                wef wefVar = wef.a;
                q6e q6eVar = this.b;
                switch (i3) {
                    case 0:
                        t6e t6eVar2 = q6eVar.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        gw7 gw7Var = layoutNode.W0;
                        if (gw7Var == null) {
                            gw7Var = new gw7(layoutNode, t6eVar2);
                            layoutNode.W0 = gw7Var;
                        }
                        q6eVar.b = gw7Var;
                        q6eVar.a().h();
                        gw7 gw7VarA = q6eVar.a();
                        if (gw7VarA.c != t6eVar2) {
                            gw7VarA.c = t6eVar2;
                            gw7VarA.i(false);
                            LayoutNode.u0(gw7VarA.a, false, 7);
                        }
                        break;
                    case 1:
                        q6eVar.a().b = (lg2) obj2;
                        break;
                    default:
                        gw7 gw7VarA2 = q6eVar.a();
                        ((LayoutNode) obj).B0(new dw7(gw7VarA2, (l26) obj2, gw7VarA2.E0));
                        break;
                }
                return wefVar;
            }
        };
        final int i3 = 2;
        this.e = new l26(this) { // from class: n6e
            public final /* synthetic */ q6e b;

            {
                this.b = this;
            }

            @Override // defpackage.l26
            public final Object z(Object obj, Object obj2) {
                int i4 = i3;
                wef wefVar = wef.a;
                q6e q6eVar = this.b;
                switch (i4) {
                    case 0:
                        t6e t6eVar2 = q6eVar.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        gw7 gw7Var = layoutNode.W0;
                        if (gw7Var == null) {
                            gw7Var = new gw7(layoutNode, t6eVar2);
                            layoutNode.W0 = gw7Var;
                        }
                        q6eVar.b = gw7Var;
                        q6eVar.a().h();
                        gw7 gw7VarA = q6eVar.a();
                        if (gw7VarA.c != t6eVar2) {
                            gw7VarA.c = t6eVar2;
                            gw7VarA.i(false);
                            LayoutNode.u0(gw7VarA.a, false, 7);
                        }
                        break;
                    case 1:
                        q6eVar.a().b = (lg2) obj2;
                        break;
                    default:
                        gw7 gw7VarA2 = q6eVar.a();
                        ((LayoutNode) obj).B0(new dw7(gw7VarA2, (l26) obj2, gw7VarA2.E0));
                        break;
                }
                return wefVar;
            }
        };
    }

    public final gw7 a() {
        gw7 gw7Var = this.b;
        if (gw7Var != null) {
            return gw7Var;
        }
        qc0.j("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
