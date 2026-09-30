package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jk4 extends czb implements l26 {
    final /* synthetic */ l26 $onDrag;
    final /* synthetic */ x16 $onDragCancel;
    final /* synthetic */ x16 $onDragEnd;
    final /* synthetic */ a26 $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk4(xn2 xn2Var, x16 x16Var, x16 x16Var2, a26 a26Var, l26 l26Var) {
        super(2, xn2Var);
        this.$onDragStart = a26Var;
        this.$onDragEnd = x16Var;
        this.$onDragCancel = x16Var2;
        this.$onDrag = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jk4 jk4Var = new jk4(xn2Var, this.$onDragEnd, this.$onDragCancel, this.$onDragStart, this.$onDrag);
        jk4Var.L$0 = obj;
        return jk4Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[Catch: CancellationException -> 0x0018, TryCatch #0 {CancellationException -> 0x0018, blocks: (B:8:0x0014, B:32:0x0078, B:34:0x0080, B:36:0x008c, B:38:0x0098, B:39:0x009b, B:40:0x009e, B:41:0x00a4, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:46:0x0008 }] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r9 == r5) goto L31;
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
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L32
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L22
            if (r0 != r2) goto L1b
            java.lang.Object r0 = r8.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r9)     // Catch: java.util.concurrent.CancellationException -> L18
            goto L78
        L18:
            r9 = move-exception
            goto Lac
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            r8 = 0
            return r8
        L22:
            java.lang.Object r0 = r8.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r9)     // Catch: java.util.concurrent.CancellationException -> L18
            goto L54
        L2a:
            java.lang.Object r0 = r8.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r9)     // Catch: java.util.concurrent.CancellationException -> L18
            goto L45
        L32:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            r0 = r9
            mbe r0 = (defpackage.mbe) r0
            r8.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L18
            r8.label = r4     // Catch: java.util.concurrent.CancellationException -> L18
            java.lang.Object r9 = defpackage.ffe.b(r0, r8, r3)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r9 != r5) goto L45
            goto L77
        L45:
            oia r9 = (defpackage.oia) r9     // Catch: java.util.concurrent.CancellationException -> L18
            long r6 = r9.a     // Catch: java.util.concurrent.CancellationException -> L18
            r8.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L18
            r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L18
            java.lang.Object r9 = defpackage.rk4.e(r0, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r9 != r5) goto L54
            goto L77
        L54:
            oia r9 = (defpackage.oia) r9     // Catch: java.util.concurrent.CancellationException -> L18
            if (r9 == 0) goto La9
            a26 r3 = r8.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L18
            long r6 = r9.c     // Catch: java.util.concurrent.CancellationException -> L18
            hl9 r4 = new hl9     // Catch: java.util.concurrent.CancellationException -> L18
            r4.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> L18
            r3.d(r4)     // Catch: java.util.concurrent.CancellationException -> L18
            long r3 = r9.a     // Catch: java.util.concurrent.CancellationException -> L18
            l26 r9 = r8.$onDrag     // Catch: java.util.concurrent.CancellationException -> L18
            ik4 r6 = new ik4     // Catch: java.util.concurrent.CancellationException -> L18
            r6.<init>(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L18
            r8.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L18
            r8.label = r2     // Catch: java.util.concurrent.CancellationException -> L18
            java.lang.Object r9 = defpackage.rk4.k(r0, r3, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r9 != r5) goto L78
        L77:
            return r5
        L78:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L18
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L18
            if (r9 == 0) goto La4
            obe r9 = r0.e     // Catch: java.util.concurrent.CancellationException -> L18
            hia r9 = r9.I0     // Catch: java.util.concurrent.CancellationException -> L18
            java.util.List r9 = r9.a     // Catch: java.util.concurrent.CancellationException -> L18
            int r0 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L18
        L8a:
            if (r1 >= r0) goto L9e
            java.lang.Object r2 = r9.get(r1)     // Catch: java.util.concurrent.CancellationException -> L18
            oia r2 = (defpackage.oia) r2     // Catch: java.util.concurrent.CancellationException -> L18
            boolean r3 = defpackage.xo1.m(r2)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r3 == 0) goto L9b
            r2.a()     // Catch: java.util.concurrent.CancellationException -> L18
        L9b:
            int r1 = r1 + 1
            goto L8a
        L9e:
            x16 r9 = r8.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L18
            r9.invoke()     // Catch: java.util.concurrent.CancellationException -> L18
            goto La9
        La4:
            x16 r9 = r8.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L18
            r9.invoke()     // Catch: java.util.concurrent.CancellationException -> L18
        La9:
            wef r8 = defpackage.wef.a
            return r8
        Lac:
            x16 r8 = r8.$onDragCancel
            r8.invoke()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jk4) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
