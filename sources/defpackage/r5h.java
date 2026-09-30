package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r5h extends v4 {
    public static final Parcelable.Creator<r5h> CREATOR = new s5h(0);
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] g;
    public final byte[][] v;
    public final int[] w;
    public final byte[][] x;

    public r5h(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.g = iArr;
        this.v = bArr6;
        this.w = iArr2;
        this.x = bArr7;
    }

    public static void c(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            oa7.A(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetP = aic.p(length);
        for (byte[] bArr2 : bArr) {
            oa7.A(bArr2);
            hashSetP.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetP;
    }

    public static List f(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new f6h(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set d() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.v;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objP;
        Object objP2;
        int length;
        int length2;
        if (obj instanceof r5h) {
            r5h r5hVar = (r5h) obj;
            if (hfc.s(this.a, r5hVar.a) && hfc.s(d(), r5hVar.d()) && hfc.s(e(this.c), e(r5hVar.c)) && hfc.s(e(this.d), e(r5hVar.d)) && hfc.s(e(this.e), e(r5hVar.e)) && hfc.s(e(this.f), e(r5hVar.f))) {
                int[] iArr = this.g;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objP = Collections.EMPTY_SET;
                } else {
                    objP = aic.p(length2);
                    for (int i : iArr) {
                        objP.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = r5hVar.g;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objP2 = Collections.EMPTY_SET;
                } else {
                    objP2 = aic.p(length);
                    for (int i2 : iArr2) {
                        objP2.add(Integer.valueOf(i2));
                    }
                }
                if (hfc.s(objP, objP2) && hfc.s(f(this.w), f(r5hVar.w)) && hfc.s(e(this.x), e(r5hVar.x))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbQ = kv2.q("ExperimentTokens", "(");
        String str = this.a;
        sbQ.append(str == null ? "null" : ib8.m(new StringBuilder(str.length() + 2), "'", str, "'"));
        sbQ.append(", direct==");
        byte[] bArr = this.b;
        if (bArr == null) {
            sbQ.append("null");
        } else {
            sbQ.append("'");
            sbQ.append(Base64.encodeToString(bArr, 3));
            sbQ.append("'");
        }
        sbQ.append(", ");
        c(sbQ, "GAIA=", this.c);
        sbQ.append(", ");
        c(sbQ, "PSEUDO=", this.d);
        sbQ.append(", ");
        c(sbQ, "ALWAYS=", this.e);
        sbQ.append(", ");
        c(sbQ, "OTHER=", this.f);
        sbQ.append(", weak=");
        sbQ.append(Arrays.toString(this.g));
        sbQ.append(", ");
        c(sbQ, "directs=", this.v);
        sbQ.append(", genDims=");
        sbQ.append(Arrays.toString(f(this.w).toArray()));
        sbQ.append(", ");
        c(sbQ, "external=", this.x);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 2, this.a);
        hcc.q(parcel, 3, this.b);
        hcc.r(parcel, 4, this.c);
        hcc.r(parcel, 5, this.d);
        hcc.r(parcel, 6, this.e);
        hcc.r(parcel, 7, this.f);
        hcc.t(parcel, 8, this.g);
        hcc.r(parcel, 9, this.v);
        hcc.t(parcel, 10, this.w);
        hcc.r(parcel, 11, this.x);
        hcc.C(parcel, iB);
    }
}
