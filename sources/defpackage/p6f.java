package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p6f implements xj5 {
    public final /* synthetic */ xj5 a;

    public p6f(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        o6f o6fVar;
        if (xn2Var instanceof o6f) {
            o6fVar = (o6f) xn2Var;
            int i = o6fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                o6fVar.label = i - Integer.MIN_VALUE;
            } else {
                o6fVar = new o6f(this, xn2Var);
            }
        } else {
            o6fVar = new o6f(this, xn2Var);
        }
        Object obj2 = o6fVar.result;
        int i2 = o6fVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            xha xhaVar = (xha) obj;
            if (xhaVar.b || xhaVar.f != null) {
                o6fVar.L$0 = null;
                o6fVar.L$1 = null;
                o6fVar.L$2 = null;
                o6fVar.L$3 = null;
                o6fVar.label = 1;
                Object objA = this.a.a(obj, o6fVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
