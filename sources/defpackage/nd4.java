package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nd4 extends gbe implements l26 {
    final /* synthetic */ String $id;
    final /* synthetic */ nb4 $this_contentFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd4(xn2 xn2Var, nb4 nb4Var, String str) {
        super(2, xn2Var);
        this.$id = str;
        this.$this_contentFlow = nb4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nd4 nd4Var = new nd4(xn2Var, this.$this_contentFlow, this.$id);
        nd4Var.L$0 = obj;
        return nd4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r0.a(r9, r8) == r5) goto L17;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r8 = r8.L$1
            fb4 r8 = (defpackage.fb4) r8
            defpackage.jzb.q(r9)
            goto L4f
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r4
        L1f:
            defpackage.jzb.q(r9)
            goto L3e
        L23:
            defpackage.jzb.q(r9)
            js3 r9 = defpackage.ga4.a
            hr3 r9 = defpackage.hr3.c
            md4 r1 = new md4
            nb4 r6 = r8.$this_contentFlow
            java.lang.String r7 = r8.$id
            r1.<init>(r4, r6, r7)
            r8.L$0 = r0
            r8.label = r3
            java.lang.Object r9 = defpackage.ynb.p0(r9, r1, r8)
            if (r9 != r5) goto L3e
            goto L4e
        L3e:
            fb4 r9 = (defpackage.fb4) r9
            if (r9 == 0) goto L52
            r8.L$0 = r4
            r8.L$1 = r4
            r8.label = r2
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r5) goto L4f
        L4e:
            return r5
        L4f:
            wef r8 = defpackage.wef.a
            return r8
        L52:
            java.lang.String r8 = r8.$id
            java.lang.String r9 = "No content row for divination id="
            java.lang.String r8 = defpackage.ub3.i(r9, r8)
            com.adjust.sdk.sig.r3.n(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nd4) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
