package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vle extends gbe implements l26 {
    final /* synthetic */ j18 $listState;
    final /* synthetic */ int $visibleCount;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vle(j18 j18Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$listState = j18Var;
        this.$visibleCount = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vle(this.$listState, this.$visibleCount, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r2.f(r0, r6) == r3) goto L18;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
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
            goto L50
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L17:
            defpackage.jzb.q(r7)
            goto L29
        L1b:
            defpackage.jzb.q(r7)
            r6.label = r2
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = defpackage.vfh.q(r4, r6)
            if (r7 != r3) goto L29
            goto L4f
        L29:
            j18 r7 = r6.$listState
            b18 r7 = r7.h()
            int r7 = r7.o
            int r0 = r6.$visibleCount
            r2 = 5
            if (r0 <= r2) goto L50
            if (r7 <= 0) goto L50
            int r0 = r7 + (-2)
            int r2 = r7 + (-1)
            r4 = 0
            int r0 = defpackage.mh3.o(r0, r4, r2)
            j18 r2 = r6.$listState
            r6.I$0 = r7
            r6.I$1 = r0
            r6.label = r1
            java.lang.Object r6 = r2.f(r0, r6)
            if (r6 != r3) goto L50
        L4f:
            return r3
        L50:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vle.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vle) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
