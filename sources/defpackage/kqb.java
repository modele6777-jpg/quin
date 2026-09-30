package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kqb {
    public final xb0 a;
    public final pv2 b;

    public kqb(xb0 xb0Var, pv2 pv2Var) {
        xb0Var.getClass();
        pv2Var.getClass();
        this.a = xb0Var;
        this.b = pv2Var;
    }

    public final URL a() {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(Constants.SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        xb0 xb0Var = this.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(xb0Var.a).appendPath("settings");
        wo woVar = xb0Var.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", woVar.c).appendQueryParameter("display_version", woVar.b).build().toString());
    }
}
