package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f54 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public f54(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        c54 c54Var;
        if (xn2Var instanceof c54) {
            c54Var = (c54) xn2Var;
            int i = c54Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c54Var.label = i - Integer.MIN_VALUE;
            } else {
                c54Var = new c54(this, xn2Var);
            }
        } else {
            c54Var = new c54(this, xn2Var);
        }
        Object obj = c54Var.result;
        int i2 = c54Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            e54 e54Var = new e54(xj5Var, this.b, this.c);
            c54Var.L$0 = null;
            c54Var.L$1 = null;
            c54Var.L$2 = null;
            c54Var.label = 1;
            Object objB = this.a.b(e54Var, c54Var);
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
