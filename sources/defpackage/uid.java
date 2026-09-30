package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uid extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ vid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uid(vid vidVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = vidVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new uid(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a A[PHI: r0 r6
  0x004a: PHI (r0v1 l26) = (r0v2 l26), (r0v4 l26) binds: [B:13:0x0047, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x0047, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r0.z(r6, r5) == r4) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:18:0x0055). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r6)
            goto L55
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L17:
            java.lang.Object r0 = r5.L$0
            l26 r0 = (defpackage.l26) r0
            defpackage.jzb.q(r6)
            goto L4a
        L1f:
            defpackage.jzb.q(r6)
            vid r6 = r5.this$0
            uh0 r6 = r6.d
            java.util.concurrent.atomic.AtomicInteger r6 = r6.a
            int r6 = r6.get()
            if (r6 <= 0) goto L64
        L2e:
            vid r6 = r5.this$0
            aw2 r6 = r6.a
            pv2 r6 = r6.getCoroutineContext()
            defpackage.tq.v(r6)
            vid r6 = r5.this$0
            ld3 r0 = r6.b
            r41 r6 = r6.c
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r6 = r6.m(r5)
            if (r6 != r4) goto L4a
            goto L54
        L4a:
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = r0.z(r6, r5)
            if (r6 != r4) goto L55
        L54:
            return r4
        L55:
            vid r6 = r5.this$0
            uh0 r6 = r6.d
            java.util.concurrent.atomic.AtomicInteger r6 = r6.a
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L2e
            wef r5 = defpackage.wef.a
            return r5
        L64:
            java.lang.String r5 = "Check failed."
            defpackage.qc0.p(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uid.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((uid) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
