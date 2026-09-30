package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v9b implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public v9b(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        s9b s9bVar;
        if (xn2Var instanceof s9b) {
            s9bVar = (s9b) xn2Var;
            int i = s9bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                s9bVar.label = i - Integer.MIN_VALUE;
            } else {
                s9bVar = new s9b(this, xn2Var);
            }
        } else {
            s9bVar = new s9b(this, xn2Var);
        }
        Object obj = s9bVar.result;
        int i2 = s9bVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            u9b u9bVar = new u9b(xj5Var, this.b, this.c);
            s9bVar.L$0 = null;
            s9bVar.L$1 = null;
            s9bVar.L$2 = null;
            s9bVar.label = 1;
            Object objB = this.a.b(u9bVar, s9bVar);
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
