package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rz0 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $operationId;
    final /* synthetic */ Bitmap $this_share;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(xn2 xn2Var, Context context, Bitmap bitmap, String str) {
        super(2, xn2Var);
        this.$this_share = bitmap;
        this.$context = context;
        this.$operationId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rz0(xn2Var, this.$context, this.$this_share, this.$operationId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r8 == r4) goto L21;
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
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L19
            java.lang.Object r0 = r7.L$1
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r7 = r7.L$0
            java.io.File r7 = (java.io.File) r7
            defpackage.jzb.q(r8)     // Catch: java.io.IOException -> L6a
            goto L63
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r3
        L1f:
            defpackage.jzb.q(r8)
            goto L3e
        L23:
            defpackage.jzb.q(r8)
            android.graphics.Bitmap r8 = r7.$this_share
            android.content.Context r0 = r7.$context
            r7.label = r2
            js3 r2 = defpackage.ga4.a
            hr3 r2 = defpackage.hr3.c
            pz0 r5 = new pz0
            java.lang.String r6 = "shared"
            r5.<init>(r3, r0, r8, r6)
            java.lang.Object r8 = defpackage.ynb.p0(r2, r5, r7)
            if (r8 != r4) goto L3e
            goto L62
        L3e:
            java.io.File r8 = (java.io.File) r8
            if (r8 != 0) goto L45
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L45:
            android.net.Uri r8 = defpackage.xo1.B(r8)     // Catch: java.io.IOException -> L6a
            js3 r0 = defpackage.ga4.a     // Catch: java.io.IOException -> L6a
            wg6 r0 = defpackage.mk8.a     // Catch: java.io.IOException -> L6a
            qz0 r2 = new qz0     // Catch: java.io.IOException -> L6a
            android.content.Context r5 = r7.$context     // Catch: java.io.IOException -> L6a
            java.lang.String r6 = r7.$operationId     // Catch: java.io.IOException -> L6a
            r2.<init>(r5, r8, r6, r3)     // Catch: java.io.IOException -> L6a
            r7.L$0 = r3     // Catch: java.io.IOException -> L6a
            r7.L$1 = r3     // Catch: java.io.IOException -> L6a
            r7.label = r1     // Catch: java.io.IOException -> L6a
            java.lang.Object r8 = defpackage.ynb.p0(r0, r2, r7)     // Catch: java.io.IOException -> L6a
            if (r8 != r4) goto L63
        L62:
            return r4
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.io.IOException -> L6a
            boolean r7 = r8.booleanValue()     // Catch: java.io.IOException -> L6a
            goto L88
        L6a:
            r7 = move-exception
            ef8 r8 = defpackage.hf8.Q
            r8.getClass()
            java.lang.String r8 = "BitmapUtil"
            m8b r8 = defpackage.ef8.a(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Share Bitmap failed with: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.b(r7)
            r7 = 0
        L88:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rz0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
