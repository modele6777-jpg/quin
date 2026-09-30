package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class um9 {
    public final Runnable a;
    public final ace b = new ace(new zv6(23, this));

    public um9(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(x48 x48Var, qm9 qm9Var) {
        qm9Var.getClass();
        h48 h48VarK = x48Var.k();
        if (((a58) h48VarK).i == g48.a) {
            return;
        }
        pm9 pm9Var = new pm9(qm9Var, new rm9(x48Var, qm9Var));
        qm9Var.a.add(pm9Var);
        pm9Var.g(false);
        szc.x(b().c, pm9Var);
        rr3 rr3Var = new rr3(pm9Var, this, h48VarK);
        h48VarK.a(rr3Var);
        qm9Var.c.add(new ts3(1, h48VarK, rr3Var));
    }

    public final sm9 b() {
        return (sm9) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.z(new mm9(onBackInvokedDispatcher, 0), 1);
        b().c.z(new mm9(onBackInvokedDispatcher, 1000000), 0);
    }
}
