package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ b(d dVar, Activity activity, int i) {
        this.a = i;
        this.b = dVar;
        this.c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Activity activity = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((FrameMetricsAggregator) dVar.a.a()).a(activity);
                break;
            default:
                ((FrameMetricsAggregator) dVar.a.a()).b(activity);
                break;
        }
    }
}
