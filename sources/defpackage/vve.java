package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vve implements wj5 {
    public final /* synthetic */ wj5 a;

    public vve(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        sve sveVar;
        if (xn2Var instanceof sve) {
            sveVar = (sve) xn2Var;
            int i = sveVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sveVar.label = i - Integer.MIN_VALUE;
            } else {
                sveVar = new sve(this, xn2Var);
            }
        } else {
            sveVar = new sve(this, xn2Var);
        }
        Object obj = sveVar.result;
        int i2 = sveVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            uve uveVar = new uve(xj5Var);
            sveVar.L$0 = null;
            sveVar.L$1 = null;
            sveVar.L$2 = null;
            sveVar.label = 1;
            Object objB = this.a.b(uveVar, sveVar);
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
