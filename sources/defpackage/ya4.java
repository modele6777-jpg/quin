package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ya4 implements xj5 {
    public final /* synthetic */ za4 a;
    public final /* synthetic */ mmb b;
    public final /* synthetic */ xj5 c;

    public ya4(za4 za4Var, mmb mmbVar, xj5 xj5Var) {
        this.a = za4Var;
        this.b = mmbVar;
        this.c = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        xa4 xa4Var;
        if (xn2Var instanceof xa4) {
            xa4Var = (xa4) xn2Var;
            int i = xa4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xa4Var.label = i - Integer.MIN_VALUE;
            } else {
                xa4Var = new xa4(this, xn2Var);
            }
        } else {
            xa4Var = new xa4(this, xn2Var);
        }
        Object obj2 = xa4Var.result;
        int i2 = xa4Var.label;
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
        za4 za4Var = this.a;
        Object objD = za4Var.b.d(obj);
        mmb mmbVar = this.b;
        Object obj3 = mmbVar.element;
        if (obj3 == rj9.a || !((Boolean) za4Var.c.z(obj3, objD)).booleanValue()) {
            mmbVar.element = objD;
            xa4Var.L$0 = null;
            xa4Var.L$1 = null;
            xa4Var.label = 1;
            Object objA = this.c.a(obj, xa4Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }
}
