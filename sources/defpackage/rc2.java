package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 extends gbe implements l26 {
    final /* synthetic */ jx $p;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc2(jx jxVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$p = jxVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rc2(this.$p, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (defpackage.jx.b(r0, r1, r2, null, null, r13, 12) == r12) goto L20;
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
            r7 = 3
            r8 = 2
            r1 = 1
            r9 = 6
            r10 = 0
            r11 = 0
            bw2 r12 = defpackage.bw2.a
            if (r0 == 0) goto L25
            if (r0 == r1) goto L21
            if (r0 == r8) goto L1d
            if (r0 != r7) goto L17
            defpackage.jzb.q(r14)
            goto L84
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            return r11
        L1d:
            defpackage.jzb.q(r14)
            goto L66
        L21:
            defpackage.jzb.q(r14)
            goto L48
        L25:
            defpackage.jzb.q(r14)
            jx r0 = r13.$p
            java.lang.Float r2 = new java.lang.Float
            r3 = 1053609165(0x3ecccccd, float:0.4)
            r2.<init>(r3)
            r3 = 2000(0x7d0, float:2.803E-42)
            x6f r3 = defpackage.b21.T(r3, r10, r11, r9)
            r13.label = r1
            r1 = r2
            r2 = r3
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r13
            java.lang.Object r0 = defpackage.jx.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r12) goto L48
            goto L83
        L48:
            jx r0 = r13.$p
            java.lang.Float r1 = new java.lang.Float
            r2 = 1060320051(0x3f333333, float:0.7)
            r1.<init>(r2)
            r2 = 5000(0x1388, float:7.006E-42)
            x6f r2 = defpackage.b21.T(r2, r10, r11, r9)
            r13.label = r8
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r13
            java.lang.Object r0 = defpackage.jx.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r12) goto L66
            goto L83
        L66:
            jx r0 = r13.$p
            java.lang.Float r1 = new java.lang.Float
            r2 = 1064514355(0x3f733333, float:0.95)
            r1.<init>(r2)
            r2 = 20000(0x4e20, float:2.8026E-41)
            x6f r2 = defpackage.b21.T(r2, r10, r11, r9)
            r13.label = r7
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r13
            java.lang.Object r0 = defpackage.jx.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r12) goto L84
        L83:
            return r12
        L84:
            wef r0 = defpackage.wef.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rc2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
