package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gsd extends gbe implements l26 {
    final /* synthetic */ pv2 $context;
    final /* synthetic */ wj5 $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsd(pv2 pv2Var, wj5 wj5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = pv2Var;
        this.$this_collectAsState = wj5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gsd gsdVar = new gsd(this.$context, this.$this_collectAsState, xn2Var);
        gsdVar.L$0 = obj;
        return gsdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r0.b(r1, r6) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (defpackage.ynb.p0(r0, r3, r6) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r4;
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
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L12:
            defpackage.jzb.q(r7)
            goto L4b
        L16:
            defpackage.jzb.q(r7)
            java.lang.Object r7 = r6.L$0
            xva r7 = (defpackage.xva) r7
            pv2 r0 = r6.$context
            nu4 r4 = defpackage.nu4.a
            boolean r0 = defpackage.pa7.t(r0, r4)
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L39
            wj5 r0 = r6.$this_collectAsState
            bk5 r1 = new bk5
            r1.<init>(r7, r2)
            r6.label = r3
            java.lang.Object r6 = r0.b(r1, r6)
            if (r6 != r4) goto L4b
            goto L4a
        L39:
            pv2 r0 = r6.$context
            fsd r3 = new fsd
            wj5 r5 = r6.$this_collectAsState
            r3.<init>(r5, r7, r1)
            r6.label = r2
            java.lang.Object r6 = defpackage.ynb.p0(r0, r3, r6)
            if (r6 != r4) goto L4b
        L4a:
            return r4
        L4b:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsd.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gsd) k((xn2) obj2, (xva) obj)).r(wef.a);
    }
}
