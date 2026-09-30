package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bnd implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ List c;

    public /* synthetic */ bnd(a26 a26Var, List list) {
        this.b = a26Var;
        this.c = list;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        List list = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                v08Var.X(list.size(), null, new gj(14, list, false), new dd2(new a07(list, a26Var, 2), true, 802480018));
                break;
            default:
                a26Var.d(list.get(((Integer) obj).intValue()));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ bnd(List list, a26 a26Var) {
        this.c = list;
        this.b = a26Var;
    }
}
