package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class goc implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j09 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ goc(j09 j09Var, mmd mmdVar, float f, boolean z, x16 x16Var, int i) {
        this.c = j09Var;
        this.e = mmdVar;
        this.d = f;
        this.b = z;
        this.f = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(385);
                u3c.a((List) obj4, (yx9) obj3, this.c, this.d, this.b, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(24625);
                y8c.b(this.b, this.c, this.d, (x16) obj4, (dd2) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(3073);
                n3d.a(this.c, (mmd) obj4, this.d, this.b, (x16) obj3, (l46) obj, iP3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(1);
                h4g.l((String) obj4, (String) obj3, this.b, this.d, this.c, (l46) obj, iP4);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ goc(String str, String str2, boolean z, float f, j09 j09Var, int i) {
        this.e = str;
        this.f = str2;
        this.b = z;
        this.d = f;
        this.c = j09Var;
    }

    public /* synthetic */ goc(List list, yx9 yx9Var, j09 j09Var, float f, boolean z, int i) {
        this.e = list;
        this.f = yx9Var;
        this.c = j09Var;
        this.d = f;
        this.b = z;
    }

    public /* synthetic */ goc(boolean z, j09 j09Var, float f, x16 x16Var, dd2 dd2Var, int i) {
        this.b = z;
        this.c = j09Var;
        this.d = f;
        this.e = x16Var;
        this.f = dd2Var;
    }
}
