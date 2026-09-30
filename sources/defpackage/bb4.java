package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ m26 v;

    public /* synthetic */ bb4(j09 j09Var, int i, int i2, boolean z, n26 n26Var, a26 a26Var, int i3) {
        this.a = 4;
        this.b = j09Var;
        this.d = i;
        this.e = i2;
        this.c = z;
        this.g = n26Var;
        this.v = a26Var;
        this.f = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        int i3 = this.e;
        wef wefVar = wef.a;
        m26 m26Var = this.v;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i3 | 1);
                x57.s(this.b, this.d, (String) obj3, this.c, (x16) m26Var, (l46) obj, iP, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i3 | 1);
                if9.e(this.b, (eh4) obj3, this.c, this.d, (a26) m26Var, (l46) obj, iP2, this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i3 | 1);
                k99.i(this.b, (z19) obj3, this.c, this.d, (a26) m26Var, (l46) obj, iP3, this.f);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                dxd.a((List) obj3, this.d, this.e, (a26) m26Var, this.b, this.c, (l46) obj, iP4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i2 | 1);
                ief.f(this.b, this.d, this.e, this.c, (n26) obj3, (a26) m26Var, (l46) obj, iP5);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ bb4(j09 j09Var, int i, String str, boolean z, x16 x16Var, int i2, int i3) {
        this.a = 0;
        this.b = j09Var;
        this.d = i;
        this.g = str;
        this.c = z;
        this.v = x16Var;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ bb4(j09 j09Var, Object obj, boolean z, int i, a26 a26Var, int i2, int i3, int i4) {
        this.a = i4;
        this.b = j09Var;
        this.g = obj;
        this.c = z;
        this.d = i;
        this.v = a26Var;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ bb4(List list, int i, int i2, a26 a26Var, j09 j09Var, boolean z, int i3) {
        this.a = 3;
        this.g = list;
        this.d = i;
        this.e = i2;
        this.v = a26Var;
        this.b = j09Var;
        this.c = z;
        this.f = i3;
    }
}
