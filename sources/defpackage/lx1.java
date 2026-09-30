package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lx1 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lx1(int i, int i2, j09 j09Var, kx1 kx1Var, mue mueVar, int i3) {
        this.c = i;
        this.d = i2;
        this.b = j09Var;
        this.f = kx1Var;
        this.g = mueVar;
        this.e = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                i7h.b(this.c, this.d, this.b, (kx1) obj4, (mue) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                k99.n(this.b, (List) obj4, this.c, this.d, (a26) obj3, (l46) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                ief.a(this.b, this.c, this.d, (n26) obj4, (a26) obj3, (l46) obj, iP3);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ lx1(j09 j09Var, int i, int i2, n26 n26Var, a26 a26Var, int i3) {
        this.b = j09Var;
        this.c = i;
        this.d = i2;
        this.f = n26Var;
        this.g = a26Var;
        this.e = i3;
    }

    public /* synthetic */ lx1(j09 j09Var, List list, int i, int i2, a26 a26Var, int i3) {
        this.b = j09Var;
        this.f = list;
        this.c = i;
        this.d = i2;
        this.g = a26Var;
        this.e = i3;
    }
}
