package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class huc implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r17 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ i5c e;
    public final /* synthetic */ m26 f;

    public /* synthetic */ huc(r17 r17Var, boolean z, boolean z2, i5c i5cVar, m26 m26Var, int i) {
        this.a = i;
        this.b = r17Var;
        this.c = z;
        this.d = z2;
        this.e = i5cVar;
        this.f = m26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        m26 m26Var = this.f;
        r17 r17Var = this.b;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                ((Number) obj3).intValue();
                l46Var.f0(-1525724089);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = ib8.e(l46Var);
                }
                t69 t69Var = (t69) objR;
                j09 j09VarD = o17.a(g09Var, t69Var, r17Var).D(new fuc(this.c, t69Var, null, false, this.d, this.e, (x16) m26Var));
                l46Var.r(false);
                return j09VarD;
            default:
                l46 l46Var2 = (l46) obj2;
                ((Number) obj3).intValue();
                l46Var2.f0(-1525724089);
                Object objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = ib8.e(l46Var2);
                }
                t69 t69Var2 = (t69) objR2;
                j09 j09VarD2 = o17.a(g09Var, t69Var2, r17Var).D(new vye(this.c, t69Var2, null, false, this.d, this.e, (a26) m26Var));
                l46Var2.r(false);
                return j09VarD2;
        }
    }
}
