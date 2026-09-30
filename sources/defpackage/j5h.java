package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j5h extends v4 {
    public static final Parcelable.Creator<j5h> CREATOR = new njg(28);
    public final String a;
    public final byte[] b;
    public final String c;
    public final h5h[] d;
    public final TreeMap e = new TreeMap();
    public final boolean f;
    public final long g;

    public j5h(String str, String str2, h5h[] h5hVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = h5hVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (h5h h5hVar : h5hVarArr) {
            this.e.put(Integer.valueOf(h5hVar.a), h5hVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j5h)) {
            return false;
        }
        j5h j5hVar = (j5h) obj;
        return hfc.s(this.a, j5hVar.a) && hfc.s(this.c, j5hVar.c) && this.e.equals(j5hVar.e) && this.f == j5hVar.f && Arrays.equals(this.b, j5hVar.b) && this.g == j5hVar.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((h5h) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 2, this.a);
        hcc.v(parcel, 3, this.c);
        hcc.x(parcel, 4, this.d, i);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        hcc.q(parcel, 6, this.b);
        hcc.z(parcel, 7, 8);
        parcel.writeLong(this.g);
        hcc.C(parcel, iB);
    }
}
