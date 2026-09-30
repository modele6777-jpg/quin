package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yg8 extends gu7 implements a26 {
    final /* synthetic */ int $iterations;
    final /* synthetic */ eh8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg8(eh8 eh8Var, int i) {
        super(1);
        this.this$0 = eh8Var;
        this.$iterations = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return Boolean.valueOf(this.this$0.f(this.$iterations, ((Number) obj).longValue()));
    }
}
