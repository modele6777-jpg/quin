package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa implements wj5 {
    public final /* synthetic */ al5 a;

    public zaa(al5 al5Var) {
        this.a = al5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        waa waaVar;
        if (xn2Var instanceof waa) {
            waaVar = (waa) xn2Var;
            int i = waaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                waaVar.label = i - Integer.MIN_VALUE;
            } else {
                waaVar = new waa(this, xn2Var);
            }
        } else {
            waaVar = new waa(this, xn2Var);
        }
        Object obj = waaVar.result;
        int i2 = waaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            yaa yaaVar = new yaa(xj5Var);
            waaVar.L$0 = null;
            waaVar.L$1 = null;
            waaVar.L$2 = null;
            waaVar.label = 1;
            Object objB = this.a.b(yaaVar, waaVar);
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
