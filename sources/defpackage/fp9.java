package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fp9 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ fp9(j09 j09Var, ArrayList arrayList, int i) {
        this.b = j09Var;
        this.c = arrayList;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        ArrayList arrayList = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k99.f(k99.P(49), l46Var, j09Var, arrayList);
                break;
            default:
                jgb.u(k99.P(1), l46Var, j09Var, arrayList);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ fp9(ArrayList arrayList, j09 j09Var, int i) {
        this.c = arrayList;
        this.b = j09Var;
    }
}
