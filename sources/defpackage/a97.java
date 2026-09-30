package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a97 extends zb6 {
    public static final k47 l = new k47("IdentityCredentials.API", new y87(0), new gec(11));
    public static final k47 m = new k47("ClientNotification.API", new y87(3), new gec(11));
    public static final k47 n = new k47("ClientTelemetry.API", new y87(4), new gec(11));
    public static final k47 o = new k47("CloudMessaging.API", new y87(8), new gec(11));
    public static int p = 1;

    public gfh c(ole oleVar) {
        j27 j27VarB = j27.b();
        j27VarB.d = new za5[]{db6.h};
        j27VarB.a = false;
        j27VarB.c = new g5b(17, oleVar);
        return b(2, j27VarB.a());
    }

    public synchronized int d() {
        int i;
        try {
            i = p;
            if (i == 1) {
                Context context = this.a;
                ac6 ac6Var = ac6.e;
                int iB = ac6Var.b(context, 12451000);
                if (iB == 0) {
                    i = 4;
                    p = 4;
                } else if (ac6Var.a(iB, context, null) != null || cs4.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    p = 2;
                } else {
                    i = 3;
                    p = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
