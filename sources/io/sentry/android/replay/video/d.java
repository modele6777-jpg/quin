package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import defpackage.gu7;
import defpackage.x16;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends gu7 implements x16 {
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(0);
        this.this$0 = eVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        e eVar = this.this$0;
        int iIntValue = eVar.b.e;
        try {
            MediaCodecInfo.VideoCapabilities videoCapabilities = eVar.c.getCodecInfo().getCapabilitiesForType(this.this$0.b.f).getVideoCapabilities();
            if (videoCapabilities != null && !videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                this.this$0.a.getLogger().i(q5.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                objClamp.getClass();
                iIntValue = ((Number) objClamp).intValue();
            }
        } catch (Throwable th) {
            this.this$0.a.getLogger().d(q5.DEBUG, "Could not retrieve MediaCodec info", th);
        }
        a aVar = this.this$0.b;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(aVar.f, aVar.b, aVar.c);
        mediaFormatCreateVideoFormat.getClass();
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
        mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.b.d);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
        return mediaFormatCreateVideoFormat;
    }
}
