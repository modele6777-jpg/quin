package defpackage;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ay8 {
    public final String a;
    public final JSONObject b;

    public ay8(String str, JSONObject jSONObject) {
        str.getClass();
        this.a = str;
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay8)) {
            return false;
        }
        ay8 ay8Var = (ay8) obj;
        return pa7.t(this.a, ay8Var.a) && pa7.t(this.b, ay8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "MixpanelEvent(eventName=" + this.a + ", properties=" + this.b + ")";
    }
}
