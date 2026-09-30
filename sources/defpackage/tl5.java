package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tl5 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ l26 b;

    public tl5(wj5 wj5Var, l26 l26Var) {
        this.a = wj5Var;
        this.b = l26Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        sl5 sl5Var;
        vl5 vl5Var;
        if (xn2Var instanceof sl5) {
            sl5Var = (sl5) xn2Var;
            int i = sl5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sl5Var.label = i - Integer.MIN_VALUE;
            } else {
                sl5Var = new sl5(this, xn2Var);
            }
        } else {
            sl5Var = new sl5(this, xn2Var);
        }
        Object obj = sl5Var.result;
        int i2 = sl5Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            wj5 wj5Var = this.a;
            vl5 vl5Var2 = new vl5(xj5Var, this.b);
            try {
                sl5Var.L$0 = null;
                sl5Var.L$1 = null;
                sl5Var.L$2 = null;
                sl5Var.L$3 = null;
                sl5Var.L$4 = null;
                sl5Var.L$5 = vl5Var2;
                sl5Var.I$0 = 0;
                sl5Var.I$1 = 0;
                sl5Var.label = 1;
                Object objB = wj5Var.b(vl5Var2, sl5Var);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } catch (l e) {
                e = e;
                vl5Var = vl5Var2;
                if (e.a == vl5Var) {
                    throw e;
                }
                tq.v(sl5Var.getContext());
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vl5Var = (vl5) sl5Var.L$5;
            try {
                jzb.q(obj);
            } catch (l e2) {
                e = e2;
                if (e.a == vl5Var) {
                    throw e;
                }
                tq.v(sl5Var.getContext());
            }
        }
        return wef.a;
    }
}
