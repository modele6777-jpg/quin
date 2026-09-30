package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class keb extends gbe implements l26 {
    final /* synthetic */ phb $layouts;
    final /* synthetic */ e89 $selecting$delegate;
    final /* synthetic */ qwc $selection;
    final /* synthetic */ e89 $selectionRequest$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keb(phb phbVar, qwc qwcVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$layouts = phbVar;
        this.$selection = qwcVar;
        this.$selectionRequest$delegate = e89Var;
        this.$selecting$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new keb(this.$layouts, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[PHI: r0
  0x00a7: PHI (r0v5 rgb) = (r0v4 rgb), (r0v12 rgb) binds: [B:27:0x00a4, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r10.c(r2, r0, r9) == r7) goto L31;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            wef r6 = defpackage.wef.a
            bw2 r7 = defpackage.bw2.a
            if (r0 == 0) goto L3d
            if (r0 == r4) goto L35
            if (r0 == r3) goto L2d
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r9.L$0
            rgb r0 = (defpackage.rgb) r0
            defpackage.jzb.q(r10)
            goto Lb8
        L1e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r5
        L24:
            java.lang.Object r0 = r9.L$0
            rgb r0 = (defpackage.rgb) r0
            defpackage.jzb.q(r10)
            goto La7
        L2d:
            java.lang.Object r0 = r9.L$0
            rgb r0 = (defpackage.rgb) r0
            defpackage.jzb.q(r10)
            goto L8f
        L35:
            java.lang.Object r0 = r9.L$0
            rgb r0 = (defpackage.rgb) r0
            defpackage.jzb.q(r10)
            goto L73
        L3d:
            defpackage.jzb.q(r10)
            e89 r10 = r9.$selectionRequest$delegate
            java.lang.Object r10 = r10.getValue()
            r0 = r10
            rgb r0 = (defpackage.rgb) r0
            if (r0 != 0) goto L4c
            goto L5a
        L4c:
            e89 r10 = r9.$selecting$delegate
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L5b
        L5a:
            return r6
        L5b:
            z8b r10 = new z8b
            r10.<init>(r2)
            r9.L$0 = r0
            r9.label = r4
            pv2 r4 = r9.getContext()
            z09 r4 = defpackage.tm7.J(r4)
            java.lang.Object r10 = r4.g0(r9, r10)
            if (r10 != r7) goto L73
            goto Lb7
        L73:
            phb r10 = r9.$layouts
            hla r4 = new hla
            r8 = 6
            r4.<init>(r8, r10)
            ybc r10 = defpackage.jzb.p(r4)
            jeb r4 = new jeb
            r4.<init>(r0, r5)
            r9.L$0 = r0
            r9.label = r3
            java.lang.Object r10 = defpackage.tm7.C(r10, r4, r9)
            if (r10 != r7) goto L8f
            goto Lb7
        L8f:
            z8b r10 = new z8b
            r10.<init>(r1)
            r9.L$0 = r0
            r9.label = r2
            pv2 r2 = r9.getContext()
            z09 r2 = defpackage.tm7.J(r2)
            java.lang.Object r10 = r2.g0(r9, r10)
            if (r10 != r7) goto La7
            goto Lb7
        La7:
            phb r10 = r9.$layouts
            long r2 = r0.a
            qwc r0 = r9.$selection
            r9.L$0 = r5
            r9.label = r1
            java.lang.Object r10 = r10.c(r2, r0, r9)
            if (r10 != r7) goto Lb8
        Lb7:
            return r7
        Lb8:
            e89 r9 = r9.$selectionRequest$delegate
            r9.setValue(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keb.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((keb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
