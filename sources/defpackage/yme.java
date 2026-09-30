package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yme extends gbe implements l26 {
    final /* synthetic */ xme $dataProvider;
    final /* synthetic */ long $localClickOffset;
    final /* synthetic */ ene $provider;
    int label;
    final /* synthetic */ zme this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yme(zme zmeVar, long j, ene eneVar, xme xmeVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = zmeVar;
        this.$localClickOffset = j;
        this.$provider = eneVar;
        this.$dataProvider = xmeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yme(this.this$0, this.$localClickOffset, this.$provider, this.$dataProvider, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7.a(r0, r6) == r3) goto L17;
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
            goto L41
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L17:
            defpackage.jzb.q(r7)
            goto L34
        L1b:
            defpackage.jzb.q(r7)
            zme r7 = r6.this$0
            l26 r7 = r7.F0
            if (r7 == 0) goto L34
            long r4 = r6.$localClickOffset
            hl9 r0 = new hl9
            r0.<init>(r4)
            r6.label = r2
            java.lang.Object r7 = r7.z(r0, r6)
            if (r7 != r3) goto L34
            goto L40
        L34:
            ene r7 = r6.$provider
            xme r0 = r6.$dataProvider
            r6.label = r1
            java.lang.Object r6 = r7.a(r0, r6)
            if (r6 != r3) goto L41
        L40:
            return r3
        L41:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yme.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yme) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
