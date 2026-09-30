package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.adjust.sdk.sig.r3;
import io.sentry.android.core.b1;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qch extends g5h {
    public static final String[] x = {"firebase_", "google_", "ga_"};
    public static final String[] y = {"_err"};
    public SecureRandom d;
    public final AtomicLong e;
    public int f;
    public io8 g;
    public Boolean v;
    public Integer w;

    public qch(w3h w3hVar) {
        super(w3hVar);
        this.w = null;
        this.e = new AtomicLong(0L);
    }

    public static boolean B1(String str) {
        oa7.x(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean D1(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String H0(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    public static boolean N1(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void S0(pch pchVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        Z0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        pchVar.c(str, "_err", bundle);
    }

    public static MessageDigest T0() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long U0(byte[] bArr) {
        oa7.A(bArr);
        int length = bArr.length;
        long j = 0;
        if (length <= 0) {
            r3.l();
            return 0L;
        }
        int i = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean V0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static int X0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean Z0(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean c1(String str, String[] strArr) {
        oa7.A(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean f1(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] k1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList v1(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wog wogVar = (wog) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", wogVar.a);
            bundle.putString("origin", wogVar.b);
            bundle.putLong("creation_timestamp", wogVar.d);
            bundle.putString("name", wogVar.c.b);
            Object objC = wogVar.c.c();
            oa7.A(objC);
            afc.u(bundle, objC);
            bundle.putBoolean(UsageBillingBalance.STATUS_ACTIVE, wogVar.e);
            String str = wogVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            hsg hsgVar = wogVar.g;
            if (hsgVar != null) {
                bundle.putString("timed_out_event_name", hsgVar.a);
                esg esgVar = hsgVar.b;
                if (esgVar != null) {
                    bundle.putBundle("timed_out_event_params", esgVar.f());
                }
            }
            bundle.putLong("trigger_timeout", wogVar.v);
            hsg hsgVar2 = wogVar.w;
            if (hsgVar2 != null) {
                bundle.putString("triggered_event_name", hsgVar2.a);
                esg esgVar2 = hsgVar2.b;
                if (esgVar2 != null) {
                    bundle.putBundle("triggered_event_params", esgVar2.f());
                }
            }
            bundle.putLong("triggered_timestamp", wogVar.c.c);
            bundle.putLong("time_to_live", wogVar.x);
            hsg hsgVar3 = wogVar.y;
            if (hsgVar3 != null) {
                bundle.putString("expired_event_name", hsgVar3.a);
                esg esgVar3 = hsgVar3.b;
                if (esgVar3 != null) {
                    bundle.putBundle("expired_event_params", esgVar3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean w1(Context context) {
        ActivityInfo receiverInfo;
        oa7.A(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void x1(t8h t8hVar, Bundle bundle, boolean z) {
        if (bundle != null && t8hVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = t8hVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = t8hVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", t8hVar.c);
                return;
            }
            z = false;
        }
        if (bundle != null && t8hVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final SecureRandom A1() {
        A0();
        SecureRandom secureRandom = this.d;
        if (secureRandom != null) {
            return secureRandom;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        this.d = secureRandom2;
        return secureRandom2;
    }

    @Override // defpackage.g5h
    public final boolean B0() {
        return true;
    }

    public final Bundle C1(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        w3h w3hVar = (w3h) this.b;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString(Constants.MEDIUM, queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (w3hVar.d.L0(null, bzg.a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        w3hVar.d.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = H0(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.x.b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean E0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        w0h w0hVar = ((w3h) this.b).f;
        w3h.h(w0hVar);
        w0hVar.z.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    public final boolean E1(String str, String str2) {
        w3h w3hVar = (w3h) this.b;
        if (str2 == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.w.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.w.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            w0h w0hVar3 = w3hVar.f;
            w3h.h(w0hVar3);
            w0hVar3.w.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                w0h w0hVar4 = w3hVar.f;
                w3h.h(w0hVar4);
                w0hVar4.w.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void F0(String str, String str2, Bundle bundle, List list, boolean z) {
        int iL1;
        int iI0;
        list = list;
        w3h w3hVar = (w3h) this.b;
        qqg qqgVar = w3hVar.d;
        w0h w0hVar = w3hVar.f;
        i0h i0hVar = w3hVar.x;
        qch qchVar = ((w3h) qqgVar.b).w;
        w3h.f(qchVar);
        int i = true != qchVar.l1(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iL1 = !z ? L1(str3) : 0;
                if (iL1 == 0) {
                    iL1 = M1(str3);
                }
            } else {
                iL1 = 0;
            }
            if (iL1 != 0) {
                O0(bundle, iL1, str3, iL1 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (N1(bundle.get(str3))) {
                    w3h.h(w0hVar);
                    w0hVar.z.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iI0 = 22;
                } else {
                    iI0 = I0(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iI0 != 0 && !"_ev".equals(str3)) {
                    O0(bundle, iI0, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (B1(str3) && !c1(str3, ym8.k)) {
                    i2++;
                    if (!l1(231100000)) {
                        w3h.h(w0hVar);
                        w0hVar.w.c(i0hVar.a(str), i0hVar.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        Z0(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            w3h.h(w0hVar);
                            tz0 tz0Var = w0hVar.w;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            tz0Var.c(i0hVar.a(str), i0hVar.e(bundle), sb.toString());
                        }
                        Z0(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    public final boolean F1(String str, String str2) {
        w3h w3hVar = (w3h) this.b;
        if (str2 == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.w.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.w.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                w0h w0hVar3 = w3hVar.f;
                w3h.h(w0hVar3);
                w0hVar3.w.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                w0h w0hVar4 = w3hVar.f;
                w3h.h(w0hVar4);
                w0hVar4.w.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean G0(String str) {
        w3h w3hVar = (w3h) this.b;
        if (TextUtils.isEmpty(str)) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.w.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        oa7.A(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        w0h w0hVar2 = w3hVar.f;
        w3h.h(w0hVar2);
        w0hVar2.w.b(w0h.E0(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean G1(String str, String[] strArr, String[] strArr2, String str2) {
        w3h w3hVar = (w3h) this.b;
        if (str2 == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.w.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(x[i])) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.w.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !c1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && c1(str2, strArr2)) {
            return true;
        }
        w0h w0hVar3 = w3hVar.f;
        w3h.h(w0hVar3);
        w0hVar3.w.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean H1(int i, String str, String str2) {
        w3h w3hVar = (w3h) this.b;
        if (str2 == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.w.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        w0h w0hVar2 = w3hVar.f;
        w3h.h(w0hVar2);
        w0hVar2.w.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int I0(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        w3h w3hVar = (w3h) this.b;
        A0();
        int i2 = 0;
        if (!N1(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!c1(str2, ym8.j)) {
                return 20;
            }
            lah lahVarJ = w3hVar.j();
            lahVarJ.A0();
            lahVarJ.B0();
            if (lahVarJ.H0()) {
                qch qchVar = ((w3h) lahVarJ.b).w;
                w3h.f(qchVar);
                if (qchVar.m1() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.z.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (f1(str) || f1(str2)) {
            w3hVar.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            w3hVar.d.getClass();
        }
        if (!E0("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                F0(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.z.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    F0(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        w0h w0hVar3 = w3hVar.f;
                        w3h.h(w0hVar3);
                        w0hVar3.z.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    F0(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    public final int I1(String str) {
        if (!F1("event", str)) {
            return 2;
        }
        if (G1("event", ok8.t, ((w3h) this.b).d.L0(null, bzg.f1) ? ok8.v : ok8.u, str)) {
            return !H1(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final Object J0(Object obj, String str) {
        w3h w3hVar = (w3h) this.b;
        int iMax = 500;
        if ("_ev".equals(str)) {
            w3hVar.d.getClass();
            return a1(Math.max(500, 256), obj, true, true);
        }
        if (f1(str)) {
            w3hVar.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            w3hVar.d.getClass();
        }
        return a1(iMax, obj, false, true);
    }

    public final boolean J1(String str) {
        return ((w3h) this.b).d.L0(null, bzg.f1) ? c1(str, ok8.x) : c1(str, ok8.w);
    }

    public final Bundle K0(String str, Bundle bundle, List list, boolean z) {
        int iL1;
        boolean zC1 = c1(str, ok8.z);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        w3h w3hVar = (w3h) this.b;
        qqg qqgVar = w3hVar.d;
        i0h i0hVar = w3hVar.x;
        qch qchVar = ((w3h) qqgVar.b).w;
        w3h.f(qchVar);
        int i = qchVar.l1(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iL1 = !z ? L1(str2) : 0;
                if (iL1 == 0) {
                    iL1 = M1(str2);
                }
            } else {
                iL1 = 0;
            }
            if (iL1 != 0) {
                O0(bundle2, iL1, str2, iL1 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iI0 = I0(str, str2, bundle.get(str2), bundle2, list, z, zC1);
                if (iI0 == 17) {
                    O0(bundle2, 17, str2, Boolean.FALSE);
                } else if (iI0 != 0 && !"_ev".equals(str2)) {
                    O0(bundle2, iI0, iI0 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (B1(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.w.c(i0hVar.a(str), i0hVar.e(bundle), string);
                        }
                        Z0(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int K1(String str) {
        if (!F1("user property", str)) {
            return 6;
        }
        if (!G1("user property", if9.q, null, str)) {
            return 15;
        }
        qqg qqgVar = ((w3h) this.b).d;
        return !H1(24, "user property", str) ? 6 : 0;
    }

    public final void L0(z0h z0hVar, int i) {
        Bundle bundle = z0hVar.e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (B1(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    w3h w3hVar = (w3h) this.b;
                    w0h w0hVar = w3hVar.f;
                    i0h i0hVar = w3hVar.x;
                    w3h.h(w0hVar);
                    w0hVar.w.c(i0hVar.a(z0hVar.a), i0hVar.e(bundle), string);
                    Z0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int L1(String str) {
        if (!E1("event param", str)) {
            return 3;
        }
        if (!G1("event param", null, null, str)) {
            return 14;
        }
        qqg qqgVar = ((w3h) this.b).d;
        return !H1(40, "event param", str) ? 3 : 0;
    }

    public final void M0(Parcelable[] parcelableArr, int i) {
        oa7.A(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (B1(str) && !c1(str, ym8.k) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        w3h w3hVar = (w3h) this.b;
                        w0h w0hVar = w3hVar.f;
                        i0h i0hVar = w3hVar.x;
                        w3h.h(w0hVar);
                        tz0 tz0Var = w0hVar.w;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        tz0Var.c(i0hVar.b(str), i0hVar.e(bundle), sb.toString());
                    }
                    Z0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final int M1(String str) {
        if (!F1("event param", str)) {
            return 3;
        }
        if (!G1("event param", null, null, str)) {
            return 14;
        }
        qqg qqgVar = ((w3h) this.b).d;
        return !H1(40, "event param", str) ? 3 : 0;
    }

    public final void N0(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                qch qchVar = ((w3h) this.b).w;
                w3h.f(qchVar);
                qchVar.R0(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void O0(Bundle bundle, int i, String str, Object obj) {
        if (Z0(i, bundle)) {
            qqg qqgVar = ((w3h) this.b).d;
            bundle.putString("_ev", H0(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int P0(Object obj, String str) {
        return "_ldl".equals(str) ? E0("user property referrer", str, b1(str), obj) : E0("user property", str, b1(str), obj) ? 0 : 7;
    }

    public final Object Q0(Object obj, String str) {
        return "_ldl".equals(str) ? a1(b1(str), obj, true, false) : a1(b1(str), obj, false, false);
    }

    public final void R0(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            w3h w3hVar = (w3h) this.b;
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.z.c(w3hVar.x.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final io8 W0() {
        y7h eo8Var;
        Object objD;
        io8 io8Var = this.g;
        if (io8Var != null) {
            return io8Var;
        }
        Context context = ((w3h) this.b).a;
        context.getClass();
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        sf sfVar = sf.a;
        sb.append(i >= 33 ? sfVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        if ((i >= 33 ? sfVar.a() : 0) >= 5) {
            eo8Var = new eo8(context, 1);
        } else {
            rf rfVar = rf.a;
            if (((i == 31 || i == 32) ? rfVar.a() : 0) >= 9) {
                try {
                    objD = new do8(context).d(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i2 = Build.VERSION.SDK_INT;
                    sb2.append((i2 == 31 || i2 == 32) ? rfVar.a() : 0);
                    Log.d("MeasurementManager", sb2.toString());
                    objD = null;
                }
                eo8Var = (y7h) objD;
            } else {
                eo8Var = null;
            }
        }
        io8 io8Var2 = eo8Var != null ? new io8(eo8Var) : null;
        this.g = io8Var2;
        return io8Var2;
    }

    public final long Y0() {
        long j;
        boolean zBooleanValue;
        Integer num;
        Object e;
        A0();
        w3h w3hVar = (w3h) this.b;
        xzg xzgVarL = w3hVar.l();
        w0h w0hVar = w3hVar.f;
        if (!d1((String) bzg.q0.a(null), xzgVarL.G0())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = X0() < ((Integer) bzg.k0.a(null)).intValue() ? 16L : 0L;
        }
        if (!e1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.v == null) {
                io8 io8VarW0 = W0();
                zBooleanValue = false;
                if (io8VarW0 != null) {
                    try {
                        num = (Integer) io8VarW0.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                w3h.h(w0hVar);
                                w0hVar.x.b(e, "Measurement manager api exception");
                                this.v = Boolean.FALSE;
                            } catch (CancellationException e3) {
                                e = e3;
                                w3h.h(w0hVar);
                                w0hVar.x.b(e, "Measurement manager api exception");
                                this.v = Boolean.FALSE;
                            } catch (ExecutionException e4) {
                                e = e4;
                                w3h.h(w0hVar);
                                w0hVar.x.b(e, "Measurement manager api exception");
                                this.v = Boolean.FALSE;
                            } catch (TimeoutException e5) {
                                e = e5;
                                w3h.h(w0hVar);
                                w0hVar.x.b(e, "Measurement manager api exception");
                                this.v = Boolean.FALSE;
                            }
                        }
                        this.v = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        num = null;
                        e = e6;
                    }
                    w3h.h(w0hVar);
                    w0hVar.Z.b(num, "Measurement manager api status result");
                    zBooleanValue = this.v.booleanValue();
                }
            } else {
                zBooleanValue = this.v.booleanValue();
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final Object a1(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return H0(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleH1 = h1((Bundle) parcelable);
                if (!bundleH1.isEmpty()) {
                    arrayList.add(bundleH1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int b1(String str) {
        w3h w3hVar = (w3h) this.b;
        if ("_ldl".equals(str)) {
            qqg qqgVar = w3hVar.d;
            return 2048;
        }
        if ("_id".equals(str)) {
            qqg qqgVar2 = w3hVar.d;
            return 256;
        }
        if ("_lgclid".equals(str)) {
            qqg qqgVar3 = w3hVar.d;
            return 100;
        }
        qqg qqgVar4 = w3hVar.d;
        return 36;
    }

    public final boolean e1(String str) {
        A0();
        w3h w3hVar = (w3h) this.b;
        if (rcg.a(w3hVar.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Y.b(str, "Permission not granted");
        return false;
    }

    public final boolean g1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((w3h) this.b).d.E0("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle h1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objJ0 = J0(bundle.get(str), str);
                if (objJ0 == null) {
                    w3h w3hVar = (w3h) this.b;
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.z.b(w3hVar.x.b(str), "Param value can't be null");
                } else {
                    R0(bundle2, str, objJ0);
                }
            }
        }
        return bundle2;
    }

    public final hsg i1(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (I1(str) != 0) {
            w3h w3hVar = (w3h) this.b;
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.b(w3hVar.x.c(str), "Invalid conditional property event name");
            cva.s();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleK0 = K0(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleK0 = h1(bundleK0);
        }
        oa7.A(bundleK0);
        return new hsg(str, new esg(bundleK0), str2, j, j2);
    }

    public final boolean j1(Context context, String str) {
        Signature[] signatureArr;
        w3h w3hVar = (w3h) this.b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = rcg.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean l1(int i) {
        Boolean bool = ((w3h) this.b).j().f;
        if (m1() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int m1() {
        Integer numValueOf = this.w;
        if (numValueOf == null) {
            w3h w3hVar = (w3h) this.b;
            bc6 bc6Var = bc6.b;
            Context context = w3hVar.a;
            bc6Var.getClass();
            int i = sc6.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                b1.l("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            numValueOf = Integer.valueOf(i2 / 1000);
            this.w = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final void n1(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void o1(String str, tug tugVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning string value to wrapper");
        }
    }

    public final void p1(tug tugVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning long value to wrapper");
        }
    }

    public final void q1(tug tugVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning int value to wrapper");
        }
    }

    public final void r1(tug tugVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void s1(tug tugVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void t1(tug tugVar, Bundle bundle) {
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void u1(tug tugVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String y1() {
        byte[] bArr = new byte[16];
        A1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long z1() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.e;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((w3h) this.b).y.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f + 1;
            this.f = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }
}
