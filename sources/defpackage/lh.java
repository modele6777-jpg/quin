package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.Util;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lh implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;

    public lh(FirebaseMessaging firebaseMessaging, long j) {
        this.a = 3;
        this.d = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z99("firebase-iid-executor"));
        this.e = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.e).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.e).a() == null) {
                b1.d("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                b1.l("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            b1.l("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            b1.l("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                AdjustThirdPartySharingResult thirdPartySharingResult = SharedPreferencesManager.getDefaultInstance(context).getThirdPartySharingResult();
                if (thirdPartySharingResult != null) {
                    new Handler(context.getMainLooper()).post(new w36(this, thirdPartySharingResult, z, 6));
                    return;
                } else {
                    ActivityHandler.queueGetThirdPartySharingSettingsWithTimeout(this.c, (OnThirdPartySharingSettingsReadListener) this.e, ((AdjustInstance) this.d).cachedThirdPartySharingTimeoutCallbacks, context);
                    return;
                }
            case 1:
                Context context2 = (Context) this.b;
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context2);
                if (adidFromActivityStateFile != null) {
                    new Handler(context2.getMainLooper()).post(new lwg(this, adidFromActivityStateFile, z, 8));
                    return;
                } else {
                    ActivityHandler.queueGetAdidWithTimeout(this.c, (OnAdidReadListener) this.e, ((AdjustInstance) this.d).cachedAdidReadTimeoutCallbacks, context2);
                    return;
                }
            case 2:
                Context context3 = (Context) this.b;
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context3);
                if (attributionFromAttributionFile != null) {
                    new Handler(context3.getMainLooper()).post(new v36(this, attributionFromAttributionFile, z, 11));
                    return;
                } else {
                    ActivityHandler.queueGetAttributionWithTimeout(this.c, (OnAttributionReadListener) this.e, ((AdjustInstance) this.d).cachedAttributionReadTimeoutCallbacks, context3);
                    return;
                }
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.b;
                szc szcVarL = szc.L();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.e;
                if (szcVarL.O(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.k = true;
                        }
                        if (!firebaseMessaging.i.h()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.k = false;
                            }
                            if (!szc.L().O(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!szc.L().N(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.k = false;
                                }
                            } else {
                                firebaseMessaging.g(this.c);
                            }
                            if (!szc.L().O(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            xbe xbeVar = new xbe();
                            xbeVar.c = this;
                            xbeVar.a();
                            if (!szc.L().O(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        b1.d("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.k = false;
                            if (!szc.L().O(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (szc.L().O(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ lh(AdjustInstance adjustInstance, Context context, Object obj, long j, int i) {
        this.a = i;
        this.d = adjustInstance;
        this.b = context;
        this.e = obj;
        this.c = j;
    }
}
