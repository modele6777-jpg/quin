package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.d45;
import defpackage.ff8;
import defpackage.lag;
import defpackage.t72;
import defpackage.yag;
import defpackage.zi0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = ff8.n("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ff8 ff8VarH = ff8.h();
        String str = a;
        ff8VarH.e(str, "Requesting diagnostics");
        try {
            context.getClass();
            yag yagVarB = yag.b(context);
            List listH = t72.H(new zi0(DiagnosticsWorker.class).e());
            if (listH.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new lag(yagVarB, null, d45.b, listH, 0).a();
        } catch (IllegalStateException e) {
            ff8.h().g(str, "WorkManager is not initialized", e);
        }
    }
}
