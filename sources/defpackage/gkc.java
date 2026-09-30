package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gkc implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ jkc b;
    public final /* synthetic */ mic c;

    public /* synthetic */ gkc(jkc jkcVar, mic micVar) {
        this.b = jkcVar;
        this.c = micVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        mic micVar = this.c;
        jkc jkcVar = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    int i2 = jkc.Y;
                    vtb.f(jkcVar, micVar, l46Var, 8);
                }
                break;
            default:
                num.getClass();
                vtb.f(jkcVar, micVar, l46Var, k99.P(9));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ gkc(jkc jkcVar, mic micVar, int i) {
        this.b = jkcVar;
        this.c = micVar;
    }
}
