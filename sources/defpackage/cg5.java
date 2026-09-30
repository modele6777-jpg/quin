package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg5 {
    public static final ct b = ct.d();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public cg5(ff5 ff5Var, i1b i1bVar, of5 of5Var, i1b i1bVar2, RemoteConfigManager remoteConfigManager, ji2 ji2Var, SessionManager sessionManager) {
        Bundle bundle;
        if (ff5Var == null) {
            new xx6(new Bundle());
            return;
        }
        wf5 wf5Var = ff5Var.c;
        e4f e4fVar = e4f.H0;
        e4fVar.d = ff5Var;
        ff5Var.a();
        e4fVar.E0 = wf5Var.h;
        e4fVar.f = of5Var;
        e4fVar.g = i1bVar2;
        e4fVar.w.execute(new d4f(e4fVar, 1));
        ff5Var.a();
        Context context = ff5Var.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        xx6 xx6Var = bundle != null ? new xx6(bundle) : new xx6();
        remoteConfigManager.setFirebaseRemoteConfigProvider(i1bVar);
        ji2Var.b = xx6Var;
        ji2.d.a = jzb.l(context);
        ji2Var.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolF = ji2Var.f();
        ct ctVar = b;
        if (ctVar.a) {
            if (boolF != null ? boolF.booleanValue() : ff5.d().h()) {
                ff5Var.a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(oa7.O(wf5Var.h, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (ctVar.a) {
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }
}
