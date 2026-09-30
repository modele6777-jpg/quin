package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ag8 extends czb implements l26 {
    final /* synthetic */ qne $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag8(qne qneVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$observer = qneVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ag8 ag8Var = new ag8(this.$observer, xn2Var);
        ag8Var.L$0 = obj;
        return ag8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r12 == r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r12 == r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:17:0x0054). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L18
            java.lang.Object r0 = r11.L$1
            oia r0 = (defpackage.oia) r0
            java.lang.Object r2 = r11.L$0
            mbe r2 = (defpackage.mbe) r2
            defpackage.jzb.q(r12)
            goto L54
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            r11 = 0
            return r11
        L1f:
            java.lang.Object r0 = r11.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r12)
            goto L3a
        L27:
            defpackage.jzb.q(r12)
            java.lang.Object r12 = r11.L$0
            r0 = r12
            mbe r0 = (defpackage.mbe) r0
            r11.L$0 = r0
            r11.label = r2
            java.lang.Object r12 = defpackage.ffe.b(r0, r11, r1)
            if (r12 != r3) goto L3a
            goto L53
        L3a:
            oia r12 = (defpackage.oia) r12
            qne r2 = r11.$observer
            long r4 = r12.c
            r2.d()
            r2 = r0
            r0 = r12
        L45:
            r11.L$0 = r2
            r11.L$1 = r0
            r11.label = r1
            iia r12 = defpackage.iia.b
            java.lang.Object r12 = r2.a(r12, r11)
            if (r12 != r3) goto L54
        L53:
            return r3
        L54:
            hia r12 = (defpackage.hia) r12
            java.util.List r12 = r12.a
            int r4 = r12.size()
            r5 = 0
        L5d:
            if (r5 >= r4) goto L77
            java.lang.Object r6 = r12.get(r5)
            oia r6 = (defpackage.oia) r6
            long r7 = r6.a
            long r9 = r0.a
            boolean r7 = defpackage.kn2.E(r7, r9)
            if (r7 == 0) goto L74
            boolean r6 = r6.d
            if (r6 == 0) goto L74
            goto L45
        L74:
            int r5 = r5 + 1
            goto L5d
        L77:
            qne r11 = r11.$observer
            r11.c()
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag8.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ag8) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
