package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nz extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ n26 $content;
    final /* synthetic */ bx4 $enter;
    final /* synthetic */ e45 $exit;
    final /* synthetic */ j09 $modifier;
    final /* synthetic */ n89 $mutableTransform;
    final /* synthetic */ n3f $transition;
    final /* synthetic */ a26 $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(n3f n3fVar, a26 a26Var, j09 j09Var, bx4 bx4Var, e45 e45Var, n26 n26Var, int i, int i2) {
        super(2);
        this.$transition = n3fVar;
        this.$visible = a26Var;
        this.$modifier = j09Var;
        this.$enter = bx4Var;
        this.$exit = e45Var;
        this.$content = n26Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        m93.e(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, (l46) obj, k99.P(this.$$changed | 1), this.$$default);
        return wef.a;
    }
}
