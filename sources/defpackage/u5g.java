package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u5g extends gbe implements l26 {
    final /* synthetic */ h0e $dragged$delegate;
    final /* synthetic */ yx9 $pagerState;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5g(yx9 yx9Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pagerState = yx9Var;
        this.$dragged$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u5g(this.$pagerState, this.$dragged$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r7)
            goto L2f
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L17:
            defpackage.jzb.q(r7)
            goto L3a
        L1b:
            defpackage.jzb.q(r7)
            h0e r7 = r6.$dragged$delegate
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L2f
            wef r6 = defpackage.wef.a
            return r6
        L2f:
            r6.label = r2
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = defpackage.vfh.q(r4, r6)
            if (r7 != r3) goto L3a
            goto L5a
        L3a:
            yx9 r7 = r6.$pagerState
            hzc r7 = r7.d
            java.lang.Object r7 = r7.c
            sz9 r7 = (defpackage.sz9) r7
            int r7 = r7.j()
            int r7 = r7 + r2
            yx9 r0 = r6.$pagerState
            int r0 = r0.l()
            int r7 = r7 % r0
            yx9 r0 = r6.$pagerState
            r6.I$0 = r7
            r6.label = r1
            java.lang.Object r7 = defpackage.yx9.g(r0, r7, r6)
            if (r7 != r3) goto L2f
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5g.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((u5g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
