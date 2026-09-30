package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z3e extends gbe implements n26 {
    final /* synthetic */ mmb $progress;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3e(mmb mmbVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.$progress = mmbVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        z3e z3eVar = new z3e(this.$progress, (xn2) obj3);
        z3eVar.L$0 = (xj5) obj;
        z3eVar.L$1 = (Throwable) obj2;
        return z3eVar.r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r0.a(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r0.a(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
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
            goto L53
        L1e:
            defpackage.jzb.q(r7)
            boolean r7 = r1 instanceof java.util.concurrent.CancellationException
            bw2 r2 = defpackage.bw2.a
            if (r7 == 0) goto L3d
            jyb r7 = new jyb
            mmb r1 = r6.$progress
            java.lang.Object r1 = r1.element
            r7.<init>(r1)
            r6.L$0 = r5
            r6.L$1 = r5
            r6.label = r4
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r2) goto L53
            goto L52
        L3d:
            kyb r7 = new kyb
            java.lang.Throwable r1 = defpackage.nzc.b(r1)
            r7.<init>(r1)
            r6.L$0 = r5
            r6.L$1 = r5
            r6.label = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r2) goto L53
        L52:
            return r2
        L53:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3e.r(java.lang.Object):java.lang.Object");
    }
}
