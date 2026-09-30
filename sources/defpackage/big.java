package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class big extends sig {
    public final Context a;
    public final /* synthetic */ ac6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public big(ac6 ac6Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = ac6Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            b1.l("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = bc6.a;
        ac6 ac6Var = this.b;
        Context context = this.a;
        int iB = ac6Var.b(context, i2);
        int i3 = sc6.e;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = ac6Var.a(iB, context, "n");
            ac6Var.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
