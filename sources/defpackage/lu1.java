package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lu1 extends gbe implements l26 {
    final /* synthetic */ jx $flipAngle;
    final /* synthetic */ er1 $flipTarget;
    final /* synthetic */ gh6 $haptics;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu1(gh6 gh6Var, jx jxVar, float f, er1 er1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$haptics = gh6Var;
        this.$flipAngle = jxVar;
        this.$target = f;
        this.$flipTarget = er1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lu1(this.$haptics, this.$flipAngle, this.$target, this.$flipTarget, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r13.g(r11, r0) == r5) goto L22;
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
            r1 = 0
            r2 = 1135869952(0x43b40000, float:360.0)
            r3 = 1
            r4 = 2
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1b
            if (r0 != r4) goto L14
            defpackage.jzb.q(r14)
            r11 = r13
            goto L6e
        L14:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            r13 = 0
            return r13
        L1b:
            defpackage.jzb.q(r14)
            r11 = r13
            goto L48
        L20:
            defpackage.jzb.q(r14)
            gh6 r14 = r13.$haptics
            r14.a()
            jx r6 = r13.$flipAngle
            float r14 = r13.$target
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r14)
            r14 = 0
            q03 r0 = defpackage.hs4.a
            r8 = 400(0x190, float:5.6E-43)
            x6f r8 = defpackage.b21.T(r8, r14, r0, r4)
            r13.label = r3
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.jx.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto L48
            goto L6d
        L48:
            jx r13 = r11.$flipAngle
            float r14 = r11.$target
            float r14 = r14 % r2
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            goto L60
        L52:
            float r0 = java.lang.Math.signum(r14)
            float r3 = java.lang.Math.signum(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L5f
            goto L60
        L5f:
            float r14 = r14 + r2
        L60:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r14)
            r11.label = r4
            java.lang.Object r13 = r13.g(r11, r0)
            if (r13 != r5) goto L6e
        L6d:
            return r5
        L6e:
            er1 r13 = r11.$flipTarget
            float r14 = r11.$target
            float r0 = r13.a
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 != 0) goto L8e
            float r14 = r14 % r2
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L8c
        L7e:
            float r0 = java.lang.Math.signum(r14)
            float r1 = java.lang.Math.signum(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            goto L8c
        L8b:
            float r14 = r14 + r2
        L8c:
            r13.a = r14
        L8e:
            wef r13 = defpackage.wef.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lu1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
