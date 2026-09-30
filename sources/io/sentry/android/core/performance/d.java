package io.sentry.android.core.performance;

import android.os.MessageQueue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements MessageQueue.IdleHandler {
    public final /* synthetic */ g a;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.a.d();
        return false;
    }
}
