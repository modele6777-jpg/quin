package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rtf;
import defpackage.stf;
import defpackage.vjg;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new vjg(28);
    public final stf a;

    public ParcelImpl(Parcel parcel) {
        this.a = new rtf(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new rtf(parcel).i(this.a);
    }
}
