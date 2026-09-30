package defpackage;

import android.content.ContentResolver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bgc extends h36 implements x16 {
    final /* synthetic */ cgc $contentObserver;
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ imb $registered;
    final /* synthetic */ lmb $registrationGeneration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgc(imb imbVar, lmb lmbVar, ContentResolver contentResolver, cgc cgcVar) {
        super(0, oa7.class, "unregister", "observeMediaStoreScreenshots$unregister(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$LongRef;Landroid/content/ContentResolver;Lai/askquin/ui/components/ScreenshotDetectionEffectKt$observeMediaStoreScreenshots$contentObserver$1;)V", 0);
        this.$registered = imbVar;
        this.$registrationGeneration = lmbVar;
        this.$contentResolver = contentResolver;
        this.$contentObserver = cgcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        imb imbVar = this.$registered;
        lmb lmbVar = this.$registrationGeneration;
        ContentResolver contentResolver = this.$contentResolver;
        cgc cgcVar = this.$contentObserver;
        if (imbVar.element) {
            imbVar.element = false;
            lmbVar.element++;
            try {
                contentResolver.unregisterContentObserver(cgcVar);
            } catch (Exception unused) {
            }
        }
        return wef.a;
    }
}
