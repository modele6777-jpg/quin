package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yk implements l26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ m26 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ yk(j09 j09Var, String str, String str2, int i, kt8 kt8Var, dvd dvdVar, boolean z, boolean z2, String str3, x16 x16Var, a26 a26Var, int i2) {
        this.w = j09Var;
        this.b = str;
        this.x = str2;
        this.g = i;
        this.z = kt8Var;
        this.X = dvdVar;
        this.d = z;
        this.e = z2;
        this.y = str3;
        this.c = x16Var;
        this.f = a26Var;
        this.v = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        wef wefVar = wef.a;
        m26 m26Var = this.f;
        Object obj3 = this.X;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(this.v | 1);
                ok8.a((j09) obj7, this.b, (String) obj6, this.g, (kt8) obj4, (dvd) obj3, this.d, this.e, (String) obj5, this.c, (a26) m26Var, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                dj6.h(this.b, (TarotSkinIdentify) obj7, (l26) obj6, this.c, (l26) obj5, this.d, this.e, (x16) obj4, (a26) m26Var, (a26) obj3, (l46) obj, iP2, this.v);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                kj0.F(this.b, (l26) obj7, (String) obj6, (String) obj5, this.d, this.e, (s84) obj4, this.c, (x16) obj3, (x16) m26Var, (l46) obj, iP3, this.v);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ yk(String str, l26 l26Var, String str2, String str3, boolean z, boolean z2, s84 s84Var, x16 x16Var, x16 x16Var2, x16 x16Var3, int i, int i2) {
        this.b = str;
        this.w = l26Var;
        this.x = str2;
        this.y = str3;
        this.d = z;
        this.e = z2;
        this.z = s84Var;
        this.c = x16Var;
        this.X = x16Var2;
        this.f = x16Var3;
        this.g = i;
        this.v = i2;
    }

    public /* synthetic */ yk(String str, TarotSkinIdentify tarotSkinIdentify, l26 l26Var, x16 x16Var, l26 l26Var2, boolean z, boolean z2, x16 x16Var2, a26 a26Var, a26 a26Var2, int i, int i2) {
        this.b = str;
        this.w = tarotSkinIdentify;
        this.x = l26Var;
        this.c = x16Var;
        this.y = l26Var2;
        this.d = z;
        this.e = z2;
        this.z = x16Var2;
        this.f = a26Var;
        this.X = a26Var2;
        this.g = i;
        this.v = i2;
    }
}
