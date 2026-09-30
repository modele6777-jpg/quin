package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mb1 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ nb1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb1(nb1 nb1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = nb1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mb1(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r9 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r5.s(r8) == r0) goto L28;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x003a, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:20:0x0061). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            bw2 r0 = defpackage.bw2.a
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            defpackage.jzb.q(r9)
            goto Lc2
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r2
        L18:
            java.lang.Object r1 = r8.L$1
            gc1 r1 = (defpackage.gc1) r1
            java.lang.Object r5 = r8.L$0
            java.util.Iterator r5 = (java.util.Iterator) r5
            defpackage.jzb.q(r9)
            goto L61
        L24:
            defpackage.jzb.q(r9)
            nb1 r9 = r8.this$0
            java.lang.Object r1 = r9.f
            monitor-enter(r1)
            java.util.LinkedHashSet r9 = r9.g     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r1)
            java.util.Iterator r9 = r9.iterator()
            r5 = r9
        L34:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L82
            java.lang.Object r9 = r5.next()
            r1 = r9
            gc1 r1 = (defpackage.gc1) r1
            java.lang.String r9 = "CXCP"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Camera2Backend#shutdownAsync: Awaiting closure from "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r9, r6)
            r8.L$0 = r5
            r8.L$1 = r1
            r8.label = r4
            java.lang.Object r9 = r1.a(r8)
            if (r9 != r0) goto L61
            goto Lc1
        L61:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L34
            java.lang.String r9 = "CXCP"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to await closure from "
            r6.<init>(r7)
            r6.append(r1)
            r1 = 33
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            io.sentry.android.core.b1.l(r9, r1)
            goto L34
        L82:
            java.lang.String r9 = "CXCP"
            java.lang.String r1 = "Camera2Backend#shutdownAsync: Closing all cameras (if any)"
            android.util.Log.d(r9, r1)
            nb1 r9 = r8.this$0
            z1b r9 = r9.d
            wef r1 = defpackage.wef.a
            xzb r4 = r9.a
            pj1 r4 = r4.a
            za2 r4 = r4.h
            r4.R(r1)
            jtb r4 = new jtb
            r4.<init>()
            za2 r5 = r4.a
            f2b r9 = r9.e
            r41 r9 = r9.e
            java.lang.Object r9 = r9.d(r4)
            boolean r9 = r9 instanceof defpackage.qw1
            if (r9 == 0) goto Lb5
            java.lang.String r9 = "CXCP"
            java.lang.String r4 = "Camera close all request failed!"
            io.sentry.android.core.b1.d(r9, r4)
            r5.R(r1)
        Lb5:
            r8.L$0 = r2
            r8.L$1 = r2
            r8.label = r3
            java.lang.Object r8 = r5.s(r8)
            if (r8 != r0) goto Lc2
        Lc1:
            return r0
        Lc2:
            wef r8 = defpackage.wef.a
            return r8
        Lc5:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mb1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
