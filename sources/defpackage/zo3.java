package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zo3 extends gbe implements l26 {
    final /* synthetic */ x16 $onFinished;
    int label;
    final /* synthetic */ bp3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo3(bp3 bp3Var, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = bp3Var;
        this.$onFinished = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zo3(this.this$0, this.$onFinished, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        bp3 bp3Var = this.this$0;
        bp3Var.z = this.$onFinished;
        s0e s0eVar = bp3Var.X;
        y45 y45Var = bp3Var.b;
        wef wefVar = wef.a;
        if (y45Var != null) {
            if (bp3Var.g) {
                bp3Var.g = false;
                do {
                    value = s0eVar.getValue();
                } while (!s0eVar.l(value, xha.a((xha) value, false, false, 0L, 0L, 0L, null, 31)));
                y45Var.P(true);
                y45Var.D();
                this.this$0.m();
                return wefVar;
            }
            if (((xha) s0eVar.getValue()).b && !y45Var.x()) {
                y45Var.P(true);
                this.this$0.m();
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        zo3 zo3Var = (zo3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        zo3Var.r(wefVar);
        return wefVar;
    }
}
