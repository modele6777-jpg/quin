package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c2f extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d2f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2f(d2f d2fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = d2fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        c2f c2fVar = new c2f(this.this$0, xn2Var);
        c2fVar.L$0 = obj;
        return c2fVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0011, B:17:0x0035, B:20:0x0041, B:24:0x0057, B:14:0x002a), top: B:32:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0068 -> B:17:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L18
            java.lang.Object r0 = r8.L$0
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L16
            r9 = r0
            goto L35
        L16:
            r9 = move-exception
            goto L6f
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r3
        L1e:
            java.lang.Object r0 = r8.L$2
            gic r0 = (defpackage.gic) r0
            java.lang.Object r5 = r8.L$1
            d2f r5 = (defpackage.d2f) r5
            java.lang.Object r6 = r8.L$0
            aw2 r6 = (defpackage.aw2) r6
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L16
            goto L57
        L2e:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            aw2 r9 = (defpackage.aw2) r9
        L35:
            pv2 r0 = r9.getCoroutineContext()     // Catch: java.lang.Throwable -> L16
            boolean r0 = defpackage.tq.F(r0)     // Catch: java.lang.Throwable -> L16
            d2f r5 = r8.this$0
            if (r0 == 0) goto L6a
            gic r0 = r5.a     // Catch: java.lang.Throwable -> L16
            r41 r6 = r5.f     // Catch: java.lang.Throwable -> L16
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L16
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L16
            r8.L$2 = r0     // Catch: java.lang.Throwable -> L16
            r8.label = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r6 = r6.m(r8)     // Catch: java.lang.Throwable -> L16
            if (r6 != r4) goto L54
            goto L67
        L54:
            r7 = r6
            r6 = r9
            r9 = r7
        L57:
            z1f r9 = (defpackage.z1f) r9     // Catch: java.lang.Throwable -> L16
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L16
            r8.L$1 = r3     // Catch: java.lang.Throwable -> L16
            r8.L$2 = r3     // Catch: java.lang.Throwable -> L16
            r8.label = r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r9 = r5.c(r0, r9, r8)     // Catch: java.lang.Throwable -> L16
            if (r9 != r4) goto L68
        L67:
            return r4
        L68:
            r9 = r6
            goto L35
        L6a:
            r5.g = r3
            wef r8 = defpackage.wef.a
            return r8
        L6f:
            d2f r8 = r8.this$0
            r8.g = r3
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2f.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c2f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
