package ai.askquin.ui.fourseasons.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.qd0;
import defpackage.qv5;
import defpackage.s72;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class FourSeasonsScheduleReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (s72.o0(qd0.I0(new String[]{"android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED"}), intent.getAction())) {
            qv5 qv5Var = qv5.a;
            qv5.i(context, null, 6);
        }
    }
}
