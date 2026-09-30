package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 extends BroadcastReceiver {
    public final t45 a;
    public final jce b;
    public final /* synthetic */ zi0 c;

    public yi0(zi0 zi0Var, jce jceVar, t45 t45Var) {
        this.c = zi0Var;
        this.b = jceVar;
        this.a = t45Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new j1(8, this));
        }
    }
}
