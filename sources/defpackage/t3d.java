package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t3d extends gbe implements l26 {
    int label;
    final /* synthetic */ w3d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3d(w3d w3dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = w3dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t3d(this.this$0, xn2Var);
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
        wj5 data = this.this$0.b.getData();
        this.label = 1;
        Object objB = tm7.B(data, this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t3d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
