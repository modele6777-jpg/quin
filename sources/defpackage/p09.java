package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface p09 extends rv3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
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
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p09, rv3] */
    default Object L(c1b c1bVar) {
        wo0 wo0Var;
        i09 i09Var = (i09) this;
        if (!i09Var.a.Y) {
            i37.a("ModifierLocal accessed from an unattached node");
        }
        if (!i09Var.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var2 = i09Var.a.e;
        LayoutNode layoutNodeS0 = vd0.s0(this);
        while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 32) != 0) {
                while (i09Var2 != null) {
                    if ((i09Var2.c & 32) != 0) {
                        ?? M0 = i09Var2;
                        ?? p89Var = 0;
                        while (M0 != 0) {
                            if (M0 instanceof p09) {
                                p09 p09Var = (p09) M0;
                                if (p09Var.e0().J(c1bVar)) {
                                    return p09Var.e0().O(c1bVar);
                                }
                            } else if ((M0.c & 32) != 0 && (M0 instanceof sv3)) {
                                i09 i09Var3 = ((sv3) M0).E0;
                                int i = 0;
                                M0 = M0;
                                p89Var = p89Var;
                                while (i09Var3 != null) {
                                    if ((i09Var3.c & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            p89Var = p89Var;
                                            M0 = i09Var3;
                                        } else {
                                            if (p89Var == 0) {
                                                p89Var = new p89(0, new i09[16]);
                                            }
                                            if (M0 != 0) {
                                                p89Var.b(M0);
                                                M0 = 0;
                                            }
                                            p89Var.b(i09Var3);
                                        }
                                    }
                                    i09Var3 = i09Var3.f;
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                                if (i == 1) {
                                }
                            }
                            M0 = vd0.m0(p89Var);
                        }
                    }
                    i09Var2 = i09Var2.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var2 = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
        return c1bVar.a.invoke();
    }

    default x57 e0() {
        return ru4.s;
    }
}
