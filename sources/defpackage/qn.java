package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qn extends gbe implements l26 {
    final /* synthetic */ wj4 $event;
    int label;
    final /* synthetic */ rn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(rn rnVar, wj4 wj4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rnVar;
        this.$event = wj4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qn(this.this$0, this.$event, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r4.G1(r9, r8) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r5.a(r3, r9, r8) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        return r6;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r1
        L12:
            defpackage.jzb.q(r9)
            goto L71
        L16:
            defpackage.jzb.q(r9)
            rn r9 = r8.this$0
            wj4 r0 = r8.$event
            long r4 = r0.a
            boolean r0 = r9.H1()
            if (r0 == 0) goto L2c
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L27:
            long r4 = defpackage.zsf.f(r4, r0)
            goto L2f
        L2c:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L27
        L2f:
            ks9 r9 = r9.F0
            ks9 r0 = defpackage.ks9.a
            if (r9 != r0) goto L3a
            float r9 = defpackage.zsf.c(r4)
            goto L3e
        L3a:
            float r9 = defpackage.zsf.b(r4)
        L3e:
            rn r4 = r8.this$0
            lu9 r5 = r4.Z0
            bw2 r6 = defpackage.bw2.a
            if (r5 != 0) goto L4f
            r8.label = r3
            java.lang.Object r8 = r4.G1(r9, r8)
            if (r8 != r6) goto L71
            goto L70
        L4f:
            ks9 r3 = r4.F0
            ks9 r4 = defpackage.ks9.b
            r7 = 0
            if (r3 != r4) goto L58
            r4 = r9
            goto L59
        L58:
            r4 = r7
        L59:
            if (r3 != r0) goto L5c
            goto L5d
        L5c:
            r9 = r7
        L5d:
            long r3 = defpackage.q7c.j(r4, r9)
            pn r9 = new pn
            rn r0 = r8.this$0
            r9.<init>(r0, r1)
            r8.label = r2
            java.lang.Object r8 = r5.a(r3, r9, r8)
            if (r8 != r6) goto L71
        L70:
            return r6
        L71:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qn) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
