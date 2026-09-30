package io.sentry.android.replay;

import defpackage.gu7;
import defpackage.pa7;
import defpackage.x16;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.n0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends gu7 implements x16 {
    final /* synthetic */ ReplayIntegration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ReplayIntegration replayIntegration) {
        super(0);
        this.this$0 = replayIntegration;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new n0(2));
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        SentryAndroidOptions sentryAndroidOptions = this.this$0.d;
        if (sentryAndroidOptions != null) {
            return new io.sentry.android.replay.util.g(scheduledExecutorServiceNewSingleThreadScheduledExecutor, sentryAndroidOptions);
        }
        pa7.g0("options");
        throw null;
    }
}
