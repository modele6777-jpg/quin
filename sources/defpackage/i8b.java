package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i8b implements xj5 {
    public final /* synthetic */ xj5 a;

    public i8b(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        h8b h8bVar;
        mfc mfcVarD;
        if (xn2Var instanceof h8b) {
            h8bVar = (h8b) xn2Var;
            int i = h8bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8bVar.label = i - Integer.MIN_VALUE;
            } else {
                h8bVar = new h8b(this, xn2Var);
            }
        } else {
            h8bVar = new h8b(this, xn2Var);
        }
        Object obj2 = h8bVar.result;
        int i2 = h8bVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            String str = (String) obj;
            if (str.length() > 0) {
                try {
                    mfcVarD = mfc.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    mfcVarD = k8b.d();
                }
            } else {
                mfcVarD = k8b.d();
            }
            h8bVar.L$0 = null;
            h8bVar.L$1 = null;
            h8bVar.L$2 = null;
            h8bVar.L$3 = null;
            h8bVar.label = 1;
            Object objA = this.a.a(mfcVarD, h8bVar);
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
