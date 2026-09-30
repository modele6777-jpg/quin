package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wye implements n26 {
    public final /* synthetic */ r17 a;
    public final /* synthetic */ yye b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ i5c d;
    public final /* synthetic */ x16 e;

    public wye(r17 r17Var, yye yyeVar, boolean z, i5c i5cVar, x16 x16Var) {
        this.a = r17Var;
        this.b = yyeVar;
        this.c = z;
        this.d = i5cVar;
        this.e = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        l46 l46Var = (l46) obj2;
        ((Number) obj3).intValue();
        l46Var.f0(-1525724089);
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            objR = ib8.e(l46Var);
        }
        t69 t69Var = (t69) objR;
        j09 j09VarD = o17.a(g09.a, t69Var, this.a).D(new l4f(this.b, t69Var, null, this.c, this.d, this.e));
        l46Var.r(false);
        return j09VarD;
    }
}
