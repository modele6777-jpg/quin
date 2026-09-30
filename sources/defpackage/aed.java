package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aed extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ n26 $content;
    final /* synthetic */ j09 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aed(j09 j09Var, n26 n26Var, int i, int i2) {
        super(2);
        this.$modifier = j09Var;
        this.$content = n26Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ded.a(this.$modifier, this.$content, (l46) obj, k99.P(this.$$changed | 1), this.$$default);
        return wef.a;
    }
}
