package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jqb extends gbe implements l26 {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ l26 $onFailure;
    final /* synthetic */ l26 $onSuccess;
    int label;
    final /* synthetic */ kqb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqb(kqb kqbVar, Map map, l26 l26Var, l26 l26Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kqbVar;
        this.$headerOptions = map;
        this.$onSuccess = l26Var;
        this.$onFailure = l26Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jqb(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r8.z(r0, r7) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (r0.z(r2, r7) == r4) goto L36;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqb.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jqb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
