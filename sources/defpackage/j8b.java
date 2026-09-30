package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j8b implements wj5 {
    public final /* synthetic */ dra a;

    public j8b(dra draVar) {
        this.a = draVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        g8b g8bVar;
        if (xn2Var instanceof g8b) {
            g8bVar = (g8b) xn2Var;
            int i = g8bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                g8bVar.label = i - Integer.MIN_VALUE;
            } else {
                g8bVar = new g8b(this, xn2Var);
            }
        } else {
            g8bVar = new g8b(this, xn2Var);
        }
        Object obj = g8bVar.result;
        int i2 = g8bVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            i8b i8bVar = new i8b(xj5Var);
            g8bVar.L$0 = null;
            g8bVar.L$1 = null;
            g8bVar.L$2 = null;
            g8bVar.label = 1;
            Object objB = this.a.b(i8bVar, g8bVar);
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
