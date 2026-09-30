package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import defpackage.gu7;
import defpackage.v4e;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gu7 implements x16 {
    public static final c a = new c(0);

    @Override // defpackage.x16
    public final Object invoke() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        codecInfos.getClass();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            name.getClass();
            if (v4e.F(name, "c2.exynos", false)) {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
