package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a75 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ k75 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a75(k75 k75Var, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k75Var;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a75(this.this$0, this.$skin, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (defpackage.lw2.b(r6, r5) == r4) goto L15;
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
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r6)
            goto L47
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L17:
            defpackage.jzb.q(r6)
            goto L35
        L1b:
            defpackage.jzb.q(r6)
            k75 r6 = r5.this$0
            gd8 r6 = r6.c
            ai.askquin.model.TarotSkinIdentify r0 = r5.$skin
            n2f r0 = r0.getKey()
            java.lang.String r0 = r0.name()
            r5.label = r3
            java.lang.Object r6 = r6.m(r0, r5)
            if (r6 != r4) goto L35
            goto L46
        L35:
            z65 r6 = new z65
            k75 r0 = r5.this$0
            ai.askquin.model.TarotSkinIdentify r3 = r5.$skin
            r6.<init>(r0, r3, r1)
            r5.label = r2
            java.lang.Object r5 = defpackage.lw2.b(r6, r5)
            if (r5 != r4) goto L47
        L46:
            return r4
        L47:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a75.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a75) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
