package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pl5 implements wj5 {
    public final /* synthetic */ hl5 a;

    public pl5(hl5 hl5Var) {
        this.a = hl5Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        ol5 ol5Var;
        Object obj;
        if (xn2Var instanceof ol5) {
            ol5Var = (ol5) xn2Var;
            int i = ol5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ol5Var.label = i - Integer.MIN_VALUE;
            } else {
                ol5Var = new ol5(this, xn2Var);
            }
        } else {
            ol5Var = new ol5(this, xn2Var);
        }
        Object obj2 = ol5Var.result;
        int i2 = ol5Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Object obj3 = new Object();
            kmb kmbVar = new kmb();
            try {
                hl5 hl5Var = this.a;
                rl5 rl5Var = new rl5(kmbVar, xj5Var, obj3);
                ol5Var.L$0 = null;
                ol5Var.L$1 = null;
                ol5Var.L$2 = null;
                ol5Var.L$3 = obj3;
                ol5Var.L$4 = null;
                ol5Var.I$0 = 0;
                ol5Var.label = 1;
                Object objB = hl5Var.b(rl5Var, ol5Var);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } catch (l e) {
                e = e;
                obj = obj3;
                if (e.a != obj) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = ol5Var.L$3;
            try {
                jzb.q(obj2);
            } catch (l e2) {
                e = e2;
                if (e.a != obj) {
                    throw e;
                }
            }
        }
        return wef.a;
    }
}
