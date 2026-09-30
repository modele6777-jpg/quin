package defpackage;

import android.os.Process;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q25 implements Thread.UncaughtExceptionHandler {
    public static q25 b;
    public final Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    public q25() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        HashMap map = tx8.q;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                for (tx8 tx8Var : ((Map) it.next()).values()) {
                    if (tx8Var.d.booleanValue()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_crashed_reason", th.toString());
                            tx8Var.l("$ae_crashed", jSONObject, true);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        Process.killProcess(Process.myPid());
    }
}
