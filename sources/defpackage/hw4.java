package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hw4 extends gu7 implements a26 {
    final /* synthetic */ boolean $disableClip;
    final /* synthetic */ x16 $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw4(x16 x16Var, boolean z) {
        super(1);
        this.$disableClip = z;
        this.$isEnabled = x16Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ((g0c) obj).g(!this.$disableClip && ((Boolean) this.$isEnabled.invoke()).booleanValue());
        return wef.a;
    }
}
