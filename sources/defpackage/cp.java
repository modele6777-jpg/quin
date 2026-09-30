package defpackage;

import android.util.Base64;
import android.webkit.JavascriptInterface;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cp {
    public final yea a;

    public cp(yea yeaVar) {
        this.a = yeaVar;
    }

    @JavascriptInterface
    public final void postMessage(String str, String str2) throws Throwable {
        str.getClass();
        str2.getClass();
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            bArrDecode.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            hf8.Q.getClass();
            ef8.a("AndroidBridge").f("Received H5 Message -> Method: {}, Payload: {}", str, jSONObject);
            this.a.f(str, jSONObject);
        } catch (Exception e) {
            ynb.h0(e);
            tec.t(hf8.Q, "AndroidBridge", "Get Javascript error", e);
        }
    }
}
