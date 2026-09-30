package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wm5 implements wj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ m26 d;

    public /* synthetic */ wm5(wj5 wj5Var, Object obj, m26 m26Var, int i) {
        this.a = i;
        this.b = wj5Var;
        this.c = obj;
        this.d = m26Var;
    }

    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        m26 m26Var = this.d;
        Object obj = this.c;
        wj5 wj5Var = this.b;
        switch (i) {
            case 0:
                Object objV = lmg.V(xn2Var, xj5Var, tq0.z, new xm5((n26) m26Var, null), new wj5[]{wj5Var, (wj5) obj});
                return objV == bw2Var ? objV : wefVar;
            default:
                Object objB = wj5Var.b(new gn5(xj5Var, (w5c) obj, (a26) m26Var), xn2Var);
                return objB == bw2Var ? objB : wefVar;
        }
    }
}
