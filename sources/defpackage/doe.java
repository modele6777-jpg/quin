package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class doe extends gbe implements l26 {
    final /* synthetic */ long $currSelection;
    final /* synthetic */ float $offsetDifference;
    final /* synthetic */ hkb $rawCursorRect;
    final /* synthetic */ boolean $shouldBringIntoView;
    float F$0;
    int label;
    final /* synthetic */ eoe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doe(float f, eoe eoeVar, boolean z, long j, hkb hkbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$offsetDifference = f;
        this.this$0 = eoeVar;
        this.$shouldBringIntoView = z;
        this.$currSelection = j;
        this.$rawCursorRect = hkbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new doe(this.$offsetDifference, this.this$0, this.$shouldBringIntoView, this.$currSelection, this.$rawCursorRect, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r0.a(r8, r7) == r4) goto L37;
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
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.jzb.q(r8)
            goto L98
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L19:
            float r0 = r7.F$0
            defpackage.jzb.q(r8)
            goto L52
        L1f:
            defpackage.jzb.q(r8)
            float r8 = r7.$offsetDifference
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 != 0) goto L3b
            boolean r0 = java.lang.Float.isInfinite(r8)
            if (r0 == 0) goto L31
            goto L3b
        L31:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3d
            double r5 = (double) r8
            double r5 = java.lang.Math.ceil(r5)
        L3a:
            float r8 = (float) r5
        L3b:
            r0 = r8
            goto L43
        L3d:
            double r5 = (double) r8
            double r5 = java.lang.Math.floor(r5)
            goto L3a
        L43:
            eoe r8 = r7.this$0
            ghc r8 = r8.M0
            r7.F$0 = r0
            r7.label = r3
            java.lang.Object r8 = defpackage.eb3.S(r8, r0, r7)
            if (r8 != r4) goto L52
            goto L97
        L52:
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            boolean r3 = r7.$shouldBringIntoView
            if (r3 == 0) goto L98
            long r5 = r7.$currSelection
            boolean r3 = defpackage.eue.d(r5)
            if (r3 == 0) goto L87
            hkb r3 = r7.$rawCursorRect
            float r5 = r3.c
            float r3 = r3.a
            float r5 = r5 - r3
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L87
            float r0 = r0 - r8
            float r8 = java.lang.Math.abs(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L7b
            goto L87
        L7b:
            hkb r8 = r7.$rawCursorRect
            float r3 = r8.c
            float r3 = r3 + r0
            r0 = 11
            hkb r8 = defpackage.hkb.b(r8, r1, r3, r1, r0)
            goto L89
        L87:
            hkb r8 = r7.$rawCursorRect
        L89:
            eoe r0 = r7.this$0
            ute r0 = r0.H0
            n31 r0 = r0.h
            r7.label = r2
            java.lang.Object r7 = r0.a(r8, r7)
            if (r7 != r4) goto L98
        L97:
            return r4
        L98:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doe.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((doe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
