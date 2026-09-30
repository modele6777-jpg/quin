package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q0c implements Parcelable {
    public static final Parcelable.Creator<q0c> CREATOR = new njg(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tjg tjgVar = (tjg) this;
        parcel.writeParcelable(tjgVar.a, 0);
        parcel.writeInt(tjgVar.b ? 1 : 0);
    }
}
