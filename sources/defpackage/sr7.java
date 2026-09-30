package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sr7 extends gu7 implements a26 {
    final /* synthetic */ e89 $drawArea;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr7(e89 e89Var) {
        super(1);
        this.$drawArea = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bv7 bv7Var = (bv7) obj;
        bv7Var.getClass();
        this.$drawArea.setValue(new ju2((int) (bv7Var.l() >> 32), (int) (bv7Var.l() & 4294967295L)));
        return wef.a;
    }
}
