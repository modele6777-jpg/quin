package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1h extends v4 {
    public static final Parcelable.Creator<i1h> CREATOR = new njg(25);
    public final boolean a;
    public final d1h b;

    public i1h(boolean z, x0h x0hVar) {
        this.a = z;
        this.b = x0hVar;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            d1h d1hVar = this.b;
            byte[] bArrM = d1hVar == null ? null : d1hVar.m();
            if (bArrM != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM, 32), 11));
                if (bArrM.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            cva.q("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1h)) {
            return false;
        }
        i1h i1hVar = (i1h) obj;
        return this.a == i1hVar.a && ym8.w(this.b, i1hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return ib8.j("AuthenticationExtensionsPrfOutputs{", c().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        d1h d1hVar = this.b;
        hcc.q(parcel, 2, d1hVar == null ? null : d1hVar.m());
        hcc.C(parcel, iB);
    }
}
