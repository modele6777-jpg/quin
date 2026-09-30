package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lf6 implements ene {
    public final ene a;
    public final x16 b;

    public lf6(ene eneVar, x16 x16Var) {
        this.a = eneVar;
        this.b = x16Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ene
    public final Object a(ume umeVar, zn2 zn2Var) throws Throwable {
        kf6 kf6Var;
        imb imbVar;
        if (zn2Var instanceof kf6) {
            kf6Var = (kf6) zn2Var;
            int i = kf6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kf6Var.label = i - Integer.MIN_VALUE;
            } else {
                kf6Var = new kf6(this, zn2Var);
            }
        } else {
            kf6Var = new kf6(this, zn2Var);
        }
        Object obj = kf6Var.result;
        int i2 = kf6Var.label;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imbVar = (imb) kf6Var.L$1;
            try {
                jzb.q(obj);
                imbVar.element = false;
                return wef.a;
            } catch (Throwable th) {
                th = th;
                imbVar.element = false;
                throw th;
            }
        }
        jzb.q(obj);
        imb imbVar2 = new imb();
        imbVar2.element = true;
        try {
            ene eneVar = this.a;
            if6 if6Var = new if6(umeVar, new jf6(i3, imbVar2, this));
            kf6Var.L$0 = null;
            kf6Var.L$1 = imbVar2;
            kf6Var.label = 1;
            Object objA = eneVar.a(if6Var, kf6Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            imbVar = imbVar2;
            imbVar.element = false;
            return wef.a;
        } catch (Throwable th2) {
            th = th2;
            imbVar = imbVar2;
            imbVar.element = false;
            throw th;
        }
    }
}
