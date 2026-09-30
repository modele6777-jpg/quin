package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class x7g extends w7g {
    public x47 s;

    public x7g(h8g h8gVar, x7g x7gVar) {
        super(h8gVar, x7gVar);
        this.s = null;
        this.s = x7gVar.s;
    }

    @Override // defpackage.e8g
    public h8g b() {
        return h8g.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.e8g
    public h8g c() {
        return h8g.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.e8g
    public final x47 l() {
        x47 x47Var = this.s;
        if (x47Var != null) {
            return x47Var;
        }
        WindowInsets windowInsets = this.c;
        x47 x47VarB = x47.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = x47VarB;
        return x47VarB;
    }

    @Override // defpackage.e8g
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // defpackage.e8g
    public void z(x47 x47Var) {
        this.s = x47Var;
    }

    public x7g(h8g h8gVar, WindowInsets windowInsets) {
        super(h8gVar, windowInsets);
        this.s = null;
    }
}
