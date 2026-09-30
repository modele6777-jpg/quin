package defpackage;

import ai.askquin.ui.onboard.OnboardingActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo9 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eo9(int i, Object obj) {
        this.a = 0;
        this.b = obj;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = 2;
        Object obj3 = this.b;
        byte b = 0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ap9.a(obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 1:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = OnboardingActivity.Q0;
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o7c.a(false, null, af1.b0(1032356387, new eo9(obj3, i2, b), l46Var), l46Var, 384, 3);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = OnboardingActivity.Q0;
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                    return wefVar;
                }
                pwf pwfVarA = qd8.a(l46Var2);
                if (pwfVarA != null) {
                    mh3.a(snd.a.a((die) tm7.t(((hod) z5c.G(job.a.b(hod.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null)).b, l46Var2).getValue()), af1.b0(1272100579, new eo9(obj3, 3, b), l46Var2), l46Var2, 56);
                    return wefVar;
                }
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i5 = OnboardingActivity.Q0;
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ap9.a(obj3, l46Var3, 0);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ eo9(Object obj, int i, byte b) {
        this.a = i;
        this.b = obj;
    }
}
