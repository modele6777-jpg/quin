package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y3c implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ o4c c;
    public final /* synthetic */ dd2 d;

    public /* synthetic */ y3c(j09 j09Var, o4c o4cVar, dd2 dd2Var) {
        this.b = j09Var;
        this.c = o4cVar;
        this.d = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    tq.a(this.b, this.c, this.d, l46Var, 0, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                z3c.a(this.b, this.c, this.d, (l46) obj, k99.P(385));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ y3c(j09 j09Var, o4c o4cVar, dd2 dd2Var, int i) {
        this.b = j09Var;
        this.c = o4cVar;
        this.d = dd2Var;
    }
}
