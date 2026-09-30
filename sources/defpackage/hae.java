package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hae extends lu3 {
    public final pa1 n;
    public final la1 o;
    public lu3 p;
    public oae q;

    public hae(int i, Size size) {
        super(i, size);
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            this.o = la1Var;
            la1Var.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            pa1Var.a(e);
        }
        this.n = pa1Var;
    }

    @Override // defpackage.lu3
    public final void a() {
        super.a();
        p8c.v(new cae(this, 2));
    }

    @Override // defpackage.lu3
    public final m88 f() {
        return this.n;
    }

    public final boolean g(lu3 lu3Var, Runnable runnable) {
        boolean z;
        Size size = this.h;
        p8c.m();
        lu3Var.getClass();
        int i = lu3Var.i;
        Size size2 = lu3Var.h;
        lu3 lu3Var2 = this.p;
        if (lu3Var2 == lu3Var) {
            return false;
        }
        ok8.o("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", lu3Var2 == null);
        ok8.k("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.i;
        ok8.k(kv2.h(i2, i, "The provider's format(", ") must match the parent(", ")"), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        ok8.o("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = lu3Var;
        bm8.N(true, lu3Var.c(), this.o, g94.a());
        lu3Var.d();
        bm8.J(this.e).b(new eae(lu3Var, 1), g94.a());
        bm8.J(lu3Var.g).b(runnable, ok8.w());
        return true;
    }
}
