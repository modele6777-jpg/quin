package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c1c implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ String b;

    public c1c(wj5 wj5Var, String str) {
        this.a = wj5Var;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        z0c z0cVar;
        if (xn2Var instanceof z0c) {
            z0cVar = (z0c) xn2Var;
            int i = z0cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0cVar.label = i - Integer.MIN_VALUE;
            } else {
                z0cVar = new z0c(this, xn2Var);
            }
        } else {
            z0cVar = new z0c(this, xn2Var);
        }
        Object obj = z0cVar.result;
        int i2 = z0cVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            b1c b1cVar = new b1c(xj5Var, this.b);
            z0cVar.L$0 = null;
            z0cVar.L$1 = null;
            z0cVar.L$2 = null;
            z0cVar.label = 1;
            Object objB = this.a.b(b1cVar, z0cVar);
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
