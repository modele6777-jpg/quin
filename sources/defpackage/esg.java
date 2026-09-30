package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class esg extends v4 implements Iterable {
    public static final Parcelable.Creator<esg> CREATOR = new njg(15);
    public final Bundle a;

    public esg(Bundle bundle) {
        this.a = bundle;
    }

    public final Object c(String str) {
        return this.a.get(str);
    }

    public final Double d() {
        return Double.valueOf(this.a.getDouble("value"));
    }

    public final String e() {
        return this.a.getString("currency");
    }

    public final Bundle f() {
        return new Bundle(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new iff(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.p(parcel, 2, f());
        hcc.C(parcel, iB);
    }
}
