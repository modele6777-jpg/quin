package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class upb extends gbe implements l26 {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ n26 $onRetry;
    final /* synthetic */ e89 $result$delegate;
    final /* synthetic */ ji8 $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upb(n26 n26Var, Context context, ji8 ji8Var, String str, String str2, String str3, String str4, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onRetry = n26Var;
        this.$context = context;
        this.$spec = ji8Var;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new upb(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d A[PHI: r0 r3 r13
  0x006d: PHI (r0v4 int) = (r0v15 int), (r0v16 int) binds: [B:22:0x006b, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x006d: PHI (r3v3 java.lang.Throwable) = (r3v5 java.lang.Throwable), (r3v6 java.lang.Throwable) binds: [B:22:0x006b, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x006d: PHI (r13v14 'this' upb) = (r13v17 'this' upb), (r13v18 'this' upb) binds: [B:22:0x006b, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d A[Catch: all -> 0x00ec, TryCatch #4 {all -> 0x00ec, blocks: (B:26:0x0084, B:29:0x008d, B:32:0x0095), top: B:91:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9 A[Catch: all -> 0x00e3, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e3, blocks: (B:40:0x00ad, B:41:0x00b7, B:44:0x00c9, B:47:0x00d5, B:53:0x00df, B:42:0x00b8, B:46:0x00cb), top: B:83:0x00ad, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[Catch: all -> 0x00dc, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:42:0x00b8, B:46:0x00cb), top: B:93:0x00b8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00aa -> B:83:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upb.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((upb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
