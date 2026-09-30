package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class am implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nfc b;

    public /* synthetic */ am(nfc nfcVar, int i) {
        this.a = i;
        this.b = nfcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() throws bw8 {
        tx8 tx8Var;
        int i = this.a;
        nfc nfcVar = this.b;
        switch (i) {
            case 0:
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(pa7.q(nfcVar));
                firebaseAnalytics.getClass();
                return new gf5(firebaseAnalytics);
            case 1:
                Context contextQ = pa7.q(nfcVar);
                gg7 gg7Var = new gg7(10, false);
                w84 w84Var = new w84(5);
                w84Var.b = new JSONObject();
                w84Var.c = esf.a;
                gg7Var.b = new gb5(w84Var);
                gg7Var.d = Collections.EMPTY_SET;
                gg7Var.c = "https://mixpanel.quin.love";
                jy8 jy8Var = new jy8(gg7Var);
                HashMap map = tx8.q;
                synchronized (map) {
                    try {
                        Context applicationContext = contextQ.getApplicationContext();
                        gj8 gj8Var = null;
                        if (tx8.s == null) {
                            tx8.s = tx8.r.g(contextQ, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
                        }
                        Map map2 = (Map) map.get("b41fb6ae2d9a804340593124ab7792c3");
                        if (map2 == null) {
                            map2 = new HashMap();
                            map.put("b41fb6ae2d9a804340593124ab7792c3", map2);
                        }
                        tx8Var = (tx8) map2.get(applicationContext);
                        if (tx8Var == null) {
                            PackageManager packageManager = applicationContext.getPackageManager();
                            String packageName = applicationContext.getPackageName();
                            if (packageManager == null || packageName == null) {
                                db6.h1("MixpanelAPI.ConfigurationChecker", "Can't check configuration when using a Context with null packageManager or packageName");
                            } else if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                                db6.h1("MixpanelAPI.ConfigurationChecker", "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
                                if (db6.L0(4)) {
                                    Log.i("MixpanelAPI.ConfigurationChecker", "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
                                }
                            } else {
                                FutureTask futureTask = tx8.s;
                                Context applicationContext2 = contextQ.getApplicationContext();
                                String packageName2 = applicationContext2.getPackageName();
                                try {
                                    Bundle bundle = applicationContext2.getPackageManager().getApplicationInfo(packageName2, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).metaData;
                                    if (bundle == null) {
                                        bundle = new Bundle();
                                    }
                                    gj8Var = new gj8(bundle);
                                } catch (PackageManager.NameNotFoundException e) {
                                    cva.q(ub3.i("Can't configure Mixpanel with package name ", packageName2), e);
                                }
                                tx8Var = new tx8(applicationContext, futureTask, gj8Var, jy8Var);
                                tx8.i(contextQ, tx8Var);
                                map2.put(applicationContext, tx8Var);
                            }
                        }
                        tx8.b(contextQ);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return tx8Var;
            case 2:
                return bzd.p(pa7.q(nfcVar), "local_storage.pb");
            case 3:
                return bzd.p(pa7.q(nfcVar), "user_profile.pb");
            case 4:
                return bzd.p(pa7.q(nfcVar), "review_reward.pb");
            default:
                return bzd.p(pa7.q(nfcVar), "rating_dialog_condition.pb");
        }
    }
}
