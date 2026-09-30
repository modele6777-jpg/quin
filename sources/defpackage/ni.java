package defpackage;

import ai.askquin.R;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ni(oq0 oq0Var, int i) {
        this.a = 10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                i79 i79Var = AndroidComposeView.a2;
                synchronized (i79Var) {
                    try {
                        int i3 = Build.VERSION.SDK_INT;
                        Object[] objArr = i79Var.a;
                        int i4 = i79Var.b;
                        if (i3 < 30) {
                            while (i < i4) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.X1;
                                androidComposeView.setShowLayoutBounds(ynb.K());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new yp(androidComposeView, 2));
                                }
                                i++;
                            }
                        } else {
                            while (i < i4) {
                                AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr[i];
                                androidComposeView2.post(new yp(androidComposeView2, 3));
                                i++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                return;
            case 3:
                CrashlyticsWorker.lambda$await$6();
                return;
            case 4:
                jcc.k(0, Integer.valueOf(R.string.chat_mind_signin_error_network));
                return;
            case 5:
                jcc.k(0, Integer.valueOf(R.string.skin_download_failed));
                return;
            case 6:
                jcc.k(0, Integer.valueOf(R.string.skin_download_success_toast));
                return;
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            default:
                return;
        }
    }

    public /* synthetic */ ni(int i, Object obj, Object obj2) {
        this.a = i;
    }

    public /* synthetic */ ni(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
