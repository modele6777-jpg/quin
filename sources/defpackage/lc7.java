package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lc7 extends gbe implements l26 {
    int label;
    final /* synthetic */ oc7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc7(oc7 oc7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = oc7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lc7(this.this$0, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7.g(r6) == r4) goto L21;
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
            if (r0 != r2) goto L11
            defpackage.jzb.q(r7)
            goto L6c
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L17:
            defpackage.jzb.q(r7)
            goto L2e
        L1b:
            defpackage.jzb.q(r7)
            kc7 r7 = new kc7
            oc7 r0 = r6.this$0
            r7.<init>(r0, r1)
            r6.label = r3
            java.lang.Object r7 = defpackage.lw2.b(r7, r6)
            if (r7 != r4) goto L2e
            goto L6b
        L2e:
            ezb r7 = (defpackage.ezb) r7
            java.lang.Object r7 = r7.b()
            oc7 r0 = r6.this$0
            java.lang.Throwable r1 = defpackage.ezb.a(r7)
            if (r1 == 0) goto L50
            m8b r0 = r0.d()
            java.lang.String r5 = "Failed to load invitation info"
            r0.c(r5, r1)
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 2131887251(0x7f120493, float:1.9409104E38)
            r0.<init>(r1)
            defpackage.jcc.k(r3, r0)
        L50:
            oc7 r0 = r6.this$0
            boolean r1 = r7 instanceof defpackage.dzb
            if (r1 != 0) goto L5f
            tech.chatmind.api.InvitationInfo r7 = (tech.chatmind.api.InvitationInfo) r7
            int r1 = defpackage.oc7.v
            vz9 r0 = r0.f
            r0.setValue(r7)
        L5f:
            oc7 r7 = r6.this$0
            r6.label = r2
            int r0 = defpackage.oc7.v
            java.lang.Object r6 = r7.g(r6)
            if (r6 != r4) goto L6c
        L6b:
            return r4
        L6c:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc7.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lc7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
