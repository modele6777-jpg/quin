package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vbb implements xj5 {
    public final /* synthetic */ xj5 a;

    public vbb(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        ubb ubbVar;
        if (xn2Var instanceof ubb) {
            ubbVar = (ubb) xn2Var;
            int i = ubbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubbVar.label = i - Integer.MIN_VALUE;
            } else {
                ubbVar = new ubb(this, xn2Var);
            }
        } else {
            ubbVar = new ubb(this, xn2Var);
        }
        Object obj2 = ubbVar.result;
        int i2 = ubbVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            icb icbVar = (icb) obj;
            iy9 iy9Var = new iy9(Boolean.valueOf(icbVar.d), new Integer(icbVar.a));
            ubbVar.L$0 = null;
            ubbVar.L$1 = null;
            ubbVar.L$2 = null;
            ubbVar.L$3 = null;
            ubbVar.label = 1;
            Object objA = this.a.a(iy9Var, ubbVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
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
