package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kka implements xj5 {
    public final /* synthetic */ xj5 a;

    public kka(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        jka jkaVar;
        if (xn2Var instanceof jka) {
            jkaVar = (jka) xn2Var;
            int i = jkaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkaVar.label = i - Integer.MIN_VALUE;
            } else {
                jkaVar = new jka(this, xn2Var);
            }
        } else {
            jkaVar = new jka(this, xn2Var);
        }
        Object obj2 = jkaVar.result;
        int i2 = jkaVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            ued uedVar = (ued) obj;
            uedVar.getClass();
            if (uedVar == ued.b) {
                jkaVar.L$0 = null;
                jkaVar.L$1 = null;
                jkaVar.L$2 = null;
                jkaVar.L$3 = null;
                jkaVar.label = 1;
                Object objA = this.a.a(obj, jkaVar);
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
