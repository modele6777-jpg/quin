package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class heb implements a26 {
    public final /* synthetic */ phb a;
    public final /* synthetic */ long b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ e89 d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ e89 f;

    public /* synthetic */ heb(phb phbVar, long j, e89 e89Var, e89 e89Var2, e89 e89Var3, e89 e89Var4) {
        this.a = phbVar;
        this.b = j;
        this.c = e89Var;
        this.d = e89Var2;
        this.e = e89Var3;
        this.f = e89Var4;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        qhb qhbVar = (qhb) obj;
        qhbVar.getClass();
        ((a26) this.c.getValue()).d(qhbVar);
        int iOrdinal = qhbVar.ordinal();
        phb phbVar = this.a;
        if (iOrdinal == 0) {
            ((a26) this.d.getValue()).d(phbVar.a());
        } else if (iOrdinal == 1) {
            this.e.setValue(new rgb(this.b, phbVar.a()));
            this.f.setValue(Boolean.TRUE);
        }
        return wef.a;
    }
}
