package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lg extends gbe implements l26 {
    final /* synthetic */ xn5 $focusManager;
    final /* synthetic */ boolean $isInspection;
    final /* synthetic */ e89 $showAiBubble$delegate;
    final /* synthetic */ e89 $showUserBubble$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(boolean z, xn5 xn5Var, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isInspection = z;
        this.$focusManager = xn5Var;
        this.$showUserBubble$delegate = e89Var;
        this.$showAiBubble$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lg(this.$isInspection, this.$focusManager, this.$showUserBubble$delegate, this.$showAiBubble$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (defpackage.vfh.q(300, r7) == r4) goto L18;
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
            wef r1 = defpackage.wef.a
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.jzb.q(r8)
            goto L4b
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L19:
            defpackage.jzb.q(r8)
            goto L39
        L1d:
            defpackage.jzb.q(r8)
            boolean r8 = r7.$isInspection
            if (r8 == 0) goto L25
            return r1
        L25:
            xn5 r8 = r7.$focusManager
            bo5 r8 = (defpackage.bo5) r8
            r0 = 8
            r8.c(r0, r3, r3)
            r7.label = r3
            r5 = 200(0xc8, double:9.9E-322)
            java.lang.Object r8 = defpackage.vfh.q(r5, r7)
            if (r8 != r4) goto L39
            goto L4a
        L39:
            e89 r8 = r7.$showUserBubble$delegate
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setValue(r0)
            r7.label = r2
            r2 = 300(0x12c, double:1.48E-321)
            java.lang.Object r8 = defpackage.vfh.q(r2, r7)
            if (r8 != r4) goto L4b
        L4a:
            return r4
        L4b:
            e89 r7 = r7.$showAiBubble$delegate
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.setValue(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lg) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
