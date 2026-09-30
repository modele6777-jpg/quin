package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jrf extends v4 {
    public static final Parcelable.Creator<jrf> CREATOR = new njg(13);
    public final List a;

    public jrf(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final JSONArray c() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.a;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    krf krfVar = (krf) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) krfVar.c);
                    jSONArray2.put((int) krfVar.b);
                    jSONArray2.put((int) krfVar.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            cva.q("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jrf)) {
            return false;
        }
        List list = ((jrf) obj).a;
        List list2 = this.a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.y(parcel, 1, this.a);
        hcc.C(parcel, iB);
    }
}
