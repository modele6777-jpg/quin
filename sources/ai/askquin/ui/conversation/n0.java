package ai.askquin.ui.conversation;

import defpackage.gbe;
import defpackage.l26;
import defpackage.oyb;
import defpackage.t12;
import defpackage.wef;
import defpackage.xn2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends gbe implements l26 {
    final /* synthetic */ t12 $projection;
    final /* synthetic */ String $requestMessageId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r0 r0Var, String str, t12 t12Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$requestMessageId = str;
        this.$projection = t12Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        n0 n0Var = new n0(this.this$0, this.$requestMessageId, this.$projection, xn2Var);
        n0Var.L$0 = obj;
        return n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r12.v0(r11) == r1) goto L54;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.conversation.n0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((n0) k((xn2) obj2, (oyb) obj)).r(wef.a);
    }
}
