package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o09 {
    public final AndroidComposeView a;
    public i79 b;
    public i79 c;
    public i79 d;
    public i79 e;
    public boolean f;

    public o09(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i09] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static void b(i09 i09Var, c1b c1bVar) {
        if (!i09Var.a.Y) {
            i37.c("visitSubtreeIf called on an unattached node");
        }
        p89 p89Var = new p89(0, new i09[16]);
        i09 i09Var2 = i09Var.a;
        i09 i09Var3 = i09Var2.f;
        if (i09Var3 == null) {
            vd0.H(p89Var, i09Var2);
        } else {
            p89Var.b(i09Var3);
        }
        while (true) {
            int i = p89Var.c;
            if (i == 0) {
                return;
            }
            i09 i09Var4 = (i09) p89Var.k(i - 1);
            if ((i09Var4.d & 32) != 0) {
                i09 i09Var5 = i09Var4;
                while (true) {
                    if (i09Var5 != null && i09Var5.Y) {
                        if ((i09Var5.c & 32) != 0) {
                            ?? M0 = i09Var5;
                            ?? p89Var2 = 0;
                            while (M0 != 0) {
                                if (M0 instanceof p09) {
                                    if (((p09) M0).e0().J(c1bVar)) {
                                        break;
                                    }
                                } else if ((M0.c & 32) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var6 = ((sv3) M0).E0;
                                    int i2 = 0;
                                    M0 = M0;
                                    p89Var2 = p89Var2;
                                    while (i09Var6 != null) {
                                        if ((i09Var6.c & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                p89Var2 = p89Var2;
                                                M0 = i09Var6;
                                            } else {
                                                if (p89Var2 == 0) {
                                                    p89Var2 = new p89(0, new i09[16]);
                                                }
                                                if (M0 != 0) {
                                                    p89Var2.b(M0);
                                                    M0 = 0;
                                                }
                                                p89Var2.b(i09Var6);
                                            }
                                        }
                                        i09Var6 = i09Var6.f;
                                        M0 = M0;
                                        p89Var2 = p89Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M0 = vd0.m0(p89Var2);
                            }
                        }
                        i09Var5 = i09Var5.f;
                    }
                }
            }
            vd0.H(p89Var, i09Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        zv6 zv6Var = new zv6(16, this);
        i79 i79Var = this.a.F1;
        if (i79Var.c(zv6Var) >= 0) {
            return;
        }
        i79Var.h(zv6Var);
    }
}
