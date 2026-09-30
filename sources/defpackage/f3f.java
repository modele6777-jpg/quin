package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f3f implements h0e {
    public final k3f a;
    public a26 b;
    public a26 c;
    public final /* synthetic */ g3f d;

    public f3f(g3f g3fVar, k3f k3fVar, a26 a26Var, a26 a26Var2) {
        this.d = g3fVar;
        this.a = k3fVar;
        this.b = a26Var;
        this.c = a26Var2;
    }

    public final void c(i3f i3fVar, Object obj, b00 b00Var) {
        Object objD = this.c.d(i3fVar.d());
        boolean zH = this.d.c.h();
        k3f k3fVar = this.a;
        if (zH) {
            k3fVar.i(this.c.d(i3fVar.b()), objD, (ze5) this.b.d(i3fVar));
        } else {
            k3fVar.j(objD, (ze5) this.b.d(i3fVar), obj, b00Var);
        }
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        c(this.d.c.f(), null, null);
        return this.a.x.getValue();
    }
}
