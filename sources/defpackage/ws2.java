package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ws2 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfo;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws2(t7 t7Var, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountInfo = t7Var;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ws2(this.$accountInfo, this.$context, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r0.b("paywall_pending", r5) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r0.b("awaiting_registration", r5) == r4) goto L18;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 == r3) goto L15
            if (r0 != r1) goto Lf
            defpackage.jzb.q(r6)
            goto L5e
        Lf:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r2
        L15:
            defpackage.jzb.q(r6)
            goto L35
        L19:
            defpackage.jzb.q(r6)
            t7 r6 = r5.$accountInfo
            mo3 r6 = (defpackage.mo3) r6
            boolean r6 = r6.b()
            rp9 r0 = defpackage.rp9.a
            bw2 r4 = defpackage.bw2.a
            if (r6 == 0) goto L53
            r5.label = r3
            java.lang.String r6 = "paywall_pending"
            java.lang.Object r6 = r0.b(r6, r5)
            if (r6 != r4) goto L35
            goto L5d
        L35:
            android.content.Context r5 = r5.$context
            hs3 r6 = defpackage.xqa.c
            isa r0 = r6.a
            java.lang.Object r6 = r6.b
            vs2 r1 = new vs2
            r1.<init>(r0, r6, r2)
            nu4 r6 = defpackage.nu4.a
            java.lang.Object r6 = defpackage.z5c.I(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            defpackage.ap9.b(r5, r6, r0)
            goto L7a
        L53:
            r5.label = r1
            java.lang.String r6 = "awaiting_registration"
            java.lang.Object r6 = r0.b(r6, r5)
            if (r6 != r4) goto L5e
        L5d:
            return r4
        L5e:
            android.content.Context r5 = r5.$context
            r5.getClass()
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<ai.askquin.ui.onboard.OnboardingActivity> r0 = ai.askquin.ui.onboard.OnboardingActivity.class
            r6.<init>(r5, r0)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r6.setFlags(r0)
            java.lang.String r0 = "KEY_START_DESTINATION"
            java.lang.String r1 = "post_first_reading_auth"
            r6.putExtra(r0, r1)
            r5.startActivity(r6)
        L7a:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws2.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ws2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
