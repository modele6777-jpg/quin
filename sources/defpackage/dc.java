package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ dc(long j, ii6 ii6Var, boolean z, lb lbVar, UserSubscriptionInformation userSubscriptionInformation, fb fbVar, x16 x16Var) {
        this.b = j;
        this.e = ii6Var;
        this.c = z;
        this.f = lbVar;
        this.g = userSubscriptionInformation;
        this.v = fbVar;
        this.d = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ii6 ii6Var = (ii6) obj6;
                lb lbVar = (lb) obj5;
                UserSubscriptionInformation userSubscriptionInformation = (UserSubscriptionInformation) obj4;
                fb fbVar = (fb) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarC);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    lc.w(d31.a.b(g09Var), this.b, ii6Var, this.c, l46Var, 0);
                    lc.f(ynb.d0(24.0f, 0.0f, 24.0f, 16.0f, 2, g09Var), lbVar, userSubscriptionInformation, fbVar, this.d, l46Var, (UserSubscriptionInformation.$stable << 6) | 6, 0);
                    l46Var.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                y41.b((String) obj6, this.b, this.c, this.d, (a26) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dc(String str, long j, boolean z, x16 x16Var, a26 a26Var, x16 x16Var2, x16 x16Var3, int i) {
        this.e = str;
        this.b = j;
        this.c = z;
        this.d = x16Var;
        this.f = a26Var;
        this.g = x16Var2;
        this.v = x16Var3;
    }
}
