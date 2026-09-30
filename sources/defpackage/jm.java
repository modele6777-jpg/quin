package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jm extends gbe implements l26 {
    final /* synthetic */ String $testId;
    int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(mm mmVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmVar;
        this.$testId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jm jmVar = new jm(this.this$0, this.$testId, xn2Var);
        jmVar.L$0 = obj;
        return jmVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        int i2;
        String message;
        Throwable th = (Throwable) this.L$0;
        int i3 = this.label;
        if (i3 == 0) {
            jzb.q(obj);
            i = ((th instanceof IllegalStateException) && (message = th.getMessage()) != null && c5e.C(message, "Report not ready", false)) ? 1 : 0;
            if (i != 0) {
                this.this$0.d().e("Report " + this.$testId + " not ready yet, retrying...");
                this.L$0 = null;
                this.I$0 = i;
                this.label = 1;
                Object objQ = vfh.q(3000L, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
                i2 = i;
            }
            return Boolean.valueOf(i != 0);
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.I$0;
        jzb.q(obj);
        i = i2;
        return Boolean.valueOf(i != 0);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jm) k((xn2) obj2, (Throwable) obj)).r(wef.a);
    }
}
