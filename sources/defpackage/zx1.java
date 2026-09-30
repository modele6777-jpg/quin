package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zx1 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ aw2 d;
    public final /* synthetic */ fo5 e;

    public /* synthetic */ zx1(boolean z, a26 a26Var, aw2 aw2Var, fo5 fo5Var, int i) {
        this.a = i;
        this.b = z;
        this.c = a26Var;
        this.d = aw2Var;
        this.e = fo5Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    boolean z = this.b;
                    boolean zH = l46Var.h(z);
                    a26 a26Var = this.c;
                    boolean zG = zH | l46Var.g(a26Var);
                    aw2 aw2Var = this.d;
                    boolean zI = zG | l46Var.i(aw2Var);
                    fo5 fo5Var = this.e;
                    boolean zG2 = l46Var.g(fo5Var) | zI;
                    Object objR = l46Var.R();
                    if (zG2 || objR == i8cVar) {
                        by1 by1Var = new by1(z, a26Var, aw2Var, fo5Var, 0);
                        l46Var.p0(by1Var);
                        objR = by1Var;
                    }
                    kj0.h(z, (x16) objR, l46Var, 0);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    Object objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = ib8.e(l46Var2);
                    }
                    boolean z2 = this.b;
                    cn1.f(Boolean.valueOf(z2), null, null, "expand-collapse-icon", af1.b0(769603493, new cl((t69) objR2, z2, this.c, this.d, this.e, 2), l46Var2), l46Var2, 27648, 6);
                }
                break;
        }
        return wefVar;
    }
}
