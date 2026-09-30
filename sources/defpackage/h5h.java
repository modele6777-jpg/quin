package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h5h extends v4 implements Comparable {
    public static final Parcelable.Creator<h5h> CREATOR = new njg(27);
    public final int a;
    public final u5h[] b;
    public final String[] c;
    public final TreeMap d = new TreeMap();

    public h5h(int i, u5h[] u5hVarArr, String[] strArr) {
        this.a = i;
        this.b = u5hVarArr;
        for (u5h u5hVar : u5hVarArr) {
            this.d.put(u5hVar.a, u5hVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a - ((h5h) obj).a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h5h)) {
            return false;
        }
        h5h h5hVar = (h5h) obj;
        return this.a == h5hVar.a && hfc.s(this.d, h5hVar.d) && Arrays.equals(this.c, h5hVar.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((u5h) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.a);
        hcc.x(parcel, 3, this.b, i);
        String[] strArr = this.c;
        if (strArr != null) {
            int iB2 = hcc.B(parcel, 4);
            parcel.writeStringArray(strArr);
            hcc.C(parcel, iB2);
        }
        hcc.C(parcel, iB);
    }
}
