package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nq7 {
    public final ArrayList a;

    public nq7(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ewa(jSONObjectOptJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    public void a(Object obj) {
        if (obj != null) {
            this.a.add(obj);
        } else {
            r82.g("Set contributions cannot be null");
        }
    }

    public nq7(oq7 oq7Var) {
        this.a = new ArrayList(1);
    }

    public nq7() {
        this.a = new ArrayList(9);
    }
}
