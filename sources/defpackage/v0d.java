package defpackage;

import java.security.SecureRandom;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0d {
    public long a;
    public long b;
    public long c;
    public String d;
    public final SecureRandom e;

    public v0d() {
        b();
        this.e = new SecureRandom();
    }

    public final JSONObject a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.e.nextLong()));
            jSONObject.put("$mp_session_id", this.d);
            jSONObject.put("$mp_session_seq_id", z ? this.a : this.b);
            jSONObject.put("$mp_session_start_sec", this.c);
            if (z) {
                this.a++;
                return jSONObject;
            }
            this.b++;
            return jSONObject;
        } catch (JSONException e) {
            db6.G("MixpanelAPI.ConfigurationChecker", "Cannot create session metadata JSON object", e);
            return jSONObject;
        }
    }

    public final void b() {
        this.a = 0L;
        this.b = 0L;
        this.d = Long.toHexString(new SecureRandom().nextLong());
        this.c = System.currentTimeMillis() / 1000;
    }
}
