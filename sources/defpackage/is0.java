package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class is0 implements Parcelable {
    public static final Parcelable.Creator<is0> CREATOR = new vjg(3);
    public final ArrayList X;
    public final boolean Y;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int v;
    public final CharSequence w;
    public final int x;
    public final CharSequence y;
    public final ArrayList z;

    public is0(hs0 hs0Var) {
        int size = hs0Var.a.size();
        this.a = new int[size * 6];
        if (!hs0Var.g) {
            qc0.p("Not on back stack");
            throw null;
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ky5 ky5Var = (ky5) hs0Var.a.get(i2);
            int i3 = i + 1;
            this.a[i] = ky5Var.a;
            ArrayList arrayList = this.b;
            kx5 kx5Var = ky5Var.b;
            arrayList.add(kx5Var != null ? kx5Var.e : null);
            int[] iArr = this.a;
            iArr[i3] = ky5Var.c ? 1 : 0;
            iArr[i + 2] = ky5Var.d;
            iArr[i + 3] = ky5Var.e;
            int i4 = i + 5;
            iArr[i + 4] = ky5Var.f;
            i += 6;
            iArr[i4] = ky5Var.g;
            this.c[i2] = ky5Var.h.ordinal();
            this.d[i2] = ky5Var.i.ordinal();
        }
        this.e = hs0Var.f;
        this.f = hs0Var.h;
        this.g = hs0Var.s;
        this.v = hs0Var.i;
        this.w = hs0Var.j;
        this.x = hs0Var.k;
        this.y = hs0Var.l;
        this.z = hs0Var.m;
        this.X = hs0Var.n;
        this.Y = hs0Var.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.v);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeInt(this.x);
        TextUtils.writeToParcel(this.y, parcel, 0);
        parcel.writeStringList(this.z);
        parcel.writeStringList(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
    }

    public is0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.v = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.w = (CharSequence) creator.createFromParcel(parcel);
        this.x = parcel.readInt();
        this.y = (CharSequence) creator.createFromParcel(parcel);
        this.z = parcel.createStringArrayList();
        this.X = parcel.createStringArrayList();
        this.Y = parcel.readInt() != 0;
    }
}
