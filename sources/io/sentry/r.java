package io.sentry;

import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends TimerTask {
    public final /* synthetic */ u a;

    public r(u uVar) {
        this.a = uVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((c1) it.next()).c();
        }
    }
}
