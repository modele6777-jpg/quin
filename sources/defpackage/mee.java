package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mee extends czb implements l26 {
    final /* synthetic */ aw2 $$this$coroutineScope;
    final /* synthetic */ n26 $onPress;
    final /* synthetic */ a26 $onTap;
    final /* synthetic */ nta $pressScope;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mee(aw2 aw2Var, n26 n26Var, a26 a26Var, nta ntaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$coroutineScope = aw2Var;
        this.$onPress = n26Var;
        this.$onTap = a26Var;
        this.$pressScope = ntaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mee meeVar = new mee(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, xn2Var);
        meeVar.L$0 = obj;
        return meeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r11 == r4) goto L19;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L15
            java.lang.Object r0 = r10.L$0
            dg7 r0 = (defpackage.dg7) r0
            defpackage.jzb.q(r11)
            goto L74
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r10)
            return r3
        L1b:
            java.lang.Object r0 = r10.L$1
            dg7 r0 = (defpackage.dg7) r0
            java.lang.Object r2 = r10.L$0
            mbe r2 = (defpackage.mbe) r2
            defpackage.jzb.q(r11)
            goto L4e
        L27:
            defpackage.jzb.q(r11)
            java.lang.Object r11 = r10.L$0
            mbe r11 = (defpackage.mbe) r11
            aw2 r0 = r10.$$this$coroutineScope
            lee r5 = new lee
            nta r6 = r10.$pressScope
            r5.<init>(r6, r3)
            dw2 r6 = defpackage.dw2.d
            lyd r0 = defpackage.ynb.V(r0, r3, r6, r5, r2)
            r10.L$0 = r11
            r10.L$1 = r0
            r10.label = r2
            r2 = 3
            java.lang.Object r2 = defpackage.ffe.b(r11, r10, r2)
            if (r2 != r4) goto L4b
            goto L73
        L4b:
            r9 = r2
            r2 = r11
            r11 = r9
        L4e:
            oia r11 = (defpackage.oia) r11
            r11.a()
            n26 r5 = r10.$onPress
            dee r6 = defpackage.ffe.a
            if (r5 == r6) goto L65
            aw2 r6 = r10.$$this$coroutineScope
            iee r7 = new iee
            nta r8 = r10.$pressScope
            r7.<init>(r5, r8, r11, r3)
            defpackage.ffe.g(r6, r0, r7)
        L65:
            r10.L$0 = r0
            r10.L$1 = r3
            r10.label = r1
            iia r11 = defpackage.iia.b
            java.lang.Object r11 = defpackage.ffe.j(r2, r11, r10)
            if (r11 != r4) goto L74
        L73:
            return r4
        L74:
            oia r11 = (defpackage.oia) r11
            if (r11 != 0) goto L85
            aw2 r11 = r10.$$this$coroutineScope
            jee r1 = new jee
            nta r10 = r10.$pressScope
            r1.<init>(r10, r3)
            defpackage.ffe.g(r11, r0, r1)
            goto La2
        L85:
            r11.a()
            aw2 r1 = r10.$$this$coroutineScope
            kee r2 = new kee
            nta r4 = r10.$pressScope
            r2.<init>(r4, r3)
            defpackage.ffe.g(r1, r0, r2)
            a26 r10 = r10.$onTap
            if (r10 == 0) goto La2
            long r0 = r11.c
            hl9 r11 = new hl9
            r11.<init>(r0)
            r10.d(r11)
        La2:
            wef r10 = defpackage.wef.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mee.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mee) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
