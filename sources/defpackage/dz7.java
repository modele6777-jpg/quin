package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dz7 extends gbe implements l26 {
    final /* synthetic */ ke6 $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ ze5 $spec;
    int label;
    final /* synthetic */ kz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz7(boolean z, kz7 kz7Var, ze5 ze5Var, ke6 ke6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shouldResetValue = z;
        this.this$0 = kz7Var;
        this.$spec = ze5Var;
        this.$layer = ke6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dz7(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r12 == r3) goto L26;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L15
            defpackage.jzb.q(r12)     // Catch: java.lang.Throwable -> L11
            r9 = r11
            goto L5d
        L11:
            r0 = move-exception
            r12 = r0
            r9 = r11
            goto L75
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            r11 = 0
            return r11
        L1c:
            defpackage.jzb.q(r12)     // Catch: java.lang.Throwable -> L11
            goto L3a
        L20:
            defpackage.jzb.q(r12)
            boolean r12 = r11.$shouldResetValue     // Catch: java.lang.Throwable -> L6e
            if (r12 == 0) goto L3a
            kz7 r12 = r11.this$0     // Catch: java.lang.Throwable -> L11
            jx r12 = r12.q     // Catch: java.lang.Throwable -> L11
            java.lang.Float r0 = new java.lang.Float     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r11.label = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r12 = r12.g(r11, r0)     // Catch: java.lang.Throwable -> L11
            if (r12 != r3) goto L3a
            goto L5c
        L3a:
            kz7 r12 = r11.this$0     // Catch: java.lang.Throwable -> L6e
            jx r4 = r12.q     // Catch: java.lang.Throwable -> L6e
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L71
            r12 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12)     // Catch: java.lang.Throwable -> L71
            ze5 r6 = r11.$spec     // Catch: java.lang.Throwable -> L6e
            ke6 r12 = r11.$layer     // Catch: java.lang.Throwable -> L6e
            kz7 r0 = r11.this$0     // Catch: java.lang.Throwable -> L6e
            cz7 r8 = new cz7     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r8.<init>(r12, r0, r2)     // Catch: java.lang.Throwable -> L6e
            r11.label = r1     // Catch: java.lang.Throwable -> L6e
            r7 = 0
            r10 = 4
            r9 = r11
            java.lang.Object r12 = defpackage.jx.b(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6b
            if (r12 != r3) goto L5d
        L5c:
            return r3
        L5d:
            tz r12 = (defpackage.tz) r12     // Catch: java.lang.Throwable -> L6b
            kz7 r11 = r9.this$0
            vz9 r11 = r11.i
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r11.setValue(r12)
            wef r11 = defpackage.wef.a
            return r11
        L6b:
            r0 = move-exception
        L6c:
            r12 = r0
            goto L75
        L6e:
            r0 = move-exception
            r9 = r11
            goto L6c
        L71:
            r0 = move-exception
            r9 = r11
            r11 = r0
            r12 = r11
        L75:
            kz7 r11 = r9.this$0
            vz9 r11 = r11.i
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.setValue(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz7.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dz7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
