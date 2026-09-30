package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u68 extends q3c {
    public final em7 a;
    public final Object b;
    public final q3c c;

    public u68(em7 em7Var, Object obj, q3c q3cVar) {
        obj.getClass();
        q3cVar.getClass();
        this.a = em7Var;
        this.b = obj;
        this.c = q3cVar;
    }

    @Override // defpackage.q3c
    public final Object k(em7 em7Var) {
        return em7Var.equals(this.a) ? af1.R(em7Var).cast(this.b) : this.c.k(em7Var);
    }

    @Override // defpackage.q3c
    public final q3c p(em7 em7Var, Object obj) {
        em7 em7Var2 = this.a;
        boolean zEquals = em7Var.equals(em7Var2);
        q3c q3cVar = this.c;
        if (!zEquals) {
            q3c q3cVarP = q3cVar.p(em7Var, null);
            if (q3cVarP != q3cVar) {
                this = new u68(em7Var2, this.b, q3cVarP);
            }
            q3cVar = this;
        }
        return obj != null ? new u68(em7Var, obj, q3cVar) : q3cVar;
    }

    public final String toString() {
        return s72.D0(s72.V0(fyc.A(fyc.u(new tb7(23), this))), null, "{", "}", new tb7(24), 25);
    }
}
