package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 extends gbe implements l26 {
    int label;
    final /* synthetic */ gc1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec1(gc1 gc1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gc1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ec1(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        eyf eyfVar;
        qo1 qo1Var;
        Object objB;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            jzb.q(obj);
            gc1 gc1Var = this.this$0;
            this.label = 1;
            mmb mmbVar = new mmb();
            synchronized (gc1Var.q) {
                eyfVar = gc1Var.y;
                qo1Var = gc1Var.z;
                mmbVar.element = qo1Var;
            }
            if (eyfVar == null || qo1Var == null || (objB = eyfVar.i.b(new qb1(i2, mmbVar, gc1Var), this)) != bw2Var) {
                objB = wef.a;
            }
            if (objB == bw2Var) {
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
        return ((ec1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
