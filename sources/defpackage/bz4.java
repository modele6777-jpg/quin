package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ bz4(List list, a26 a26Var, j09 j09Var, int i) {
        this.a = 2;
        this.c = list;
        this.d = a26Var;
        this.b = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.d;
        List list = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k99.d(k99.P(7), a26Var, l46Var, j09Var, list);
                break;
            case 1:
                k99.d(k99.P(7), a26Var, l46Var, j09Var, list);
                break;
            case 2:
                k5a.b(k99.P(1), a26Var, l46Var, j09Var, list);
                break;
            default:
                aic.a(k99.P(1), a26Var, l46Var, j09Var, list);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ bz4(int i, int i2, a26 a26Var, j09 j09Var, List list) {
        this.a = i2;
        this.b = j09Var;
        this.c = list;
        this.d = a26Var;
    }
}
