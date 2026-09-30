package defpackage;

import android.content.ContentResolver;
import android.provider.MediaStore;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class agc extends h36 implements x16 {
    final /* synthetic */ cgc $contentObserver;
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ lmb $observationStartedAtMillis;
    final /* synthetic */ imb $registered;
    final /* synthetic */ lmb $registrationGeneration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agc(imb imbVar, ContentResolver contentResolver, cgc cgcVar, lmb lmbVar, lmb lmbVar2) {
        super(0, oa7.class, "register", "observeMediaStoreScreenshots$register(Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/content/ContentResolver;Lai/askquin/ui/components/ScreenshotDetectionEffectKt$observeMediaStoreScreenshots$contentObserver$1;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$LongRef;)V", 0);
        this.$registered = imbVar;
        this.$contentResolver = contentResolver;
        this.$contentObserver = cgcVar;
        this.$observationStartedAtMillis = lmbVar;
        this.$registrationGeneration = lmbVar2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        imb imbVar = this.$registered;
        ContentResolver contentResolver = this.$contentResolver;
        cgc cgcVar = this.$contentObserver;
        lmb lmbVar = this.$observationStartedAtMillis;
        lmb lmbVar2 = this.$registrationGeneration;
        if (!imbVar.element) {
            try {
                contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, cgcVar);
                lmbVar.element = System.currentTimeMillis();
                lmbVar2.element++;
                imbVar.element = true;
            } catch (Exception unused) {
            }
        }
        return wef.a;
    }
}
