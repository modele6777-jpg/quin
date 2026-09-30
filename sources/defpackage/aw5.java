package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aw5 extends gbe implements a26 {
    final /* synthetic */ String $period;
    int label;
    final /* synthetic */ gw5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw5(gw5 gw5Var, String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = gw5Var;
        this.$period = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new aw5(this.this$0, this.$period, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gl glVar = this.this$0.a;
            zv5 zv5Var = new zv5(this.$period, null);
            this.label = 1;
            Object objZ = glVar.z(zv5Var, this);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
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
}
