package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y0a extends gbe implements a26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ String $sql;
    int label;
    final /* synthetic */ a1a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0a(a1a a1aVar, String str, a26 a26Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = a1aVar;
        this.$sql = str;
        this.$block = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new y0a(this.this$0, this.$sql, this.$block, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        x8c x8cVarW0 = this.this$0.b.W0(this.$sql);
        try {
            Object objD = this.$block.d(x8cVarW0);
            cgg.t(x8cVarW0, null);
            return objD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }
}
