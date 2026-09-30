package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vn5 {
    public final bo5 a;
    public final AndroidComposeView b;
    public final x79 c;
    public final x79 d;
    public boolean e;

    public vn5(bo5 bo5Var, AndroidComposeView androidComposeView) {
        this.a = bo5Var;
        this.b = androidComposeView;
        x79 x79Var = mec.a;
        this.c = new x79();
        this.d = new x79();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        sk3 sk3Var = new sk3(0, this, vn5.class, "invalidateNodes", "invalidateNodes()V", 0, 10);
        i79 i79Var = this.b.F1;
        if (i79Var.c(sk3Var) < 0) {
            i79Var.h(sk3Var);
        }
        this.e = true;
    }
}
