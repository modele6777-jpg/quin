package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xl extends Handler {
    public kj8 a;
    public final long b;
    public long c;
    public int d;
    public final /* synthetic */ yl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(yl ylVar, Looper looper) {
        hbc hbcVar;
        super(looper);
        this.e = ylVar;
        this.a = null;
        Context context = ((zl) ylVar.h).c;
        synchronized (hbc.w) {
            try {
                hbcVar = hbc.v;
                if (hbcVar == null) {
                    hbcVar = new hbc(context.getApplicationContext(), 1);
                    hbc.v = hbcVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ylVar.g = hbcVar;
        this.b = ((zl) ylVar.h).d.b;
    }

    public final int a(rl rlVar) throws JSONException {
        JSONObject jSONObjectC = c(rlVar);
        zl.d("Queuing event for sending later");
        zl.d("    " + jSONObjectC);
        return this.a.b(jSONObjectC, rlVar.a, jj8.EVENTS);
    }

    public final void b(rl rlVar) {
        try {
            JSONObject jSONObject = c(rlVar).getJSONObject("properties");
            String str = rlVar.c;
            ncd ncdVar = by8.a;
            str.getClass();
            by8.a.i(new ay8(str, jSONObject));
        } catch (JSONException e) {
            db6.G("MixpanelAPI.Messages", "Exception notifying event bridge listeners", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    public final JSONObject c(rl rlVar) throws JSONException {
        Boolean boolValueOf;
        String str;
        BluetoothAdapter defaultAdapter;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = rlVar.b;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("mp_lib", "android");
        jSONObject3.put("$lib_version", "8.9.0");
        jSONObject3.put("$os", "Android");
        String str2 = Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = "UNKNOWN";
        }
        jSONObject3.put("$os_version", str2);
        String str3 = Build.MANUFACTURER;
        if (str3 == null) {
            str3 = "UNKNOWN";
        }
        jSONObject3.put("$manufacturer", str3);
        String str4 = Build.BRAND;
        if (str4 == null) {
            str4 = "UNKNOWN";
        }
        jSONObject3.put("$brand", str4);
        String str5 = Build.MODEL;
        jSONObject3.put("$model", str5 != null ? str5 : "UNKNOWN");
        yl ylVar = this.e;
        DisplayMetrics displayMetrics = (DisplayMetrics) ((hbc) ylVar.g).d;
        jSONObject3.put("$screen_dpi", displayMetrics.densityDpi);
        jSONObject3.put("$screen_height", displayMetrics.heightPixels);
        jSONObject3.put("$screen_width", displayMetrics.widthPixels);
        String str6 = (String) ((hbc) ylVar.g).e;
        if (str6 != null) {
            jSONObject3.put("$app_version", str6);
            jSONObject3.put("$app_version_string", str6);
        }
        Integer num = (Integer) ((hbc) ylVar.g).f;
        if (num != null) {
            String strValueOf = String.valueOf(num);
            jSONObject3.put("$app_release", strValueOf);
            jSONObject3.put("$app_build_number", strValueOf);
        }
        Boolean bool = (Boolean) ((hbc) ylVar.g).b;
        bool.getClass();
        jSONObject3.put("$has_nfc", bool.booleanValue());
        Boolean bool2 = (Boolean) ((hbc) ylVar.g).c;
        bool2.getClass();
        jSONObject3.put("$has_telephone", bool2.booleanValue());
        TelephonyManager telephonyManager = (TelephonyManager) ((Context) ((hbc) ylVar.g).a).getSystemService("phone");
        Boolean boolValueOf2 = null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        if (networkOperatorName != null && !networkOperatorName.trim().isEmpty()) {
            jSONObject3.put("$carrier", networkOperatorName);
        }
        Context context = (Context) ((hbc) ylVar.g).a;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            jSONObject3.put("$wifi", boolValueOf.booleanValue());
        }
        Context context2 = (Context) ((hbc) ylVar.g).a;
        try {
            if (context2.getPackageManager().checkPermission("android.permission.BLUETOOTH", context2.getPackageName()) == 0 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                boolValueOf2 = Boolean.valueOf(defaultAdapter.isEnabled());
            }
        } catch (Exception unused) {
        }
        if (boolValueOf2 != null) {
            jSONObject3.put("$bluetooth_enabled", boolValueOf2);
        }
        Context context3 = (Context) ((hbc) ylVar.g).a;
        if (context3.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            str = "ble";
        } else {
            str = context3.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "classic" : "none";
        }
        jSONObject3.put("$bluetooth_version", str);
        jSONObject3.put("token", rlVar.a);
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject3.put(next, jSONObject2.get(next));
            }
        }
        zl.a(jSONObject3, rlVar.e);
        jSONObject.put("event", rlVar.c);
        jSONObject.put("properties", jSONObject3);
        jSONObject.put("$mp_metadata", rlVar.d);
        return jSONObject;
    }

    public final void d(kj8 kj8Var, String str) throws Throwable {
        boolean z;
        gk2 gk2VarB = ((zl) this.e.h).b();
        zl zlVar = (zl) this.e.h;
        Context context = zlVar.c;
        synchronized (zlVar.d) {
        }
        if (gk2VarB.b) {
            z = false;
        } else {
            z = true;
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    db6.f1("MixpanelAPI.Message", "A default network has not been set so we cannot be certain whether we are offline");
                } else {
                    boolean zIsConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
                    StringBuilder sb = new StringBuilder("ConnectivityManager says we ");
                    sb.append(zIsConnectedOrConnecting ? "are" : "are not");
                    sb.append(" online");
                    db6.f1("MixpanelAPI.Message", sb.toString());
                    z = zIsConnectedOrConnecting;
                }
            } catch (SecurityException unused) {
                db6.f1("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
            }
        }
        zl zlVar2 = (zl) this.e.h;
        if (!z) {
            zl.d("Not flushing data to Mixpanel because the device is not connected to the internet.");
            return;
        }
        e(kj8Var, str, jj8.EVENTS, zlVar2.d.i);
        e(kj8Var, str, jj8.PEOPLE, ((zl) this.e.h).d.j);
        e(kj8Var, str, jj8.GROUPS, ((zl) this.e.h).d.k);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0147 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.kj8 r24, java.lang.String r25, defpackage.jj8 r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl.e(kj8, java.lang.String, jj8, java.lang.String):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        int iF;
        String str;
        kj8 kj8Var;
        if (this.a == null) {
            zl zlVar = (zl) this.e.h;
            Context context = zlVar.c;
            gj8 gj8Var = zlVar.d;
            HashMap map = kj8.b;
            synchronized (map) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    gj8Var.getClass();
                    if (map.containsKey(null)) {
                        kj8Var = (kj8) map.get(null);
                    } else {
                        kj8Var = new kj8(applicationContext, gj8Var);
                        map.put(null, kj8Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a = kj8Var;
            kj8Var.d(System.currentTimeMillis() - ((zl) this.e.h).d.d, jj8.EVENTS);
            this.a.d(System.currentTimeMillis() - ((zl) this.e.h).d.d, jj8.PEOPLE);
        }
        try {
            int i = message.what;
            try {
                if (i != 0) {
                    if (i == 3) {
                        if (message.obj != null) {
                            throw new ClassCastException();
                        }
                        zl.d("Queuing group record for sending later");
                        throw null;
                    }
                    int iA = -3;
                    if (i != 1) {
                        if (i == 4) {
                            wl wlVar = (wl) message.obj;
                            String str2 = wlVar.b;
                            str = wlVar.a;
                            iF = this.a.f(str, str2);
                        } else if (i == 7) {
                            str = ((tl) message.obj).a;
                            this.a.c(jj8.ANONYMOUS_PEOPLE, str);
                        } else {
                            if (i == 8) {
                                if (message.obj != null) {
                                    throw new ClassCastException();
                                }
                                throw null;
                            }
                            if (i == 2) {
                                zl.d("Flushing queue due to scheduled or forced flush");
                                this.e.b();
                                str = (String) message.obj;
                                d(this.a, str);
                            } else if (i == 6) {
                                str = ((tl) message.obj).a;
                                this.a.c(jj8.EVENTS, str);
                                this.a.c(jj8.PEOPLE, str);
                                this.a.c(jj8.GROUPS, str);
                                this.a.c(jj8.ANONYMOUS_PEOPLE, str);
                            } else {
                                if (i == 5) {
                                    db6.h1("MixpanelAPI.Messages", "Worker received a hard kill. Dumping all events and force-killing. Thread id " + Thread.currentThread().getId());
                                    synchronized (this.e.e) {
                                        this.a.a.b();
                                        this.e.f = null;
                                        Looper.myLooper().quit();
                                    }
                                } else if (i == 9) {
                                    bzd.H((File) message.obj);
                                } else if (i == 10) {
                                    sl slVar = (sl) message.obj;
                                    rl rlVar = slVar.b;
                                    String str3 = slVar.a;
                                    p9a p9aVar = slVar.c;
                                    if (p9aVar.b(str3, !this.a.a.b)) {
                                        try {
                                            iA = a(rlVar);
                                            r45 r45Var = slVar.d;
                                            String str4 = rlVar.c;
                                            JSONObject jSONObject = rlVar.b;
                                            fb5 fb5Var = (fb5) r45Var.b;
                                            try {
                                                fb5Var.e.post(new c0(fb5Var, str4, jSONObject, 19));
                                                b(rlVar);
                                            } catch (JSONException e) {
                                                e = e;
                                                db6.G("MixpanelAPI.Messages", "Exception tracking event " + rlVar.c, e);
                                            }
                                        } catch (JSONException e2) {
                                            e = e2;
                                        }
                                        p9aVar.i(str3);
                                    }
                                    iF = iA;
                                    str = str3;
                                } else {
                                    db6.F("MixpanelAPI.Messages", "Unexpected message received by Mixpanel worker: " + message);
                                    iF = -3;
                                    str = null;
                                }
                                iF = -3;
                                str = null;
                            }
                        }
                        if ((iF < ((zl) this.e.h).d.a || iF == -2) && this.d <= 0 && str != null) {
                            zl.d("Flushing queue due to bulk upload limit (" + iF + ") for project " + str);
                            this.e.b();
                            d(this.a, str);
                            return;
                        }
                        if (iF > 0 || hasMessages(2, str)) {
                        }
                        zl.d("Queue depth " + iF + " - Adding flush in " + this.b);
                        if (this.b >= 0) {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 2;
                            messageObtain.obj = str;
                            messageObtain.arg1 = 1;
                            sendMessageDelayed(messageObtain, this.b);
                            return;
                        }
                        return;
                    }
                    rl rlVar2 = (rl) message.obj;
                    try {
                        str = rlVar2.a;
                        try {
                            iA = a(rlVar2);
                            b(rlVar2);
                        } catch (JSONException e3) {
                            e = e3;
                            db6.G("MixpanelAPI.Messages", "Exception tracking event " + rlVar2.c, e);
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        str = null;
                    }
                    iF = iA;
                    db6.G("MixpanelAPI.Messages", "Worker threw an unhandled exception", e);
                    synchronized (this.e.e) {
                        this.e.f = null;
                        try {
                            Looper.myLooper().quit();
                            db6.G("MixpanelAPI.Messages", "Mixpanel will not process any more analytics messages", e);
                        } catch (Exception e5) {
                            db6.G("MixpanelAPI.Messages", "Could not halt looper", e5);
                        }
                    }
                    return;
                }
                vl vlVar = (vl) message.obj;
                jj8 jj8Var = !vlVar.b.has("$distinct_id") ? jj8.ANONYMOUS_PEOPLE : jj8.PEOPLE;
                zl.d("Queuing people record for sending later");
                zl.d("    " + vlVar.b.toString());
                str = vlVar.a;
                iF = this.a.b(vlVar.b, str, jj8Var);
                if (!vlVar.b.has("$distinct_id")) {
                    iF = 0;
                }
                if (iF < ((zl) this.e.h).d.a) {
                    zl.d("Flushing queue due to bulk upload limit (" + iF + ") for project " + str);
                    this.e.b();
                    d(this.a, str);
                    return;
                }
                zl.d("Flushing queue due to bulk upload limit (" + iF + ") for project " + str);
                this.e.b();
                d(this.a, str);
                return;
                if (iF > 0) {
                }
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (RuntimeException e7) {
            e = e7;
        }
    }
}
