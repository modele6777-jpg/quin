package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ul extends tl {
    public final JSONObject b;

    public ul(String str, JSONObject jSONObject) {
        super(str);
        if (jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject.get(next).toString();
                } catch (AssertionError e) {
                    jSONObject.remove(next);
                    db6.G("MixpanelAPI.Messages", "Removing people profile property from update (see https://github.com/mixpanel/mixpanel-android/issues/567)", e);
                } catch (JSONException unused) {
                }
            }
        }
        this.b = jSONObject;
    }
}
