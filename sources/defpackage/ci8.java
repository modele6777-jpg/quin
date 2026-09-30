package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ci8 extends gu7 implements x16 {
    final /* synthetic */ fi8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci8(fi8 fi8Var) {
        super(0);
        this.this$0 = fi8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return Boolean.valueOf(((Throwable) this.this$0.c.getValue()) != null);
    }
}
