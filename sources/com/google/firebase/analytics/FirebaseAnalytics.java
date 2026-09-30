package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Tasks;
import defpackage.e8h;
import defpackage.ff5;
import defpackage.iwg;
import defpackage.nf5;
import defpackage.oa7;
import defpackage.of5;
import defpackage.rwg;
import defpackage.tvg;
import defpackage.uwg;
import defpackage.vxg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final vxg a;

    public FirebaseAnalytics(vxg vxgVar) {
        oa7.A(vxgVar);
        this.a = vxgVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(vxg.e(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static e8h getScionFrontendApiImplementation(Context context, Bundle bundle) {
        vxg vxgVarE = vxg.e(context, bundle);
        if (vxgVarE == null) {
            return null;
        }
        return new tvg(vxgVarE);
    }

    public final void a(String str) {
        vxg vxgVar = this.a;
        vxgVar.getClass();
        vxgVar.c(new uwg(vxgVar, str, 0));
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = nf5.l;
            return (String) Tasks.await(((nf5) ff5.d().b(of5.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        iwg iwgVarC = iwg.c(activity);
        vxg vxgVar = this.a;
        vxgVar.getClass();
        vxgVar.c(new rwg(vxgVar, iwgVarC, str, str2));
    }
}
