package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ii6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ UserSubscriptionInformation g;
    public final /* synthetic */ x16 v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ int x;

    public /* synthetic */ qb(lb lbVar, long j, ii6 ii6Var, boolean z, boolean z2, UserSubscriptionInformation userSubscriptionInformation, fb fbVar, x16 x16Var, int i) {
        this.a = 3;
        this.b = lbVar;
        this.c = j;
        this.d = ii6Var;
        this.e = z;
        this.f = z2;
        this.g = userSubscriptionInformation;
        this.w = fbVar;
        this.v = x16Var;
        this.x = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                lc.l(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (x16) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                lc.l(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (x16) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                lc.l(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (x16) obj3, (l46) obj, iP3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                lc.u(this.b, this.c, this.d, this.e, this.f, this.g, (fb) obj3, this.v, (l46) obj, iP4);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ qb(lb lbVar, long j, ii6 ii6Var, boolean z, boolean z2, UserSubscriptionInformation userSubscriptionInformation, x16 x16Var, x16 x16Var2, int i, int i2) {
        this.a = i2;
        this.b = lbVar;
        this.c = j;
        this.d = ii6Var;
        this.e = z;
        this.f = z2;
        this.g = userSubscriptionInformation;
        this.v = x16Var;
        this.w = x16Var2;
        this.x = i;
    }
}
