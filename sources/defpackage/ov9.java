package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ov9 implements xj5 {
    public final /* synthetic */ j18 a;

    public ov9(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // defpackage.xj5
    public final /* bridge */ /* synthetic */ Object a(Object obj, xn2 xn2Var) {
        return b(((Number) obj).intValue(), xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, xn2 xn2Var) {
        nv9 nv9Var;
        if (xn2Var instanceof nv9) {
            nv9Var = (nv9) xn2Var;
            int i2 = nv9Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nv9Var.label = i2 - Integer.MIN_VALUE;
            } else {
                nv9Var = new nv9(this, xn2Var);
            }
        } else {
            nv9Var = new nv9(this, xn2Var);
        }
        Object obj = nv9Var.result;
        int i3 = nv9Var.label;
        wef wefVar = wef.a;
        if (i3 != 0) {
            if (i3 == 1) {
                jzb.q(obj);
                return obj;
            }
            if (i3 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        j18 j18Var = this.a;
        bw2 bw2Var = bw2.a;
        if (i != -2) {
            if (i != -1) {
                b18 b18VarH = j18Var.h();
                c18 c18Var = (c18) s72.H0(b18VarH.l);
                if (c18Var != null) {
                    float f = (c18Var.o + c18Var.p) - b18VarH.n;
                    if (f > 0.0f) {
                        nv9Var.L$0 = null;
                        nv9Var.L$1 = null;
                        nv9Var.I$0 = i;
                        nv9Var.F$0 = f;
                        nv9Var.label = 2;
                        if (eb3.S(j18Var, f, nv9Var) == bw2Var) {
                        }
                    }
                }
            }
            return wefVar;
        }
        int i4 = j18Var.h().o - 1;
        nv9Var.I$0 = i;
        nv9Var.label = 1;
        Object objJ = j18Var.j(i4, 0, nv9Var);
        if (objJ != bw2Var) {
            return objJ;
        }
        return bw2Var;
    }
}
