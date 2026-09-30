package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yna implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ yna(int i, boolean z, boolean z2, float f, x16 x16Var, x16 x16Var2, j09 j09Var, int i2) {
        this.e = i;
        this.c = z;
        this.d = z2;
        this.b = f;
        this.f = x16Var;
        this.g = x16Var2;
        this.v = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(1);
                x57.B(this.e, this.c, this.d, this.b, (x16) obj5, (x16) obj4, (j09) obj3, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(this.e | 1);
                p8c.k((List) obj5, this.b, this.c, this.d, (List) obj4, (fy9) obj3, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ yna(List list, float f, boolean z, boolean z2, List list2, fy9 fy9Var, int i) {
        this.f = list;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.g = list2;
        this.v = fy9Var;
        this.e = i;
    }
}
