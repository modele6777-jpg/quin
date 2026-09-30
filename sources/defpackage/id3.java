package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class id3 extends gbe implements l26 {
    final /* synthetic */ cb3 $curData;
    final /* synthetic */ l26 $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id3(l26 l26Var, cb3 cb3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transform = l26Var;
        this.$curData = cb3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new id3(this.$transform, this.$curData, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        l26 l26Var = this.$transform;
        Object obj2 = this.$curData.b;
        this.label = 1;
        Object objZ = l26Var.z(obj2, this);
        bw2 bw2Var = bw2.a;
        return objZ == bw2Var ? bw2Var : objZ;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((id3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
