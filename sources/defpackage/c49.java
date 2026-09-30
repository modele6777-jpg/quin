package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c49 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d49 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c49(d49 d49Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = d49Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        c49 c49Var = new c49(this.this$0, xn2Var);
        c49Var.L$0 = obj;
        return c49Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r5.d(r6, r7, r8, r9, r10) == r4) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0074 -> B:42:0x0031). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L22
            if (r0 != r2) goto L1c
            java.lang.Object r0 = r12.L$0
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r13)     // Catch: java.lang.Throwable -> L17
            r10 = r12
        L15:
            r13 = r0
            goto L74
        L17:
            r0 = move-exception
            r13 = r0
            r10 = r12
            goto L81
        L1c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r1
        L22:
            java.lang.Object r0 = r12.L$0
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r13)     // Catch: java.lang.Throwable -> L17
            goto L4d
        L2a:
            defpackage.jzb.q(r13)
            java.lang.Object r13 = r12.L$0
            aw2 r13 = (defpackage.aw2) r13
        L31:
            pv2 r0 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L79
            boolean r0 = defpackage.tq.F(r0)     // Catch: java.lang.Throwable -> L79
            d49 r5 = r12.this$0
            if (r0 == 0) goto L7c
            r41 r0 = r5.g     // Catch: java.lang.Throwable -> L79
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L79
            r12.label = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.m(r12)     // Catch: java.lang.Throwable -> L79
            if (r0 != r4) goto L4a
            goto L73
        L4a:
            r11 = r0
            r0 = r13
            r13 = r11
        L4d:
            r7 = r13
            x39 r7 = (defpackage.x39) r7     // Catch: java.lang.Throwable -> L79
            d49 r13 = r12.this$0     // Catch: java.lang.Throwable -> L79
            sw3 r13 = r13.c     // Catch: java.lang.Throwable -> L79
            r5 = 1086324736(0x40c00000, float:6.0)
            float r8 = r13.p0(r5)     // Catch: java.lang.Throwable -> L79
            d49 r13 = r12.this$0     // Catch: java.lang.Throwable -> L79
            sw3 r13 = r13.c     // Catch: java.lang.Throwable -> L79
            r5 = 1065353216(0x3f800000, float:1.0)
            float r9 = r13.p0(r5)     // Catch: java.lang.Throwable -> L79
            d49 r5 = r12.this$0     // Catch: java.lang.Throwable -> L79
            gic r6 = r5.a     // Catch: java.lang.Throwable -> L79
            r12.L$0 = r0     // Catch: java.lang.Throwable -> L79
            r12.label = r2     // Catch: java.lang.Throwable -> L79
            r10 = r12
            java.lang.Object r12 = r5.d(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L76
            if (r12 != r4) goto L15
        L73:
            return r4
        L74:
            r12 = r10
            goto L31
        L76:
            r0 = move-exception
        L77:
            r13 = r0
            goto L81
        L79:
            r0 = move-exception
            r10 = r12
            goto L77
        L7c:
            r5.h = r1
            wef r12 = defpackage.wef.a
            return r12
        L81:
            d49 r12 = r10.this$0
            r12.h = r1
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c49.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c49) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
