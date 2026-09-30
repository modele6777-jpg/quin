package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mi1 extends gbe implements l26 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ float $degrees;
    final /* synthetic */ a26 $onSuccess;
    Object L$0;
    int label;
    final /* synthetic */ pi1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi1(pi1 pi1Var, Bitmap bitmap, float f, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pi1Var;
        this.$bitmap = bitmap;
        this.$degrees = f;
        this.$onSuccess = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mi1(this.this$0, this.$bitmap, this.$degrees, this.$onSuccess, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (r2.b(r8, r7) == r4) goto L15;
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
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L15
            java.lang.Object r7 = r7.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.jzb.q(r8)
            goto L79
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r3
        L1b:
            defpackage.jzb.q(r8)
            goto L36
        L1f:
            defpackage.jzb.q(r8)
            js3 r8 = defpackage.ga4.a
            li1 r0 = new li1
            android.graphics.Bitmap r5 = r7.$bitmap
            float r6 = r7.$degrees
            r0.<init>(r5, r6, r3)
            r7.label = r2
            java.lang.Object r8 = defpackage.ynb.p0(r8, r0, r7)
            if (r8 != r4) goto L36
            goto L78
        L36:
            java.lang.String r8 = (java.lang.String) r8
            pi1 r0 = r7.this$0
            gda r0 = r0.c
            r8.getClass()
            pi1 r2 = r7.this$0
            java.lang.Integer r2 = r2.b
            ida r0 = (defpackage.ida) r0
            r0.getClass()
            hda r5 = new hda
            r5.<init>(r8, r2, r0, r3)
            ybc r8 = new ybc
            r8.<init>(r5)
            js3 r0 = defpackage.ga4.a
            hr3 r0 = defpackage.hr3.c
            wj5 r8 = defpackage.ym8.x(r8, r0)
            ji1 r0 = new ji1
            pi1 r2 = r7.this$0
            r0.<init>(r2, r3)
            al5 r2 = new al5
            r2.<init>(r8, r0)
            ki1 r8 = new ki1
            a26 r0 = r7.$onSuccess
            r5 = 0
            r8.<init>(r0, r5)
            r7.L$0 = r3
            r7.label = r1
            java.lang.Object r7 = r2.b(r8, r7)
            if (r7 != r4) goto L79
        L78:
            return r4
        L79:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mi1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
