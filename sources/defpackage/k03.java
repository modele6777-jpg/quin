package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k03 extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ze5 $animationSpec;
    final /* synthetic */ n26 $content;
    final /* synthetic */ a26 $contentKey;
    final /* synthetic */ j09 $modifier;
    final /* synthetic */ n3f $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k03(n3f n3fVar, j09 j09Var, ze5 ze5Var, a26 a26Var, n26 n26Var, int i, int i2) {
        super(2);
        this.$this_Crossfade = n3fVar;
        this.$modifier = j09Var;
        this.$animationSpec = ze5Var;
        this.$contentKey = a26Var;
        this.$content = n26Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cn1.e(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, (l46) obj, k99.P(this.$$changed | 1), this.$$default);
        return wef.a;
    }
}
