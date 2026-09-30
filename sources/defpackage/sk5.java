package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sk5 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ n26 b;

    public sk5(wj5 wj5Var, n26 n26Var) {
        this.a = wj5Var;
        this.b = n26Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        rk5 rk5Var;
        int i;
        int i2;
        twe tweVar;
        ubc ubcVar;
        ubc ubcVar2;
        if (xn2Var instanceof rk5) {
            rk5Var = (rk5) xn2Var;
            int i3 = rk5Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rk5Var.label = i3 - Integer.MIN_VALUE;
            } else {
                rk5Var = new rk5(this, xn2Var);
            }
        } else {
            rk5Var = new rk5(this, xn2Var);
        }
        Object obj = rk5Var.result;
        int i4 = rk5Var.label;
        n26 n26Var = this.b;
        bw2 bw2Var = bw2.a;
        if (i4 == 0) {
            jzb.q(obj);
            i = 0;
            try {
                wj5 wj5Var = this.a;
                rk5Var.L$0 = null;
                rk5Var.L$1 = null;
                rk5Var.L$2 = xj5Var;
                rk5Var.I$0 = 0;
                rk5Var.label = 1;
                if (wj5Var.b(xj5Var, rk5Var) != bw2Var) {
                    i2 = 0;
                    ubcVar = new ubc(xj5Var, rk5Var.getContext());
                    rk5Var.L$0 = null;
                    rk5Var.L$1 = null;
                    rk5Var.L$2 = null;
                    rk5Var.L$3 = ubcVar;
                    rk5Var.I$0 = i2;
                    rk5Var.label = 3;
                    if (n26Var.m(ubcVar, null, rk5Var) != bw2Var) {
                        ubcVar2 = ubcVar;
                        ubcVar2.s();
                        return wef.a;
                    }
                }
            } catch (Throwable th) {
                th = th;
                tweVar = new twe(th);
                rk5Var.L$0 = null;
                rk5Var.L$1 = null;
                rk5Var.L$2 = null;
                rk5Var.L$3 = th;
                rk5Var.I$0 = i;
                rk5Var.label = 2;
                if (x57.W(tweVar, n26Var, th, rk5Var) == bw2Var) {
                    throw th;
                }
            }
            return bw2Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                Throwable th2 = (Throwable) rk5Var.L$3;
                jzb.q(obj);
                throw th2;
            }
            if (i4 != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ubcVar2 = (ubc) rk5Var.L$3;
            try {
                jzb.q(obj);
                ubcVar2.s();
                return wef.a;
            } catch (Throwable th3) {
                th = th3;
                ubcVar2.s();
                throw th;
            }
        }
        i2 = rk5Var.I$0;
        xj5Var = (xj5) rk5Var.L$2;
        try {
            jzb.q(obj);
            ubcVar = new ubc(xj5Var, rk5Var.getContext());
            try {
                rk5Var.L$0 = null;
                rk5Var.L$1 = null;
                rk5Var.L$2 = null;
                rk5Var.L$3 = ubcVar;
                rk5Var.I$0 = i2;
                rk5Var.label = 3;
                if (n26Var.m(ubcVar, null, rk5Var) != bw2Var) {
                    ubcVar2 = ubcVar;
                    ubcVar2.s();
                    return wef.a;
                }
                return bw2Var;
            } catch (Throwable th4) {
                th = th4;
                ubcVar2 = ubcVar;
                ubcVar2.s();
                throw th;
            }
        } catch (Throwable th5) {
            i = i2;
            th = th5;
            tweVar = new twe(th);
            rk5Var.L$0 = null;
            rk5Var.L$1 = null;
            rk5Var.L$2 = null;
            rk5Var.L$3 = th;
            rk5Var.I$0 = i;
            rk5Var.label = 2;
            if (x57.W(tweVar, n26Var, th, rk5Var) == bw2Var) {
                throw th;
            }
        }
    }
}
