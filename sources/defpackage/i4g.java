package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i4g implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c31 b;

    public /* synthetic */ i4g(c31 c31Var, int i) {
        this.a = i;
        this.b = c31Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        c31 c31Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    feg.j(od4.A(R.drawable.bg_widget_onboarding_popup, 0, l46Var), null, c31Var.b(g09Var), ndb.c, an2.a, 0.0f, null, l46Var, 27704, 96);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    feg.j(od4.A(R.drawable.bg_widget_onboarding_popup, 0, l46Var2), null, c31Var.b(g09Var), ndb.c, an2.a, 0.0f, null, l46Var2, 27704, 96);
                }
                break;
        }
        return wefVar;
    }
}
