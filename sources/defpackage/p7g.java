package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class p7g extends v7g {
    public final WindowInsets.Builder e;

    public p7g(h8g h8gVar) {
        super(h8gVar);
        WindowInsets windowInsetsB = h8gVar.b();
        this.e = windowInsetsB != null ? fv.h(windowInsetsB) : fv.g();
    }

    @Override // defpackage.v7g
    public h8g b() {
        a();
        h8g h8gVarC = h8g.c(this.e.build(), null);
        x47[] x47VarArr = this.b;
        e8g e8gVar = h8gVarC.a;
        e8gVar.w(x47VarArr);
        e8gVar.v(null);
        e8gVar.B(this.c);
        e8gVar.C(this.d);
        return h8gVarC;
    }

    @Override // defpackage.v7g
    public void e(x47 x47Var) {
        this.e.setMandatorySystemGestureInsets(x47Var.d());
    }

    @Override // defpackage.v7g
    public void f(x47 x47Var) {
        this.e.setStableInsets(x47Var.d());
    }

    @Override // defpackage.v7g
    public void g(x47 x47Var) {
        this.e.setSystemGestureInsets(x47Var.d());
    }

    @Override // defpackage.v7g
    public void h(x47 x47Var) {
        this.e.setSystemWindowInsets(x47Var.d());
    }

    @Override // defpackage.v7g
    public void i(x47 x47Var) {
        this.e.setTappableElementInsets(x47Var.d());
    }

    public p7g() {
        this.e = fv.g();
    }
}
