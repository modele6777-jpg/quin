package io.sentry.android.core;

import defpackage.j6;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends j6 {
    @Override // defpackage.j6
    public final void u(boolean z) {
        super.u(z);
        if (z) {
            d("android.webkit.WebView");
            d("android.widget.VideoView");
            d("androidx.camera.view.PreviewView");
            d("androidx.media3.ui.PlayerView");
            d("com.google.android.exoplayer2.ui.PlayerView");
            d("com.google.android.exoplayer2.ui.StyledPlayerView");
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.a;
        copyOnWriteArraySet.remove("android.webkit.WebView");
        copyOnWriteArraySet.remove("android.widget.VideoView");
        copyOnWriteArraySet.remove("androidx.camera.view.PreviewView");
        copyOnWriteArraySet.remove("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    @Override // defpackage.j6
    public final void x() {
    }
}
