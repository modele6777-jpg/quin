package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x0d extends gbe implements l26 {
    final /* synthetic */ AtomicReference<w0d> $arg0;
    final /* synthetic */ l26 $session;
    final /* synthetic */ a26 $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0d(a26 a26Var, AtomicReference atomicReference, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sessionInitializer = a26Var;
        this.$arg0 = atomicReference;
        this.$session = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        x0d x0dVar = new x0d(this.$sessionInitializer, this.$arg0, this.$session, xn2Var);
        x0dVar.L$0 = obj;
        return x0dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r8 == r4) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L26
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L18
            java.lang.Object r0 = r7.L$0
            w0d r0 = (defpackage.w0d) r0
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L16
        L14:
            r2 = r0
            goto L6e
        L16:
            r8 = move-exception
            goto L7e
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L1e:
            java.lang.Object r0 = r7.L$0
            w0d r0 = (defpackage.w0d) r0
            defpackage.jzb.q(r8)
            goto L5f
        L26:
            defpackage.jzb.q(r8)
            java.lang.Object r8 = r7.L$0
            aw2 r8 = (defpackage.aw2) r8
            w0d r0 = new w0d
            pv2 r5 = r8.getCoroutineContext()
            dg7 r5 = defpackage.tq.z(r5)
            a26 r6 = r7.$sessionInitializer
            java.lang.Object r8 = r6.d(r8)
            r0.<init>(r5, r8)
            java.util.concurrent.atomic.AtomicReference<w0d> r8 = r7.$arg0
            java.lang.Object r8 = r8.getAndSet(r0)
            w0d r8 = (defpackage.w0d) r8
            if (r8 == 0) goto L5f
            dg7 r8 = r8.a
            r7.L$0 = r0
            r7.label = r3
            r8.h(r1)
            java.lang.Object r8 = r8.U0(r7)
            if (r8 != r4) goto L5a
            goto L5c
        L5a:
            wef r8 = defpackage.wef.a
        L5c:
            if (r8 != r4) goto L5f
            goto L6d
        L5f:
            l26 r8 = r7.$session     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r0.b     // Catch: java.lang.Throwable -> L16
            r7.L$0 = r0     // Catch: java.lang.Throwable -> L16
            r7.label = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r8.z(r3, r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r4) goto L14
        L6d:
            return r4
        L6e:
            java.util.concurrent.atomic.AtomicReference<w0d> r3 = r7.$arg0
        L70:
            boolean r7 = r3.compareAndSet(r2, r1)
            if (r7 == 0) goto L77
            goto L7d
        L77:
            java.lang.Object r7 = r3.get()
            if (r7 == r2) goto L70
        L7d:
            return r8
        L7e:
            java.util.concurrent.atomic.AtomicReference<w0d> r7 = r7.$arg0
        L80:
            boolean r2 = r7.compareAndSet(r0, r1)
            if (r2 != 0) goto L8d
            java.lang.Object r2 = r7.get()
            if (r2 != r0) goto L8d
            goto L80
        L8d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0d.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((x0d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
