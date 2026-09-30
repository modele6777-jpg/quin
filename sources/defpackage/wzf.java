package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wzf extends gbe implements l26 {
    final /* synthetic */ x16 $block;
    final /* synthetic */ List<String> $intentions;
    Object L$0;
    int label;
    final /* synthetic */ xzf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzf(xzf xzfVar, List list, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xzfVar;
        this.$intentions = list;
        this.$block = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wzf(this.this$0, this.$intentions, this.$block, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.Object] */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            wef r1 = defpackage.wef.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            java.lang.Object r0 = r8.L$0
            owa r0 = (defpackage.owa) r0
            defpackage.jzb.q(r9)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            goto L73
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r4
        L1b:
            java.lang.Object r0 = r8.L$0
            owa r0 = (defpackage.owa) r0
            defpackage.jzb.q(r9)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            goto L7f
        L23:
            defpackage.jzb.q(r9)
            owa r0 = new owa
            r0.<init>()
            ca2 r9 = defpackage.ca2.a     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r9.getClass()     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            boolean r9 = defpackage.ca2.c     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            bw2 r5 = defpackage.bw2.a
            if (r9 == 0) goto L5b
            xzf r9 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            t7 r9 = r9.c     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            mo3 r9 = (defpackage.mo3) r9     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            boolean r9 = r9.b()     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            if (r9 != 0) goto L5b
            java.util.List<java.lang.String> r9 = r8.$intentions     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r8.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            b8a r2 = new b8a     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r2.<init>(r9, r4)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            ypa r9 = defpackage.ypa.a     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            e8a r3 = new e8a     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r3.<init>(r2, r4)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            java.lang.Object r9 = r9.a(r3, r8)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            if (r9 != r5) goto L7f
            goto L72
        L5b:
            js3 r9 = defpackage.ga4.a     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            hr3 r9 = defpackage.hr3.c     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            vzf r3 = new vzf     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            xzf r6 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            java.util.List<java.lang.String> r7 = r8.$intentions     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r3.<init>(r6, r7, r0, r4)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r8.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r8.label = r2     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            java.lang.Object r9 = defpackage.ynb.p0(r9, r3, r8)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            if (r9 != r5) goto L73
        L72:
            return r5
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            if (r9 != 0) goto L7f
            defpackage.jcc.l(r0)     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            return r1
        L7f:
            x16 r8 = r8.$block     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            r8.invoke()     // Catch: java.util.concurrent.CancellationException -> L85 java.lang.Exception -> L87
            return r1
        L85:
            r8 = move-exception
            goto L8b
        L87:
            defpackage.jcc.l(r0)
            return r1
        L8b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wzf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
