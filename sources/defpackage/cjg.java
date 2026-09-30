package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cjg implements Runnable {
    public static final os c = new os("RevokeAccessOperation", new String[0]);
    public final String a;
    public final t1e b;

    public cjg(String str) {
        oa7.x(str);
        this.a = str;
        this.b = new t1e(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        os osVar = c;
        Status status = Status.g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=".concat(this.a)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                b1.d((String) osVar.c, ((String) osVar.d).concat("Unable to revoke access!"));
            }
            String str = "Response Code: " + responseCode;
            if (osVar.b <= 3) {
                Log.d((String) osVar.c, ((String) osVar.d).concat(str));
            }
        } catch (IOException e) {
            b1.d((String) osVar.c, ((String) osVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            b1.d((String) osVar.c, ((String) osVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.b.e(status);
    }
}
