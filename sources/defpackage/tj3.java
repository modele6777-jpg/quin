package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tj3 extends gbe implements l26 {
    final /* synthetic */ n69 $boxSlideX$delegate;
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ jx $openProgress;
    final /* synthetic */ e89 $phase$delegate;
    final /* synthetic */ float $screenWidthPx;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj3(gh6 gh6Var, jx jxVar, float f, n69 n69Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$haptic = gh6Var;
        this.$openProgress = jxVar;
        this.$screenWidthPx = f;
        this.$boxSlideX$delegate = n69Var;
        this.$phase$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        tj3 tj3Var = new tj3(this.$haptic, this.$openProgress, this.$screenWidthPx, this.$boxSlideX$delegate, this.$phase$delegate, xn2Var);
        tj3Var.L$0 = obj;
        return tj3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (defpackage.jx.b(r6, r7, r8, null, null, r11, 12) == r5) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L$0
            aw2 r0 = (defpackage.aw2) r0
            int r1 = r13.label
            r2 = 1
            r3 = 2
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1c
            if (r1 != r3) goto L16
            defpackage.jzb.q(r14)
            r11 = r13
            goto L66
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            return r4
        L1c:
            defpackage.jzb.q(r14)
            goto L44
        L20:
            defpackage.jzb.q(r14)
            gh6 r14 = r13.$haptic
            hh6 r1 = defpackage.hh6.b
            r14.b(r1)
            sj3 r14 = new sj3
            float r1 = r13.$screenWidthPx
            n69 r6 = r13.$boxSlideX$delegate
            r14.<init>(r1, r6, r4)
            r1 = 3
            defpackage.ynb.V(r0, r4, r4, r14, r1)
            r13.L$0 = r4
            r13.label = r2
            r0 = 450(0x1c2, double:2.223E-321)
            java.lang.Object r14 = defpackage.vfh.q(r0, r13)
            if (r14 != r5) goto L44
            goto L65
        L44:
            jx r6 = r13.$openProgress
            java.lang.Float r7 = new java.lang.Float
            r14 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r14)
            r14 = 0
            q03 r0 = defpackage.hs4.a
            r1 = 700(0x2bc, float:9.81E-43)
            x6f r8 = defpackage.b21.T(r1, r14, r0, r3)
            r13.L$0 = r4
            r13.label = r3
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.jx.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto L66
        L65:
            return r5
        L66:
            e89 r13 = r11.$phase$delegate
            float r14 = defpackage.xj3.e
            xh3 r14 = defpackage.xh3.d
            r13.setValue(r14)
            wef r13 = defpackage.wef.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tj3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
