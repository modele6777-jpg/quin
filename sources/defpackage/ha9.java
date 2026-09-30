package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha9 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l26 c;

    public /* synthetic */ ha9(boolean z, l26 l26Var) {
        this.b = z;
        this.c = l26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        l26 l26Var = this.c;
        boolean z = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                jgb.v(z, l26Var, l46Var, k99.P(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    if (z) {
                        l46Var.f0(632991597);
                        l26Var.z(l46Var, 0);
                    } else {
                        l46Var.f0(632992130);
                        fbc.a(af1.b0(1444240504, new sb0(6, l26Var), l46Var), l46Var, 6);
                    }
                    l46Var.r(false);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ha9(boolean z, l26 l26Var, int i) {
        this.b = z;
        this.c = l26Var;
    }
}
