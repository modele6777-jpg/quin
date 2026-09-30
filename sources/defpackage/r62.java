package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r62 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd2 b;
    public final /* synthetic */ c4c c;

    public /* synthetic */ r62(dd2 dd2Var, c4c c4cVar, int i) {
        this.a = i;
        this.b = dd2Var;
        this.c = c4cVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        c4c c4cVar = this.c;
        dd2 dd2Var = this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    dd2Var.m(c4cVar, l46Var, 0);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    dd2Var.m(c4cVar, l46Var, 0);
                }
                break;
        }
        return wefVar;
    }
}
