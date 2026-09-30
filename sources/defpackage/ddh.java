package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.sentry.android.core.b1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ddh extends BroadcastReceiver {
    public static volatile oid a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
            sb.append("Got an invalid config package for P/H that includes '..': ");
            sb.append(stringExtra);
            sb.append(". Exiting.");
            b1.l("PhUpdateBroadcastRecv", sb.toString());
            return;
        }
        oid oidVar = a;
        if (oidVar == null) {
            b1.l("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        tbh tbhVar = (tbh) ((ConcurrentHashMap) ((fnb) oidVar.b).a).get(stringExtra);
        if (tbhVar != null) {
            tbhVar.a.b();
        }
    }
}
