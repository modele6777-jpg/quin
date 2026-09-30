package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v4c extends czb implements l26 {
    final /* synthetic */ a26 $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4c(xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$onDown = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        v4c v4cVar = new v4c(xn2Var, this.$onDown);
        v4cVar.L$0 = obj;
        return v4cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r8 == r4) goto L15;
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
            r1 = 2
            r2 = 0
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r1) goto L11
            defpackage.jzb.q(r8)
            goto L50
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r2
        L17:
            java.lang.Object r0 = r7.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r8)
            goto L32
        L1f:
            defpackage.jzb.q(r8)
            java.lang.Object r8 = r7.L$0
            r0 = r8
            mbe r0 = (defpackage.mbe) r0
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = defpackage.cn1.o(r0, r7)
            if (r8 != r4) goto L32
            goto L4f
        L32:
            oia r8 = (defpackage.oia) r8
            r8.a()
            a26 r3 = r7.$onDown
            long r5 = r8.c
            hl9 r8 = new hl9
            r8.<init>(r5)
            r3.d(r8)
            r7.L$0 = r2
            r7.label = r1
            iia r8 = defpackage.iia.b
            java.lang.Object r8 = defpackage.ffe.j(r0, r8, r7)
            if (r8 != r4) goto L50
        L4f:
            return r4
        L50:
            oia r8 = (defpackage.oia) r8
            if (r8 == 0) goto L57
            r8.a()
        L57:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4c.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v4c) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
