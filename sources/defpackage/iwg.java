package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iwg extends v4 {
    public static final Parcelable.Creator<iwg> CREATOR = new njg(21);
    public final int a;
    public final String b;
    public final Intent c;

    public iwg(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static iwg c(Activity activity) {
        return new iwg(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwg)) {
            return false;
        }
        iwg iwgVar = (iwg) obj;
        return this.a == iwgVar.a && Objects.equals(this.b, iwgVar.b) && Objects.equals(this.c, iwgVar.c);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.v(parcel, 2, this.b);
        hcc.u(parcel, 3, this.c, i);
        hcc.C(parcel, iB);
    }
}
