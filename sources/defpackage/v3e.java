package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v3e extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        v3e v3eVar = new v3e(3, (xn2) obj3);
        v3eVar.L$0 = (xj5) obj;
        v3eVar.L$1 = (Throwable) obj2;
        return v3eVar.r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r0.a(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r0.a(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return r2;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            xj5 r0 = (defpackage.xj5) r0
            java.lang.Object r1 = r6.L$1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            int r2 = r6.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L14
            goto L1a
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r5
        L1a:
            defpackage.jzb.q(r7)
            goto L4f
        L1e:
            defpackage.jzb.q(r7)
            boolean r7 = r1 instanceof java.util.concurrent.CancellationException
            bw2 r2 = defpackage.bw2.a
            if (r7 == 0) goto L39
            jyb r7 = new jyb
            r7.<init>(r5)
            r6.L$0 = r5
            r6.L$1 = r5
            r6.label = r4
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r2) goto L4f
            goto L4e
        L39:
            kyb r7 = new kyb
            java.lang.Throwable r1 = defpackage.nzc.b(r1)
            r7.<init>(r1)
            r6.L$0 = r5
            r6.L$1 = r5
            r6.label = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r2) goto L4f
        L4e:
            return r2
        L4f:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3e.r(java.lang.Object):java.lang.Object");
    }
}
