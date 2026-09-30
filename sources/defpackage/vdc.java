package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vdc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l26 b;
    public final /* synthetic */ dd2 c;
    public final /* synthetic */ l26 d;
    public final /* synthetic */ l26 e;
    public final /* synthetic */ r89 f;
    public final /* synthetic */ l26 g;

    public vdc(int i, l26 l26Var, dd2 dd2Var, l26 l26Var2, l26 l26Var3, r89 r89Var, l26 l26Var4) {
        this.a = i;
        this.b = l26Var;
        this.c = dd2Var;
        this.d = l26Var2;
        this.e = l26Var3;
        this.f = r89Var;
        this.g = l26Var4;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            xdc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
