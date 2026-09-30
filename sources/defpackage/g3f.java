package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g3f {
    public final y6f a;
    public final vz9 b = q1c.f(null);
    public final /* synthetic */ n3f c;

    public g3f(n3f n3fVar, y6f y6fVar, String str) {
        this.c = n3fVar;
        this.a = y6fVar;
    }

    public final f3f a(a26 a26Var, Object obj, b00 b00Var, a26 a26Var2) {
        vz9 vz9Var = this.b;
        f3f f3fVar = (f3f) vz9Var.getValue();
        n3f n3fVar = this.c;
        if (f3fVar == null) {
            Object objD = a26Var2.d(n3fVar.a.a());
            Object objD2 = a26Var2.d(n3fVar.a.a());
            y6f y6fVar = this.a;
            b00 b00Var2 = (b00) y6fVar.a.d(objD2);
            b00Var2.d();
            k3f k3fVar = new k3f(n3fVar, objD, b00Var2, y6fVar);
            f3fVar = new f3f(this, k3fVar, a26Var, a26Var2);
            vz9Var.setValue(f3fVar);
            n3fVar.j.add(k3fVar);
        }
        f3fVar.c = a26Var2;
        f3fVar.b = a26Var;
        f3fVar.c(n3fVar.f(), obj, b00Var);
        return f3fVar;
    }
}
