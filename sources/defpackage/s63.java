package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s63 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $date;
    final /* synthetic */ TarotSkinIdentify $preferredSkin;
    final /* synthetic */ lld $previousSkinState;
    Object L$0;
    int label;
    final /* synthetic */ y63 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s63(y63 y63Var, String str, TarotSkinIdentify tarotSkinIdentify, lld lldVar, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = y63Var;
        this.$date = str;
        this.$preferredSkin = tarotSkinIdentify;
        this.$previousSkinState = lldVar;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new s63(this.this$0, this.$date, this.$preferredSkin, this.$previousSkinState, this.$context, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r12 == r4) goto L26;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s63.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((s63) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
