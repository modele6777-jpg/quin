package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class du1 extends gbe implements l26 {
    final /* synthetic */ tt1 $controller;
    final /* synthetic */ jx $flipAngle;
    final /* synthetic */ n69 $lastFlipDirection$delegate;
    final /* synthetic */ jx $progress;
    final /* synthetic */ e89 $tiltEnabled$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du1(tt1 tt1Var, jx jxVar, e89 e89Var, jx jxVar2, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$controller = tt1Var;
        this.$progress = jxVar;
        this.$tiltEnabled$delegate = e89Var;
        this.$flipAngle = jxVar2;
        this.$lastFlipDirection$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new du1(this.$controller, this.$progress, this.$tiltEnabled$delegate, this.$flipAngle, this.$lastFlipDirection$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (defpackage.jx.b(r4, r5, r6, null, null, r9, 12) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (defpackage.jgb.O(r3, r9) == r0) goto L21;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r12)
            r9 = r11
            goto L8f
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r1
        L17:
            defpackage.jzb.q(r12)
            r9 = r11
            goto L68
        L1c:
            defpackage.jzb.q(r12)
            tt1 r12 = r11.$controller
            vz9 r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            bw2 r0 = defpackage.bw2.a
            if (r12 == 0) goto L70
            tt1 r12 = r11.$controller
            vz9 r12 = r12.f
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L48
            e89 r12 = r11.$tiltEnabled$delegate
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r12.setValue(r1)
        L48:
            jx r4 = r11.$progress
            java.lang.Float r5 = new java.lang.Float
            r12 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12)
            r12 = 450(0x1c2, float:6.3E-43)
            q03 r1 = defpackage.hs4.a
            r6 = 0
            x6f r6 = defpackage.b21.T(r12, r6, r1, r2)
            r11.label = r3
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r11 = defpackage.jx.b(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L68
            goto L8e
        L68:
            e89 r11 = r9.$tiltEnabled$delegate
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r11.setValue(r12)
            goto La4
        L70:
            r9 = r11
            e89 r11 = r9.$tiltEnabled$delegate
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r11.setValue(r12)
            cu1 r3 = new cu1
            tt1 r4 = r9.$controller
            jx r5 = r9.$progress
            jx r6 = r9.$flipAngle
            n69 r7 = r9.$lastFlipDirection$delegate
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r9.label = r2
            java.lang.Object r11 = defpackage.jgb.O(r3, r9)
            if (r11 != r0) goto L8f
        L8e:
            return r0
        L8f:
            tt1 r11 = r9.$controller
            vz9 r12 = r11.a
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto La4
            vz9 r11 = r11.b
            r11.setValue(r1)
        La4:
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((du1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
