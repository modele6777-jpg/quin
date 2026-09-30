package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zv4 extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ x16 $effect;
    final /* synthetic */ n3f $this_DeferredTransitionCleanupEffect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv4(n3f n3fVar, x16 x16Var, int i) {
        super(2);
        this.$this_DeferredTransitionCleanupEffect = n3fVar;
        this.$effect = x16Var;
        this.$$changed = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rw4.a(this.$this_DeferredTransitionCleanupEffect, this.$effect, (l46) obj, k99.P(this.$$changed | 1));
        return wef.a;
    }
}
