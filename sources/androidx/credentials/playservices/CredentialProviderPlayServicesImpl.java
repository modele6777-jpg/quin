package androidx.credentials.playservices;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import defpackage.a26;
import defpackage.a97;
import defpackage.ac6;
import defpackage.ai2;
import defpackage.cva;
import defpackage.d76;
import defpackage.dd7;
import defpackage.dj6;
import defpackage.dta;
import defpackage.e76;
import defpackage.ec6;
import defpackage.gfh;
import defpackage.hle;
import defpackage.hy2;
import defpackage.i32;
import defpackage.i76;
import defpackage.iy2;
import defpackage.j27;
import defpackage.j32;
import defpackage.jv2;
import defpackage.k32;
import defpackage.k60;
import defpackage.ky2;
import defpackage.l32;
import defpackage.lid;
import defpackage.ly2;
import defpackage.mmb;
import defpackage.ny2;
import defpackage.oa7;
import defpackage.pa7;
import defpackage.pjg;
import defpackage.qy2;
import defpackage.r45;
import defpackage.sx2;
import defpackage.t72;
import defpackage.thg;
import defpackage.tx2;
import defpackage.vrb;
import defpackage.vy2;
import defpackage.wef;
import defpackage.wg;
import defpackage.wy2;
import defpackage.x60;
import defpackage.yb6;
import defpackage.yy2;
import defpackage.z66;
import defpackage.z7c;
import defpackage.za5;
import defpackage.zig;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0016¢\u0006\u0004\b!\u0010\"J3\u0010%\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$0\fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J?\u0010)\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0002¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R(\u0010,\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00066"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lly2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Le76;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Liy2;", "Lf76;", "Lb76;", "callback", "Lwef;", "onGetCredential", "(Landroid/content/Context;Le76;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Liy2;)V", "Ltx2;", "", "Lqx2;", "onCreateCredential", "(Landroid/content/Context;Ltx2;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Liy2;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "Lj32;", "Ljava/lang/Void;", "Lh32;", "onClearCredential", "(Lj32;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Liy2;)V", "Llid;", "Ljid;", "onSignalCredentialState", "(Llid;Ljava/util/concurrent/Executor;Liy2;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "Lac6;", "googleApiAvailability", "Lac6;", "getGoogleApiAvailability", "()Lac6;", "setGoogleApiAvailability", "(Lac6;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "yy2", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class CredentialProviderPlayServicesImpl implements ly2 {
    public static final yy2 Companion = new yy2();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private ac6 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = ac6.e;
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.b(context, minApkVersion);
    }

    private static final wef onClearCredential$lambda$0(Executor executor, iy2 iy2Var) {
        executor.execute(new vy2(iy2Var, 0));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(iy2 iy2Var) {
        ((hy2) iy2Var).a(new i32("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final wef onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var, Boolean bool) {
        Companion.getClass();
        if (!yy2.a(cancellationSignal)) {
            onClearCredential$lambda$1$0(executor, iy2Var);
        }
        return wef.a;
    }

    private static final wef onClearCredential$lambda$1$0(Executor executor, iy2 iy2Var) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new vy2(iy2Var, 2));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$1$0$0(iy2 iy2Var) {
        ((hy2) iy2Var).b(null);
    }

    private static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var, Exception exc) {
        exc.getClass();
        b1.n(TAG, "Clearing restore credential failed", exc);
        mmb mmbVar = new mmb();
        mmbVar.element = new l32("Clear restore credential failed for unknown reason.");
        if ((exc instanceof x60) && ((x60) exc).a() == 40201) {
            mmbVar.element = new l32("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (yy2.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$3$0(executor, iy2Var, mmbVar);
    }

    private static final wef onClearCredential$lambda$3$0(Executor executor, iy2 iy2Var, mmb mmbVar) {
        executor.execute(new ny2(4, iy2Var, mmbVar));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(iy2 iy2Var, mmb mmbVar) {
        ((hy2) iy2Var).a(mmbVar.element);
    }

    private static final wef onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var, k32 k32Var) {
        Companion.getClass();
        if (!yy2.a(cancellationSignal)) {
            onClearCredential$lambda$4$0(executor, iy2Var);
        }
        return wef.a;
    }

    private static final wef onClearCredential$lambda$4$0(Executor executor, iy2 iy2Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new vy2(iy2Var, 6));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$4$0$0(iy2 iy2Var) {
        ((hy2) iy2Var).b(null);
    }

    private static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, j32 j32Var, CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var, Exception exc) {
        exc.getClass();
        b1.d(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(j32Var, cancellationSignal, executor, iy2Var);
    }

    private static final wef onCreateCredential$lambda$0(Executor executor, iy2 iy2Var) {
        executor.execute(new vy2(iy2Var, 1));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(iy2 iy2Var) {
        ((hy2) iy2Var).a(new sx2("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final wef onGetCredential$lambda$0(Executor executor, iy2 iy2Var) {
        executor.execute(new vy2(iy2Var, 5));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(iy2 iy2Var) {
        ((hy2) iy2Var).a(new d76("this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final wef onGetCredential$lambda$1(Executor executor, iy2 iy2Var) {
        executor.execute(new vy2(iy2Var, 4));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(iy2 iy2Var) {
        ((hy2) iy2Var).a(new d76("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(j32 request, final CancellationSignal cancellationSignal, final Executor executor, final iy2 callback) {
        Context context = this.context;
        oa7.A(context);
        zig zigVar = new zig(context, new pjg());
        zigVar.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = thg.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((thg) it.next()).getClass();
            cva.f();
            return;
        }
        ec6.a();
        j27 j27VarB = j27.b();
        j27VarB.d = new za5[]{dj6.g};
        j27VarB.c = new vrb(13, zigVar);
        j27VarB.a = false;
        j27VarB.b = 1554;
        gfh gfhVarB = zigVar.b(1, j27VarB.a());
        jv2 jv2Var = new jv2(20, new a26() { // from class: xy2
            @Override // defpackage.a26
            public final Object d(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, callback, (Void) obj);
            }
        });
        gfhVarB.getClass();
        dd7 dd7Var = hle.a;
        gfhVarB.e(dd7Var, jv2Var);
        gfhVarB.d(dd7Var, new wy2(this, cancellationSignal, executor, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wef runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var, Void r3) {
        Companion.getClass();
        if (!yy2.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$0$0(executor, iy2Var);
        }
        return wef.a;
    }

    private static final wef runFallbackClearCredFlow$lambda$0$0(Executor executor, iy2 iy2Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new vy2(iy2Var, 3));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$0$0$0(iy2 iy2Var) {
        ((hy2) iy2Var).b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var, Exception exc) {
        exc.getClass();
        Companion.getClass();
        if (yy2.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$2$0$0(exc, executor, iy2Var);
    }

    private static final wef runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, iy2 iy2Var) {
        b1.l(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new ny2(5, iy2Var, exc));
        return wef.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(iy2 iy2Var, Exception exc) {
        ((hy2) iy2Var).a(new l32(exc.getMessage()));
    }

    public final ac6 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            b1.l(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    public void onClearCredential(j32 request, CancellationSignal cancellationSignal, Executor executor, iy2 callback) {
        throw null;
    }

    public void onCreateCredential(Context context, tx2 request, CancellationSignal cancellationSignal, Executor executor, iy2 callback) {
        context.getClass();
        throw null;
    }

    @Override // defpackage.ly2
    public void onGetCredential(Context context, e76 request, CancellationSignal cancellationSignal, Executor executor, iy2 callback) {
        context.getClass();
        request.getClass();
        List<i76> list = request.a;
        executor.getClass();
        callback.getClass();
        Companion.getClass();
        if (yy2.a(cancellationSignal)) {
            return;
        }
        for (i76 i76Var : list) {
        }
        Companion.getClass();
        for (i76 i76Var2 : list) {
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Companion.getClass();
            for (i76 i76Var3 : list) {
            }
            new qy2(context).f(request, cancellationSignal, executor, callback);
            return;
        }
        z66 z66Var = new z66(context);
        z66Var.g = cancellationSignal;
        z66Var.e = callback;
        z66Var.f = executor;
        Companion.getClass();
        if (yy2.a(cancellationSignal)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (i76 i76Var4 : list) {
            i76Var4.getClass();
            arrayList.add(new ky2("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", i76Var4.a, i76Var4.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
        Context context2 = z66Var.d;
        context2.getClass();
        a97 a97Var = new a97(context2, a97.l, k60.h, yb6.c);
        j27 j27VarB = j27.b();
        j27VarB.d = new za5[]{pa7.e};
        j27VarB.c = new vrb(17, getCredentialRequest);
        j27VarB.b = 32701;
        gfh gfhVarB = a97Var.b(0, j27VarB.a());
        gfhVarB.getClass();
        r45 r45Var = new r45(7, new wg(cancellationSignal, z66Var, executor, callback, 15));
        dd7 dd7Var = hle.a;
        gfhVarB.e(dd7Var, r45Var);
        gfhVarB.d(dd7Var, new ai2(request, z66Var, callback, executor, cancellationSignal));
    }

    public void onPrepareCredential(e76 e76Var, CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var) {
        e76Var.getClass();
        executor.getClass();
        iy2Var.getClass();
    }

    public void onSignalCredentialState(lid request, Executor executor, iy2 callback) {
        throw null;
    }

    public final void setGoogleApiAvailability(ac6 ac6Var) {
        ac6Var.getClass();
        this.googleApiAvailability = ac6Var;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // defpackage.ly2
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(Context context, dta dtaVar, CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var) {
        context.getClass();
        throw null;
    }
}
