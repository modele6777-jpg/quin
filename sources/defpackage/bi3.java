package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bi3 extends gbe implements l26 {
    final /* synthetic */ n69 $boxRotation$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi3(n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$boxRotation$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bi3(this.$boxRotation$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (defpackage.hkg.S(-4.0f, 22.0f, r8, r9, r10, 4) == r5) goto L20;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 0
            r2 = 3
            r3 = 1
            r4 = 2
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r4) goto L1b
            if (r0 != r2) goto L14
            defpackage.jzb.q(r13)
            goto L6d
        L14:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            r12 = 0
            return r12
        L1b:
            defpackage.jzb.q(r13)
            r10 = r12
            goto L50
        L20:
            defpackage.jzb.q(r13)
            goto L32
        L24:
            defpackage.jzb.q(r13)
            r12.label = r3
            r6 = 220(0xdc, double:1.087E-321)
            java.lang.Object r13 = defpackage.vfh.q(r6, r12)
            if (r13 != r5) goto L32
            goto L6c
        L32:
            r13 = 360(0x168, float:5.04E-43)
            q03 r0 = defpackage.hs4.a
            x6f r8 = defpackage.b21.T(r13, r1, r0, r4)
            n69 r13 = r12.$boxRotation$delegate
            iu1 r9 = new iu1
            r9.<init>(r13, r4)
            r12.label = r4
            r6 = 1102053376(0x41b00000, float:22.0)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            r11 = 4
            r10 = r12
            java.lang.Object r12 = defpackage.hkg.S(r6, r7, r8, r9, r10, r11)
            if (r12 != r5) goto L50
            goto L6c
        L50:
            r12 = 520(0x208, float:7.29E-43)
            q03 r13 = defpackage.hs4.a
            x6f r8 = defpackage.b21.T(r12, r1, r13, r4)
            n69 r12 = r10.$boxRotation$delegate
            iu1 r9 = new iu1
            r9.<init>(r12, r2)
            r10.label = r2
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            r7 = 1102053376(0x41b00000, float:22.0)
            r11 = 4
            java.lang.Object r12 = defpackage.hkg.S(r6, r7, r8, r9, r10, r11)
            if (r12 != r5) goto L6d
        L6c:
            return r5
        L6d:
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bi3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
