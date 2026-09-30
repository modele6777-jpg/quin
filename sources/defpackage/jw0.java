package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 extends gbe implements l26 {
    final /* synthetic */ h89 $isLongPressedFlow;
    final /* synthetic */ d0f $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw0(h89 h89Var, d0f d0fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isLongPressedFlow = h89Var;
        this.$state = d0fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jw0(this.$isLongPressedFlow, this.$state, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (defpackage.ok8.p(r7, r0, r6) == r5) goto L30;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L28
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1e
            if (r0 == r2) goto L16
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L16:
            java.lang.Object r6 = r6.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.jzb.q(r7)
            goto L84
        L1e:
            defpackage.jzb.q(r7)
            goto L62
        L22:
            defpackage.jzb.q(r7)     // Catch: java.lang.Throwable -> L26
            goto L46
        L26:
            r7 = move-exception
            goto L65
        L28:
            defpackage.jzb.q(r7)
            h89 r7 = r6.$isLongPressedFlow     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            s0e r7 = (defpackage.s0e) r7     // Catch: java.lang.Throwable -> L26
            r7.getClass()     // Catch: java.lang.Throwable -> L26
            r7.n(r1, r0)     // Catch: java.lang.Throwable -> L26
            d0f r7 = r6.$state     // Catch: java.lang.Throwable -> L26
            s89 r0 = defpackage.s89.c     // Catch: java.lang.Throwable -> L26
            r6.label = r4     // Catch: java.lang.Throwable -> L26
            h0f r7 = (defpackage.h0f) r7     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = r7.c(r0, r6)     // Catch: java.lang.Throwable -> L26
            if (r7 != r5) goto L46
            goto L82
        L46:
            d0f r7 = r6.$state
            h0f r7 = (defpackage.h0f) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto L62
            h89 r7 = r6.$isLongPressedFlow
            iw0 r0 = new iw0
            d0f r2 = r6.$state
            r0.<init>(r2, r1)
            r6.label = r3
            java.lang.Object r6 = defpackage.ok8.p(r7, r0, r6)
            if (r6 != r5) goto L62
            goto L82
        L62:
            wef r6 = defpackage.wef.a
            return r6
        L65:
            d0f r0 = r6.$state
            h0f r0 = (defpackage.h0f) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L85
            h89 r0 = r6.$isLongPressedFlow
            iw0 r3 = new iw0
            d0f r4 = r6.$state
            r3.<init>(r4, r1)
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r6 = defpackage.ok8.p(r0, r3, r6)
            if (r6 != r5) goto L83
        L82:
            return r5
        L83:
            r6 = r7
        L84:
            r7 = r6
        L85:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jw0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
