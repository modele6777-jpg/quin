package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rl5 implements xj5 {
    public final /* synthetic */ kmb a;
    public final /* synthetic */ xj5 b;
    public final /* synthetic */ Object c;

    public rl5(kmb kmbVar, xj5 xj5Var, Object obj) {
        this.a = kmbVar;
        this.b = xj5Var;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        ql5 ql5Var;
        if (xn2Var instanceof ql5) {
            ql5Var = (ql5) xn2Var;
            int i = ql5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ql5Var.label = i - Integer.MIN_VALUE;
            } else {
                ql5Var = new ql5(this, xn2Var);
            }
        } else {
            ql5Var = new ql5(this, xn2Var);
        }
        Object obj2 = ql5Var.result;
        int i2 = ql5Var.label;
        wef wefVar = wef.a;
        if (i2 != 0) {
            if (i2 == 1) {
                jzb.q(obj2);
                return wefVar;
            }
            if (i2 == 2) {
                jzb.q(obj2);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj2);
        kmb kmbVar = this.a;
        int i3 = kmbVar.element + 1;
        kmbVar.element = i3;
        bw2 bw2Var = bw2.a;
        xj5 xj5Var = this.b;
        if (i3 < 1) {
            ql5Var.L$0 = null;
            ql5Var.label = 1;
            return xj5Var.a(obj, ql5Var) == bw2Var ? bw2Var : wefVar;
        }
        ql5Var.L$0 = null;
        ql5Var.label = 2;
        pa7.P(xj5Var, obj, this.c, ql5Var);
        return bw2Var;
    }
}
