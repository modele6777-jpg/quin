package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e02 extends gbe implements l26 {
    final /* synthetic */ int $index;
    final /* synthetic */ a26 $onItemClick;
    final /* synthetic */ jx $slideOutProgress;
    final /* synthetic */ e89 $slidingOutIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e02(int i, jx jxVar, a26 a26Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$index = i;
        this.$slideOutProgress = jxVar;
        this.$onItemClick = a26Var;
        this.$slidingOutIndex$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new e02(this.$index, this.$slideOutProgress, this.$onItemClick, this.$slidingOutIndex$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (defpackage.jx.b(r4, r5, r6, null, null, r9, 12) == r3) goto L15;
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
            r1 = 1
            r2 = 2
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L18
            if (r0 != r2) goto L11
            defpackage.jzb.q(r12)
            r9 = r11
            goto L5e
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            r11 = 0
            return r11
        L18:
            defpackage.jzb.q(r12)
            goto L3e
        L1c:
            defpackage.jzb.q(r12)
            e89 r12 = r11.$slidingOutIndex$delegate
            int r0 = r11.$index
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
            wn7[] r0 = defpackage.q02.a
            r12.setValue(r4)
            jx r12 = r11.$slideOutProgress
            java.lang.Float r0 = new java.lang.Float
            r4 = 0
            r0.<init>(r4)
            r11.label = r1
            java.lang.Object r12 = r12.g(r11, r0)
            if (r12 != r3) goto L3e
            goto L5d
        L3e:
            jx r4 = r11.$slideOutProgress
            java.lang.Float r5 = new java.lang.Float
            r12 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12)
            r12 = 0
            q03 r0 = defpackage.hs4.a
            r1 = 600(0x258, float:8.41E-43)
            x6f r6 = defpackage.b21.T(r1, r12, r0, r2)
            r11.label = r2
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r11 = defpackage.jx.b(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r3) goto L5e
        L5d:
            return r3
        L5e:
            a26 r11 = r9.$onItemClick
            int r12 = r9.$index
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            r11.d(r0)
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e02.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e02) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
