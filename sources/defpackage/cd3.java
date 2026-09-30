package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cd3 extends gbe implements a26 {
    Object L$0;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd3(od3 od3Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = od3Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new cd3(this.this$0, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Throwable th;
        i0e odbVar;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                od3 od3Var = this.this$0;
                this.label = 1;
                obj = od3Var.h(true, this);
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.L$0;
                    jzb.q(obj);
                    odbVar = new odb(th, ((Number) obj).intValue());
                    return new iy9(odbVar, Boolean.TRUE);
                }
                jzb.q(obj);
            }
            odbVar = (i0e) obj;
        } catch (Throwable th2) {
            k77 k77VarC = this.this$0.c();
            this.L$0 = th2;
            this.label = 2;
            Object objA = k77VarC.a(this);
            if (objA != bw2Var) {
                obj = objA;
                th = th2;
            }
            return bw2Var;
        }
        return new iy9(odbVar, Boolean.TRUE);
    }
}
