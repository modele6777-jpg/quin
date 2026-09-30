package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7b implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ v7b(long j, Object obj, e89 e89Var, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
        this.d = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        Object obj = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                x16 x16Var = (x16) obj;
                tz9 tz9Var = (tz9) e89Var;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - tz9Var.j() >= j) {
                    tz9Var.k(jCurrentTimeMillis);
                    x16Var.invoke();
                }
                break;
            default:
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                String str = (String) ((e89) obj).getValue();
                jf4 jf4Var = new jf4(jCurrentTimeMillis2, e89Var, 3);
                if (str != null) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05(str), jf4Var, 2);
                }
                break;
        }
        return wefVar;
    }
}
