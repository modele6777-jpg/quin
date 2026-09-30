package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qz9 extends d1e implements Parcelable, n69, wrd {
    public static final Parcelable.Creator<qz9> CREATOR = new vjg(29);
    public srd b;

    public qz9(float f) {
        ird irdVarH = qrd.h();
        srd srdVar = new srd(irdVarH.g(), f);
        if (!(irdVarH instanceof qb6)) {
            srdVar.b = new srd(1L, f);
        }
        this.b = srdVar;
    }

    @Override // defpackage.e89
    public final a26 a() {
        return new ckb(29, this);
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.b;
    }

    @Override // defpackage.c1e
    public final f1e d(f1e f1eVar, f1e f1eVar2, f1e f1eVar3) {
        if (((srd) f1eVar2).c == ((srd) f1eVar3).c) {
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
        this.b = (srd) f1eVar;
    }

    @Override // defpackage.e89
    public final Object g() {
        return Float.valueOf(j());
    }

    public final float j() {
        return ((srd) qrd.s(this.b, this)).c;
    }

    public final void k(float f) {
        ird irdVarH;
        srd srdVar = (srd) qrd.f(this.b);
        if (srdVar.c == f) {
            return;
        }
        srd srdVar2 = this.b;
        synchronized (qrd.c) {
            irdVarH = qrd.h();
            ((srd) qrd.n(srdVar2, this, irdVarH, srdVar)).c = f;
        }
        qrd.l(irdVarH, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((srd) qrd.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(j());
    }
}
