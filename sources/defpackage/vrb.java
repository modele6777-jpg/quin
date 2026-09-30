package defpackage;

import android.R;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class vrb implements nw2, cvd, s36, c00, z0g, cfg, ypb, ong, ye {
    public final /* synthetic */ int a;
    public Object b;

    public vrb(Context context) {
        boolean zIsEmpty;
        this.a = 5;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        return new yfg((Context) ((ysd) ((oid) this.b).b).b);
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                zig zigVar = (zig) this.b;
                yig yigVar = new yig((gle) obj2);
                qjg qjgVar = (qjg) ((ajg) obj).l();
                String str = zigVar.l;
                Parcel parcelF = qjgVar.f();
                int i = ejg.a;
                parcelF.writeStrongBinder(yigVar);
                parcelF.writeString(str);
                qjgVar.G(parcelF, 2);
                return;
            case 17:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                z87 z87Var = new z87((gle) obj2);
                ot6 ot6Var = (ot6) ((tu6) obj).l();
                c70 c70Var = new c70(new ib2(-1, -1, 0, true), false);
                c70Var.c = false;
                mt6 mt6Var = (mt6) ot6Var;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = jtg.a;
                parcelObtain.writeStrongBinder(z87Var);
                jtg.b(parcelObtain, getCredentialRequest);
                jtg.b(parcelObtain, c70Var);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    mt6Var.d.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            default:
                int i3 = w6h.l;
                i6h i6hVar = new i6h((gle) obj2);
                d7h d7hVar = (d7h) ((g7h) obj).l();
                byte[] bArrA = ((h9h) this.b).a();
                Parcel parcelJ = d7hVar.J();
                lsg.c(parcelJ, i6hVar);
                parcelJ.writeByteArray(bArrA);
                d7hVar.K(parcelJ, 31);
                return;
        }
    }

    @Override // defpackage.cvd
    public Iterator b(j27 j27Var, CharSequence charSequence) {
        return new avd(this, j27Var, charSequence, 0);
    }

    @Override // defpackage.nw2
    public Object c(mw2 mw2Var) {
        return ((a26) this.b).d(mw2Var);
    }

    @Override // defpackage.z0g
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) g21.y(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // defpackage.z0g
    public String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // defpackage.ong
    public boolean e(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ong[]) this.b)[i].e(cls)) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public FutureTask g(Context context, String str, mjg mjgVar) {
        FutureTask futureTask = new FutureTask(new vcd(context, str, mjgVar, 0));
        ((ExecutorService) this.b).execute(futureTask);
        return futureTask;
    }

    @Override // defpackage.c00
    public mj5 get(int i) {
        return (mj5) this.b;
    }

    @Override // defpackage.z0g
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) g21.y(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    public void h() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new m45(22, viewFindViewById));
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        xe xeVar = (xe) obj;
        Intent intent = xeVar.b;
        int i = xeVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zsg.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", z5h.ERROR_IN_ACTIVITY_RESULT.a());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = zsg.e(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.S0;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            zsg.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            zsg.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    public void k() {
        ebh ebhVar = (ebh) this.b;
        ebhVar.A0();
        w3h w3hVar = (w3h) ebhVar.b;
        c2h c2hVar = w3hVar.e;
        w3h.f(c2hVar);
        w3hVar.y.getClass();
        if (c2hVar.J0(System.currentTimeMillis())) {
            c2h c2hVar2 = w3hVar.e;
            w3h.f(c2hVar2);
            c2hVar2.X.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.Z.a("Detected application was in foreground");
                n(System.currentTimeMillis(), w3hVar.d.L0(null, bzg.e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    @Override // defpackage.ong
    public xng l(Class cls) {
        for (int i = 0; i < 2; i++) {
            ong ongVar = ((ong[]) this.b)[i];
            if (ongVar.e(cls)) {
                return ongVar.l(cls);
            }
        }
        s8f.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public void m(long j, long j2) {
        ebh ebhVar = (ebh) this.b;
        ebhVar.A0();
        ebhVar.E0();
        w3h w3hVar = (w3h) ebhVar.b;
        c2h c2hVar = w3hVar.e;
        w3h.f(c2hVar);
        if (c2hVar.J0(j)) {
            w3h.f(c2hVar);
            c2hVar.X.b(true);
            w3hVar.l().F0();
        }
        w3h.f(c2hVar);
        c2hVar.F0.b(j);
        if (c2hVar.X.a()) {
            n(j, j2);
        }
    }

    public void n(long j, long j2) {
        ebh ebhVar = (ebh) this.b;
        ebhVar.A0();
        w3h w3hVar = (w3h) ebhVar.b;
        if (w3hVar.a()) {
            c2h c2hVar = w3hVar.e;
            w3h.f(c2hVar);
            c2hVar.F0.b(j);
            w3hVar.y.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            c8h c8hVar = w3hVar.X;
            w3h.g(c8hVar);
            c8hVar.L0(j, lValueOf, "auto", "_sid");
            w3h.f(c2hVar);
            c2hVar.G0.b(j3);
            c2hVar.X.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            w3h.g(c8hVar);
            c8hVar.I0(j, j2, bundle, "auto", "_s");
            String strC = c2hVar.L0.C();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strC);
            w3h.g(c8hVar);
            c8hVar.I0(j, j2, bundle2, "auto", "_ssr");
        }
    }

    @Override // defpackage.s36
    public void a(Object obj) {
        ((dae) this.b).run();
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
    }

    public vrb(kv kvVar, a98 a98Var) {
        this.a = 12;
        this.b = kvVar;
    }

    public vrb(AppMeasurementSdk appMeasurementSdk, kl klVar) {
        this.a = 16;
        this.b = klVar;
        appMeasurementSdk.a(new uvg(1, this));
    }

    public vrb(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = Executors.newSingleThreadExecutor();
                break;
            case 8:
                break;
            default:
                this.b = new LinkedHashSet();
                break;
        }
    }

    public /* synthetic */ vrb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public vrb(jeg jegVar) {
        this.a = 7;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), jegVar);
    }
}
