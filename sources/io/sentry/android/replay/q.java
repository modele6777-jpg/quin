package io.sentry.android.replay;

import android.graphics.Bitmap;
import defpackage.gu7;
import defpackage.l26;
import defpackage.mmb;
import defpackage.pa7;
import defpackage.wef;
import defpackage.ym8;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends gu7 implements l26 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ mmb $screen;
    final /* synthetic */ ReplayIntegration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ReplayIntegration replayIntegration, Bitmap bitmap, mmb mmbVar) {
        super(2);
        this.this$0 = replayIntegration;
        this.$bitmap = bitmap;
        this.$screen = mmbVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        k kVar = (k) obj;
        long jLongValue = ((Number) obj2).longValue();
        kVar.getClass();
        SentryAndroidOptions sentryAndroidOptions = this.this$0.d;
        if (sentryAndroidOptions == null) {
            pa7.g0("options");
            throw null;
        }
        sentryAndroidOptions.getSessionReplay().getClass();
        Bitmap bitmap = this.$bitmap;
        String str = (String) this.$screen.element;
        bitmap.getClass();
        if (kVar.l() != null && !bitmap.isRecycled()) {
            File fileL = kVar.l();
            if (fileL != null) {
                fileL.mkdirs();
            }
            File file = new File(kVar.l(), jLongValue + ".jpg");
            file.createNewFile();
            synchronized (bitmap) {
                if (!bitmap.isRecycled()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, kVar.a.getSessionReplay().f.screenshotQuality, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        kVar.b(file, str, jLongValue);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ym8.t(fileOutputStream, th);
                            throw th2;
                        }
                    }
                }
            }
        }
        return wef.a;
    }
}
