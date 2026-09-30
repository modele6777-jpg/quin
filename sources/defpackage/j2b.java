package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j2b extends v4 {
    public static final Parcelable.Creator<j2b> CREATOR = new njg(8);
    public final String a;
    public final String b;
    public final x0h c;
    public final xl0 d;
    public final wl0 e;
    public final yl0 f;
    public final ul0 g;
    public final String v;

    public j2b(String str, String str2, byte[] bArr, xl0 xl0Var, wl0 wl0Var, yl0 yl0Var, ul0 ul0Var, String str3) {
        x0h x0hVarK = bArr == null ? null : d1h.k(bArr, bArr.length);
        boolean z = false;
        oa7.u("Must provide a response object.", (xl0Var != null && wl0Var == null && yl0Var == null) || (xl0Var == null && wl0Var != null && yl0Var == null) || (xl0Var == null && wl0Var == null && yl0Var != null));
        if (yl0Var != null || (str != null && x0hVarK != null)) {
            z = true;
        }
        oa7.u("Must provide id and rawId if not an error response.", z);
        this.a = str;
        this.b = str2;
        this.c = x0hVarK;
        this.d = xl0Var;
        this.e = wl0Var;
        this.f = yl0Var;
        this.g = ul0Var;
        this.v = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j2b)) {
            return false;
        }
        j2b j2bVar = (j2b) obj;
        return ym8.w(this.a, j2bVar.a) && ym8.w(this.b, j2bVar.b) && ym8.w(this.c, j2bVar.c) && ym8.w(this.d, j2bVar.d) && ym8.w(this.e, j2bVar.e) && ym8.w(this.f, j2bVar.f) && ym8.w(this.g, j2bVar.g) && ym8.w(this.v, j2bVar.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.v});
    }

    public final String toString() {
        x0h x0hVar = this.c;
        String strU = y7h.u(x0hVar == null ? null : x0hVar.m());
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf(this.f);
        String strValueOf4 = String.valueOf(this.g);
        StringBuilder sbO = ib8.o("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        ub3.v(sbO, strU, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        ub3.v(sbO, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return ks0.m(sbO, strValueOf4, ", \n authenticatorAttachment='", this.v, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        r3h.a();
        throw null;
    }
}
