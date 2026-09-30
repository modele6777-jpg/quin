package defpackage;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gb5 {
    public final JSONObject a;
    public final esf b;

    public gb5(w84 w84Var) {
        JSONObject jSONObject = (JSONObject) w84Var.b;
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
        esf esfVar = (esf) w84Var.c;
        this.b = esfVar == null ? esf.a : esfVar;
    }

    public gb5(JSONObject jSONObject, esf esfVar) {
        this.a = jSONObject;
        this.b = esfVar;
    }
}
