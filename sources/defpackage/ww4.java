package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww4 extends gu7 implements a26 {
    final /* synthetic */ long $target;
    final /* synthetic */ ax4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww4(ax4 ax4Var, long j) {
        super(1);
        this.this$0 = ax4Var;
        this.$target = j;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        ood oodVar;
        long j;
        ood oodVar2;
        long j2;
        int iOrdinal;
        long j3;
        a26 a26Var;
        a26 a26Var2;
        wv4 wv4Var = (wv4) obj;
        if (wv4Var == wv4.c) {
            ax4 ax4Var = this.this$0;
            if (((f45) ax4Var.J0).c.b == null) {
                j3 = ax4Var.K0.j;
            } else {
                ax4 ax4Var2 = this.this$0;
                long j4 = this.$target;
                oodVar = ((cx4) ax4Var2.I0).b.b;
                if (oodVar != null || (a26Var2 = oodVar.a) == null) {
                    j = 0;
                } else {
                    j = ((w67) a26Var2.d(new e77(j4))).a;
                }
                oodVar2 = ((f45) ax4Var2.J0).c.b;
                if (oodVar2 != null || (a26Var = oodVar2.a) == null) {
                    j2 = 0;
                } else {
                    j2 = ((w67) a26Var.d(new e77(j4))).a;
                }
                iOrdinal = wv4Var.ordinal();
                if (iOrdinal != 0) {
                    j3 = j;
                } else if (iOrdinal != 1) {
                    j3 = 0;
                } else {
                    if (iOrdinal == 2) {
                        ap.c();
                        return null;
                    }
                    j3 = j2;
                }
            }
        } else {
            ax4 ax4Var3 = this.this$0;
            long j5 = this.$target;
            oodVar = ((cx4) ax4Var3.I0).b.b;
            if (oodVar != null) {
                j = 0;
            } else {
                j = 0;
            }
            oodVar2 = ((f45) ax4Var3.J0).c.b;
            if (oodVar2 != null) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            iOrdinal = wv4Var.ordinal();
            if (iOrdinal != 0) {
                j3 = j;
            } else if (iOrdinal != 1) {
                j3 = 0;
            } else {
                if (iOrdinal == 2) {
                    ap.c();
                    return null;
                }
                j3 = j2;
            }
        }
        return new w67(j3);
    }
}
