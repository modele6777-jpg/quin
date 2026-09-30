package defpackage;

import ai.askquin.ui.router.GiftCardPerspective;
import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import java.util.List;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ fc(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, rp1 rp1Var, cr1 cr1Var, dd2 dd2Var, int i) {
        this.a = 1;
        this.b = x16Var;
        this.e = j09Var;
        this.c = z;
        this.f = x4dVar;
        this.g = rp1Var;
        this.v = cr1Var;
        this.w = dd2Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        wef wefVar = wef.a;
        Object obj3 = this.w;
        Object obj4 = this.b;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                lc.o((lb) obj8, (UserSubscriptionInformation) obj7, (SubscriptionKind) obj6, (fb) obj5, this.c, (x16) obj4, (x16) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                bzd.c((x16) obj4, (j09) obj8, this.c, (x4d) obj7, (rp1) obj6, (cr1) obj5, (dd2) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                cn1.k((yye) obj8, (x16) obj4, (d5e) obj7, (d5e) obj6, (j09) obj5, this.c, (qy1) obj3, (l46) obj, iP3);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iP4 = k99.P(i2 | 1);
                pa6.a((z76) obj8, (GiftCardPerspective) obj7, this.c, (x16) obj4, (x16) obj3, (a26) obj6, (l26) obj5, (l46) obj, iP4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i2 | 1);
                pa6.i((String) obj8, (String) obj7, (String) obj6, (a26) obj5, this.c, (String) obj4, (List) obj3, (l46) obj, iP5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP6 = k99.P(24647);
                b87.a((j09) obj8, (c87) obj7, this.d, this.c, (a26) obj6, (a26) obj5, (x16) obj4, (x16) obj3, (l46) obj, iP6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iP7 = k99.P(i2 | 1);
                kj0.z((j09) obj8, (nsb) obj7, (x16) obj4, this.c, (x16) obj3, (x16) obj6, (a26) obj5, (l46) obj, iP7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP8 = k99.P(i2 | 1);
                epd.c((gpd) obj8, (j09) obj7, this.c, (pod) obj6, (t69) obj5, (dd2) obj4, (dd2) obj3, (l46) obj, iP8);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ fc(z76 z76Var, GiftCardPerspective giftCardPerspective, boolean z, x16 x16Var, x16 x16Var2, a26 a26Var, l26 l26Var, int i) {
        this.a = 3;
        this.e = z76Var;
        this.f = giftCardPerspective;
        this.c = z;
        this.b = x16Var;
        this.w = x16Var2;
        this.g = a26Var;
        this.v = l26Var;
        this.d = i;
    }

    public /* synthetic */ fc(j09 j09Var, c87 c87Var, int i, boolean z, a26 a26Var, a26 a26Var2, x16 x16Var, x16 x16Var2, int i2) {
        this.a = 5;
        this.e = j09Var;
        this.f = c87Var;
        this.d = i;
        this.c = z;
        this.g = a26Var;
        this.v = a26Var2;
        this.b = x16Var;
        this.w = x16Var2;
    }

    public /* synthetic */ fc(j09 j09Var, nsb nsbVar, x16 x16Var, boolean z, x16 x16Var2, x16 x16Var3, a26 a26Var, int i) {
        this.a = 6;
        this.e = j09Var;
        this.f = nsbVar;
        this.b = x16Var;
        this.c = z;
        this.w = x16Var2;
        this.g = x16Var3;
        this.v = a26Var;
        this.d = i;
    }

    public /* synthetic */ fc(gpd gpdVar, j09 j09Var, boolean z, pod podVar, t69 t69Var, dd2 dd2Var, dd2 dd2Var2, int i) {
        this.a = 7;
        this.e = gpdVar;
        this.f = j09Var;
        this.c = z;
        this.g = podVar;
        this.v = t69Var;
        this.b = dd2Var;
        this.w = dd2Var2;
        this.d = i;
    }

    public /* synthetic */ fc(yye yyeVar, x16 x16Var, d5e d5eVar, d5e d5eVar2, j09 j09Var, boolean z, qy1 qy1Var, int i) {
        this.a = 2;
        this.e = yyeVar;
        this.b = x16Var;
        this.f = d5eVar;
        this.g = d5eVar2;
        this.v = j09Var;
        this.c = z;
        this.w = qy1Var;
        this.d = i;
    }

    public /* synthetic */ fc(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.v = obj4;
        this.c = z;
        this.b = obj5;
        this.w = obj6;
        this.d = i;
    }
}
