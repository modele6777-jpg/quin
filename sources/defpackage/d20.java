package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d20 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d20(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        x1f x1fVar = x1f.a;
        x1f.k(new r05("popup_view"), new zv(8), 2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        d20 d20Var = (d20) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        d20Var.r(wefVar);
        return wefVar;
    }
}
