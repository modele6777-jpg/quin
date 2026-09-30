package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hs5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is5 b;

    public /* synthetic */ hs5(is5 is5Var, int i) {
        this.a = i;
        this.b = is5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        is5 is5Var = this.b;
        switch (i) {
            case 0:
                ViewParent parent = is5Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                is5Var.a();
                View view = is5Var.d;
                if (view.isEnabled() && !view.isLongClickable() && is5Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    is5Var.g = true;
                    break;
                }
                break;
        }
    }
}
