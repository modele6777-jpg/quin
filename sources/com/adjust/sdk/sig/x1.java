package com.adjust.sdk.sig;

import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import defpackage.ub3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 {
    public final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    public final boolean b;

    public x1(Map map) {
        this.b = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
    }

    public final void a(String str) {
        if (this.b) {
            StringBuilder sbO = ub3.o(str);
            sbO.append(this.a.format(new Date(System.currentTimeMillis())));
            Log.v("SignerInstance", sbO.toString());
        }
    }
}
