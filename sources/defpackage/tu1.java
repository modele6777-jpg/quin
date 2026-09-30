package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tu1 implements x3f {
    public final m6c a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final j52 e;
    public final j52 f;

    public tu1(Context context, j52 j52Var, j52 j52Var2) {
        hh7 hh7Var = new hh7();
        hj6.d.configure(hh7Var);
        hh7Var.d = true;
        this.a = new m6c(20, hh7Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(e71.c);
        this.e = j52Var2;
        this.f = j52Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(ub3.i("Invalid url: ", str), e);
        }
    }

    public final xo0 a(xo0 xo0Var) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        wo0 wo0VarC = xo0Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map = (HashMap) wo0VarC.w;
        if (map == null) {
            qc0.p("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("sdk-version", String.valueOf(i));
        wo0VarC.b("model", Build.MODEL);
        wo0VarC.b("hardware", Build.HARDWARE);
        wo0VarC.b("device", Build.DEVICE);
        wo0VarC.b("product", Build.PRODUCT);
        wo0VarC.b("os-uild", Build.ID);
        wo0VarC.b("manufacturer", Build.MANUFACTURER);
        wo0VarC.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map2 = (HashMap) wo0VarC.w;
        if (map2 == null) {
            qc0.p("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iA = activeNetworkInfo == null ? md9.NONE.a() : activeNetworkInfo.getType();
        HashMap map3 = (HashMap) wo0VarC.w;
        if (map3 == null) {
            qc0.p("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("net-type", String.valueOf(iA));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = ld9.UNKNOWN_MOBILE_SUBTYPE.a();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = ld9.COMBINED.a();
            } else if (((ld9) ld9.c.get(subtype)) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = (HashMap) wo0VarC.w;
        if (map4 == null) {
            qc0.p("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        wo0VarC.b("country", Locale.getDefault().getCountry());
        wo0VarC.b("locale", Locale.getDefault().getLanguage());
        Context context = this.c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        wo0VarC.b("mcc_mnc", simOperator);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            g21.K("CctTransportBackend", "Unable to find version code for package", e);
        }
        wo0VarC.b("application_build", Integer.toString(i2));
        return wo0VarC.c();
    }
}
