package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.bfg;
import defpackage.cgg;
import defpackage.d45;
import defpackage.lbg;
import defpackage.pzd;
import defpackage.qe;
import defpackage.rch;
import defpackage.rs9;
import defpackage.sfc;
import defpackage.yag;
import defpackage.zfg;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionStateBroadcastReceiver extends BroadcastReceiver {
    public static final rch a = new rch("SessionStateBroadcastReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        rch rchVar = a;
        if (bundleExtra == null) {
            rchVar.b("Empty flags bundle received from broadcast.", new Object[0]);
            return;
        }
        if (bundleExtra.getBoolean("enableWorkManager")) {
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
            if (bundleExtra2 == null) {
                rchVar.b("Empty bundle received from broadcast.", new Object[0]);
                return;
            }
            zfg zfgVar = (zfg) cgg.n(context).d.a();
            Bundle bundleExtra3 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_NOTIFICATION_OPTIONS");
            bfg bfgVar = zfgVar.f;
            rch rchVar2 = zfg.i;
            ArrayList<String> stringArrayList = bundleExtra2.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                rchVar2.b("Corrupt packStateBundle.", new Object[0]);
                return;
            }
            boolean z = bundleExtra.getBoolean("enableExpeditedWork");
            if (z && bundleExtra3 == null) {
                rchVar2.b("Notification options must be present when expedited work is enabled.", new Object[0]);
                return;
            }
            bs bsVarA = bs.a(bundleExtra2, stringArrayList.get(0), zfgVar.b, zfgVar.c, new pzd(13));
            rchVar2.a("ExtractionWorkScheduler.scheduleExtraction: %s", bsVarA);
            if (((PendingIntent) bundleExtra2.getParcelable("confirmation_intent")) != null) {
                zfgVar.d.getClass();
            }
            ((Executor) zfgVar.h.a()).execute(new qe(zfgVar, bundleExtra2, bsVarA, false, 6));
            d45 d45Var = d45.c;
            if (!z) {
                zi0 zi0Var = new zi0(ExtractionWorker.class);
                ((lbg) zi0Var.c).e = sfc.f(bundleExtra2, new Bundle());
                ((yag) bfgVar.a()).a("extractAssetPacks", d45Var, zi0Var.e());
            } else {
                zi0 zi0Var2 = new zi0(ExtractionWorker.class);
                lbg lbgVar = (lbg) zi0Var2.c;
                lbgVar.q = true;
                lbgVar.r = rs9.a;
                ((lbg) zi0Var2.c).e = sfc.f(bundleExtra2, bundleExtra3);
                ((yag) bfgVar.a()).a("extractAssetPacks", d45Var, zi0Var2.e());
            }
        }
    }
}
