package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qn1 extends gbe implements l26 {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSignal;
    final /* synthetic */ boolean $lock3ARequired$inlined;
    final /* synthetic */ boolean $torchOnRequired$inlined;
    final /* synthetic */ boolean $triggerAePreCapture$inlined;
    Object L$0;
    int label;
    final /* synthetic */ xn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn1(List list, xn2 xn2Var, boolean z, xn1 xn1Var, boolean z2, boolean z3, int i) {
        super(2, xn2Var);
        this.$captureSignal = list;
        this.$torchOnRequired$inlined = z;
        this.this$0 = xn1Var;
        this.$triggerAePreCapture$inlined = z2;
        this.$lock3ARequired$inlined = z3;
        this.$captureMode$inlined = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qn1(this.$captureSignal, xn2Var, this.$torchOnRequired$inlined, this.this$0, this.$triggerAePreCapture$inlined, this.$lock3ARequired$inlined, this.$captureMode$inlined);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e0, code lost:
    
        if (r11.q(1000000000, r10) == r8) goto L67;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qn1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
