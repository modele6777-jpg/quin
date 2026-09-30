package defpackage;

import ai.askquin.App;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import io.sentry.android.core.b1;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ya5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public ya5() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    public void i(iwg iwgVar, Bundle bundle) {
        Uri uri;
        w3h w3hVar = (w3h) ((c8h) this.b).b;
        try {
            try {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.Z.a("onActivityCreated");
                Intent intent = iwgVar.c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        w3h.f(w3hVar.w);
                        String str = qch.D1(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                        boolean z = bundle == null;
                        m3h m3hVar = w3hVar.g;
                        w3h.h(m3hVar);
                        m3hVar.J0(new m6h(this, z, uri, str, queryParameter));
                    }
                }
            } catch (RuntimeException e) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.b(e, "Throwable caught in onActivityCreated");
            }
        } finally {
            b9h b9hVar = w3hVar.z;
            w3h.g(b9hVar);
            b9hVar.H0(iwgVar, bundle);
        }
    }

    public void j(iwg iwgVar) {
        b9h b9hVar = ((w3h) ((c8h) this.b).b).z;
        w3h.g(b9hVar);
        synchronized (b9hVar.X) {
            try {
                if (Objects.equals(b9hVar.v, iwgVar)) {
                    b9hVar.v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((w3h) b9hVar.b).d.P0()) {
            b9hVar.g.remove(Integer.valueOf(iwgVar.a));
        }
    }

    public void k(iwg iwgVar) {
        w3h w3hVar = (w3h) ((c8h) this.b).b;
        b9h b9hVar = w3hVar.z;
        w3h.g(b9hVar);
        synchronized (b9hVar.X) {
            b9hVar.z = false;
            b9hVar.w = true;
        }
        w3h w3hVar2 = (w3h) b9hVar.b;
        w3hVar2.y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (w3hVar2.d.P0()) {
            t8h t8hVarK0 = b9hVar.K0(iwgVar);
            b9hVar.e = b9hVar.d;
            b9hVar.d = null;
            m3h m3hVar = w3hVar2.g;
            w3h.h(m3hVar);
            m3hVar.J0(new pkd(b9hVar, t8hVarK0, jElapsedRealtime));
        } else {
            b9hVar.d = null;
            m3h m3hVar2 = w3hVar2.g;
            w3h.h(m3hVar2);
            m3hVar2.J0(new btg(b9hVar, jElapsedRealtime));
        }
        ebh ebhVar = w3hVar.v;
        w3h.g(ebhVar);
        w3h w3hVar3 = (w3h) ebhVar.b;
        w3hVar3.y.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        m3h m3hVar3 = w3hVar3.g;
        w3h.h(m3hVar3);
        m3hVar3.J0(new tah(ebhVar, jElapsedRealtime2, 1));
    }

    public void l(iwg iwgVar) {
        w3h w3hVar = (w3h) ((c8h) this.b).b;
        ebh ebhVar = w3hVar.v;
        w3h.g(ebhVar);
        w3h w3hVar2 = (w3h) ebhVar.b;
        w3hVar2.y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m3h m3hVar = w3hVar2.g;
        w3h.h(m3hVar);
        m3hVar.J0(new tah(ebhVar, jElapsedRealtime, 0));
        b9h b9hVar = w3hVar.z;
        w3h.g(b9hVar);
        Object obj = b9hVar.X;
        synchronized (obj) {
            try {
                b9hVar.z = true;
                if (!Objects.equals(iwgVar, b9hVar.v)) {
                    synchronized (obj) {
                        b9hVar.v = iwgVar;
                        b9hVar.w = false;
                        w3h w3hVar3 = (w3h) b9hVar.b;
                        if (w3hVar3.d.P0()) {
                            b9hVar.x = null;
                            m3h m3hVar2 = w3hVar3.g;
                            w3h.h(m3hVar2);
                            m3hVar2.J0(new w8h(b9hVar, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w3h w3hVar4 = (w3h) b9hVar.b;
        if (!w3hVar4.d.P0()) {
            b9hVar.d = b9hVar.x;
            m3h m3hVar3 = w3hVar4.g;
            w3h.h(m3hVar3);
            m3hVar3.J0(new w8h(b9hVar, 0));
            return;
        }
        b9hVar.I0(iwgVar.b, b9hVar.K0(iwgVar), false);
        bwg bwgVar = ((w3h) b9hVar.b).Y;
        w3h.e(bwgVar);
        w3h w3hVar5 = (w3h) bwgVar.b;
        w3hVar5.y.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        m3h m3hVar4 = w3hVar5.g;
        w3h.h(m3hVar4);
        m3hVar4.J0(new btg(bwgVar, jElapsedRealtime2));
    }

    public void m(iwg iwgVar, Bundle bundle) {
        t8h t8hVar;
        b9h b9hVar = ((w3h) ((c8h) this.b).b).z;
        w3h.g(b9hVar);
        if (!((w3h) b9hVar.b).d.P0() || bundle == null || (t8hVar = (t8h) b9hVar.g.get(Integer.valueOf(iwgVar.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", t8hVar.c);
        bundle2.putString("name", t8hVar.a);
        bundle2.putString("referrer_name", t8hVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) obj;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e) {
                        b1.n("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                ml mlVar = (ml) ff5.d().b(ml.class);
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                }
                                if (mlVar != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    nl nlVar = (nl) mlVar;
                                    if (etg.a("fcm") && etg.c("fcm", "_ln")) {
                                        vxg vxgVar = nlVar.a.a;
                                        vxgVar.c(new owg(vxgVar, "fcm", "_ln", (Object) string2, true));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString(Constants.MEDIUM, "notification");
                                    bundle3.putString("campaign", string2);
                                    nlVar.a("fcm", "_cmp", bundle3);
                                } else {
                                    b1.l("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        y41.C("_no", bundle2);
                    }
                    break;
                }
                break;
            case 1:
                activity.getClass();
                if (!qd0.I0(new String[]{"ai.askquin.MainActivity", "ai.askquin.ui.onboard.OnboardingActivity", "ai.askquin.ui.conversation.ConversationActivity"}).contains(activity.getClass().getName())) {
                    dsc.a.a = true;
                }
                ((App) obj).unregisterActivityLifecycleCallbacks(this);
                break;
            case 2:
                ((vxg) obj).c(new axg(this, bundle, activity));
                break;
            default:
                i(iwg.c(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                break;
            case 2:
                ((vxg) this.b).c(new qxg(this, activity, 4));
                break;
            default:
                j(iwg.c(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                break;
            case 2:
                ((vxg) this.b).c(new qxg(this, activity, 2));
                break;
            default:
                k(iwg.c(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                break;
            case 2:
                ((vxg) this.b).c(new qxg(this, activity, 1));
                break;
            default:
                l(iwg.c(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                bundle.getClass();
                break;
            case 2:
                fug fugVar = new fug();
                ((vxg) this.b).c(new axg(this, activity, fugVar));
                Bundle bundleE = fugVar.e(50L);
                if (bundleE != null) {
                    bundle.putAll(bundleE);
                }
                break;
            default:
                m(iwg.c(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                activity.getClass();
                break;
            case 2:
                ((vxg) this.b).c(new qxg(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                activity.getClass();
                break;
            case 2:
                ((vxg) this.b).c(new qxg(this, activity, 3));
                break;
        }
    }

    public /* synthetic */ ya5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
