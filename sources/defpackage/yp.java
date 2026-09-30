package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ yp(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                ad0 ad0Var = androidComposeView.w;
                Class cls = AndroidComposeView.X1;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!ad0Var.isEmpty()) {
                    try {
                        ((x16) ad0Var.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                androidComposeView.M1 = false;
                MotionEvent motionEvent = androidComposeView.C1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.H(motionEvent);
                    return;
                } else {
                    qc0.p("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                AndroidComposeView.j(androidComposeView.getRoot());
                return;
            default:
                AndroidComposeView.j(androidComposeView.getRoot());
                return;
        }
    }
}
