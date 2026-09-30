package defpackage;

import android.util.Log;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.io.FileNotFoundException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pd4 implements t37, fs4, a3f, bc2, c98, d98, yn2, an9, xm9, jz4, j8e {
    public final /* synthetic */ int a;

    public /* synthetic */ pd4(int i) {
        this.a = i;
    }

    public static /* synthetic */ void f(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void l(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    @Override // defpackage.a3f
    public Object apply(Object obj) {
        o0d o0dVar = (o0d) obj;
        String strR = p0d.b.r(o0dVar);
        strR.getClass();
        o0dVar.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strR.getBytes(ox1.a);
        bytes.getClass();
        return bytes;
    }

    @Override // defpackage.fs4
    public float b(float f) {
        float f2;
        float f3;
        switch (this.a) {
            case 3:
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            default:
                return f;
        }
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        switch (this.a) {
            case 8:
                return ExecutorsRegistrar.lambda$getComponents$4(hbcVar);
            case 9:
                return ExecutorsRegistrar.lambda$getComponents$5(hbcVar);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ExecutorsRegistrar.lambda$getComponents$6(hbcVar);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return ExecutorsRegistrar.lambda$getComponents$7(hbcVar);
            case 25:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(hbcVar);
            default:
                return FirebasePerfRegistrar.providesFirebasePerformance(hbcVar);
        }
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        xga xgaVar = (xga) obj;
        switch (this.a) {
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                xgaVar.q(new g45(2, new l55(1), ErrorCodes.MALFORMED_URL_EXCEPTION));
                break;
            default:
                xgaVar.x();
                break;
        }
    }

    @Override // defpackage.d98
    public void g(Object obj, ki5 ki5Var) {
        ((xga) obj).c(new wga(ki5Var));
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        int i;
        switch (this.a) {
            case 15:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        p2g p2gVar = p2g.a;
        task.getClass();
        if (!task.m()) {
            p2gVar.d().d("Firebase Remote Config fetch failed", task.h());
            return;
        }
        p2gVar.d().e("Firebase Remote Config fetch complete: result: " + task.i());
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        FirebaseCrashlytics.lambda$init$0(exc);
    }

    @Override // defpackage.j8e
    public Task then(Object obj) {
        return Tasks.d(null);
    }

    public /* synthetic */ pd4(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.t37
    public void a(mx mxVar, sf9 sf9Var) {
    }
}
