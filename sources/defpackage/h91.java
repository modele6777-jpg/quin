package defpackage;

import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h91 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ h91(d92 d92Var, j09 j09Var, String str, boolean z, boolean z2, a26 a26Var, khb khbVar, int i, int i2) {
        this.g = d92Var;
        this.b = j09Var;
        this.v = str;
        this.c = z;
        this.d = z2;
        this.w = a26Var;
        this.x = khbVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.f;
        wef wefVar = wef.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                int iP2 = k99.P(i3);
                vd0.f(this.b, (r91) obj6, this.c, this.d, (xw9) obj5, (lm2) obj4, (dd2) obj3, (l46) obj, iP, iP2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                vd0.k((d92) obj6, this.b, (String) obj5, this.c, this.d, (a26) obj4, (khb) obj3, (l46) obj, iP3, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i3 | 1);
                zrc.d((sdd) obj6, this.e, (TarotCardChoice) obj5, this.c, this.d, (ly) obj4, (x16) obj3, this.b, (l46) obj, iP4);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ h91(j09 j09Var, r91 r91Var, boolean z, boolean z2, xw9 xw9Var, lm2 lm2Var, dd2 dd2Var, int i, int i2) {
        this.b = j09Var;
        this.g = r91Var;
        this.c = z;
        this.d = z2;
        this.v = xw9Var;
        this.w = lm2Var;
        this.x = dd2Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ h91(sdd sddVar, int i, TarotCardChoice tarotCardChoice, boolean z, boolean z2, ly lyVar, x16 x16Var, j09 j09Var, int i2) {
        this.g = sddVar;
        this.e = i;
        this.v = tarotCardChoice;
        this.c = z;
        this.d = z2;
        this.w = lyVar;
        this.x = x16Var;
        this.b = j09Var;
        this.f = i2;
    }
}
