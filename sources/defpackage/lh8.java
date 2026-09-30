package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lh8 extends gu7 implements x16 {
    final /* synthetic */ qh8 $progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh8(ug8 ug8Var) {
        super(0);
        this.$progress$delegate = ug8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return Float.valueOf(((Number) ((eh8) this.$progress$delegate).getValue()).floatValue());
    }
}
