package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ehd extends gbe implements l26 {
    final /* synthetic */ s7a $record;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehd(s7a s7aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$record = s7aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ehd(this.$record, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ihd ihdVar = ihd.a;
            dhd dhdVar = new dhd(this.$record, null);
            this.label = 1;
            Object objA = ihdVar.a(dhdVar, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ehd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
