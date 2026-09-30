package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xqg extends meg implements crg {
    public final int O(int i, String str, String str2) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        Parcel parcelN = N(parcelM, 1);
        int i2 = parcelN.readInt();
        parcelN.recycle();
        return i2;
    }

    public final int P(int i, String str, String str2, Bundle bundle) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        int i2 = jrg.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, 10);
        int i3 = parcelN.readInt();
        parcelN.recycle();
        return i3;
    }

    public final Bundle Q(String str, String str2, String str3) {
        Parcel parcelM = M();
        parcelM.writeInt(3);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        parcelM.writeString(null);
        Parcel parcelN = N(parcelM, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) jrg.a(parcelN);
        parcelN.recycle();
        return bundle;
    }

    public final Bundle R(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        parcelM.writeString(null);
        int i2 = jrg.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) jrg.a(parcelN);
        parcelN.recycle();
        return bundle2;
    }

    public final Bundle S(String str, String str2, String str3) {
        Parcel parcelM = M();
        parcelM.writeInt(3);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        Parcel parcelN = N(parcelM, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) jrg.a(parcelN);
        parcelN.recycle();
        return bundle;
    }

    public final Bundle T(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        int i2 = jrg.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) jrg.a(parcelN);
        parcelN.recycle();
        return bundle2;
    }

    public final Bundle U(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        int i2 = jrg.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        parcelM.writeInt(1);
        bundle2.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) jrg.a(parcelN);
        parcelN.recycle();
        return bundle3;
    }

    public final void V(String str, Bundle bundle, wtg wtgVar) {
        Parcel parcelM = M();
        parcelM.writeInt(25);
        parcelM.writeString(str);
        int i = jrg.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        parcelM.writeStrongBinder(wtgVar);
        try {
            this.e.transact(2101, parcelM, null, 1);
        } finally {
            parcelM.recycle();
        }
    }
}
