package io.sentry.android.core.performance;

import android.view.Window;
import defpackage.qae;
import io.sentry.android.core.internal.gestures.j;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {
    public final qae b;

    public i(Window.Callback callback, qae qaeVar) {
        super(callback);
        this.b = qaeVar;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.b.run();
    }
}
