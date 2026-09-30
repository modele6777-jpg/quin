package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kbe extends gbe implements l26 {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ mbe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbe(long j, mbe mbeVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$timeMillis = j;
        this.this$0 = mbeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kbe(this.$timeMillis, this.this$0, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (defpackage.vfh.q(8, r8) == r5) goto L15;
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
            r1 = 8
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L12
            defpackage.jzb.q(r9)
            goto L35
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            r8 = 0
            return r8
        L19:
            defpackage.jzb.q(r9)
            goto L2c
        L1d:
            defpackage.jzb.q(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r1
            r8.label = r4
            java.lang.Object r9 = defpackage.vfh.q(r6, r8)
            if (r9 != r5) goto L2c
            goto L34
        L2c:
            r8.label = r3
            java.lang.Object r9 = defpackage.vfh.q(r1, r8)
            if (r9 != r5) goto L35
        L34:
            return r5
        L35:
            mbe r9 = r8.this$0
            pl1 r9 = r9.c
            if (r9 == 0) goto L4a
            jia r0 = new jia
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            dzb r8 = new dzb
            r8.<init>(r0)
            r9.g(r8)
        L4a:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbe.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kbe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
