package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f0f extends gbe implements a26 {
    final /* synthetic */ a26 $cancellableShow;
    final /* synthetic */ s89 $mutatePriority;
    int label;
    final /* synthetic */ h0f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0f(h0f h0fVar, a26 a26Var, s89 s89Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = h0fVar;
        this.$cancellableShow = a26Var;
        this.$mutatePriority = s89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new f0f(this.this$0, this.$cancellableShow, this.$mutatePriority, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        s89 s89Var = s89.c;
        try {
            if (i == 0) {
                jzb.q(obj);
                this.this$0.getClass();
                e0f e0fVar = new e0f(null, this.$cancellableShow);
                this.label = 2;
                Object objR = rs0.R(1500L, e0fVar, this);
                bw2 bw2Var = bw2.a;
                if (objR == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            if (this.$mutatePriority != s89Var) {
                this.this$0.a();
            }
            return wef.a;
        } catch (Throwable th) {
            if (this.$mutatePriority != s89Var) {
                this.this$0.a();
            }
            throw th;
        }
    }
}
