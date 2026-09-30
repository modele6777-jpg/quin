package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fxg implements ServiceConnection {
    public final int a;
    public final /* synthetic */ yt0 b;

    public fxg(yt0 yt0Var, int i) {
        this.b = yt0Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        yt0 yt0Var = this.b;
        if (iBinder == null) {
            synchronized (yt0Var.g) {
                i = yt0Var.n;
            }
            if (i == 3) {
                yt0Var.v = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            srg srgVar = yt0Var.f;
            srgVar.sendMessage(srgVar.obtainMessage(i2, yt0Var.x.get(), 16));
            return;
        }
        synchronized (yt0Var.h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                yt0Var.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yjg)) ? new yjg(iBinder) : (yjg) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        yt0 yt0Var2 = this.b;
        int i3 = this.a;
        dzg dzgVar = new dzg(yt0Var2, 0, null);
        srg srgVar2 = yt0Var2.f;
        srgVar2.sendMessage(srgVar2.obtainMessage(7, i3, -1, dzgVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yt0 yt0Var = this.b;
        synchronized (yt0Var.h) {
            yt0Var.i = null;
        }
        yt0 yt0Var2 = this.b;
        int i = this.a;
        srg srgVar = yt0Var2.f;
        srgVar.sendMessage(srgVar.obtainMessage(6, i, 1));
    }
}
