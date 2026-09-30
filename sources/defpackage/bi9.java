package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bi9 extends gbe implements l26 {
    final /* synthetic */ int $touchpointId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi9(int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$touchpointId = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bi9(this.$touchpointId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ynb.V(lw2.a, null, null, new w0f(this.$touchpointId, null, null), 3);
        x1f x1fVar = x1f.a;
        x1f.k(new r05("popup_view"), new xp(this.$touchpointId, 16), 2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        bi9 bi9Var = (bi9) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        bi9Var.r(wefVar);
        return wefVar;
    }
}
