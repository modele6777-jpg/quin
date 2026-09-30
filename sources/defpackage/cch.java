package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cch extends meg {
    public final vt6 O(tk9 tk9Var, String str, int i) {
        Parcel parcelJ = J();
        itg.b(parcelJ, tk9Var);
        parcelJ.writeString(str);
        parcelJ.writeInt(i);
        Parcel parcelH = H(parcelJ, 2);
        vt6 vt6VarM = tk9.M(parcelH.readStrongBinder());
        parcelH.recycle();
        return vt6VarM;
    }

    public final vt6 P(tk9 tk9Var, String str, int i) {
        Parcel parcelJ = J();
        itg.b(parcelJ, tk9Var);
        parcelJ.writeString(str);
        parcelJ.writeInt(i);
        Parcel parcelH = H(parcelJ, 4);
        vt6 vt6VarM = tk9.M(parcelH.readStrongBinder());
        parcelH.recycle();
        return vt6VarM;
    }

    public final vt6 Q(tk9 tk9Var, String str, boolean z, long j) {
        Parcel parcelJ = J();
        itg.b(parcelJ, tk9Var);
        parcelJ.writeString(str);
        parcelJ.writeInt(z ? 1 : 0);
        parcelJ.writeLong(j);
        Parcel parcelH = H(parcelJ, 7);
        vt6 vt6VarM = tk9.M(parcelH.readStrongBinder());
        parcelH.recycle();
        return vt6VarM;
    }

    public final vt6 R(tk9 tk9Var, String str, int i, tk9 tk9Var2) {
        Parcel parcelJ = J();
        itg.b(parcelJ, tk9Var);
        parcelJ.writeString(str);
        parcelJ.writeInt(i);
        itg.b(parcelJ, tk9Var2);
        Parcel parcelH = H(parcelJ, 8);
        vt6 vt6VarM = tk9.M(parcelH.readStrongBinder());
        parcelH.recycle();
        return vt6VarM;
    }
}
