package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ey5 implements Parcelable {
    public static final Parcelable.Creator<ey5> CREATOR = new vjg(22);
    public final String X;
    public final int Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public ey5(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt() != 0;
        this.y = parcel.readInt() != 0;
        this.z = parcel.readInt();
        this.X = parcel.readString();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.v) {
            sb.append(" retainInstance");
        }
        if (this.w) {
            sb.append(" removing");
        }
        if (this.x) {
            sb.append(" detached");
        }
        if (this.y) {
            sb.append(" hidden");
        }
        String str2 = this.X;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.Y);
        }
        if (this.Z) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public ey5(kx5 kx5Var) {
        this.a = kx5Var.getClass().getName();
        this.b = kx5Var.e;
        this.c = kx5Var.Y;
        this.d = kx5Var.E0;
        this.e = kx5Var.M0;
        this.f = kx5Var.N0;
        this.g = kx5Var.O0;
        this.v = kx5Var.R0;
        this.w = kx5Var.z;
        this.x = kx5Var.Q0;
        this.y = kx5Var.P0;
        this.z = kx5Var.b1.ordinal();
        this.X = kx5Var.v;
        this.Y = kx5Var.w;
        this.Z = kx5Var.W0;
    }
}
