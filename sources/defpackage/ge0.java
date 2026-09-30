package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ge0 extends gbe implements l26 {
    final /* synthetic */ String $assetId;
    final /* synthetic */ File $cacheFile;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ je0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge0(je0 je0Var, xn2 xn2Var, File file, String str, String str2) {
        super(2, xn2Var);
        this.$cacheFile = file;
        this.this$0 = je0Var;
        this.$chatId = str;
        this.$assetId = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ge0(this.this$0, xn2Var, this.$cacheFile, this.$chatId, this.$assetId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r14 == r6) goto L37;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ge0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
