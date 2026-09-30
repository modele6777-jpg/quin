package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wl0 extends zl0 {
    public static final Parcelable.Creator<wl0> CREATOR = new njg(26);
    public final x0h a;
    public final x0h b;
    public final x0h c;
    public final x0h d;
    public final x0h e;

    public wl0(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        oa7.A(bArr);
        x0h x0hVarK = d1h.k(bArr, bArr.length);
        oa7.A(bArr2);
        x0h x0hVarK2 = d1h.k(bArr2, bArr2.length);
        oa7.A(bArr3);
        x0h x0hVarK3 = d1h.k(bArr3, bArr3.length);
        oa7.A(bArr4);
        x0h x0hVarK4 = d1h.k(bArr4, bArr4.length);
        x0h x0hVarK5 = bArr5 == null ? null : d1h.k(bArr5, bArr5.length);
        this.a = x0hVarK;
        this.b = x0hVarK2;
        this.c = x0hVarK3;
        this.d = x0hVarK4;
        this.e = x0hVarK5;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", y7h.u(this.b.m()));
            jSONObject.put("authenticatorData", y7h.u(this.c.m()));
            jSONObject.put("signature", y7h.u(this.d.m()));
            x0h x0hVar = this.e;
            if (x0hVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", y7h.u(x0hVar == null ? null : x0hVar.m()));
            return jSONObject;
        } catch (JSONException e) {
            cva.q("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wl0)) {
            return false;
        }
        wl0 wl0Var = (wl0) obj;
        return ym8.w(this.a, wl0Var.a) && ym8.w(this.b, wl0Var.b) && ym8.w(this.c, wl0Var.c) && ym8.w(this.d, wl0Var.d) && ym8.w(this.e, wl0Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        psd psdVar = new psd(getClass().getSimpleName(), 24);
        mzg mzgVar = pzg.d;
        byte[] bArrM = this.a.m();
        psdVar.G(mzgVar.c(bArrM, bArrM.length), "keyHandle");
        byte[] bArrM2 = this.b.m();
        psdVar.G(mzgVar.c(bArrM2, bArrM2.length), "clientDataJSON");
        byte[] bArrM3 = this.c.m();
        psdVar.G(mzgVar.c(bArrM3, bArrM3.length), "authenticatorData");
        byte[] bArrM4 = this.d.m();
        psdVar.G(mzgVar.c(bArrM4, bArrM4.length), "signature");
        x0h x0hVar = this.e;
        byte[] bArrM5 = x0hVar == null ? null : x0hVar.m();
        if (bArrM5 != null) {
            psdVar.G(mzgVar.c(bArrM5, bArrM5.length), "userHandle");
        }
        return psdVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.q(parcel, 2, this.a.m());
        hcc.q(parcel, 3, this.b.m());
        hcc.q(parcel, 4, this.c.m());
        hcc.q(parcel, 5, this.d.m());
        x0h x0hVar = this.e;
        hcc.q(parcel, 6, x0hVar == null ? null : x0hVar.m());
        hcc.C(parcel, iB);
    }
}
