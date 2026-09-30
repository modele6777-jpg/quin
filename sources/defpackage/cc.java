package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import java.util.List;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ m26 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ cc(en0 en0Var, boolean z, String str, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, int i) {
        this.f = en0Var;
        this.b = z;
        this.g = str;
        this.c = x16Var;
        this.d = x16Var2;
        this.v = x16Var3;
        this.w = x16Var4;
        this.x = x16Var5;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        m26 m26Var = this.d;
        Object obj3 = this.x;
        Object obj4 = this.f;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                lc.m((j09) obj4, (lb) obj7, (UserSubscriptionInformation) obj6, (SubscriptionKind) obj5, (fb) obj3, this.b, this.c, (x16) m26Var, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                hkg.H((en0) obj4, this.b, (String) obj7, this.c, (x16) m26Var, (x16) obj6, (x16) obj5, (x16) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                g21.e((sdd) obj7, (j09) obj4, (xw9) obj6, (Integer) obj5, this.b, (a26) obj3, (l26) m26Var, this.c, (l46) obj, iP3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                dj6.v((j09) obj4, (l26) obj7, (sfb) obj6, this.b, this.c, (x16) m26Var, (x16) obj5, (x16) obj3, (l46) obj, iP4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i2 | 1);
                zrc.c((sdd) obj7, (ly) obj6, (List) obj5, this.b, this.c, (j09) obj4, (xw9) obj3, (l26) m26Var, (l46) obj, iP5);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cc(j09 j09Var, lb lbVar, UserSubscriptionInformation userSubscriptionInformation, SubscriptionKind subscriptionKind, fb fbVar, boolean z, x16 x16Var, x16 x16Var2, int i) {
        this.f = j09Var;
        this.g = lbVar;
        this.v = userSubscriptionInformation;
        this.w = subscriptionKind;
        this.x = fbVar;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
        this.e = i;
    }

    public /* synthetic */ cc(j09 j09Var, l26 l26Var, sfb sfbVar, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, int i) {
        this.f = j09Var;
        this.g = l26Var;
        this.v = sfbVar;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
        this.w = x16Var3;
        this.x = x16Var4;
        this.e = i;
    }

    public /* synthetic */ cc(sdd sddVar, ly lyVar, List list, boolean z, x16 x16Var, j09 j09Var, xw9 xw9Var, l26 l26Var, int i) {
        this.g = sddVar;
        this.v = lyVar;
        this.w = list;
        this.b = z;
        this.c = x16Var;
        this.f = j09Var;
        this.x = xw9Var;
        this.d = l26Var;
        this.e = i;
    }

    public /* synthetic */ cc(sdd sddVar, j09 j09Var, xw9 xw9Var, Integer num, boolean z, a26 a26Var, l26 l26Var, x16 x16Var, int i) {
        this.g = sddVar;
        this.f = j09Var;
        this.v = xw9Var;
        this.w = num;
        this.b = z;
        this.x = a26Var;
        this.d = l26Var;
        this.c = x16Var;
        this.e = i;
    }
}
