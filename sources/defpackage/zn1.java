package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zn1 extends gbe implements l26 {
    final /* synthetic */ List<nu3> $deferredResults;
    int label;
    final /* synthetic */ ao1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn1(List list, ao1 ao1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$deferredResults = list;
        this.this$0 = ao1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zn1(this.$deferredResults, this.this$0, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8.U0(r7) == r6) goto L23;
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
            r1 = 6
            r2 = 2
            r3 = 1
            java.lang.String r4 = "CXCP"
            r5 = 3
            bw2 r6 = defpackage.bw2.a
            if (r0 == 0) goto L25
            if (r0 == r3) goto L21
            if (r0 == r2) goto L1d
            if (r0 != r5) goto L16
            defpackage.jzb.q(r8)
            goto L61
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L1d:
            defpackage.jzb.q(r8)
            goto L50
        L21:
            defpackage.jzb.q(r8)
            goto L33
        L25:
            defpackage.jzb.q(r8)
            java.util.List<nu3> r8 = r7.$deferredResults
            r7.label = r3
            java.lang.Object r8 = defpackage.pa7.X(r8, r7)
            if (r8 != r6) goto L33
            goto L60
        L33:
            boolean r8 = defpackage.b21.F(r5, r4)
            if (r8 == 0) goto L3e
            java.lang.String r8 = "Re-enable Torch to correct the Torch state"
            android.util.Log.d(r4, r8)
        L3e:
            ao1 r8 = r7.this$0
            s0f r8 = r8.c
            r0 = 0
            za2 r8 = defpackage.s0f.d(r8, r0, r1)
            r7.label = r2
            java.lang.Object r8 = r8.U0(r7)
            if (r8 != r6) goto L50
            goto L60
        L50:
            ao1 r8 = r7.this$0
            s0f r8 = r8.c
            za2 r8 = defpackage.s0f.d(r8, r2, r1)
            r7.label = r5
            java.lang.Object r7 = r8.U0(r7)
            if (r7 != r6) goto L61
        L60:
            return r6
        L61:
            boolean r7 = defpackage.b21.F(r5, r4)
            if (r7 == 0) goto L6c
            java.lang.String r7 = "Re-enable Torch to correct the Torch state, done"
            android.util.Log.d(r4, r7)
        L6c:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zn1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
