package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wm1 extends gbe implements l26 {
    final /* synthetic */ List $captureSignal;
    final /* synthetic */ boolean $lock3ARequired$inlined;
    int label;
    final /* synthetic */ xn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm1(List list, xn2 xn2Var, boolean z, xn1 xn1Var) {
        super(2, xn2Var);
        this.$captureSignal = list;
        this.$lock3ARequired$inlined = z;
        this.this$0 = xn1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wm1(this.$captureSignal, xn2Var, this.$lock3ARequired$inlined, this.this$0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r7.q(1000000000, r6) == r5) goto L26;
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
            r1 = 2
            r2 = 1
            r3 = 3
            java.lang.String r4 = "CXCP"
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L13
            defpackage.jzb.q(r7)
            goto L5f
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
            boolean r7 = defpackage.b21.F(r3, r4)
            if (r7 == 0) goto L2c
            java.lang.String r7 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal"
            android.util.Log.d(r4, r7)
        L2c:
            java.util.List r7 = r6.$captureSignal
            r6.label = r2
            java.lang.Object r7 = defpackage.pa7.X(r7, r6)
            if (r7 != r5) goto L37
            goto L5e
        L37:
            boolean r7 = defpackage.b21.F(r3, r4)
            if (r7 == 0) goto L42
            java.lang.String r7 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done"
            android.util.Log.d(r4, r7)
        L42:
            boolean r7 = r6.$lock3ARequired$inlined
            if (r7 == 0) goto L6a
            boolean r7 = defpackage.b21.F(r3, r4)
            if (r7 == 0) goto L51
            java.lang.String r7 = "CapturePipeline#defaultNoFlashCapture: Unlocking 3A"
            android.util.Log.d(r4, r7)
        L51:
            xn1 r7 = r6.this$0
            r6.label = r1
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.Object r6 = r7.q(r0, r6)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            boolean r6 = defpackage.b21.F(r3, r4)
            if (r6 == 0) goto L6a
            java.lang.String r6 = "CapturePipeline#defaultNoFlashCapture: Unlocking 3A done"
            android.util.Log.d(r4, r6)
        L6a:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wm1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
