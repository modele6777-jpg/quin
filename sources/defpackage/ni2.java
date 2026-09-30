package defpackage;

import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j09 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    public /* synthetic */ ni2(int i, int i2, l26 l26Var, j09 j09Var, boolean z, z67 z67Var, int i3, int i4) {
        this.a = 2;
        this.b = i;
        this.c = i2;
        this.f = l26Var;
        this.d = j09Var;
        this.e = z;
        this.g = z67Var;
        this.v = i3;
        this.w = i4;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.v;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                n16.h(this.b, this.c, this.d, this.e, (CardLayoutConfig) obj4, (dd2) obj3, (l46) obj, iP, this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                n16.h(this.b, this.c, this.d, this.e, (CardLayoutConfig) obj4, (dd2) obj3, (l46) obj, iP2, this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                uyb.f(this.b, this.c, (l26) obj4, this.d, this.e, (z67) obj3, (l46) obj, iP3, this.w);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ni2(int i, int i2, j09 j09Var, boolean z, CardLayoutConfig cardLayoutConfig, dd2 dd2Var, int i3, int i4, int i5) {
        this.a = i5;
        this.b = i;
        this.c = i2;
        this.d = j09Var;
        this.e = z;
        this.f = cardLayoutConfig;
        this.g = dd2Var;
        this.v = i3;
        this.w = i4;
    }
}
