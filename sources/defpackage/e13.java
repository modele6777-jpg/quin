package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e13 extends gbe implements l26 {
    final /* synthetic */ dg7 $oldJob;
    int label;
    final /* synthetic */ g13 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e13(dg7 dg7Var, g13 g13Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$oldJob = dg7Var;
        this.this$0 = g13Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new e13(this.$oldJob, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:8:0x0018, B:36:0x0079, B:30:0x0060, B:33:0x0069, B:14:0x0024, B:15:0x0028, B:16:0x0030, B:26:0x004d, B:28:0x005a), top: B:40:0x000e }] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r12 == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (defpackage.vfh.q(500, r11) == r10) goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0076 -> B:36:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 0
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            bw2 r10 = defpackage.bw2.a
            if (r0 == 0) goto L35
            if (r0 == r9) goto L31
            if (r0 == r8) goto L28
            if (r0 == r7) goto L24
            if (r0 != r6) goto L1e
            defpackage.jzb.q(r12)     // Catch: java.lang.Throwable -> L1c
            goto L79
        L1c:
            r12 = move-exception
            goto L81
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r1
        L24:
            defpackage.jzb.q(r12)     // Catch: java.lang.Throwable -> L1c
            goto L69
        L28:
            defpackage.jzb.q(r12)     // Catch: java.lang.Throwable -> L1c
            nt7 r12 = new nt7     // Catch: java.lang.Throwable -> L1c
            r12.<init>()     // Catch: java.lang.Throwable -> L1c
            throw r12     // Catch: java.lang.Throwable -> L1c
        L31:
            defpackage.jzb.q(r12)
            goto L4d
        L35:
            defpackage.jzb.q(r12)
            dg7 r12 = r11.$oldJob
            if (r12 == 0) goto L4d
            r11.label = r9
            r12.h(r1)
            java.lang.Object r12 = r12.U0(r11)
            if (r12 != r10) goto L48
            goto L4a
        L48:
            wef r12 = defpackage.wef.a
        L4a:
            if (r12 != r10) goto L4d
            goto L78
        L4d:
            g13 r12 = r11.this$0     // Catch: java.lang.Throwable -> L1c
            qz9 r12 = r12.c     // Catch: java.lang.Throwable -> L1c
            r12.k(r5)     // Catch: java.lang.Throwable -> L1c
            g13 r12 = r11.this$0     // Catch: java.lang.Throwable -> L1c
            boolean r12 = r12.a     // Catch: java.lang.Throwable -> L1c
            if (r12 != 0) goto L60
            r11.label = r8     // Catch: java.lang.Throwable -> L1c
            defpackage.vfh.o(r11)     // Catch: java.lang.Throwable -> L1c
            return r10
        L60:
            r11.label = r7     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r12 = defpackage.vfh.q(r3, r11)     // Catch: java.lang.Throwable -> L1c
            if (r12 != r10) goto L69
            goto L78
        L69:
            g13 r12 = r11.this$0     // Catch: java.lang.Throwable -> L1c
            qz9 r12 = r12.c     // Catch: java.lang.Throwable -> L1c
            r12.k(r2)     // Catch: java.lang.Throwable -> L1c
            r11.label = r6     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r12 = defpackage.vfh.q(r3, r11)     // Catch: java.lang.Throwable -> L1c
            if (r12 != r10) goto L79
        L78:
            return r10
        L79:
            g13 r12 = r11.this$0     // Catch: java.lang.Throwable -> L1c
            qz9 r12 = r12.c     // Catch: java.lang.Throwable -> L1c
            r12.k(r5)     // Catch: java.lang.Throwable -> L1c
            goto L60
        L81:
            g13 r11 = r11.this$0
            qz9 r11 = r11.c
            r11.k(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e13.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((e13) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
