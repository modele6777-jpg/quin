package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gj8 {
    public static boolean v = false;
    public final int a;
    public final int b;
    public final boolean c;
    public final long d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public final int n;
    public final boolean o;
    public final int p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final SSLSocketFactory u;

    public gj8(Bundle bundle) {
        long jFloatValue;
        SSLSocketFactory socketFactory = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            if (db6.L0(4)) {
                Log.i("MixpanelAPI.Conf", "System has no SSL support. Built-in events editor will not be available", e);
            }
        }
        this.u = socketFactory;
        boolean z = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        v = z;
        if (z) {
            db6.k = 2;
        }
        if (bundle.containsKey("com.mixpanel.android.MPConfig.DebugFlushInterval")) {
            db6.h1("MixpanelAPI.Conf", "We do not support com.mixpanel.android.MPConfig.DebugFlushInterval anymore. There will only be one flush interval. Please, update your AndroidManifest.xml.");
        }
        this.a = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        this.b = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        this.n = bundle.getInt("com.mixpanel.android.MPConfig.FlushBatchSize", 50);
        this.o = bundle.getBoolean("com.mixpanel.android.MPConfig.GzipRequestPayload", false);
        this.c = bundle.getBoolean("com.mixpanel.android.MPConfig.FlushOnBackground", true);
        this.e = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 20971520);
        this.f = bundle.getInt("com.mixpanel.android.MPConfig.MaximumDatabaseLimit", Integer.MAX_VALUE);
        bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        this.g = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        this.h = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableExceptionHandler", false);
        this.p = bundle.getInt("com.mixpanel.android.MPConfig.MinimumSessionDuration", 10000);
        this.q = bundle.getInt("com.mixpanel.android.MPConfig.SessionTimeoutDuration", Integer.MAX_VALUE);
        this.r = bundle.getBoolean("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation", true);
        this.s = bundle.getBoolean("com.mixpanel.android.MPConfig.RemoveLegacyResidualFiles", false);
        Object obj = bundle.get("com.mixpanel.android.MPConfig.DataExpiration");
        if (obj != null) {
            try {
                if (obj instanceof Integer) {
                    jFloatValue = ((Integer) obj).intValue();
                } else {
                    if (!(obj instanceof Float)) {
                        throw new NumberFormatException(obj.toString() + " is not a number.");
                    }
                    jFloatValue = (long) ((Float) obj).floatValue();
                }
            } catch (Exception e2) {
                db6.G("MixpanelAPI.Conf", "Error parsing com.mixpanel.android.MPConfig.DataExpiration meta-data value", e2);
                jFloatValue = 432000000;
            }
        } else {
            jFloatValue = 432000000;
        }
        this.d = jFloatValue;
        boolean zContainsKey = bundle.containsKey("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation");
        String string = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        if (string != null) {
            this.i = zContainsKey ? a(string, this.r) : string;
        } else {
            this.i = a("https://api.mixpanel.com/track/", this.r);
        }
        String string2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        if (string2 != null) {
            this.j = zContainsKey ? a(string2, this.r) : string2;
        } else {
            this.j = a("https://api.mixpanel.com/engage/", this.r);
        }
        String string3 = bundle.getString("com.mixpanel.android.MPConfig.GroupsEndpoint");
        if (string3 != null) {
            this.k = zContainsKey ? a(string3, this.r) : string3;
        } else {
            this.k = a("https://api.mixpanel.com/groups/", this.r);
        }
        String string4 = bundle.getString("com.mixpanel.android.MPConfig.FlagsEndpoint");
        if (string4 != null) {
            this.l = string4;
        } else {
            b("https://api.mixpanel.com");
        }
        this.t = bundle.getString("com.mixpanel.android.MPConfig.BackupHost");
        db6.f1("MixpanelAPI.Conf", toString());
    }

    public static String a(String str, boolean z) {
        if (!str.contains("?ip=")) {
            StringBuilder sbQ = kv2.q(str, "?ip=");
            sbQ.append(z ? "1" : "0");
            return sbQ.toString();
        }
        StringBuilder sb = new StringBuilder(str.substring(0, str.indexOf("?ip=")));
        sb.append("?ip=");
        sb.append(z ? "1" : "0");
        return sb.toString();
    }

    public final void b(String str) {
        this.l = tec.l(str, "/flags/");
        this.m = tec.l(str, "/flags/");
    }

    public final String toString() {
        return "Mixpanel (8.9.0) configured with:\n    TrackAutomaticEvents: true\n    BulkUploadLimit " + this.a + "\n    FlushInterval " + this.b + "\n    FlushInterval " + this.n + "\n    DataExpiration " + this.d + "\n    MinimumDatabaseLimit " + this.e + "\n    MaximumDatabaseLimit " + this.f + "\n    DisableAppOpenEvent " + this.g + "\n    EnableDebugLogging " + v + "\n    EventsEndpoint " + this.i + "\n    PeopleEndpoint " + this.j + "\n    GroupsEndpoint " + this.k + "\n    FlagsEndpoint " + this.l + "\n    MinimumSessionDuration: " + this.p + "\n    SessionTimeoutDuration: " + this.q + "\n    DisableExceptionHandler: " + this.h + "\n    FlushOnBackground: " + this.c;
    }
}
