package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class utb {
    public final oq0 a;
    public final cee b;
    public final pa1 c;
    public final pa1 d;
    public final la1 e;
    public final la1 f;
    public boolean g = false;
    public boolean h = false;
    public tv1 i;

    public utb(oq0 oq0Var, cee ceeVar) {
        this.a = oq0Var;
        this.b = ceeVar;
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        try {
            this.e = la1Var;
            la1Var.a = "CaptureCompleteFuture";
        } catch (Exception e) {
            pa1Var.a(e);
        }
        this.c = pa1Var;
        la1 la1Var2 = new la1();
        la1Var2.c = new qxb();
        pa1 pa1Var2 = new pa1(la1Var2);
        la1Var2.b = pa1Var2;
        try {
            this.f = la1Var2;
            la1Var2.a = "RequestCompleteFuture";
        } catch (Exception e2) {
            pa1Var2.a(e2);
        }
        this.d = pa1Var2;
    }

    public final void a() {
        oq0 oq0Var = this.a;
        boolean z = oq0Var.j;
        if (!z || oq0Var.a()) {
            if (!z) {
                ok8.o("The callback can only complete once.", !this.d.b.isDone());
            }
            this.f.b(null);
        }
    }
}
