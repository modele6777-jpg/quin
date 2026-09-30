package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lq2 extends gbe implements l26 {
    final /* synthetic */ o9 $accountProfileRepository;
    final /* synthetic */ Context $context;
    final /* synthetic */ gpf $userRequester;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq2(Context context, gpf gpfVar, o9 o9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$userRequester = gpfVar;
        this.$accountProfileRepository = o9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lq2 lq2Var = new lq2(this.$context, this.$userRequester, this.$accountProfileRepository, xn2Var);
        lq2Var.L$0 = obj;
        return lq2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r8.n(r0, r1, r3, r7) == r5) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r7.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            defpackage.jzb.q(r8)
            goto L45
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r4
        L1b:
            defpackage.jzb.q(r8)
            goto L2d
        L1f:
            defpackage.jzb.q(r8)
            r7.L$0 = r4
            r7.label = r3
            java.lang.Object r8 = defpackage.bsa.f(r0, r7)
            if (r8 != r5) goto L2d
            goto L44
        L2d:
            ta3 r8 = defpackage.ta3.a
            android.content.Context r0 = r7.$context
            gpf r1 = r7.$userRequester
            kq2 r3 = new kq2
            o9 r6 = r7.$accountProfileRepository
            r3.<init>(r6, r4)
            r7.L$0 = r4
            r7.label = r2
            java.lang.Object r7 = r8.n(r0, r1, r3, r7)
            if (r7 != r5) goto L45
        L44:
            return r5
        L45:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq2.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lq2) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
