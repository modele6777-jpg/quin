package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b3d extends gbe implements l26 {
    int label;
    final /* synthetic */ d3d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3d(d3d d3dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = d3dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b3d(this.this$0, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5.j(defpackage.n2f.a, r4) == r3) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r5)
            goto L3a
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L17:
            defpackage.jzb.q(r5)
            goto L2b
        L1b:
            defpackage.jzb.q(r5)
            d3d r5 = r4.this$0
            xof r5 = r5.a
            r4.label = r2
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r3) goto L2b
            goto L39
        L2b:
            d3d r5 = r4.this$0
            xof r5 = r5.a
            r4.label = r1
            n2f r0 = defpackage.n2f.a
            java.lang.Object r4 = r5.j(r0, r4)
            if (r4 != r3) goto L3a
        L39:
            return r3
        L3a:
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b3d.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b3d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
