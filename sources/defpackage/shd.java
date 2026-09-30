package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class shd {
    public final l26 a;
    public final x16 b;

    public shd() {
        v5c v5cVar = new v5c(2, ihd.a, ihd.class, "enqueue", "enqueue(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7);
        yv9 yv9Var = new yv9(0, xhd.a, xhd.class, "snapshot", "snapshot()Ljava/util/Map;", 0, 17);
        this.a = v5cVar;
        this.b = yv9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(phd phdVar, zn2 zn2Var) {
        qhd qhdVar;
        if (zn2Var instanceof qhd) {
            qhdVar = (qhd) zn2Var;
            int i = qhdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qhdVar.label = i - Integer.MIN_VALUE;
            } else {
                qhdVar = new qhd(this, zn2Var);
            }
        } else {
            qhdVar = new qhd(this, zn2Var);
        }
        Object obj = qhdVar.result;
        int i2 = qhdVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            fg9 fg9Var = fg9.b;
            rhd rhdVar = new rhd(this, phdVar, null);
            qhdVar.L$0 = null;
            qhdVar.label = 1;
            Object objP0 = ynb.p0(fg9Var, rhdVar, qhdVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
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
