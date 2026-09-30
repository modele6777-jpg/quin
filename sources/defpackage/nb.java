package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ m26 v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ nb(j09 j09Var, UserSubscriptionInformation userSubscriptionInformation, e4d e4dVar, x16 x16Var, SubscriptionKind subscriptionKind, lb lbVar, boolean z, x16 x16Var2, x16 x16Var3, int i) {
        this.d = j09Var;
        this.e = userSubscriptionInformation;
        this.f = e4dVar;
        this.g = x16Var;
        this.x = subscriptionKind;
        this.y = lbVar;
        this.c = z;
        this.v = x16Var2;
        this.w = x16Var3;
        this.b = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        x16 x16Var;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        m26 m26Var = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc.z((j09) obj9, (UserSubscriptionInformation) obj8, (e4d) obj7, (x16) obj6, (SubscriptionKind) obj4, (lb) obj3, this.c, (x16) m26Var, (x16) obj5, (l46) obj, k99.P(this.b | 1));
                break;
            default:
                j2a j2aVar = (j2a) obj9;
                String str = (String) obj8;
                final a26 a26Var = (a26) obj7;
                final h0e h0eVar = (h0e) obj6;
                final a26 a26Var2 = (a26) m26Var;
                yk8 yk8Var = (yk8) obj5;
                s69 s69Var = (s69) obj4;
                e89 e89Var = (e89) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean z2 = ((dda) h0eVar.getValue()).b() == j2a.c;
                    boolean z3 = ((dda) h0eVar.getValue()).c;
                    int size = ((dda) h0eVar.getValue()).a.size();
                    boolean zG = l46Var.g(a26Var) | l46Var.g(h0eVar);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zG || objR == i8cVar) {
                        z = false;
                        final byte b = 0 == true ? 1 : 0;
                        objR = new x16() { // from class: uca
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i2 = b;
                                wef wefVar2 = wef.a;
                                h0e h0eVar2 = h0eVar;
                                a26 a26Var3 = a26Var;
                                switch (i2) {
                                    case 0:
                                        a26Var3.d(s72.t0(((dda) h0eVar2.getValue()).b));
                                        break;
                                    default:
                                        a26Var3.d(s72.t0(((dda) h0eVar2.getValue()).b));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR);
                    } else {
                        z = false;
                    }
                    x16 x16Var2 = (x16) objR;
                    if (a26Var2 == null) {
                        l46Var.f0(-1245345199);
                        l46Var.r(z);
                        x16Var = null;
                    } else {
                        l46Var.f0(-1245345198);
                        boolean zG2 = l46Var.g(a26Var2) | l46Var.g(h0eVar);
                        Object objR2 = l46Var.R();
                        if (zG2 || objR2 == i8cVar) {
                            final int i2 = 1;
                            objR2 = new x16() { // from class: uca
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i3 = i2;
                                    wef wefVar2 = wef.a;
                                    h0e h0eVar2 = h0eVar;
                                    a26 a26Var3 = a26Var2;
                                    switch (i3) {
                                        case 0:
                                            a26Var3.d(s72.t0(((dda) h0eVar2.getValue()).b));
                                            break;
                                        default:
                                            a26Var3.d(s72.t0(((dda) h0eVar2.getValue()).b));
                                            break;
                                    }
                                    return wefVar2;
                                }
                            };
                            l46Var.p0(objR2);
                        }
                        x16Var = (x16) objR2;
                        l46Var.r(false);
                    }
                    x16 x16Var3 = x16Var;
                    boolean zI = l46Var.i(yk8Var);
                    Object objR3 = l46Var.R();
                    if (zI || objR3 == i8cVar) {
                        objR3 = new u11(yk8Var, 3);
                        l46Var.p0(objR3);
                    }
                    x16 x16Var4 = (x16) objR3;
                    Object objR4 = l46Var.R();
                    if (objR4 == i8cVar) {
                        objR4 = new ek9(14, s69Var, e89Var);
                        l46Var.p0(objR4);
                    }
                    vfh.h(j2aVar, z2, z3, size, this.b, this.c, str, x16Var2, x16Var3, x16Var4, (x16) objR4, l46Var, 0);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ nb(j2a j2aVar, int i, boolean z, String str, a26 a26Var, h0e h0eVar, a26 a26Var2, yk8 yk8Var, s69 s69Var, e89 e89Var) {
        this.d = j2aVar;
        this.b = i;
        this.c = z;
        this.e = str;
        this.f = a26Var;
        this.g = h0eVar;
        this.v = a26Var2;
        this.w = yk8Var;
        this.x = s69Var;
        this.y = e89Var;
    }
}
