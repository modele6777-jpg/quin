package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 extends gbe implements l26 {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSignal;
    int label;
    final /* synthetic */ xn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln1(List list, xn2 xn2Var, xn1 xn1Var, int i) {
        super(2, xn2Var);
        this.$captureSignal = list;
        this.this$0 = xn1Var;
        this.$captureMode$inlined = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ln1(this.$captureSignal, xn2Var, this.this$0, this.$captureMode$inlined);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r7.i(r0, r6) == r5) goto L21;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 3
            r2 = 2
            r3 = 1
            java.lang.String r4 = "CXCP"
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L13
            defpackage.jzb.q(r7)
            goto L4f
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L1a:
            defpackage.jzb.q(r7)
            goto L37
        L1e:
            defpackage.jzb.q(r7)
            boolean r7 = defpackage.b21.F(r1, r4)
            if (r7 == 0) goto L2c
            java.lang.String r7 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal"
            android.util.Log.d(r4, r7)
        L2c:
            java.util.List r7 = r6.$captureSignal
            r6.label = r3
            java.lang.Object r7 = defpackage.pa7.X(r7, r6)
            if (r7 != r5) goto L37
            goto L4e
        L37:
            boolean r7 = defpackage.b21.F(r1, r4)
            if (r7 == 0) goto L42
            java.lang.String r7 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done"
            android.util.Log.d(r4, r7)
        L42:
            xn1 r7 = r6.this$0
            int r0 = r6.$captureMode$inlined
            r6.label = r2
            java.lang.Object r6 = r7.i(r0, r6)
            if (r6 != r5) goto L4f
        L4e:
            return r5
        L4f:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ln1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
