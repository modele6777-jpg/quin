package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z66 extends ry2 {
    public final Context d;
    public iy2 e;
    public Executor f;
    public CancellationSignal g;
    public final py2 h;

    public z66(Context context) {
        context.getClass();
        this.d = context;
        this.h = new py2(this, new Handler(Looper.getMainLooper()), 1);
    }
}
