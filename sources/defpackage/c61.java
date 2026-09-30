package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c61 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ m26 x;

    public /* synthetic */ c61(e83 e83Var, boolean z, a26 a26Var, x16 x16Var, x16 x16Var2, String str, dd2 dd2Var, int i, int i2) {
        this.f = e83Var;
        this.b = z;
        this.g = a26Var;
        this.c = x16Var;
        this.v = x16Var2;
        this.w = str;
        this.x = dd2Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        m26 m26Var = this.x;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.c;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                cgg.m((x16) obj6, (j09) obj7, this.b, (x4d) obj5, (u51) obj4, (xw9) obj3, (n26) m26Var, (l46) obj, iP, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                pa7.e((e83) obj7, this.b, (a26) obj5, (x16) obj6, (x16) obj4, (String) obj3, (dd2) m26Var, (l46) obj, iP2, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                oca.a((j09) obj7, (List) obj6, (String) obj5, (use) obj4, (String) obj3, this.b, (a26) m26Var, (l46) obj, iP3, this.e);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ c61(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, xw9 xw9Var, n26 n26Var, int i, int i2) {
        this.c = x16Var;
        this.f = j09Var;
        this.b = z;
        this.g = x4dVar;
        this.v = u51Var;
        this.w = xw9Var;
        this.x = n26Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ c61(j09 j09Var, List list, String str, use useVar, String str2, boolean z, a26 a26Var, int i, int i2) {
        this.f = j09Var;
        this.c = list;
        this.g = str;
        this.v = useVar;
        this.w = str2;
        this.b = z;
        this.x = a26Var;
        this.d = i;
        this.e = i2;
    }
}
