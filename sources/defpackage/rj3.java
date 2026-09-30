package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rj3 extends gbe implements l26 {
    final /* synthetic */ e89 $boxExitRequested$delegate;
    final /* synthetic */ n69 $boxSlideX$delegate;
    final /* synthetic */ e89 $boxViewSession$delegate;
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ jx $openProgress;
    final /* synthetic */ e89 $phase$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj3(gh6 gh6Var, jx jxVar, n69 n69Var, e89 e89Var, e89 e89Var2, e89 e89Var3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$haptic = gh6Var;
        this.$openProgress = jxVar;
        this.$boxSlideX$delegate = n69Var;
        this.$phase$delegate = e89Var;
        this.$boxViewSession$delegate = e89Var2;
        this.$boxExitRequested$delegate = e89Var3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rj3(this.$haptic, this.$openProgress, this.$boxSlideX$delegate, this.$phase$delegate, this.$boxViewSession$delegate, this.$boxExitRequested$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (defpackage.hkg.S(r5, 0.0f, r7, r8, r9, 4) == r4) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 0
            r2 = 1
            r3 = 2
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L19
            if (r0 != r3) goto L12
            defpackage.jzb.q(r13)
            r9 = r12
            goto L6c
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            r12 = 0
            return r12
        L19:
            defpackage.jzb.q(r13)
            r9 = r12
            goto L47
        L1e:
            defpackage.jzb.q(r13)
            gh6 r13 = r12.$haptic
            hh6 r0 = defpackage.hh6.b
            r13.b(r0)
            jx r5 = r12.$openProgress
            java.lang.Float r6 = new java.lang.Float
            r13 = 0
            r6.<init>(r13)
            r13 = 700(0x2bc, float:9.81E-43)
            q03 r0 = defpackage.hs4.a
            x6f r7 = defpackage.b21.T(r13, r1, r0, r3)
            r12.label = r2
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r12 = defpackage.jx.b(r5, r6, r7, r8, r9, r10, r11)
            r9 = r10
            if (r12 != r4) goto L47
            goto L6b
        L47:
            n69 r12 = r9.$boxSlideX$delegate
            float r13 = defpackage.xj3.e
            qz9 r12 = (defpackage.qz9) r12
            float r5 = r12.j()
            r12 = 500(0x1f4, float:7.0E-43)
            q03 r13 = defpackage.hs4.a
            x6f r7 = defpackage.b21.T(r12, r1, r13, r3)
            n69 r12 = r9.$boxSlideX$delegate
            iu1 r8 = new iu1
            r13 = 5
            r8.<init>(r12, r13)
            r9.label = r3
            r6 = 0
            r10 = 4
            java.lang.Object r12 = defpackage.hkg.S(r5, r6, r7, r8, r9, r10)
            if (r12 != r4) goto L6c
        L6b:
            return r4
        L6c:
            e89 r12 = r9.$phase$delegate
            float r13 = defpackage.xj3.e
            xh3 r13 = defpackage.xh3.b
            r12.setValue(r13)
            e89 r12 = r9.$boxViewSession$delegate
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L8a
            e89 r12 = r9.$boxExitRequested$delegate
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r12.setValue(r13)
        L8a:
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rj3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
