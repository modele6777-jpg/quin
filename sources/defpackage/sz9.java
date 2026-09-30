package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sz9 extends d1e implements Parcelable, s69, wrd {
    public static final Parcelable.Creator<sz9> CREATOR = new rz9(0);
    public urd b;

    public sz9(int i) {
        ird irdVarH = qrd.h();
        urd urdVar = new urd(irdVarH.g(), i);
        if (!(irdVarH instanceof qb6)) {
            urdVar.b = new urd(1L, i);
        }
        this.b = urdVar;
    }

    @Override // defpackage.e89
    public final a26 a() {
        return new trd(0, this);
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.b;
    }

    @Override // defpackage.c1e
    public final f1e d(f1e f1eVar, f1e f1eVar2, f1e f1eVar3) {
        if (((urd) f1eVar2).c == ((urd) f1eVar3).c) {
            return f1eVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.wrd
    public final yrd e() {
        return i8c.f;
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        this.b = (urd) f1eVar;
    }

    @Override // defpackage.e89
    public final Object g() {
        return Integer.valueOf(j());
    }

    public final int j() {
        return ((urd) qrd.s(this.b, this)).c;
    }

    public final void k(int i) {
        ird irdVarH;
        urd urdVar = (urd) qrd.f(this.b);
        if (urdVar.c != i) {
            urd urdVar2 = this.b;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                ((urd) qrd.n(urdVar2, this, irdVarH, urdVar)).c = i;
            }
            qrd.l(irdVarH, this);
        }
    }

    public final String toString() {
        return ks0.k("MutableIntState(value=", ((urd) qrd.f(this.b)).c, ")@", hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(j());
    }
}
