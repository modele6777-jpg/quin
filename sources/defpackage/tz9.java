package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tz9 extends d1e implements Parcelable, wrd, h0e, e89 {
    public static final Parcelable.Creator<tz9> CREATOR = new rz9(1);
    public vrd b;

    public tz9(long j) {
        ird irdVarH = qrd.h();
        vrd vrdVar = new vrd(irdVarH.g(), j);
        if (!(irdVarH instanceof qb6)) {
            vrdVar.b = new vrd(1L, j);
        }
        this.b = vrdVar;
    }

    @Override // defpackage.e89
    public final a26 a() {
        return new trd(1, this);
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.b;
    }

    @Override // defpackage.c1e
    public final f1e d(f1e f1eVar, f1e f1eVar2, f1e f1eVar3) {
        if (((vrd) f1eVar2).c == ((vrd) f1eVar3).c) {
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
        this.b = (vrd) f1eVar;
    }

    @Override // defpackage.e89
    public final Object g() {
        return Long.valueOf(j());
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return Long.valueOf(j());
    }

    public final long j() {
        return ((vrd) qrd.s(this.b, this)).c;
    }

    public final void k(long j) {
        ird irdVarH;
        vrd vrdVar = (vrd) qrd.f(this.b);
        if (vrdVar.c != j) {
            vrd vrdVar2 = this.b;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                ((vrd) qrd.n(vrdVar2, this, irdVarH, vrdVar)).c = j;
            }
            qrd.l(irdVarH, this);
        }
    }

    @Override // defpackage.e89
    public final void setValue(Object obj) {
        k(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((vrd) qrd.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(j());
    }
}
