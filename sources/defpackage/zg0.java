package defpackage;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends gbe implements l26 {
    final /* synthetic */ wg0 $input;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AsyncImagePainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(AsyncImagePainter asyncImagePainter, wg0 wg0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = asyncImagePainter;
        this.$input = wg0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zg0(this.this$0, this.$input, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r7 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r7 == r5) goto L18;
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
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1b
            java.lang.Object r0 = r6.L$2
            coil3.compose.AsyncImagePainter r0 = (coil3.compose.AsyncImagePainter) r0
            java.lang.Object r1 = r6.L$1
            sw6 r1 = (defpackage.sw6) r1
            java.lang.Object r1 = r6.L$0
            ch0 r1 = (defpackage.ch0) r1
            defpackage.jzb.q(r7)
            goto L72
        L1b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r3
        L21:
            java.lang.Object r0 = r6.L$1
            sw6 r0 = (defpackage.sw6) r0
            java.lang.Object r0 = r6.L$0
            ch0 r0 = (defpackage.ch0) r0
            defpackage.jzb.q(r7)
            goto L51
        L2d:
            defpackage.jzb.q(r7)
            coil3.compose.AsyncImagePainter r7 = r6.this$0
            ch0 r0 = r7.F0
            wg0 r4 = r6.$input
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L54
            sw6 r1 = r4.b
            sw6 r7 = r7.n(r1, r2)
            wg0 r1 = r6.$input
            aw6 r1 = r1.a
            r6.L$0 = r3
            r6.L$1 = r3
            r6.label = r2
            java.lang.Object r7 = r0.a(r1, r7, r6)
            if (r7 != r5) goto L51
            goto L71
        L51:
            yg0 r7 = (defpackage.yg0) r7
            goto Laa
        L54:
            sw6 r0 = r4.b
            r2 = 0
            sw6 r7 = r7.n(r0, r2)
            coil3.compose.AsyncImagePainter r0 = r6.this$0
            wg0 r2 = r6.$input
            aw6 r2 = r2.a
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r0
            r6.label = r1
            mib r2 = (defpackage.mib) r2
            java.lang.Object r7 = r2.b(r7, r6)
            if (r7 != r5) goto L72
        L71:
            return r5
        L72:
            zw6 r7 = (defpackage.zw6) r7
            r0.getClass()
            boolean r1 = r7 instanceof defpackage.k8e
            if (r1 == 0) goto L90
            coil3.compose.AsyncImagePainter$State$Success r1 = new coil3.compose.AsyncImagePainter$State$Success
            k8e r7 = (defpackage.k8e) r7
            bv6 r2 = r7.a
            sw6 r3 = r7.b
            android.content.Context r3 = r3.a
            int r0 = r0.E0
            fy9 r0 = defpackage.cgg.p(r2, r3, r0)
            r1.<init>(r0, r7)
        L8e:
            r7 = r1
            goto Laa
        L90:
            boolean r1 = r7 instanceof defpackage.ly4
            if (r1 == 0) goto Lb2
            coil3.compose.AsyncImagePainter$State$Error r1 = new coil3.compose.AsyncImagePainter$State$Error
            ly4 r7 = (defpackage.ly4) r7
            bv6 r2 = r7.a
            if (r2 == 0) goto La6
            sw6 r3 = r7.b
            android.content.Context r3 = r3.a
            int r0 = r0.E0
            fy9 r3 = defpackage.cgg.p(r2, r3, r0)
        La6:
            r1.<init>(r3, r7)
            goto L8e
        Laa:
            coil3.compose.AsyncImagePainter r6 = r6.this$0
            r6.o(r7)
            wef r6 = defpackage.wef.a
            return r6
        Lb2:
            defpackage.ap.c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zg0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
