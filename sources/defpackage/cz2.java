package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cz2 implements Parcelable {
    public static final Parcelable.Creator<cz2> CREATOR = new vjg(14);
    public final Uri a;
    public final Uri b;
    public final Exception c;
    public final float[] d;
    public final Rect e;
    public final Rect f;
    public final int g;
    public final int v;

    public cz2(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
        this.a = uri;
        this.b = uri2;
        this.c = exc;
        this.d = fArr;
        this.e = rect;
        this.f = rect2;
        this.g = i;
        this.v = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeSerializable(this.c);
        parcel.writeFloatArray(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.v);
    }
}
