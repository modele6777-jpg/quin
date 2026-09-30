package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bh8 extends gu7 implements x16 {
    final /* synthetic */ eh8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh8(eh8 eh8Var) {
        super(0);
        this.this$0 = eh8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return Float.valueOf((((Boolean) this.this$0.d.getValue()).booleanValue() && this.this$0.c() % 2 == 0) ? -((Number) this.this$0.f.getValue()).floatValue() : ((Number) this.this$0.f.getValue()).floatValue());
    }
}
