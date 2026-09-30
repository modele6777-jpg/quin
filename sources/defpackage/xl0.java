package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xl0 extends zl0 {
    public static final Parcelable.Creator<xl0> CREATOR = new s5h(6);
    public final x0h a;
    public final x0h b;
    public final x0h c;
    public final String[] d;

    public xl0(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        oa7.A(bArr);
        x0h x0hVarK = d1h.k(bArr, bArr.length);
        oa7.A(bArr2);
        x0h x0hVarK2 = d1h.k(bArr2, bArr2.length);
        oa7.A(bArr3);
        x0h x0hVarK3 = d1h.k(bArr3, bArr3.length);
        this.a = x0hVarK;
        this.b = x0hVarK2;
        this.c = x0hVarK3;
        oa7.A(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013f A[Catch: JSONException -> 0x0049, o2h -> 0x0220, TRY_LEAVE, TryCatch #6 {o2h -> 0x0220, blocks: (B:30:0x0108, B:36:0x012e, B:38:0x013f), top: B:136:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0224  */
    public final JSONObject c() {
        r2h r2hVar;
        JSONObject jSONObject;
        byte[] bArrA;
        String[] strArr = this.d;
        x0h x0hVar = this.c;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("clientDataJSON", y7h.u(this.b.m()));
            jSONObject2.put("attestationObject", y7h.u(x0hVar.m()));
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            try {
                jSONObject2.put("transports", jSONArray);
                try {
                    try {
                        r2h r2hVar2 = (r2h) ((l2h) r2h.e(x0hVar.m()).c(l2h.class)).b.get(new m2h("authData"));
                        if (r2hVar2 != null) {
                            x0h x0hVar2 = ((e2h) r2hVar2.c(e2h.class)).a;
                            ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(x0hVar2.zza, x0hVar2.n(), x0hVar2.d()).asReadOnlyBuffer();
                            try {
                                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                                if ((byteBufferAsReadOnlyBuffer.get() & 64) != 0) {
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                                    try {
                                        try {
                                            w2h w2hVar = new w2h(x0hVar2.g(byteBufferAsReadOnlyBuffer.position(), x0hVar2.d()).o());
                                            try {
                                                r2h r2hVarO = gdc.o(w2hVar);
                                                try {
                                                    w2hVar.close();
                                                } catch (IOException unused) {
                                                }
                                                bug bugVar = ((l2h) r2hVarO.c(l2h.class)).b;
                                                r2h r2hVar3 = (r2h) bugVar.get(new i2h(3L));
                                                r2h r2hVar4 = (r2h) bugVar.get(new i2h(1L));
                                                if (r2hVar3 == null || r2hVar4 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                try {
                                                    long j = ((i2h) r2hVar3.c(i2h.class)).a;
                                                    long j2 = ((i2h) r2hVar4.c(i2h.class)).a;
                                                    if (j2 == 1) {
                                                        r2hVar = (r2h) bugVar.get(new i2h(-1L));
                                                        try {
                                                            if (r2hVar != null) {
                                                                throw new IllegalArgumentException("COSE key missing required fields");
                                                            }
                                                            long j3 = ((i2h) r2hVar.c(i2h.class)).a;
                                                            jSONObject = jSONObject2;
                                                            if (j2 != 2 && j3 == 1) {
                                                                r2h r2hVar5 = (r2h) bugVar.get(new i2h(-2L));
                                                                r2h r2hVar6 = (r2h) bugVar.get(new i2h(-3L));
                                                                if (r2hVar5 == null || r2hVar6 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                x0h x0hVar3 = ((e2h) r2hVar5.c(e2h.class)).a;
                                                                x0h x0hVar4 = ((e2h) r2hVar6.c(e2h.class)).a;
                                                                if (x0hVar3.d() != 32 || x0hVar4.d() != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrA = hcc.A(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), x0hVar3.m(), x0hVar4.m());
                                                            } else if (j2 == 1 || j3 != 6) {
                                                                bArrA = null;
                                                            } else {
                                                                r2h r2hVar7 = (r2h) bugVar.get(new i2h(-2L));
                                                                if (r2hVar7 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                x0h x0hVar5 = ((e2h) r2hVar7.c(e2h.class)).a;
                                                                if (x0hVar5.d() != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrA = hcc.A(Base64.decode("MCowBQYDK2VwAyEA", 0), x0hVar5.m());
                                                            }
                                                        } catch (o2h e) {
                                                            e = e;
                                                        }
                                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                                    }
                                                    if (j2 == 2) {
                                                        j2 = 2;
                                                        r2hVar = (r2h) bugVar.get(new i2h(-1L));
                                                        if (r2hVar != null) {
                                                            throw new IllegalArgumentException("COSE key missing required fields");
                                                        }
                                                        long j4 = ((i2h) r2hVar.c(i2h.class)).a;
                                                        jSONObject = jSONObject2;
                                                        if (j2 != 2) {
                                                            if (j2 == 1) {
                                                                bArrA = null;
                                                            } else {
                                                                bArrA = null;
                                                            }
                                                        } else if (j2 == 1) {
                                                            bArrA = null;
                                                        } else {
                                                            bArrA = null;
                                                        }
                                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                                    }
                                                    jSONObject = jSONObject2;
                                                    bArrA = null;
                                                    JSONObject jSONObject3 = jSONObject;
                                                    jSONObject3.put("authenticatorData", y7h.u(x0hVar2.m()));
                                                    jSONObject3.put("publicKeyAlgorithm", j);
                                                    if (bArrA != null) {
                                                        jSONObject3.put("publicKey", Base64.encodeToString(bArrA, 11));
                                                    }
                                                    return jSONObject3;
                                                } catch (o2h e2) {
                                                    e = e2;
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    try {
                                                        w2hVar.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    try {
                                                        throw th;
                                                    } catch (g2h e3) {
                                                        e = e3;
                                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                                    }
                                                } catch (o2h e4) {
                                                    e = e4;
                                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                                }
                                            }
                                        } catch (o2h e5) {
                                            e = e5;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    } catch (g2h e6) {
                                        e = e6;
                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                    }
                                    cva.q("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                                    return null;
                                }
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e7) {
                                    e = e7;
                                }
                            } catch (IllegalArgumentException e8) {
                                e = e8;
                            }
                            throw new IllegalArgumentException("ill-formed authenticator data", e);
                        }
                        try {
                            throw new IllegalArgumentException("attestation object missing authData");
                        } catch (o2h e9) {
                            e = e9;
                        }
                    } catch (o2h e10) {
                        e = e10;
                    }
                    throw new IllegalArgumentException("authData value has wrong type", e);
                } catch (g2h e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (o2h e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xl0)) {
            return false;
        }
        xl0 xl0Var = (xl0) obj;
        return ym8.w(this.a, xl0Var.a) && ym8.w(this.b, xl0Var.b) && ym8.w(this.c, xl0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        psd psdVar = new psd(getClass().getSimpleName(), 24);
        mzg mzgVar = pzg.d;
        byte[] bArrM = this.a.m();
        psdVar.G(mzgVar.c(bArrM, bArrM.length), "keyHandle");
        byte[] bArrM2 = this.b.m();
        psdVar.G(mzgVar.c(bArrM2, bArrM2.length), "clientDataJSON");
        byte[] bArrM3 = this.c.m();
        psdVar.G(mzgVar.c(bArrM3, bArrM3.length), "attestationObject");
        psdVar.G(Arrays.toString(this.d), "transports");
        return psdVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.q(parcel, 2, this.a.m());
        hcc.q(parcel, 3, this.b.m());
        hcc.q(parcel, 4, this.c.m());
        String[] strArr = this.d;
        if (strArr != null) {
            int iB2 = hcc.B(parcel, 5);
            parcel.writeStringArray(strArr);
            hcc.C(parcel, iB2);
        }
        hcc.C(parcel, iB);
    }
}
