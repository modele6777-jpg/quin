package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m20 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n69 b;

    public /* synthetic */ m20(n69 n69Var, int i) {
        this.a = i;
        this.b = n69Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        n69 n69Var = this.b;
        switch (i) {
            case 0:
                ((qz9) n69Var).k((int) (((e77) obj).a >> 32));
                break;
            default:
                am3.b(n69Var, ((Number) ((uz) obj).e.getValue()).floatValue() / 160.0f);
                break;
        }
        return wefVar;
    }
}
