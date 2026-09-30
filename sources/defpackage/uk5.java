package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uk5 implements wj5 {
    public final /* synthetic */ zaa a;
    public final /* synthetic */ vaa b;

    public uk5(zaa zaaVar, vaa vaaVar) {
        this.a = zaaVar;
        this.b = vaaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        tk5 tk5Var;
        imb imbVar;
        int i;
        ubc ubcVar;
        if (xn2Var instanceof tk5) {
            tk5Var = (tk5) xn2Var;
            int i2 = tk5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tk5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                tk5Var = new tk5(this, xn2Var);
            }
        } else {
            tk5Var = new tk5(this, xn2Var);
        }
        Object obj = tk5Var.result;
        int i3 = tk5Var.label;
        bw2 bw2Var = bw2.a;
        if (i3 == 0) {
            jzb.q(obj);
            imbVar = new imb();
            imbVar.element = true;
            wk5 wk5Var = new wk5(imbVar, xj5Var);
            tk5Var.L$0 = null;
            tk5Var.L$1 = null;
            tk5Var.L$2 = xj5Var;
            tk5Var.L$3 = imbVar;
            i = 0;
            tk5Var.I$0 = 0;
            tk5Var.label = 1;
            if (this.a.b(wk5Var, tk5Var) != bw2Var) {
            }
            return bw2Var;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ubcVar = (ubc) tk5Var.L$4;
            try {
                jzb.q(obj);
                ubcVar.s();
                return wef.a;
            } catch (Throwable th) {
                th = th;
                ubcVar.s();
                throw th;
            }
        }
        int i4 = tk5Var.I$0;
        imbVar = (imb) tk5Var.L$3;
        xj5 xj5Var2 = (xj5) tk5Var.L$2;
        jzb.q(obj);
        i = i4;
        xj5Var = xj5Var2;
        if (imbVar.element) {
            ubc ubcVar2 = new ubc(xj5Var, tk5Var.getContext());
            try {
                vaa vaaVar = this.b;
                tk5Var.L$0 = null;
                tk5Var.L$1 = null;
                tk5Var.L$2 = null;
                tk5Var.L$3 = null;
                tk5Var.L$4 = ubcVar2;
                tk5Var.I$0 = i;
                tk5Var.label = 2;
                if (vaaVar.z(ubcVar2, tk5Var) != bw2Var) {
                    ubcVar = ubcVar2;
                    ubcVar.s();
                }
                return bw2Var;
            } catch (Throwable th2) {
                th = th2;
                ubcVar = ubcVar2;
                ubcVar.s();
                throw th;
            }
        }
        return wef.a;
    }
}
