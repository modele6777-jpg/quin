package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lf4 extends gbe implements l26 {
    final /* synthetic */ String $otherReason;
    final /* synthetic */ int $star;
    final /* synthetic */ List<String> $tags;
    long J$0;
    boolean Z$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf4(r0 r0Var, int i, List list, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$star = i;
        this.$tags = list;
        this.$otherReason = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lf4(this.this$0, this.$star, this.$tags, this.$otherReason, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (defpackage.lw2.b(r2, r19) == r6) goto L25;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lf4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
