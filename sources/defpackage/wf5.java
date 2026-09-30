package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wf5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public wf5(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i = u4e.a;
        oa7.C("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static wf5 a(Context context) {
        lqb lqbVar = new lqb(context);
        String strL = lqbVar.l("google_app_id");
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        return new wf5(strL, lqbVar.l("google_api_key"), lqbVar.l("firebase_database_url"), lqbVar.l("ga_trackingId"), lqbVar.l("gcm_defaultSenderId"), lqbVar.l("google_storage_bucket"), lqbVar.l("recaptcha_site_key"), lqbVar.l("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wf5)) {
            return false;
        }
        wf5 wf5Var = (wf5) obj;
        return ym8.w(this.b, wf5Var.b) && ym8.w(this.a, wf5Var.a) && ym8.w(this.c, wf5Var.c) && ym8.w(this.d, wf5Var.d) && ym8.w(this.e, wf5Var.e) && ym8.w(this.f, wf5Var.f) && ym8.w(this.g, wf5Var.g) && ym8.w(this.h, wf5Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        w84 w84Var = new w84(this);
        w84Var.G0(this.b, "applicationId");
        w84Var.G0(this.a, "apiKey");
        w84Var.G0(this.c, "databaseUrl");
        w84Var.G0(this.e, "gcmSenderId");
        w84Var.G0(this.f, "storageBucket");
        w84Var.G0(this.g, "recaptchaSiteKey");
        w84Var.G0(this.h, "projectId");
        return w84Var.toString();
    }
}
