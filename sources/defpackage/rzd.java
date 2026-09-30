package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rzd implements wj5 {
    public final /* synthetic */ c7e a;

    public rzd(c7e c7eVar) {
        this.a = c7eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        qzd qzdVar;
        if (xn2Var instanceof qzd) {
            qzdVar = (qzd) xn2Var;
            int i = qzdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qzdVar.label = i - Integer.MIN_VALUE;
            } else {
                qzdVar = new qzd(this, xn2Var);
            }
        } else {
            qzdVar = new qzd(this, xn2Var);
        }
        Object obj = qzdVar.result;
        int i2 = qzdVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            oo3.f();
            return null;
        }
        jzb.q(obj);
        tzd tzdVar = new tzd(new imb(), xj5Var);
        qzdVar.L$0 = null;
        qzdVar.L$1 = null;
        qzdVar.L$2 = null;
        qzdVar.L$3 = null;
        qzdVar.I$0 = 0;
        qzdVar.label = 1;
        this.a.b(tzdVar, qzdVar);
        return bw2.a;
    }
}
