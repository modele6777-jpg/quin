package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ul0 extends v4 {
    public static final Parcelable.Creator<ul0> CREATOR = new njg(18);
    public final jrf a;
    public final zxg b;
    public final vl0 c;
    public final i1h d;
    public final String e;

    public ul0(jrf jrfVar, zxg zxgVar, vl0 vl0Var, i1h i1hVar, String str) {
        this.a = jrfVar;
        this.b = zxgVar;
        this.c = vl0Var;
        this.d = i1hVar;
        this.e = str;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            vl0 vl0Var = this.c;
            if (vl0Var != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", vl0Var.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            jrf jrfVar = this.a;
            if (jrfVar != null) {
                jSONObject.put("uvm", jrfVar.c());
            }
            i1h i1hVar = this.d;
            if (i1hVar != null) {
                jSONObject.put("prf", i1hVar.c());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            cva.q("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ul0)) {
            return false;
        }
        ul0 ul0Var = (ul0) obj;
        return ym8.w(this.a, ul0Var.a) && ym8.w(this.b, ul0Var.b) && ym8.w(this.c, ul0Var.c) && ym8.w(this.d, ul0Var.d) && ym8.w(this.e, ul0Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return ib8.j("AuthenticationExtensionsClientOutputs{", c().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.u(parcel, 1, this.a, i);
        hcc.u(parcel, 2, this.b, i);
        hcc.u(parcel, 3, this.c, i);
        hcc.u(parcel, 4, this.d, i);
        hcc.v(parcel, 5, this.e);
        hcc.C(parcel, iB);
    }
}
