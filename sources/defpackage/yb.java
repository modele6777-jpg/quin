package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import java.util.List;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yb(v50 v50Var, String str, x16 x16Var, x16 x16Var2, a26 a26Var, int i) {
        this.a = 10;
        this.c = v50Var;
        this.d = str;
        this.f = x16Var;
        this.e = x16Var2;
        this.g = a26Var;
        this.b = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        int i2 = this.b;
        Object obj5 = this.g;
        Object obj6 = this.d;
        wef wefVar = wef.a;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc.y((UserSubscriptionInformation) obj7, (lb) obj6, (e4d) obj3, (x16) obj4, (SubscriptionKind) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                x57.e((wae) obj7, (j09) obj6, (wy6) obj3, (yi) obj4, (bn2) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                eb3.h((String) obj7, (List) obj6, (l26) obj3, (l26) obj5, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2) | 1;
                ((dd2) obj7).i(this.d, this.e, this.f, this.g, (l46) obj, iP);
                break;
            case 4:
                ((Integer) obj2).getClass();
                x57.g((tr2) obj7, (gd4) obj6, (String) obj3, (a26) obj5, (x16) obj4, (l46) obj, k99.P(73), this.b);
                break;
            case 5:
                ((Integer) obj2).getClass();
                if9.g((fh4) obj7, (x16) obj4, (x16) obj6, (x16) obj3, (a26) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                bm8.f((oh4) obj7, (x16) obj4, (x16) obj6, (x16) obj3, (x16) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                pa6.j((p86) obj7, (x16) obj4, (a26) obj6, (a26) obj3, (x16) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                vm8.a((m82) obj7, (s39) obj6, (s5d) obj3, (p9f) obj4, (dd2) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                k99.k((a29) obj7, (x16) obj4, (x16) obj6, (a26) obj3, (a26) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                bm8.n((v50) obj7, (String) obj6, (x16) obj4, (x16) obj3, (a26) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                g21.t((n3f) obj7, (k3f) obj6, this.e, this.f, (ze5) obj5, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ yb(tr2 tr2Var, gd4 gd4Var, String str, a26 a26Var, x16 x16Var, int i, int i2) {
        this.a = 4;
        this.c = tr2Var;
        this.d = gd4Var;
        this.e = str;
        this.g = a26Var;
        this.f = x16Var;
        this.b = i2;
    }

    public /* synthetic */ yb(Object obj, x16 x16Var, m26 m26Var, m26 m26Var2, m26 m26Var3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.f = x16Var;
        this.d = m26Var;
        this.e = m26Var2;
        this.g = m26Var3;
        this.b = i;
    }

    public /* synthetic */ yb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = i;
    }

    public /* synthetic */ yb(String str, List list, l26 l26Var, l26 l26Var2, x16 x16Var, int i) {
        this.a = 2;
        this.c = str;
        this.d = list;
        this.e = l26Var;
        this.g = l26Var2;
        this.f = x16Var;
        this.b = i;
    }
}
