package defpackage;

import tech.chatmind.api.RecommendQuestion;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p83 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p83(int i, RecommendQuestion recommendQuestion, a26 a26Var, boolean z, int i2) {
        this.a = 3;
        this.c = i;
        this.e = recommendQuestion;
        this.f = a26Var;
        this.b = z;
        this.d = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        wef wefVar = wef.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i3 | 1);
                z83.m(this.b, (x16) obj4, (x16) obj3, (l46) obj, iP, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                oa7.e((bwa) obj4, this.b, this.c, (j09) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i3 | 1);
                rs0.f((j09) obj4, this.b, (dd2) obj3, (l46) obj, iP3, this.d);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iP4 = k99.P(i2 | 1);
                njb.b(this.c, (RecommendQuestion) obj4, (a26) obj3, this.b, (l46) obj, iP4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i3 | 1);
                o7c.a(this.b, (e8b) obj4, (dd2) obj3, (l46) obj, iP5, this.d);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ p83(j09 j09Var, boolean z, dd2 dd2Var, int i, int i2) {
        this.a = 2;
        this.e = j09Var;
        this.b = z;
        this.f = dd2Var;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ p83(bwa bwaVar, boolean z, int i, j09 j09Var, int i2) {
        this.a = 1;
        this.e = bwaVar;
        this.b = z;
        this.c = i;
        this.f = j09Var;
        this.d = i2;
    }

    public /* synthetic */ p83(boolean z, Object obj, m26 m26Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.e = obj;
        this.f = m26Var;
        this.c = i;
        this.d = i2;
    }
}
