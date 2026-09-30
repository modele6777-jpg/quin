package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0f {
    public final Context a;
    public final rw b;
    public final psd c;
    public final ScheduledThreadPoolExecutor e;
    public final m0f g;
    public final kd0 d = new kd0(0);
    public boolean f = false;

    public o0f(rw rwVar, m0f m0fVar, psd psdVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = rwVar;
        this.g = m0fVar;
        this.c = psdVar;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0153 */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8 A[Catch: IOException -> 0x008a, TryCatch #1 {IOException -> 0x008a, blocks: (B:15:0x002d, B:32:0x00d8, B:34:0x00e0, B:20:0x003f, B:22:0x0047, B:24:0x0077, B:27:0x008d, B:29:0x0095, B:31:0x00c5), top: B:84:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[Catch: IOException -> 0x008a, TRY_LEAVE, TryCatch #1 {IOException -> 0x008a, blocks: (B:15:0x002d, B:32:0x00d8, B:34:0x00e0, B:20:0x003f, B:22:0x0047, B:24:0x0077, B:27:0x008d, B:29:0x0095, B:31:0x00c5), top: B:84:0x002d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00e0, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0f.b():boolean");
    }

    public final void c(long j) {
        this.e.schedule(new q0f(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        a(true);
    }
}
