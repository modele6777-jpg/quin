package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sbh extends v4 {
    public static final Parcelable.Creator<sbh> CREATOR = new s5h(12);
    public final List a;

    public sbh(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static sbh c(s8h... s8hVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(s8hVarArr[0].a()));
        return new sbh(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        List list = this.a;
        if (list != null) {
            int iB2 = hcc.B(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            hcc.C(parcel, iB2);
        }
        hcc.C(parcel, iB);
    }
}
