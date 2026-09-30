package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends gbe implements l26 {
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ dg7 $job;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(dg7 dg7Var, long j, t69 t69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$job = dg7Var;
        this.$offset = j;
        this.$interactionSource = t69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new p0(this.$job, this.$offset, this.$interactionSource, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (((defpackage.u69) r9).a(r0, r8) == r5) goto L20;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L26
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            defpackage.jzb.q(r9)
            goto L5e
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r1
        L1a:
            java.lang.Object r0 = r8.L$0
            qta r0 = (defpackage.qta) r0
            defpackage.jzb.q(r9)
            goto L4f
        L22:
            defpackage.jzb.q(r9)
            goto L34
        L26:
            defpackage.jzb.q(r9)
            dg7 r9 = r8.$job
            r8.label = r4
            java.lang.Object r9 = r9.U0(r8)
            if (r9 != r5) goto L34
            goto L5d
        L34:
            pta r9 = new pta
            long r6 = r8.$offset
            r9.<init>(r6)
            qta r0 = new qta
            r0.<init>(r9)
            t69 r4 = r8.$interactionSource
            r8.L$0 = r0
            r8.label = r3
            u69 r4 = (defpackage.u69) r4
            java.lang.Object r9 = r4.a(r9, r8)
            if (r9 != r5) goto L4f
            goto L5d
        L4f:
            t69 r9 = r8.$interactionSource
            r8.L$0 = r1
            r8.label = r2
            u69 r9 = (defpackage.u69) r9
            java.lang.Object r8 = r9.a(r0, r8)
            if (r8 != r5) goto L5e
        L5d:
            return r5
        L5e:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((p0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
