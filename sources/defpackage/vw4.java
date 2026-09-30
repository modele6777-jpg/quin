package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vw4 extends gu7 implements a26 {
    final /* synthetic */ long $target;
    final /* synthetic */ ax4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw4(ax4 ax4Var, long j) {
        super(1);
        this.this$0 = ax4Var;
        this.$target = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        a26 a26Var;
        a26 a26Var2;
        ax4 ax4Var = this.this$0;
        long j = this.$target;
        ax4Var.getClass();
        int iOrdinal = ((wv4) obj).ordinal();
        if (iOrdinal == 0) {
            vv1 vv1Var = ((cx4) ax4Var.I0).b.c;
            if (vv1Var != null && (a26Var = vv1Var.b) != null) {
                j = ((e77) a26Var.d(new e77(j))).a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            vv1 vv1Var2 = ((f45) ax4Var.J0).c.c;
            if (vv1Var2 != null && (a26Var2 = vv1Var2.b) != null) {
                j = ((e77) a26Var2.d(new e77(j))).a;
            }
        }
        return new e77(j);
    }
}
