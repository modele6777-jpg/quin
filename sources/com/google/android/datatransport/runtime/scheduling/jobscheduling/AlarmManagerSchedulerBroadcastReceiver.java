package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.f4f;
import defpackage.lp0;
import defpackage.mua;
import defpackage.ni;
import defpackage.ohf;
import defpackage.qq0;
import defpackage.ta0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        f4f.b(context);
        ta0 ta0VarA = qq0.a();
        ta0VarA.N(queryParameter);
        ta0VarA.b = mua.b(iIntValue);
        if (queryParameter2 != null) {
            ta0VarA.d = Base64.decode(queryParameter2, 0);
        }
        lp0 lp0Var = f4f.a().d;
        ((Executor) lp0Var.f).execute(new ohf(lp0Var, ta0VarA.f(), i, new ni(0)));
    }
}
