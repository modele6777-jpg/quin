package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lk4 extends czb implements l26 {
    final /* synthetic */ x16 $onDragCancel;
    final /* synthetic */ x16 $onDragEnd;
    final /* synthetic */ a26 $onDragStart;
    final /* synthetic */ l26 $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk4(xn2 xn2Var, x16 x16Var, x16 x16Var2, a26 a26Var, l26 l26Var) {
        super(2, xn2Var);
        this.$onDragStart = a26Var;
        this.$onHorizontalDrag = l26Var;
        this.$onDragEnd = x16Var;
        this.$onDragCancel = x16Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lk4 lk4Var = new lk4(xn2Var, this.$onDragEnd, this.$onDragCancel, this.$onDragStart, this.$onHorizontalDrag);
        lk4Var.L$0 = obj;
        return lk4Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r13 == r5) goto L24;
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
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L32
            if (r0 == r4) goto L29
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.jzb.q(r13)
            r11 = r12
            goto L97
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r1
        L1c:
            java.lang.Object r0 = r12.L$1
            jmb r0 = (defpackage.jmb) r0
            java.lang.Object r3 = r12.L$0
            mbe r3 = (defpackage.mbe) r3
            defpackage.jzb.q(r13)
            r11 = r12
            goto L65
        L29:
            java.lang.Object r0 = r12.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r13)
        L30:
            r6 = r0
            goto L45
        L32:
            defpackage.jzb.q(r13)
            java.lang.Object r13 = r12.L$0
            r0 = r13
            mbe r0 = (defpackage.mbe) r0
            r12.L$0 = r0
            r12.label = r4
            java.lang.Object r13 = defpackage.ffe.b(r0, r12, r3)
            if (r13 != r5) goto L30
            goto L96
        L45:
            oia r13 = (defpackage.oia) r13
            jmb r0 = new jmb
            r0.<init>()
            long r7 = r13.a
            int r9 = r13.i
            kk4 r10 = new kk4
            r13 = 0
            r10.<init>(r0, r13)
            r12.L$0 = r6
            r12.L$1 = r0
            r12.label = r3
            r11 = r12
            java.lang.Object r13 = defpackage.rk4.c(r6, r7, r9, r10, r11)
            if (r13 != r5) goto L64
            goto L96
        L64:
            r3 = r6
        L65:
            oia r13 = (defpackage.oia) r13
            if (r13 == 0) goto Laa
            a26 r12 = r11.$onDragStart
            long r6 = r13.c
            hl9 r8 = new hl9
            r8.<init>(r6)
            r12.d(r8)
            l26 r12 = r11.$onHorizontalDrag
            float r0 = r0.element
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r12.z(r13, r6)
            long r12 = r13.a
            l26 r0 = r11.$onHorizontalDrag
            ik4 r6 = new ik4
            r6.<init>(r4, r0)
            r11.L$0 = r1
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r13 = defpackage.rk4.l(r3, r12, r6, r11)
            if (r13 != r5) goto L97
        L96:
            return r5
        L97:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r12 = r13.booleanValue()
            if (r12 == 0) goto La5
            x16 r12 = r11.$onDragEnd
            r12.invoke()
            goto Laa
        La5:
            x16 r12 = r11.$onDragCancel
            r12.invoke()
        Laa:
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lk4) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
