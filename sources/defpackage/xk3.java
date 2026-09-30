package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xk3 extends gbe implements a26 {
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ x16 $onConfirm;
    final /* synthetic */ ol3 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk3(ol3 ol3Var, r0 r0Var, x16 x16Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.$viewModel = ol3Var;
        this.$divinationViewModel = r0Var;
        this.$onConfirm = x16Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new xk3(this.$viewModel, this.$divinationViewModel, this.$onConfirm, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (defpackage.ynb.p0(r8, r0, r7) == r5) goto L22;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L1c
            if (r0 == r4) goto L18
            if (r0 != r3) goto L12
            defpackage.jzb.q(r8)
            goto L66
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L18:
            defpackage.jzb.q(r8)
            goto L4a
        L1c:
            defpackage.jzb.q(r8)
            ol3 r8 = r7.$viewModel
            whb r8 = r8.v
            q0e r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L32
            goto L67
        L32:
            ai.askquin.ui.conversation.r0 r8 = r7.$divinationViewModel
            if (r8 == 0) goto L67
            r7.label = r4
            js3 r0 = defpackage.ga4.a
            wg6 r0 = defpackage.mk8.a
            wg6 r0 = r0.f
            ae4 r6 = new ae4
            r6.<init>(r8, r1)
            java.lang.Object r8 = defpackage.ynb.p0(r0, r6, r7)
            if (r8 != r5) goto L4a
            goto L65
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != r4) goto L67
            js3 r8 = defpackage.ga4.a
            wg6 r8 = defpackage.mk8.a
            wk3 r0 = new wk3
            x16 r2 = r7.$onConfirm
            r0.<init>(r2, r1)
            r7.label = r3
            java.lang.Object r7 = defpackage.ynb.p0(r8, r0, r7)
            if (r7 != r5) goto L66
        L65:
            return r5
        L66:
            r2 = r4
        L67:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk3.r(java.lang.Object):java.lang.Object");
    }
}
