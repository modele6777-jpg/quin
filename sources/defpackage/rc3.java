package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rc3 implements xj5 {
    public final /* synthetic */ xj5 a;

    public rc3(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) throws Throwable {
        qc3 qc3Var;
        if (xn2Var instanceof qc3) {
            qc3Var = (qc3) xn2Var;
            int i = qc3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc3Var.label = i - Integer.MIN_VALUE;
            } else {
                qc3Var = new qc3(this, xn2Var);
            }
        } else {
            qc3Var = new qc3(this, xn2Var);
        }
        Object obj2 = qc3Var.result;
        int i2 = qc3Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            i0e i0eVar = (i0e) obj;
            if (i0eVar instanceof odb) {
                throw ((odb) i0eVar).b;
            }
            if (!(i0eVar instanceof cb3)) {
                if ((i0eVar instanceof we5) || (i0eVar instanceof zaf) || (i0eVar instanceof qf9)) {
                    qc0.p("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                ap.c();
                return null;
            }
            Object obj3 = ((cb3) i0eVar).b;
            qc3Var.label = 1;
            Object objA = this.a.a(obj3, qc3Var);
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
