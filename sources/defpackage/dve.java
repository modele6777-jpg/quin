package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dve implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd2 b;

    public /* synthetic */ dve(dd2 dd2Var, int i) {
        this.a = 2;
        this.b = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        byte b = 0;
        wef wefVar = wef.a;
        dd2 dd2Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    e1b e1bVarA = iue.a.a(o7c.n(l46Var));
                    e1b e1bVarF = ib8.f(((m82) l46Var.k(o82.a)).q, em2.a);
                    e1b e1bVarA2 = o82.b.a(Boolean.FALSE);
                    pr4 pr4Var = nte.a;
                    mh3.b(new e1b[]{e1bVarA, e1bVarF, e1bVarA2, pr4Var.a(mue.a((mue) l46Var.k(pr4Var), 0L, 0L, null, ((y8b) l46Var.k(x8b.a)).b, 0L, null, 0, 0L, null, null, 16777183))}, af1.b0(1806766023, new dve(dd2Var, i2, b), l46Var), l46Var, 48);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    dd2Var.z(l46Var2, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                o7c.b(dd2Var, (l46) obj, k99.P(7));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dve(dd2 dd2Var, int i, byte b) {
        this.a = i;
        this.b = dd2Var;
    }
}
