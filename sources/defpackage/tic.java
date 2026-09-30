package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tic implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public tic(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        qic qicVar;
        if (xn2Var instanceof qic) {
            qicVar = (qic) xn2Var;
            int i = qicVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qicVar.label = i - Integer.MIN_VALUE;
            } else {
                qicVar = new qic(this, xn2Var);
            }
        } else {
            qicVar = new qic(this, xn2Var);
        }
        Object obj = qicVar.result;
        int i2 = qicVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            sic sicVar = new sic(xj5Var, this.b, this.c);
            qicVar.L$0 = null;
            qicVar.L$1 = null;
            qicVar.L$2 = null;
            qicVar.label = 1;
            Object objB = this.a.b(sicVar, qicVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
