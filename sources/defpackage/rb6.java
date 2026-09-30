package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rb6 extends gbe implements l26 {
    final /* synthetic */ yv1 $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb6(yv1 yv1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$channel = yv1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rb6(this.$channel, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x0035, B:19:0x003d, B:20:0x004b, B:26:0x0059, B:14:0x0028, B:28:0x005c, B:30:0x0061, B:31:0x0062, B:13:0x0023, B:21:0x004c, B:23:0x0052), top: B:45:0x0006, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {, blocks: (B:21:0x004c, B:23:0x0052), top: B:43:0x004c, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x0035, B:19:0x003d, B:20:0x004b, B:26:0x0059, B:14:0x0028, B:28:0x005c, B:30:0x0061, B:31:0x0062, B:13:0x0023, B:21:0x004c, B:23:0x0052), top: B:45:0x0006, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0032 -> B:17:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            bw2 r0 = defpackage.bw2.a
            int r1 = r7.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L18
            java.lang.Object r1 = r7.L$1
            k41 r1 = (defpackage.k41) r1
            java.lang.Object r4 = r7.L$0
            yv1 r4 = (defpackage.yv1) r4
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L16
            goto L35
        L16:
            r7 = move-exception
            goto L69
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r2
        L1e:
            defpackage.jzb.q(r8)
            yv1 r4 = r7.$channel
            k41 r8 = r4.iterator()     // Catch: java.lang.Throwable -> L16
            r1 = r8
        L28:
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L16
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L16
            r7.label = r3     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r1.b(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r0) goto L35
            return r0
        L35:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L63
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L16
            wef r8 = (defpackage.wef) r8     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicBoolean r8 = defpackage.sb6.b     // Catch: java.lang.Throwable -> L16
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = defpackage.qrd.c     // Catch: java.lang.Throwable -> L16
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L16
            qb6 r6 = defpackage.qrd.j     // Catch: java.lang.Throwable -> L60
            x79 r6 = r6.h     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L59
            boolean r6 = r6.d()     // Catch: java.lang.Throwable -> L60
            if (r6 != r3) goto L59
            r5 = r3
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L28
            defpackage.qrd.c()     // Catch: java.lang.Throwable -> L16
            goto L28
        L60:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r7     // Catch: java.lang.Throwable -> L16
        L63:
            r4.h(r2)
            wef r7 = defpackage.wef.a
            return r7
        L69:
            throw r7     // Catch: java.lang.Throwable -> L6a
        L6a:
            r8 = move-exception
            boolean r0 = r7 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L72
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L72:
            if (r2 != 0) goto L7e
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            r2.<init>(r0)
            r2.initCause(r7)
        L7e:
            r4.h(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb6.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rb6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
