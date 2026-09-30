package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q63 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    final /* synthetic */ d63 $success;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ y63 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q63(xn2 xn2Var, d63 d63Var, y63 y63Var, TarotSkinIdentify tarotSkinIdentify) {
        super(2, xn2Var);
        this.this$0 = y63Var;
        this.$skin = tarotSkinIdentify;
        this.$success = d63Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        q63 q63Var = new q63(xn2Var, this.$success, this.this$0, this.$skin);
        q63Var.L$0 = obj;
        return q63Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        if (defpackage.ynb.p0(r15, r0, r14) == r5) goto L74;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((q63) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
