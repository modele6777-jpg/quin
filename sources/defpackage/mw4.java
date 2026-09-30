package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mw4 extends gu7 implements a26 {
    final /* synthetic */ a26 $initialOffsetX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw4(a26 a26Var) {
        super(1);
        this.$initialOffsetX = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new w67(((long) ((Number) this.$initialOffsetX.d(Integer.valueOf((int) (((e77) obj).a >> 32)))).intValue()) << 32);
    }
}
