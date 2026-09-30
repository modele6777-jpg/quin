package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hb0 implements fb0 {
    private final gb0 appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private zb0 currentAppState = zb0.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<fb0> appStateCallback = new WeakReference<>(this);

    public hb0(gb0 gb0Var) {
        this.appStateMonitor = gb0Var;
    }

    public zb0 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<fb0> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.v.addAndGet(i);
    }

    @Override // defpackage.fb0
    public void onUpdateAppState(zb0 zb0Var) {
        zb0 zb0Var2 = this.currentAppState;
        zb0 zb0Var3 = zb0.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (zb0Var2 == zb0Var3) {
            this.currentAppState = zb0Var;
        } else {
            if (zb0Var2 == zb0Var || zb0Var == zb0Var3) {
                return;
            }
            this.currentAppState = zb0.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        gb0 gb0Var = this.appStateMonitor;
        this.currentAppState = gb0Var.Y;
        WeakReference<fb0> weakReference = this.appStateCallback;
        synchronized (gb0Var.f) {
            gb0Var.f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            gb0 gb0Var = this.appStateMonitor;
            WeakReference<fb0> weakReference = this.appStateCallback;
            synchronized (gb0Var.f) {
                gb0Var.f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
