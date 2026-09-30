package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l83 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s69 b;
    public final /* synthetic */ s69 c;

    public /* synthetic */ l83(s69 s69Var, s69 s69Var2, int i) {
        this.a = i;
        this.b = s69Var;
        this.c = s69Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        s69 s69Var = this.c;
        s69 s69Var2 = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                ((sz9) s69Var2).k(iIntValue);
                ((sz9) s69Var).k(iIntValue2);
                break;
            default:
                ((sz9) s69Var2).k(iIntValue);
                ((sz9) s69Var).k(iIntValue2);
                break;
        }
        return wefVar;
    }
}
