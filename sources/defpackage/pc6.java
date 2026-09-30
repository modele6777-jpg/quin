package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.adjust.sdk.sig.r3;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pc6 implements ServiceConnection {
    public final long a;
    public boolean b = false;
    public final LinkedBlockingQueue c = new LinkedBlockingQueue(1);

    public pc6(long j) {
        this.a = j;
    }

    public final IBinder a() {
        if (this.b) {
            r3.l();
            return null;
        }
        this.b = true;
        return (IBinder) this.c.poll(this.a, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.c.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
