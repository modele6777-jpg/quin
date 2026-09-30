package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n8h implements u8e {
    public static final /* synthetic */ n8h a = new n8h();

    @Override // defpackage.u8e
    public final Object get() {
        Object obj = f8h.j;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(mtb.b);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof i39 ? (i39) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new i39(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }
}
