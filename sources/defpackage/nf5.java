package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nf5 implements of5 {
    public static final Object l = new Object();
    public final ff5 a;
    public final lf5 b;
    public final w84 c;
    public final wqf d;
    public final mw7 e;
    public final Object f;
    public final ExecutorService g;
    public final kyc h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public nf5(ff5 ff5Var, i1b i1bVar, ExecutorService executorService, kyc kycVar) {
        ff5Var.a();
        lf5 lf5Var = new lf5(ff5Var.a, i1bVar);
        w84 w84Var = new w84(ff5Var);
        w1e w1eVar = w1e.b;
        if (w1eVar == null) {
            w1eVar = new w1e(3);
            w1e.b = w1eVar;
        }
        wqf wqfVar = wqf.b;
        if (wqfVar == null) {
            wqfVar = new wqf(w1eVar);
            wqf.b = wqfVar;
        }
        mw7 mw7Var = new mw7(new ac2(2, ff5Var));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = ff5Var;
        this.b = lf5Var;
        this.c = w84Var;
        this.d = wqfVar;
        this.e = mw7Var;
        this.g = executorService;
        this.h = kycVar;
    }

    public final void a() {
        vp0 vp0VarD1;
        int i;
        synchronized (l) {
            try {
                ff5 ff5Var = this.a;
                ff5Var.a();
                k47 k47VarR = k47.r(ff5Var.a);
                try {
                    vp0VarD1 = this.c.d1();
                    int i2 = vp0VarD1.b;
                    i = 2;
                    boolean z = true;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                    }
                    if (z) {
                        String strF = f(vp0VarD1);
                        w84 w84Var = this.c;
                        up0 up0VarA = vp0VarD1.a();
                        up0VarA.a = strF;
                        up0VarA.b = 3;
                        vp0VarD1 = up0VarA.a();
                        w84Var.Z0(vp0VarD1);
                    }
                    if (k47VarR != null) {
                        k47VarR.I();
                    }
                } catch (Throwable th) {
                    if (k47VarR != null) {
                        k47VarR.I();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(vp0VarD1);
        this.h.execute(new mf5(this, i));
    }

    public final vp0 b(vp0 vp0Var) throws Throwable {
        HttpURLConnection httpURLConnection;
        pq0 pq0Var;
        pq0 pq0VarF;
        lf5 lf5Var = this.b;
        ff5 ff5Var = this.a;
        ff5Var.a();
        String str = ff5Var.c.a;
        String str2 = vp0Var.a;
        ff5 ff5Var2 = this.a;
        ff5Var2.a();
        String str3 = ff5Var2.c.h;
        String str4 = vp0Var.d;
        pf5 pf5Var = pf5.b;
        a67 a67Var = lf5Var.c;
        if (!a67Var.a()) {
            throw new qf5("Firebase Installations Service is unavailable. Please try again later.", pf5Var);
        }
        URL urlA = lf5.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new qf5("Firebase Installations Service is unavailable. Please try again later.", pf5Var);
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = lf5Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    lf5.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    a67Var.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        pq0VarF = lf5.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    lf5.b(httpURLConnectionC, null, str, str3);
                    httpURLConnection = httpURLConnectionC;
                    try {
                        try {
                            if (responseCode == 401 || responseCode == 404) {
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                pq0Var = new pq0(3, 0L, null);
                            } else {
                                if (responseCode == 429) {
                                    throw new qf5("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", pf5.c);
                                }
                                if (responseCode < 500 || responseCode >= 600) {
                                    b1.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    if (((byte) (0 | 1)) != 1) {
                                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                    }
                                    pq0Var = new pq0(2, 0L, null);
                                }
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i++;
                            }
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            pq0VarF = pq0Var;
                            break;
                        } catch (IOException | AssertionError unused) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                } catch (IOException | AssertionError unused2) {
                    httpURLConnection = httpURLConnectionC;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionC;
            }
        }
        int iB = kv2.B(pq0VarF.c);
        if (iB == 0) {
            String str5 = pq0VarF.a;
            long j = pq0VarF.b;
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            up0 up0VarA = vp0Var.a();
            up0VarA.c = str5;
            up0VarA.e = j;
            byte b = (byte) (up0VarA.h | 1);
            up0VarA.f = jCurrentTimeMillis;
            up0VarA.h = (byte) (b | 2);
            return up0VarA.a();
        }
        if (iB == 1) {
            up0 up0VarA2 = vp0Var.a();
            up0VarA2.g = "BAD CONFIG";
            up0VarA2.b = 5;
            return up0VarA2.a();
        }
        if (iB != 2) {
            throw new qf5("Firebase Installations Service is unavailable. Please try again later.", pf5Var);
        }
        synchronized (this) {
            this.i = null;
        }
        up0 up0VarA3 = vp0Var.a();
        up0VarA3.b = 2;
        return up0VarA3.a();
    }

    public final gfh c() {
        String str;
        e();
        synchronized (this) {
            str = this.i;
        }
        if (str != null) {
            return Tasks.d(str);
        }
        gle gleVar = new gle();
        j76 j76Var = new j76(gleVar);
        synchronized (this.f) {
            this.k.add(j76Var);
        }
        gfh gfhVar = gleVar.a;
        this.g.execute(new mf5(this, 0));
        return gfhVar;
    }

    public final gfh d() {
        e();
        gle gleVar = new gle();
        v66 v66Var = new v66(this.d, gleVar);
        synchronized (this.f) {
            this.k.add(v66Var);
        }
        gfh gfhVar = gleVar.a;
        this.g.execute(new mf5(this, 1));
        return gfhVar;
    }

    public final void e() {
        ff5 ff5Var = this.a;
        ff5Var.a();
        oa7.y(ff5Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ff5Var.a();
        oa7.y(ff5Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ff5Var.a();
        oa7.y(ff5Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ff5Var.a();
        String str = ff5Var.c.b;
        Pattern pattern = wqf.a;
        oa7.u("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        ff5Var.a();
        oa7.u("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", wqf.a.matcher(ff5Var.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final String f(vp0 vp0Var) {
        fe7 fe7Var;
        String strEncodeToString;
        String str;
        String str2;
        PublicKey publicKeyGeneratePublic;
        ff5 ff5Var = this.a;
        ff5Var.a();
        String str3 = ff5Var.b;
        if (!str3.equals("CHIME_ANDROID_SDK")) {
            ff5Var.a();
            if ("[DEFAULT]".equals(str3)) {
                if (vp0Var.b == 1) {
                    fe7Var = ((wu6) this.e.get()).a;
                    strEncodeToString = null;
                    str = (String) fe7Var.b(wu6.d, null);
                    if (str != null) {
                        strEncodeToString = str;
                    } else {
                        str2 = (String) fe7Var.b(wu6.c, null);
                        if (str2 != null) {
                            try {
                                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                                b1.l("ContentValues", "Invalid key stored " + e);
                                publicKeyGeneratePublic = null;
                            }
                            if (publicKeyGeneratePublic != null) {
                                try {
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                                    bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                                    strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    b1.l("ContentValues", "Unexpected error, device missing required algorithms");
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strEncodeToString)) {
                        return nbb.a();
                    }
                    return strEncodeToString;
                }
            }
        } else if (vp0Var.b == 1) {
            fe7Var = ((wu6) this.e.get()).a;
            strEncodeToString = null;
            str = (String) fe7Var.b(wu6.d, null);
            if (str != null) {
                strEncodeToString = str;
            } else {
                str2 = (String) fe7Var.b(wu6.c, null);
                if (str2 != null) {
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                    if (publicKeyGeneratePublic != null) {
                        byte[] bArrDigest2 = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                        bArrDigest2[0] = (byte) (((bArrDigest2[0] & 15) + 112) & 255);
                        strEncodeToString = Base64.encodeToString(bArrDigest2, 0, 8, 11);
                    }
                }
            }
            if (TextUtils.isEmpty(strEncodeToString)) {
                return nbb.a();
            }
            return strEncodeToString;
        }
        return nbb.a();
    }

    public final vp0 g(vp0 vp0Var) throws qf5 {
        hp0 hp0VarE;
        String str = vp0Var.a;
        String string = null;
        if (str != null && str.length() == 11) {
            wu6 wu6Var = (wu6) this.e.get();
            wu6Var.getClass();
            for (String str2 : wu6.e) {
                String str3 = (String) wu6Var.a.b(new isa(ub3.k("|T|", wu6Var.b, "|", str2)), null);
                if (str3 != null && !str3.isEmpty()) {
                    if (!str3.startsWith("{")) {
                        string = str3;
                        break;
                    }
                    try {
                        string = new JSONObject(str3).getString("token");
                        break;
                    } catch (JSONException unused) {
                        break;
                    }
                }
            }
        }
        ff5 ff5Var = this.a;
        ff5Var.a();
        String str4 = ff5Var.c.a;
        ff5Var.a();
        String str5 = ff5Var.c.h;
        ff5Var.a();
        String str6 = ff5Var.c.b;
        lf5 lf5Var = this.b;
        a67 a67Var = lf5Var.c;
        boolean zA = a67Var.a();
        pf5 pf5Var = pf5.b;
        if (!zA) {
            throw new qf5("Firebase Installations Service is unavailable. Please try again later.", pf5Var);
        }
        URL urlA = lf5.a("projects/" + str5 + "/installations");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new qf5("Firebase Installations Service is unavailable. Please try again later.", pf5Var);
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = lf5Var.c(urlA, str4);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    lf5.g(httpURLConnectionC, str, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    a67Var.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        hp0VarE = lf5.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    lf5.b(httpURLConnectionC, str6, str4, str5);
                    if (responseCode == 429) {
                        throw new qf5("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", pf5.c);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        b1.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        hp0 hp0Var = new hp0(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        hp0VarE = hp0Var;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int iB = kv2.B(hp0VarE.e);
        if (iB != 0) {
            if (iB != 1) {
                throw new qf5("Firebase Installations Service is unavailable. Please try again later.", pf5Var);
            }
            up0 up0VarA = vp0Var.a();
            up0VarA.g = "BAD CONFIG";
            up0VarA.b = 5;
            return up0VarA.a();
        }
        String str7 = hp0VarE.b;
        String str8 = hp0VarE.c;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        pq0 pq0Var = hp0VarE.d;
        String str9 = pq0Var.a;
        long j = pq0Var.b;
        up0 up0VarA2 = vp0Var.a();
        up0VarA2.a = str7;
        up0VarA2.b = 4;
        up0VarA2.c = str9;
        up0VarA2.d = str8;
        up0VarA2.e = j;
        byte b = (byte) (up0VarA2.h | 1);
        up0VarA2.f = jCurrentTimeMillis;
        up0VarA2.h = (byte) (b | 2);
        return up0VarA2.a();
    }

    public final void h(Exception exc) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((z0e) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(vp0 vp0Var) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((z0e) it.next()).b(vp0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
