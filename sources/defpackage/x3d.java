package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x3d implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ m26 x;
    public final /* synthetic */ Object y;

    public /* synthetic */ x3d(j09 j09Var, x6d x6dVar, int i, n26 n26Var, List list, boolean z, boolean z2, a26 a26Var, x16 x16Var, a26 a26Var2, int i2) {
        this.f = j09Var;
        this.g = x6dVar;
        this.b = i;
        this.v = n26Var;
        this.w = list;
        this.c = z;
        this.d = z2;
        this.x = a26Var;
        this.e = x16Var;
        this.y = a26Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.y;
        m26 m26Var = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(this.b | 1);
                b4d.i(this.c, (UserSubscriptionInformation) obj7, (dc9) obj6, (e4d) obj5, (zz5) obj4, this.d, this.e, (yic) obj3, (x16) m26Var, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(65);
                ief.d((j09) obj7, (x6d) obj6, this.b, (n26) obj5, (List) obj4, this.c, this.d, (a26) m26Var, this.e, (a26) obj3, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ x3d(boolean z, UserSubscriptionInformation userSubscriptionInformation, dc9 dc9Var, e4d e4dVar, zz5 zz5Var, boolean z2, x16 x16Var, yic yicVar, x16 x16Var2, int i) {
        this.c = z;
        this.f = userSubscriptionInformation;
        this.g = dc9Var;
        this.v = e4dVar;
        this.w = zz5Var;
        this.d = z2;
        this.e = x16Var;
        this.y = yicVar;
        this.x = x16Var2;
        this.b = i;
    }
}
