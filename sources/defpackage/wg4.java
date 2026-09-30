package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ yx9 d;

    public /* synthetic */ wg4(aw2 aw2Var, a26 a26Var, cs3 cs3Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = a26Var;
        this.d = cs3Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        yx9 yx9Var = this.d;
        a26 a26Var = this.c;
        aw2 aw2Var = this.b;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, null, new ah4(yx9Var, num.intValue(), null), 3);
                if (a26Var != null) {
                    a26Var.d(num);
                }
                break;
            default:
                ynb.V(aw2Var, null, null, new v19(yx9Var, num.intValue(), null), 3);
                if (a26Var != null) {
                    a26Var.d(num);
                }
                break;
        }
        return wefVar;
    }
}
