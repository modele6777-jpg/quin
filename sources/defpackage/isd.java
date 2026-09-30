package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class isd implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public static jsd a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = isd.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new jsd();
        }
        caa caaVarI = rpd.b.i();
        for (int i2 = 0; i2 < i; i2++) {
            caaVarI.add(parcel.readValue(classLoader));
        }
        return new jsd(caaVarI.e());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new alb(parcel, null);
            default:
                return new rze(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jsd[i];
            case 1:
                return new alb[i];
            default:
                return new rze[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new alb(parcel, classLoader);
            default:
                return new rze(parcel, classLoader);
        }
    }
}
