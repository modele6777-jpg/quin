package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class av3 extends gbe implements l26 {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSequence$inlined;
    final /* synthetic */ int $flashMode$inlined;
    final /* synthetic */ int $flashType$inlined;
    int label;
    final /* synthetic */ jv3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av3(jv3 jv3Var, xn2 xn2Var, List list, int i, int i2, int i3) {
        super(2, xn2Var);
        this.this$0 = jv3Var;
        this.$captureSequence$inlined = list;
        this.$captureMode$inlined = i;
        this.$flashType$inlined = i2;
        this.$flashMode$inlined = i3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new av3(this.this$0, xn2Var, this.$captureSequence$inlined, this.$captureMode$inlined, this.$flashType$inlined, this.$flashMode$inlined);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return this.this$0.l().h(this.$captureSequence$inlined, this.$captureMode$inlined, this.$flashType$inlined, this.$flashMode$inlined);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((av3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
