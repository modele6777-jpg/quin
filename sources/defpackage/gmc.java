package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gmc {
    public final SharedPreferences a;

    public gmc(Context context) {
        this.a = context.getSharedPreferences("seasonal_intro_exposures", 0);
    }

    public static String a(String str, String str2) {
        return str.length() + ":" + str + ":" + str2;
    }

    public final Object b(String str, String str2, String str3, yt5 yt5Var) {
        if (!pa7.t(str3, "qa")) {
            fg9 fg9Var = fg9.b;
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            fg9Var.getClass();
            Object objP0 = ynb.p0(i7h.I(fg9Var, hr3Var), new fmc(str, this, str2, null), yt5Var);
            if (objP0 == bw2.a) {
                return objP0;
            }
        }
        return wef.a;
    }
}
