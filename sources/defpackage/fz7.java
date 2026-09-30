package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fz7 extends gbe implements l26 {
    final /* synthetic */ ze5 $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ kz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz7(kz7 kz7Var, ze5 ze5Var, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kz7Var;
        this.$spec = ze5Var;
        this.$totalDelta = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fz7(this.this$0, this.$spec, this.$totalDelta, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (defpackage.jx.b(r5, r6, r0, null, r9, r10, 4) == r4) goto L29;
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
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L21
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.jzb.q(r13)     // Catch: java.util.concurrent.CancellationException -> L9f
            r10 = r12
            goto L91
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r1
        L19:
            java.lang.Object r0 = r12.L$0
            ze5 r0 = (defpackage.ze5) r0
            defpackage.jzb.q(r13)     // Catch: java.util.concurrent.CancellationException -> L9f
            goto L59
        L21:
            defpackage.jzb.q(r13)
            kz7 r13 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            jx r13 = r13.p     // Catch: java.util.concurrent.CancellationException -> L9f
            boolean r13 = r13.f()     // Catch: java.util.concurrent.CancellationException -> L9f
            ze5 r0 = r12.$spec
            if (r13 == 0) goto L39
            boolean r13 = r0 instanceof defpackage.fxd     // Catch: java.util.concurrent.CancellationException -> L9f
            if (r13 == 0) goto L37
            fxd r0 = (defpackage.fxd) r0     // Catch: java.util.concurrent.CancellationException -> L9f
            goto L39
        L37:
            fxd r0 = defpackage.lz7.a     // Catch: java.util.concurrent.CancellationException -> L9f
        L39:
            kz7 r13 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            jx r13 = r13.p     // Catch: java.util.concurrent.CancellationException -> L9f
            boolean r13 = r13.f()     // Catch: java.util.concurrent.CancellationException -> L9f
            if (r13 != 0) goto L60
            kz7 r13 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            jx r13 = r13.p     // Catch: java.util.concurrent.CancellationException -> L9f
            long r5 = r12.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L9f
            w67 r7 = new w67     // Catch: java.util.concurrent.CancellationException -> L9f
            r7.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L9f
            r12.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L9f
            r12.label = r3     // Catch: java.util.concurrent.CancellationException -> L9f
            java.lang.Object r13 = r13.g(r12, r7)     // Catch: java.util.concurrent.CancellationException -> L9f
            if (r13 != r4) goto L59
            goto L90
        L59:
            kz7 r13 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            zv6 r13 = r13.c     // Catch: java.util.concurrent.CancellationException -> L9f
            r13.invoke()     // Catch: java.util.concurrent.CancellationException -> L9f
        L60:
            r7 = r0
            kz7 r13 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            jx r13 = r13.p     // Catch: java.util.concurrent.CancellationException -> L9f
            java.lang.Object r13 = r13.e()     // Catch: java.util.concurrent.CancellationException -> L9f
            w67 r13 = (defpackage.w67) r13     // Catch: java.util.concurrent.CancellationException -> L9f
            long r5 = r13.a     // Catch: java.util.concurrent.CancellationException -> L9f
            long r8 = r12.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L9f
            long r5 = defpackage.w67.c(r5, r8)     // Catch: java.util.concurrent.CancellationException -> L9f
            kz7 r13 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            r8 = r5
            jx r5 = r13.p     // Catch: java.util.concurrent.CancellationException -> L9f
            w67 r6 = new w67     // Catch: java.util.concurrent.CancellationException -> L9f
            r6.<init>(r8)     // Catch: java.util.concurrent.CancellationException -> L9f
            r10 = r8
            jf4 r9 = new jf4     // Catch: java.util.concurrent.CancellationException -> L9f
            r9.<init>(r13, r10, r3)     // Catch: java.util.concurrent.CancellationException -> L9f
            r12.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L9f
            r12.label = r2     // Catch: java.util.concurrent.CancellationException -> L9f
            r8 = 0
            r11 = 4
            r10 = r12
            java.lang.Object r12 = defpackage.jx.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L9f
            if (r12 != r4) goto L91
        L90:
            return r4
        L91:
            kz7 r12 = r10.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            vz9 r12 = r12.h     // Catch: java.util.concurrent.CancellationException -> L9f
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch: java.util.concurrent.CancellationException -> L9f
            r12.setValue(r13)     // Catch: java.util.concurrent.CancellationException -> L9f
            kz7 r12 = r10.this$0     // Catch: java.util.concurrent.CancellationException -> L9f
            r13 = 0
            r12.g = r13     // Catch: java.util.concurrent.CancellationException -> L9f
        L9f:
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz7.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fz7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
