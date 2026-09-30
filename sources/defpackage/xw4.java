package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xw4 extends gu7 implements a26 {
    final /* synthetic */ long $target;
    final /* synthetic */ ax4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw4(ax4 ax4Var, long j) {
        super(1);
        this.this$0 = ax4Var;
        this.$target = j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        long jC;
        int iOrdinal;
        wv4 wv4Var = (wv4) obj;
        ax4 ax4Var = this.this$0;
        long j = this.$target;
        if (ax4Var.O0 == null || ax4Var.n1() == null || pa7.t(ax4Var.O0, ax4Var.n1()) || (iOrdinal = wv4Var.ordinal()) == 0 || iOrdinal == 1) {
            jC = 0;
        } else {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            vv1 vv1Var = ((f45) ax4Var.J0).c.c;
            if (vv1Var != null) {
                long j2 = ((e77) vv1Var.b.d(new e77(j))).a;
                yi yiVarN1 = ax4Var.n1();
                yiVarN1.getClass();
                cv7 cv7Var = cv7.a;
                long jA = yiVarN1.a(j, j2, cv7Var);
                yi yiVar = ax4Var.O0;
                yiVar.getClass();
                jC = w67.c(jA, yiVar.a(j, j2, cv7Var));
            } else {
                jC = 0;
            }
        }
        return new w67(jC);
    }
}
