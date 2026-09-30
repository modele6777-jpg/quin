package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ s69 c;

    public /* synthetic */ sg4(e89 e89Var, s69 s69Var) {
        this.a = 1;
        this.b = e89Var;
        this.c = s69Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        s69 s69Var = this.c;
        switch (i) {
            case 0:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 1:
                q3b q3bVar = (q3b) obj;
                q3bVar.getClass();
                e89Var.setValue(q3bVar);
                sz9 sz9Var = (sz9) s69Var;
                sz9Var.k(sz9Var.j() + 1);
                return wefVar;
            case 2:
                ((ra4) obj).getClass();
                return new oe0(20, s69Var, e89Var);
            case 3:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 4:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            default:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
        }
    }

    public /* synthetic */ sg4(s69 s69Var, e89 e89Var, int i) {
        this.a = i;
        this.c = s69Var;
        this.b = e89Var;
    }
}
