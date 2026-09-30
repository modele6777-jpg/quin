package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ r8(a26 a26Var, j09 j09Var, a26 a26Var2, a26 a26Var3, a26 a26Var4, int i, int i2) {
        this.a = 2;
        this.f = a26Var;
        this.b = j09Var;
        this.g = a26Var2;
        this.v = a26Var3;
        this.c = a26Var4;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                x8.d((String) obj6, (String) obj5, this.b, (y72) obj4, (x16) obj3, (l46) obj, iP, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                lc.f(this.b, (lb) obj6, (UserSubscriptionInformation) obj5, (fb) obj4, (x16) obj3, (l46) obj, iP2, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                xo1.b((a26) obj6, this.b, (a26) obj5, (a26) obj4, (a26) obj3, (l46) obj, iP3, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(this.e | 1);
                ynb.i(this.b, (tc0) obj6, (wc0) obj5, this.d, (ndb) obj4, (dd2) obj3, (l46) obj, iP4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i2 | 1);
                b4c.a((c4c) obj6, (k00) obj5, this.b, (a26) obj4, (Map) obj3, (l46) obj, iP5, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP6 = k99.P(i2 | 1);
                b4d.f(this.b, (c4d) obj6, (l26) obj5, (l26) obj4, (x16) obj3, (l46) obj, iP6, this.e);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ r8(j09 j09Var, tc0 tc0Var, wc0 wc0Var, int i, ndb ndbVar, dd2 dd2Var, int i2) {
        this.a = 3;
        this.b = j09Var;
        this.f = tc0Var;
        this.g = wc0Var;
        this.d = i;
        this.v = ndbVar;
        this.c = dd2Var;
        this.e = i2;
    }

    public /* synthetic */ r8(j09 j09Var, Object obj, Object obj2, Object obj3, x16 x16Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = j09Var;
        this.f = obj;
        this.g = obj2;
        this.v = obj3;
        this.c = x16Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ r8(Object obj, CharSequence charSequence, j09 j09Var, Object obj2, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.g = charSequence;
        this.b = j09Var;
        this.v = obj2;
        this.c = obj3;
        this.d = i;
        this.e = i2;
    }
}
