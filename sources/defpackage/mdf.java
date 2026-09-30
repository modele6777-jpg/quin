package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mdf extends gbe implements l26 {
    final /* synthetic */ x6d $configuration;
    final /* synthetic */ x48 $lifecycleOwner;
    final /* synthetic */ List<gbd> $shareTypes;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdf(x48 x48Var, x6d x6dVar, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.$lifecycleOwner = x48Var;
        this.$configuration = x6dVar;
        this.$shareTypes = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mdf(this.$lifecycleOwner, this.$configuration, this.$shareTypes, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (defpackage.tm7.J(getContext()).g0(r7, r8) == r4) goto L15;
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
            r2 = 1
            r3 = 2
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r3) goto L11
            defpackage.jzb.q(r8)
            goto L51
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L17:
            defpackage.jzb.q(r8)
            goto L3a
        L1b:
            defpackage.jzb.q(r8)
            x48 r8 = r7.$lifecycleOwner
            h48 r8 = r8.k()
            a58 r8 = (defpackage.a58) r8
            s0e r8 = r8.j
            whb r8 = defpackage.if9.n(r8)
            ldf r0 = new ldf
            r0.<init>(r3, r1)
            r7.label = r2
            java.lang.Object r8 = defpackage.tm7.C(r8, r0, r7)
            if (r8 != r4) goto L3a
            goto L50
        L3a:
            k8f r8 = new k8f
            r0 = 3
            r8.<init>(r0)
            r7.label = r3
            pv2 r0 = r7.getContext()
            z09 r0 = defpackage.tm7.J(r0)
            java.lang.Object r8 = r0.g0(r7, r8)
            if (r8 != r4) goto L51
        L50:
            return r4
        L51:
            x6d r8 = r7.$configuration
            java.util.List<gbd> r0 = r7.$shareTypes
            r8.getClass()
            r0.getClass()
            b6d r7 = new b6d
            e8d r1 = r8.d
            java.util.Map r8 = defpackage.q3c.l(r8, r1)
            iy9 r6 = new iy9
            java.lang.String r1 = "pathway"
            java.lang.String r2 = "share_sheet"
            r6.<init>(r1, r2)
            e2d r4 = new e2d
            r1 = 9
            r4.<init>(r1)
            r5 = 30
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            java.lang.String r0 = defpackage.s72.D0(r0, r1, r2, r3, r4, r5)
            iy9 r1 = new iy9
            java.lang.String r2 = "channels"
            r1.<init>(r2, r0)
            iy9[] r0 = new defpackage.iy9[]{r6, r1}
            java.util.Map r0 = defpackage.bm8.H(r0)
            java.util.LinkedHashMap r8 = defpackage.bm8.L(r8, r0)
            java.lang.String r0 = "popup_view"
            r7.<init>(r0, r8)
            defpackage.w6c.y(r7)
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mdf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
