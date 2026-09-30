package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sz6 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ uz6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz6(uz6 uz6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = uz6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sz6(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r2.u(r3, r8) == r5) goto L24;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L2a
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1c
            java.lang.Object r0 = r8.L$1
            java.time.OffsetDateTime r0 = (java.time.OffsetDateTime) r0
            java.lang.Object r8 = r8.L$0
            java.time.OffsetDateTime r8 = (java.time.OffsetDateTime) r8
            defpackage.jzb.q(r9)
            goto L79
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r4
        L22:
            java.lang.Object r0 = r8.L$0
            java.time.OffsetDateTime r0 = (java.time.OffsetDateTime) r0
            defpackage.jzb.q(r9)
            goto L5e
        L2a:
            defpackage.jzb.q(r9)
            goto L45
        L2e:
            defpackage.jzb.q(r9)
            js3 r9 = defpackage.ga4.a
            hr3 r9 = defpackage.hr3.c
            qz6 r0 = new qz6
            uz6 r6 = r8.this$0
            r0.<init>(r6, r4)
            r8.label = r3
            java.lang.Object r9 = defpackage.ynb.p0(r9, r0, r8)
            if (r9 != r5) goto L45
            goto L78
        L45:
            r0 = r9
            java.time.OffsetDateTime r0 = (java.time.OffsetDateTime) r0
            js3 r9 = defpackage.ga4.a
            hr3 r9 = defpackage.hr3.c
            rz6 r6 = new rz6
            uz6 r7 = r8.this$0
            r6.<init>(r7, r4)
            r8.L$0 = r0
            r8.label = r2
            java.lang.Object r9 = defpackage.ynb.p0(r9, r6, r8)
            if (r9 != r5) goto L5e
            goto L78
        L5e:
            java.time.OffsetDateTime r9 = (java.time.OffsetDateTime) r9
            uz6 r2 = r8.this$0
            gd8 r2 = r2.c
            int r9 = r9.compareTo(r0)
            if (r9 <= 0) goto L6b
            goto L6c
        L6b:
            r3 = 0
        L6c:
            r8.L$0 = r4
            r8.L$1 = r4
            r8.label = r1
            java.lang.Object r8 = r2.u(r3, r8)
            if (r8 != r5) goto L79
        L78:
            return r5
        L79:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz6.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sz6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
