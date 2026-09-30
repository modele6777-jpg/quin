package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e9g extends gbe implements l26 {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ yv1 $channel;
    final /* synthetic */ f9g $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9g(ContentResolver contentResolver, Uri uri, f9g f9gVar, yv1 yv1Var, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = f9gVar;
        this.$channel = yv1Var;
        this.$applicationContext = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        e9g e9gVar = new e9g(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, xn2Var);
        e9gVar.L$0 = obj;
        return e9gVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:18:0x0046, B:22:0x0056, B:24:0x005e, B:14:0x002b, B:17:0x0040), top: B:31:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r4.a(r5, r8) == r3) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1c
            java.lang.Object r0 = r8.L$1
            k41 r0 = (defpackage.k41) r0
            java.lang.Object r4 = r8.L$0
            xj5 r4 = (defpackage.xj5) r4
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L19
        L17:
            r9 = r4
            goto L46
        L19:
            r9 = move-exception
            goto L8d
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            r8 = 0
            return r8
        L23:
            java.lang.Object r0 = r8.L$1
            k41 r0 = (defpackage.k41) r0
            java.lang.Object r4 = r8.L$0
            xj5 r4 = (defpackage.xj5) r4
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L19
            goto L56
        L2f:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            xj5 r9 = (defpackage.xj5) r9
            android.content.ContentResolver r0 = r8.$resolver
            android.net.Uri r4 = r8.$animationScaleUri
            r5 = 0
            f9g r6 = r8.$contentObserver
            r0.registerContentObserver(r4, r5, r6)
            yv1 r0 = r8.$channel     // Catch: java.lang.Throwable -> L19
            k41 r0 = r0.iterator()     // Catch: java.lang.Throwable -> L19
        L46:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r0     // Catch: java.lang.Throwable -> L19
            r8.label = r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r0.b(r8)     // Catch: java.lang.Throwable -> L19
            if (r4 != r3) goto L53
            goto L82
        L53:
            r7 = r4
            r4 = r9
            r9 = r7
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L83
            r0.c()     // Catch: java.lang.Throwable -> L19
            android.content.Context r9 = r8.$applicationContext     // Catch: java.lang.Throwable -> L19
            w79 r5 = defpackage.g9g.a     // Catch: java.lang.Throwable -> L19
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L19
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L19
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r0     // Catch: java.lang.Throwable -> L19
            r8.label = r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r4.a(r5, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r3) goto L17
        L82:
            return r3
        L83:
            android.content.ContentResolver r9 = r8.$resolver
            f9g r8 = r8.$contentObserver
            r9.unregisterContentObserver(r8)
            wef r8 = defpackage.wef.a
            return r8
        L8d:
            android.content.ContentResolver r0 = r8.$resolver
            f9g r8 = r8.$contentObserver
            r0.unregisterContentObserver(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9g.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e9g) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
