package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ii2 {
    public static final int[] r = {2, 4, 8, 16, 32, 64, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 256};
    public static final Pattern s = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet a;
    public int c;
    public HttpURLConnection f;
    public th2 g;
    public final ScheduledExecutorService h;
    public final di2 i;
    public final ff5 j;
    public final of5 k;
    public final wh2 l;
    public final Context m;
    public final String n;
    public final li2 p;
    public boolean b = false;
    public final Random o = new Random();
    public boolean d = false;
    public boolean e = false;
    public final Object q = new Object();

    public ii2(ff5 ff5Var, of5 of5Var, di2 di2Var, wh2 wh2Var, Context context, String str, LinkedHashSet linkedHashSet, li2 li2Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.c = Math.max(8 - li2Var.c().a, 1);
        this.j = ff5Var;
        this.i = di2Var;
        this.k = of5Var;
        this.l = wh2Var;
        this.m = context;
        this.n = str;
        this.p = li2Var;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        return (this.a.isEmpty() || this.b || this.d || this.e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    public final String c(String str) {
        ff5 ff5Var = this.j;
        ff5Var.a();
        Matcher matcher = s.matcher(ff5Var.c.b);
        return tec.m("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.h.schedule(new wwg(7, this), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    new hg5("Unable to connect to the server. Check your connection and try again.", ig5.CONFIG_UPDATE_STREAM_ERROR);
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hi2) it.next()).a();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.p.c().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) {
        String strP;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        ff5 ff5Var = this.j;
        ff5Var.a();
        wf5 wf5Var = ff5Var.c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", wf5Var.a);
        Context context = this.m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrX = vd0.X(context, context.getPackageName());
            if (bArrX == null) {
                b1.d("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strP = null;
            } else {
                strP = vpf.p(bArrX);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strP);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        ff5Var.a();
        Matcher matcher = s.matcher(wf5Var.b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.n);
        map.put("lastKnownVersionNumber", Long.toString(((li2) this.i.g).a.getLong("last_template_version", 0L)));
        ff5Var.a();
        map.put("appId", wf5Var.b);
        map.put("sdkVersion", "23.1.0");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized th2 j(HttpURLConnection httpURLConnection) {
        return new th2(httpURLConnection, this.i, this.l, this.a, new hi2(this), this.h, this.p);
    }

    public final void k(Date date) {
        li2 li2Var = this.p;
        int i = li2Var.c().a + 1;
        long millis = TimeUnit.MINUTES.toMillis(r[(i < 8 ? i : 8) - 1]);
        li2Var.e(i, new Date(date.getTime() + (millis / 2) + ((long) this.o.nextInt((int) millis))));
    }
}
