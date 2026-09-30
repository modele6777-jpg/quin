package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mt4 implements Runnable {
    public static final /* synthetic */ mt4 b = new mt4(2);
    public static final /* synthetic */ mt4 c = new mt4(3);
    public final /* synthetic */ int a;

    public /* synthetic */ mt4(cdh cdhVar) {
        this.a = 4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                try {
                    int i = x0f.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (jt4.d()) {
                        jt4.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i2 = x0f.a;
                    Trace.endSection();
                }
            case 1:
            case 2:
            case 3:
                return;
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i3 = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i3);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                    z = runningAppProcessInfo.importance >= 400;
                } catch (RuntimeException e) {
                    b1.n("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                if (new Boolean(z).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ mt4(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }
}
