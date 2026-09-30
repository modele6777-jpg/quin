package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gc2 implements i1b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gc2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.i1b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.a;
        boolean z = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hc2 hc2Var = (hc2) obj2;
                lb2 lb2Var = (lb2) obj;
                bc2 bc2Var = lb2Var.f;
                hbc hbcVar = new hbc();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<xw3> set = lb2Var.c;
                Set set2 = lb2Var.g;
                for (xw3 xw3Var : set) {
                    int i2 = xw3Var.c;
                    int i3 = xw3Var.b;
                    boolean z2 = i2 == 0 ? z : false;
                    y3b y3bVar = xw3Var.a;
                    if (z2) {
                        if (i3 == 2) {
                            hashSet4.add(y3bVar);
                        } else {
                            hashSet.add(y3bVar);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(y3bVar);
                    } else if (i3 == 2) {
                        hashSet5.add(y3bVar);
                    } else {
                        hashSet2.add(y3bVar);
                    }
                    z = true;
                }
                if (!set2.isEmpty()) {
                    hashSet.add(y3b.a(m2b.class));
                }
                hbcVar.a = Collections.unmodifiableSet(hashSet);
                hbcVar.b = Collections.unmodifiableSet(hashSet2);
                hbcVar.c = Collections.unmodifiableSet(hashSet3);
                hbcVar.d = Collections.unmodifiableSet(hashSet4);
                hbcVar.e = Collections.unmodifiableSet(hashSet5);
                hbcVar.f = hc2Var;
                return bc2Var.c(hbcVar);
            case 1:
                return new lj6((Context) obj2, (String) obj);
            default:
                ff5 ff5Var = (ff5) obj2;
                String strE = ff5Var.e();
                db3 db3Var = new db3();
                Context contextCreateDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strE), 0);
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                db3Var.a = z;
                return db3Var;
        }
    }
}
