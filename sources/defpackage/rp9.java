package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rp9 {
    public static final rp9 a = new rp9();

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        np9 np9Var;
        Object objN;
        if (zn2Var instanceof np9) {
            np9Var = (np9) zn2Var;
            int i = np9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                np9Var.label = i - Integer.MIN_VALUE;
            } else {
                np9Var = new np9(this, zn2Var);
            }
        } else {
            np9Var = new np9(this, zn2Var);
        }
        Object obj = np9Var.result;
        int i2 = np9Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            isa isaVar = xqa.d.a;
            np9Var.L$0 = null;
            np9Var.L$1 = null;
            np9Var.label = 1;
            if (bsa.n(isaVar, "", np9Var) != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            jzb.q(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return obj;
            }
            jzb.q(obj);
        }
        isa isaVar2 = xqa.b.a;
        np9Var.L$0 = null;
        np9Var.L$1 = null;
        np9Var.label = 3;
        objN = bsa.n(isaVar2, "first_reading", np9Var);
        if (objN != bw2Var) {
            return bw2Var;
        }
        return objN;
        isa isaVar3 = xqa.e.a;
        np9Var.L$0 = null;
        np9Var.L$1 = null;
        np9Var.label = 2;
        if (bsa.n(isaVar3, "", np9Var) != bw2Var) {
            isa isaVar4 = xqa.b.a;
            np9Var.L$0 = null;
            np9Var.L$1 = null;
            np9Var.label = 3;
            objN = bsa.n(isaVar4, "first_reading", np9Var);
            if (objN != bw2Var) {
                return objN;
            }
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, zn2 zn2Var) {
        pp9 pp9Var;
        Object objN;
        if (zn2Var instanceof pp9) {
            pp9Var = (pp9) zn2Var;
            int i = pp9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp9Var.label = i - Integer.MIN_VALUE;
            } else {
                pp9Var = new pp9(this, zn2Var);
            }
        } else {
            pp9Var = new pp9(this, zn2Var);
        }
        Object obj = pp9Var.result;
        int i2 = pp9Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            isa isaVar = xqa.d.a;
            pp9Var.L$0 = str;
            pp9Var.L$1 = null;
            pp9Var.L$2 = null;
            pp9Var.label = 1;
            if (bsa.n(isaVar, "", pp9Var) != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            str = (String) pp9Var.L$0;
            jzb.q(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return obj;
            }
            str = (String) pp9Var.L$0;
            jzb.q(obj);
        }
        isa isaVar2 = xqa.b.a;
        pp9Var.L$0 = null;
        pp9Var.L$1 = null;
        pp9Var.L$2 = null;
        pp9Var.label = 3;
        objN = bsa.n(isaVar2, str, pp9Var);
        if (objN != bw2Var) {
            return bw2Var;
        }
        return objN;
        isa isaVar3 = xqa.e.a;
        pp9Var.L$0 = str;
        pp9Var.L$1 = null;
        pp9Var.L$2 = null;
        pp9Var.label = 2;
        if (bsa.n(isaVar3, "", pp9Var) != bw2Var) {
            isa isaVar4 = xqa.b.a;
            pp9Var.L$0 = null;
            pp9Var.L$1 = null;
            pp9Var.L$2 = null;
            pp9Var.label = 3;
            objN = bsa.n(isaVar4, str, pp9Var);
            if (objN != bw2Var) {
                return objN;
            }
        }
        return bw2Var;
    }
}
