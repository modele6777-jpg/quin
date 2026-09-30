package ai.askquin.ui.fourseasons.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.drb;
import defpackage.hs3;
import defpackage.lw2;
import defpackage.nu4;
import defpackage.pa7;
import defpackage.qv5;
import defpackage.rv5;
import defpackage.sv5;
import defpackage.xqa;
import defpackage.yic;
import defpackage.ynb;
import defpackage.z5c;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class FourSeasonsNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        yic yicVar = yic.c;
        yic yicVarM = drb.m(intent.getStringExtra("seasonal_term"), Integer.valueOf(intent.getIntExtra("seasonal_year", 0)));
        if (yicVarM == null) {
            return;
        }
        hs3 hs3Var = xqa.X0;
        if (((Boolean) z5c.I(nu4.a, new rv5(hs3Var.a, hs3Var.b, null))).booleanValue()) {
            qv5 qv5Var = qv5.a;
            if (pa7.t(qv5.k(), yicVarM)) {
                ynb.V(lw2.a, null, null, new sv5(context, yicVarM, goAsync(), null), 3);
            }
        }
    }
}
