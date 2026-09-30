package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jce {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public jce(Handler handler) {
        this.a = handler;
    }

    public static ice d() {
        ice iceVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                iceVar = arrayList.isEmpty() ? new ice() : (ice) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iceVar;
    }

    public final ice a(int i) {
        ice iceVarD = d();
        iceVarD.a = this.a.obtainMessage(i);
        return iceVarD;
    }

    public final ice b(int i, int i2, int i3) {
        ice iceVarD = d();
        iceVarD.a = this.a.obtainMessage(i, i2, i3);
        return iceVarD;
    }

    public final ice c(int i, Object obj) {
        ice iceVarD = d();
        iceVarD.a = this.a.obtainMessage(i, obj);
        return iceVarD;
    }

    public final void e(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void f(int i) {
        pa7.A(i != 0);
        this.a.removeMessages(i);
    }

    public final void g(int i) {
        this.a.sendEmptyMessage(i);
    }
}
