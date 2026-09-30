package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v3a implements wj5 {
    public final /* synthetic */ ybc a;

    public v3a(ybc ybcVar) {
        this.a = ybcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        s3a s3aVar;
        if (xn2Var instanceof s3a) {
            s3aVar = (s3a) xn2Var;
            int i = s3aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3aVar.label = i - Integer.MIN_VALUE;
            } else {
                s3aVar = new s3a(this, xn2Var);
            }
        } else {
            s3aVar = new s3a(this, xn2Var);
        }
        Object obj = s3aVar.result;
        int i2 = s3aVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            u3a u3aVar = new u3a(xj5Var);
            s3aVar.L$0 = null;
            s3aVar.L$1 = null;
            s3aVar.L$2 = null;
            s3aVar.label = 1;
            Object objB = this.a.b(u3aVar, s3aVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
