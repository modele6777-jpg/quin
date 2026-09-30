package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hk4 extends czb implements l26 {
    final /* synthetic */ l26 $onDrag;
    final /* synthetic */ x16 $onDragCancel;
    final /* synthetic */ a26 $onDragEnd;
    final /* synthetic */ n26 $onDragStart;
    final /* synthetic */ ks9 $orientationLock;
    final /* synthetic */ x16 $shouldAwaitTouchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk4(x16 x16Var, ks9 ks9Var, n26 n26Var, l26 l26Var, x16 x16Var2, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shouldAwaitTouchSlop = x16Var;
        this.$orientationLock = ks9Var;
        this.$onDragStart = n26Var;
        this.$onDrag = l26Var;
        this.$onDragCancel = x16Var2;
        this.$onDragEnd = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hk4 hk4Var = new hk4(this.$shouldAwaitTouchSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, xn2Var);
        hk4Var.L$0 = obj;
        return hk4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (defpackage.rk4.o(r5, (defpackage.oia) r15, r7, r8, r9, r10, r11, r12, r14) == r4) goto L16;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L20
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r15)
            goto L51
        L11:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r14)
            return r1
        L17:
            java.lang.Object r0 = r14.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r15)
        L1e:
            r5 = r0
            goto L36
        L20:
            defpackage.jzb.q(r15)
            java.lang.Object r15 = r14.L$0
            r0 = r15
            mbe r0 = (defpackage.mbe) r0
            r14.L$0 = r0
            r14.label = r3
            r15 = 0
            iia r3 = defpackage.iia.a
            java.lang.Object r15 = defpackage.ffe.a(r0, r15, r3, r14)
            if (r15 != r4) goto L1e
            goto L50
        L36:
            r6 = r15
            oia r6 = (defpackage.oia) r6
            x16 r7 = r14.$shouldAwaitTouchSlop
            ks9 r8 = r14.$orientationLock
            n26 r9 = r14.$onDragStart
            l26 r10 = r14.$onDrag
            x16 r11 = r14.$onDragCancel
            a26 r12 = r14.$onDragEnd
            r14.L$0 = r1
            r14.label = r2
            r13 = r14
            java.lang.Object r14 = defpackage.rk4.o(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r4) goto L51
        L50:
            return r4
        L51:
            wef r14 = defpackage.wef.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hk4) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
