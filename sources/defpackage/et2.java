package defpackage;

import ai.askquin.ui.share.SharedDivination;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class et2 extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ SharedDivination $divination;
    final /* synthetic */ e89 $isCapturingScreenshot$delegate;
    final /* synthetic */ String $shareScene;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et2(vb2 vb2Var, Context context, SharedDivination sharedDivination, String str, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.$context = context;
        this.$divination = sharedDivination;
        this.$shareScene = str;
        this.$isCapturingScreenshot$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new et2(this.$activity, this.$context, this.$divination, this.$shareScene, this.$isCapturingScreenshot$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r7 == r3) goto L20;
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
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L13
            defpackage.jzb.q(r7)     // Catch: java.lang.Throwable -> L10
            goto L37
        L10:
            r0 = move-exception
            r7 = r0
            goto L55
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L1a:
            defpackage.jzb.q(r7)     // Catch: java.lang.Throwable -> L10
            goto L2c
        L1e:
            defpackage.jzb.q(r7)
            r6.label = r2     // Catch: java.lang.Throwable -> L10
            r4 = 100
            java.lang.Object r7 = defpackage.vfh.q(r4, r6)     // Catch: java.lang.Throwable -> L10
            if (r7 != r3) goto L2c
            goto L36
        L2c:
            vb2 r7 = r6.$activity     // Catch: java.lang.Throwable -> L10
            r6.label = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r7 = defpackage.xo1.j(r7, r6)     // Catch: java.lang.Throwable -> L10
            if (r7 != r3) goto L37
        L36:
            return r3
        L37:
            r4 = r7
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L10
            e89 r7 = r6.$isCapturingScreenshot$delegate
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.setValue(r0)
            wef r7 = defpackage.wef.a
            if (r4 != 0) goto L46
            return r7
        L46:
            int r0 = ai.askquin.ui.share.ShareActivity.T0
            android.content.Context r0 = r6.$context
            ai.askquin.ui.share.SharedDivination r1 = r6.$divination
            java.lang.String r3 = r6.$shareScene
            r5 = 4
            xad r2 = defpackage.xad.Screenshot
            defpackage.jy4.y(r0, r1, r2, r3, r4, r5)
            return r7
        L55:
            e89 r6 = r6.$isCapturingScreenshot$delegate
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.setValue(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et2.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((et2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
