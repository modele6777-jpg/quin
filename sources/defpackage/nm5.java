package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nm5 extends gbe implements l26 {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ b89 $shared;
    final /* synthetic */ ned $started;
    final /* synthetic */ wj5 $upstream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm5(ned nedVar, wj5 wj5Var, b89 b89Var, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$started = nedVar;
        this.$upstream = wj5Var;
        this.$shared = b89Var;
        this.$initialValue = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nm5(this.$started, this.$upstream, this.$shared, this.$initialValue, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r8.b(r0, r7) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r8.b(r0, r7) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (defpackage.ok8.p(r8, r0, r7) == r6) goto L28;
     */
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
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            bw2 r6 = defpackage.bw2.a
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1e
            if (r0 == r5) goto L1a
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L14
            goto L1e
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L1a:
            defpackage.jzb.q(r8)
            goto L52
        L1e:
            defpackage.jzb.q(r8)
            goto L81
        L22:
            defpackage.jzb.q(r8)
            ned r8 = r7.$started
            pzd r0 = defpackage.med.a
            if (r8 != r0) goto L38
            wj5 r8 = r7.$upstream
            b89 r0 = r7.$shared
            r7.label = r4
            java.lang.Object r7 = r8.b(r0, r7)
            if (r7 != r6) goto L81
            goto L80
        L38:
            b89 r0 = r7.$shared
            uzd r4 = defpackage.med.b
            if (r8 != r4) goto L5f
            b5 r0 = (defpackage.b5) r0
            c7e r8 = r0.k()
            lm5 r0 = new lm5
            r0.<init>(r5, r1)
            r7.label = r5
            java.lang.Object r8 = defpackage.tm7.C(r8, r0, r7)
            if (r8 != r6) goto L52
            goto L80
        L52:
            wj5 r8 = r7.$upstream
            b89 r0 = r7.$shared
            r7.label = r3
            java.lang.Object r7 = r8.b(r0, r7)
            if (r7 != r6) goto L81
            goto L80
        L5f:
            b5 r0 = (defpackage.b5) r0
            c7e r0 = r0.k()
            wj5 r8 = r8.a(r0)
            wj5 r8 = defpackage.dj6.I(r8)
            mm5 r0 = new mm5
            wj5 r3 = r7.$upstream
            b89 r4 = r7.$shared
            java.lang.Object r5 = r7.$initialValue
            r0.<init>(r3, r4, r5, r1)
            r7.label = r2
            java.lang.Object r7 = defpackage.ok8.p(r8, r0, r7)
            if (r7 != r6) goto L81
        L80:
            return r6
        L81:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm5.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nm5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
