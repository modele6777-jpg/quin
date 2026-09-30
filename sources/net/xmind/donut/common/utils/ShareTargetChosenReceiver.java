package net.xmind.donut.common.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import defpackage.de1;
import defpackage.pa7;
import defpackage.v4e;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ShareTargetChosenReceiver extends BroadcastReceiver {
    public static final AtomicInteger a = new AtomicInteger();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (pa7.t(intent.getAction(), "net.xmind.donut.common.SHARE_TARGET_CHOSEN")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            ComponentName componentName = parcelableExtra instanceof ComponentName ? (ComponentName) parcelableExtra : null;
            String stringExtra = intent.getStringExtra("operation_id");
            String packageName = componentName != null ? componentName.getPackageName() : null;
            if (stringExtra == null || v4e.Q(stringExtra) || packageName == null) {
                return;
            }
            new Thread(new de1(context, stringExtra, packageName, goAsync(), 6)).start();
        }
    }
}
