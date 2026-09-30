package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class th2 implements goe {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object v;
    public final Object w;

    public th2(HttpURLConnection httpURLConnection, di2 di2Var, wh2 wh2Var, LinkedHashSet linkedHashSet, hi2 hi2Var, ScheduledExecutorService scheduledExecutorService, li2 li2Var) {
        this.c = httpURLConnection;
        this.d = di2Var;
        this.e = wh2Var;
        this.b = linkedHashSet;
        this.f = hi2Var;
        this.g = scheduledExecutorService;
        this.v = new Random();
        this.a = false;
        this.w = li2Var;
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-94654579);
        int i2 = i | (l46Var.g(this) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            iec.a(yse.a, ((use) this.b).d().c, dd2Var, (rpe) this.d, null, (l26) this.e, null, null, pa7.t((ype) this.c, gec.x), this.a, false, (m77) this.f, (xw9) this.g, (wne) this.v, (dd2) this.w, l46Var, 390, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(this, dd2Var, i, 16);
        }
    }

    public void a(int i, long j) {
        if (i == 0) {
            new mg5("Unable to fetch the latest version of the template.", ig5.CONFIG_UPDATE_NOT_FETCHED);
            d();
        } else {
            ((ScheduledExecutorService) this.g).schedule(new sh2(this, i, j), ((Random) this.v).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strConcat = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strConcat = strConcat.concat(line);
            if (line.contains("}")) {
                int iIndexOf = strConcat.indexOf(123);
                int iLastIndexOf = strConcat.lastIndexOf(125);
                strConcat = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strConcat.substring(iIndexOf, iLastIndexOf + 1);
                if (strConcat.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strConcat);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            hi2 hi2Var = (hi2) this.f;
                            new mg5("The server is temporarily unavailable. Try again in a few minutes.", ig5.CONFIG_UPDATE_UNAVAILABLE);
                            hi2Var.a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = ((LinkedHashSet) this.b).isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = ((li2) ((di2) this.d).g).a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                a(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            e(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strConcat = "";
                    } catch (JSONException e) {
                        new hg5(e.getCause());
                        d();
                        b1.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                if (!this.a) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e2);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IOException e3) {
            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
        }
    }

    public synchronized void d() {
        Iterator it = ((LinkedHashSet) this.b).iterator();
        while (it.hasNext()) {
            ((hi2) it.next()).a();
        }
    }

    public synchronized void e(int i) {
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
        li2 li2Var = (li2) this.w;
        synchronized (li2Var.d) {
            li2Var.a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public th2(use useVar, ype ypeVar, rpe rpeVar, l26 l26Var, boolean z, m77 m77Var, xw9 xw9Var, wne wneVar, dd2 dd2Var) {
        this.b = useVar;
        this.c = ypeVar;
        this.d = rpeVar;
        this.e = l26Var;
        this.a = z;
        this.f = m77Var;
        this.g = xw9Var;
        this.v = wneVar;
        this.w = dd2Var;
    }
}
