package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class toa implements ViewTreeObserver.OnPreDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final db0 c;
    public final db0 d;

    public toa(View view, db0 db0Var, db0 db0Var2) {
        this.b = new AtomicReference(view);
        this.c = db0Var;
        this.d = db0Var2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        db0 db0Var = this.c;
        Handler handler = this.a;
        handler.post(db0Var);
        handler.postAtFrontOfQueue(this.d);
        return true;
    }
}
