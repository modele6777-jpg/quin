package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r81 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ix9 b;
    public final /* synthetic */ gg7 c;

    public /* synthetic */ r81(ix9 ix9Var, gg7 gg7Var, int i) {
        this.a = i;
        this.b = ix9Var;
        this.c = gg7Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        gg7 gg7Var = this.c;
        ix9 ix9Var = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                ix9Var.c(gg7Var, iIntValue, iIntValue2);
                break;
            default:
                ix9Var.c(gg7Var, iIntValue, iIntValue2);
                break;
        }
        return wefVar;
    }
}
