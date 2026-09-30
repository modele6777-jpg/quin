package defpackage;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ch5 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final JSONObject f;
    public final iy8 g;

    public ch5(String str, String str2, Long l, String str3, String str4, JSONObject jSONObject, iy8 iy8Var) {
        if (str.isEmpty()) {
            qc0.j("flagKey cannot be empty");
            throw null;
        }
        if (str2.isEmpty()) {
            qc0.j("flagId cannot be empty");
            throw null;
        }
        if (str3.isEmpty()) {
            qc0.j("firstTimeEventHash cannot be empty");
            throw null;
        }
        if (str4.isEmpty()) {
            qc0.j("eventName cannot be empty");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
        this.f = jSONObject;
        this.g = iy8Var;
    }

    public final String a() {
        return this.a + ":" + this.d;
    }
}
