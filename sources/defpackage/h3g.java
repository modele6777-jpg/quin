package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h3g extends gbe implements l26 {
    final /* synthetic */ c3g $exit;
    final /* synthetic */ h0e $latestOnReadyForDissolve$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3g(c3g c3gVar, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$exit = c3gVar;
        this.$latestOnReadyForDissolve$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h3g(this.$exit, this.$latestOnReadyForDissolve$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (defpackage.jx.b(r6, r7, r8, null, null, r11, 12) == r5) goto L18;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 1065353216(0x3f800000, float:1.0)
            wef r2 = defpackage.wef.a
            r3 = 1
            r4 = 2
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L21
            if (r0 == r3) goto L1c
            if (r0 != r4) goto L15
            defpackage.jzb.q(r14)
            r11 = r13
            goto L76
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            r13 = 0
            return r13
        L1c:
            defpackage.jzb.q(r14)
            r11 = r13
            goto L55
        L21:
            defpackage.jzb.q(r14)
            c3g r14 = r13.$exit
            vz9 r14 = r14.d
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L35
            return r2
        L35:
            c3g r14 = r13.$exit
            jx r6 = r14.a
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r1)
            r14 = 0
            q03 r0 = defpackage.gs4.c
            r8 = 750(0x2ee, float:1.051E-42)
            x6f r8 = defpackage.b21.T(r8, r14, r0, r4)
            r13.label = r3
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.jx.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto L55
            goto L75
        L55:
            c3g r13 = r11.$exit
            jx r6 = r13.b
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r1)
            q03 r13 = defpackage.gs4.c
            x6f r8 = new x6f
            r14 = 500(0x1f4, float:7.0E-43)
            r0 = 300(0x12c, float:4.2E-43)
            r8.<init>(r14, r0, r13)
            r11.label = r4
            r9 = 0
            r10 = 0
            r12 = 12
            java.lang.Object r13 = defpackage.jx.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto L76
        L75:
            return r5
        L76:
            h0e r13 = r11.$latestOnReadyForDissolve$delegate
            iy9[] r14 = defpackage.i3g.a
            java.lang.Object r13 = r13.getValue()
            x16 r13 = (defpackage.x16) r13
            r13.invoke()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h3g.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h3g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
