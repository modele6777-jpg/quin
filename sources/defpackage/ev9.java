package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev9 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6f b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ ev9(d6f d6fVar, x16 x16Var, int i) {
        this.a = i;
        this.b = d6fVar;
        this.c = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        d6f d6fVar = this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    xxb.j(d6fVar, x16Var, null, l46Var, 0);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    xxb.j(d6fVar, x16Var, null, l46Var, 0);
                }
                break;
        }
        return wefVar;
    }
}
