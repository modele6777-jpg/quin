package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z4f extends gbe implements l26 {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $resolvedTableNames;
    final /* synthetic */ int[] $tableIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j5f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4f(j5f j5fVar, int[] iArr, boolean z, String[] strArr, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j5fVar;
        this.$tableIds = iArr;
        this.$emitInitialState = z;
        this.$resolvedTableNames = strArr;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        z4f z4fVar = new z4f(this.this$0, this.$tableIds, this.$emitInitialState, this.$resolvedTableNames, xn2Var);
        z4fVar.L$0 = obj;
        return z4fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (defpackage.ynb.p0((defpackage.pv2) r14, r4, r13) == r5) goto L23;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L33
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L23
            if (r0 == r2) goto L16
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            return r1
        L16:
            defpackage.jzb.q(r14)     // Catch: java.lang.Throwable -> L1f
            nt7 r14 = new nt7     // Catch: java.lang.Throwable -> L1f
            r14.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r14     // Catch: java.lang.Throwable -> L1f
        L1f:
            r0 = move-exception
            r14 = r0
            goto L8c
        L23:
            java.lang.Object r0 = r13.L$0
            xj5 r0 = (defpackage.xj5) r0
            defpackage.jzb.q(r14)
            goto L6d
        L2b:
            java.lang.Object r0 = r13.L$0
            xj5 r0 = (defpackage.xj5) r0
            defpackage.jzb.q(r14)
            goto L59
        L33:
            defpackage.jzb.q(r14)
            java.lang.Object r14 = r13.L$0
            xj5 r14 = (defpackage.xj5) r14
            j5f r0 = r13.this$0
            wk9 r0 = r0.h
            int[] r6 = r13.$tableIds
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto L6f
            j5f r0 = r13.this$0
            w5c r0 = r0.a
            r13.L$0 = r14
            r13.label = r4
            r4 = 0
            pv2 r0 = defpackage.urg.A(r0, r4, r13)
            if (r0 != r5) goto L56
            goto L6c
        L56:
            r12 = r0
            r0 = r14
            r14 = r12
        L59:
            pv2 r14 = (defpackage.pv2) r14
            w4f r4 = new w4f
            j5f r6 = r13.this$0
            r4.<init>(r6, r1)
            r13.L$0 = r0
            r13.label = r3
            java.lang.Object r14 = defpackage.ynb.p0(r14, r4, r13)
            if (r14 != r5) goto L6d
        L6c:
            return r5
        L6d:
            r9 = r0
            goto L70
        L6f:
            r9 = r14
        L70:
            mmb r7 = new mmb     // Catch: java.lang.Throwable -> L1f
            r7.<init>()     // Catch: java.lang.Throwable -> L1f
            j5f r14 = r13.this$0     // Catch: java.lang.Throwable -> L1f
            yk9 r14 = r14.i     // Catch: java.lang.Throwable -> L1f
            y4f r6 = new y4f     // Catch: java.lang.Throwable -> L1f
            boolean r8 = r13.$emitInitialState     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r10 = r13.$resolvedTableNames     // Catch: java.lang.Throwable -> L1f
            int[] r11 = r13.$tableIds     // Catch: java.lang.Throwable -> L1f
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1f
            r13.L$0 = r1     // Catch: java.lang.Throwable -> L1f
            r13.label = r2     // Catch: java.lang.Throwable -> L1f
            r14.a(r6, r13)     // Catch: java.lang.Throwable -> L1f
            return r5
        L8c:
            j5f r0 = r13.this$0
            wk9 r0 = r0.h
            int[] r13 = r13.$tableIds
            r0.b(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4f.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((z4f) k((xn2) obj2, (xj5) obj)).r(wef.a);
        return bw2.a;
    }
}
