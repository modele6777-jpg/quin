package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 implements wj5 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        r1 r1Var;
        ubc ubcVar;
        if (xn2Var instanceof r1) {
            r1Var = (r1) xn2Var;
            int i = r1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                r1Var.label = i - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, xn2Var);
            }
        } else {
            r1Var = new r1(this, xn2Var);
        }
        Object obj = r1Var.result;
        int i2 = r1Var.label;
        wef wefVar = wef.a;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ubcVar = (ubc) r1Var.L$1;
            try {
                jzb.q(obj);
                ubcVar.s();
                return wefVar;
            } catch (Throwable th) {
                th = th;
                ubcVar.s();
                throw th;
            }
        }
        jzb.q(obj);
        ubc ubcVar2 = new ubc(xj5Var, r1Var.getContext());
        try {
            r1Var.L$0 = null;
            r1Var.L$1 = ubcVar2;
            r1Var.label = 1;
            try {
                Object objZ = ((ybc) this).a.z(ubcVar2, r1Var);
                bw2 bw2Var = bw2.a;
                if (objZ != bw2Var) {
                    objZ = wefVar;
                }
                if (objZ == bw2Var) {
                    return bw2Var;
                }
                ubcVar = ubcVar2;
                ubcVar.s();
                return wefVar;
            } catch (Throwable th2) {
                th = th2;
                ubcVar = ubcVar2;
                ubcVar.s();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
