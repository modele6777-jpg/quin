package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aw extends gbe implements l26 {
    final /* synthetic */ ne2 $composeImm;
    final /* synthetic */ b89 $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(b89 b89Var, ne2 ne2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$it = b89Var;
        this.$composeImm = ne2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new aw(this.$it, this.$composeImm, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r7.b(r0, r6) == r4) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L13
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L13:
            defpackage.jzb.q(r7)
            goto L3f
        L17:
            defpackage.jzb.q(r7)
            goto L2d
        L1b:
            defpackage.jzb.q(r7)
            zv r7 = new zv
            r0 = 0
            r7.<init>(r0)
            r6.label = r3
            java.lang.Object r7 = defpackage.tm7.Q(r7, r6)
            if (r7 != r4) goto L2d
            goto L3e
        L2d:
            b89 r7 = r6.$it
            ts r0 = new ts
            ne2 r5 = r6.$composeImm
            r0.<init>(r3, r5)
            r6.label = r2
            java.lang.Object r6 = r7.b(r0, r6)
            if (r6 != r4) goto L3f
        L3e:
            return r4
        L3f:
            defpackage.oo3.f()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((aw) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
