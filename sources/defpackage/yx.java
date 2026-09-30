package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yx extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ o26 $content;
    final /* synthetic */ yi $contentAlignment;
    final /* synthetic */ a26 $contentKey;
    final /* synthetic */ String $label;
    final /* synthetic */ j09 $modifier;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ a26 $transitionSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(Object obj, j09 j09Var, a26 a26Var, yi yiVar, String str, a26 a26Var2, o26 o26Var, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = j09Var;
        this.$transitionSpec = a26Var;
        this.$contentAlignment = yiVar;
        this.$label = str;
        this.$contentKey = a26Var2;
        this.$content = o26Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kn2.c(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$label, this.$contentKey, this.$content, (l46) obj, k99.P(this.$$changed | 1), this.$$default);
        return wef.a;
    }
}
