package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uu0 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd2 b;

    public /* synthetic */ uu0(dd2 dd2Var, int i) {
        this.a = i;
        this.b = dd2Var;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        wef wefVar = wef.a;
        dd2 dd2Var = this.b;
        switch (i) {
            case 0:
                rf0 rf0Var = (rf0) obj2;
                l46 l46Var = (l46) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((c4c) obj).getClass();
                rf0Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= l46Var.g(rf0Var) ? 32 : 16;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 145) != 144)) {
                    l46Var.Z();
                } else if (rf0Var.b.b != null) {
                    l46Var.f0(248921837);
                    dd2Var.m(rf0Var, l46Var, Integer.valueOf((iIntValue >> 3) & 14));
                    l46Var.r(false);
                } else {
                    l46Var.f0(248876794);
                    vd0.e("", null, null, null, 0, false, 0, 0, null, l46Var, 6, 1022);
                    l46Var.r(false);
                }
                break;
            case 1:
                rf0 rf0Var2 = (rf0) obj2;
                l46 l46Var2 = (l46) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((c4c) obj).getClass();
                rf0Var2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= l46Var2.g(rf0Var2) ? 32 : 16;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    l46Var2.Z();
                } else if (rf0Var2.b.b != null) {
                    l46Var2.f0(-791370002);
                    dd2Var.m(rf0Var2, l46Var2, Integer.valueOf((iIntValue2 >> 3) & 14));
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-791415045);
                    vd0.e("", null, null, null, 0, false, 0, 0, null, l46Var2, 6, 1022);
                    l46Var2.r(false);
                }
                break;
            case 2:
                Integer num = (Integer) obj2;
                int iIntValue3 = num.intValue();
                l46 l46Var3 = (l46) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= l46Var3.e(iIntValue3) ? 32 : 16;
                }
                if (!l46Var3.W(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    l46Var3.Z();
                } else {
                    dd2Var.m(num, l46Var3, Integer.valueOf((iIntValue4 >> 3) & 14));
                }
                break;
            case 3:
                vw7 vw7Var = (vw7) obj;
                ((Integer) obj2).getClass();
                l46 l46Var4 = (l46) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var4.g(vw7Var) ? 4 : 2;
                }
                if (!l46Var4.W(iIntValue5 & 1, (iIntValue5 & 131) != 130)) {
                    l46Var4.Z();
                } else {
                    dd2Var.m(vw7Var, l46Var4, Integer.valueOf(iIntValue5 & 14));
                }
                break;
            default:
                mx7 mx7Var = (mx7) obj;
                ((Integer) obj2).getClass();
                l46 l46Var5 = (l46) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= l46Var5.g(mx7Var) ? 4 : 2;
                }
                if (!l46Var5.W(iIntValue6 & 1, (iIntValue6 & 131) != 130)) {
                    l46Var5.Z();
                } else {
                    dd2Var.m(mx7Var, l46Var5, Integer.valueOf(iIntValue6 & 14));
                }
                break;
        }
        return wefVar;
    }
}
