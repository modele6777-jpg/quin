package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jc7 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ gbd $shareType;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ oc7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc7(oc7 oc7Var, gbd gbdVar, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = oc7Var;
        this.$shareType = gbdVar;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jc7(this.this$0, this.$shareType, this.$context, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r0.h(r2, r5, r12, r11) == r4) goto L25;
     */
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
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L28
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r11.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r11 = r11.L$0
            java.lang.String r11 = (java.lang.String) r11
            defpackage.jzb.q(r12)
            goto L9e
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r3
        L24:
            defpackage.jzb.q(r12)
            goto L4f
        L28:
            defpackage.jzb.q(r12)
            x1f r12 = defpackage.x1f.a
            r05 r12 = new r05
            java.lang.String r0 = "generate_invitation_link"
            r12.<init>(r0)
            gbd r0 = r11.$shareType
            za6 r5 = new za6
            r6 = 14
            r5.<init>(r6, r0)
            m1f r0 = defpackage.m1f.b
            defpackage.x1f.g(r12, r0, r5)
            oc7 r12 = r11.this$0
            r11.label = r2
            int r0 = defpackage.oc7.v
            java.lang.Object r12 = r12.g(r11)
            if (r12 != r4) goto L4f
            goto L9d
        L4f:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L9e
            oc7 r0 = r11.this$0
            android.content.Context r2 = r11.$context
            gbd r5 = r11.$shareType
            ca2 r6 = defpackage.ca2.a
            r6.getClass()
            boolean r6 = defpackage.ca2.c
            if (r6 == 0) goto L65
            java.lang.String r7 = "global"
            goto L67
        L65:
            java.lang.String r7 = "cn"
        L67:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "&ap=android&av=5.23.0"
            if (r6 == 0) goto L78
            java.lang.String r6 = defpackage.vd8.d()
            java.lang.String r10 = "https://quin.love/invite-code?lang="
            java.lang.String r6 = defpackage.ib8.j(r10, r6, r9)
            goto L82
        L78:
            java.lang.String r6 = defpackage.vd8.d()
            java.lang.String r10 = "https://quin.love/cn/invite-code?lang="
            java.lang.String r6 = defpackage.ib8.j(r10, r6, r9)
        L82:
            r8.<init>(r6)
            java.lang.String r6 = "?aid=2405&region="
            java.lang.String r9 = "&code="
            java.lang.String r12 = defpackage.ks0.m(r8, r6, r7, r9, r12)
            r11.L$0 = r3
            r11.L$1 = r3
            r11.L$2 = r3
            r11.label = r1
            int r1 = defpackage.oc7.v
            java.lang.Object r11 = r0.h(r2, r5, r12, r11)
            if (r11 != r4) goto L9e
        L9d:
            return r4
        L9e:
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc7.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jc7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
