package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jl5 implements xj5 {
    public final /* synthetic */ kmb a;
    public final /* synthetic */ xj5 b;

    public jl5(kmb kmbVar, xj5 xj5Var) {
        this.a = kmbVar;
        this.b = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        il5 il5Var;
        if (xn2Var instanceof il5) {
            il5Var = (il5) xn2Var;
            int i = il5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                il5Var.label = i - Integer.MIN_VALUE;
            } else {
                il5Var = new il5(this, xn2Var);
            }
        } else {
            il5Var = new il5(this, xn2Var);
        }
        Object obj2 = il5Var.result;
        int i2 = il5Var.label;
        wef wefVar = wef.a;
        if (i2 != 0) {
            if (i2 == 1) {
                jzb.q(obj2);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj2);
        kmb kmbVar = this.a;
        int i3 = kmbVar.element;
        if (i3 < 1) {
            kmbVar.element = i3 + 1;
            return wefVar;
        }
        il5Var.L$0 = null;
        il5Var.label = 1;
        Object objA = this.b.a(obj, il5Var);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : wefVar;
    }
}
