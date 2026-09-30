package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wf9 implements xf9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.xf9
    public final boolean c(i09 i09Var) {
        ?? p89Var = 0;
        while (i09Var != 0) {
            if (i09Var instanceof ria) {
                ((ria) i09Var).W();
            } else if ((i09Var.c & 16) != 0 && (i09Var instanceof sv3)) {
                i09 i09Var2 = ((sv3) i09Var).E0;
                int i = 0;
                p89Var = p89Var;
                i09Var = i09Var;
                while (i09Var2 != null) {
                    if ((i09Var2.c & 16) != 0) {
                        i++;
                        if (i == 1) {
                            p89Var = p89Var;
                            i09Var = i09Var2;
                        } else {
                            if (p89Var == 0) {
                                p89Var = new p89(0, new i09[16]);
                            }
                            if (i09Var != 0) {
                                p89Var.b(i09Var);
                                i09Var = 0;
                            }
                            p89Var.b(i09Var2);
                        }
                    }
                    i09Var2 = i09Var2.f;
                    p89Var = p89Var;
                    i09Var = i09Var;
                }
                if (i == 1) {
                }
            }
            i09Var = vd0.m0(p89Var);
        }
        return false;
    }

    @Override // defpackage.xf9
    public final int d() {
        return 16;
    }

    @Override // defpackage.xf9
    public final void f(LayoutNode layoutNode, long j, sl6 sl6Var, int i, boolean z) {
        layoutNode.M(j, sl6Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.xf9
    public final boolean j(sl6 sl6Var, LayoutNode layoutNode) {
        yf9 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        outerCoordinator$ui.getClass();
        i09 i09VarK1 = outerCoordinator$ui.k1(zf9.g(16));
        if (i09VarK1 != null && i09VarK1.Y) {
            if (!i09VarK1.a.Y) {
                i37.c("visitLocalDescendants called on an unattached node");
            }
            i09 i09Var = i09VarK1.a;
            if ((i09Var.d & 16) != 0) {
                while (i09Var != null) {
                    if ((i09Var.c & 16) != 0) {
                        ?? M0 = i09Var;
                        ?? p89Var = 0;
                        while (M0 != 0) {
                            if (M0 instanceof ria) {
                                if (((ria) M0).J0()) {
                                    sl6Var.c = sl6Var.a.b - 1;
                                    return true;
                                }
                            } else if ((M0.c & 16) != 0 && (M0 instanceof sv3)) {
                                i09 i09Var2 = ((sv3) M0).E0;
                                int i = 0;
                                while (i09Var2 != null) {
                                    if ((i09Var2.c & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M0 = M0;
                                            p89Var = p89Var;
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
                                    } else {
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    i09Var2 = i09Var2.f;
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                                if (i == 1) {
                                    M0 = M0;
                                    p89Var = p89Var;
                                } else {
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                            }
                            M0 = vd0.m0(p89Var);
                        }
                    }
                    i09Var = i09Var.f;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xf9
    public final boolean k(LayoutNode layoutNode) {
        return true;
    }
}
