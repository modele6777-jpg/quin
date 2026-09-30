package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uz9 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ uz9(int i) {
        this.a = i;
    }

    public static vz9 a(Parcel parcel, ClassLoader classLoader) {
        yrd yrdVar;
        if (classLoader == null) {
            classLoader = uz9.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            yrdVar = qk6.L0;
        } else if (i == 1) {
            yrdVar = i8c.f;
        } else {
            if (i != 2) {
                qc0.p(tec.f(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            yrdVar = hj6.X0;
        }
        return new vz9(value, yrdVar);
    }

    public static osd b(Parcel parcel, ClassLoader classLoader) {
        osd osdVar = new osd();
        if (classLoader == null) {
            classLoader = osd.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            osdVar.add(parcel.readValue(classLoader));
        }
        return osdVar;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return u.b;
                }
                qc0.p("superState must be null");
                return null;
            default:
                return b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vz9[i];
            case 1:
                return new u[i];
            default:
                return new osd[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return u.b;
                }
                qc0.p("superState must be null");
                return null;
            default:
                return b(parcel, null);
        }
    }
}
