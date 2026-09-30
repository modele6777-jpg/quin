package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vz9 extends d1e implements Parcelable, wrd {
    public static final Parcelable.Creator<vz9> CREATOR = new uz9(0);
    public final yrd b;
    public xrd c;

    public vz9(Object obj, yrd yrdVar) {
        this.b = yrdVar;
        ird irdVarH = qrd.h();
        xrd xrdVar = new xrd(irdVarH.g(), obj);
        if (!(irdVarH instanceof qb6)) {
            xrdVar.b = new xrd(1L, obj);
        }
        this.c = xrdVar;
    }

    @Override // defpackage.e89
    public final a26 a() {
        return new trd(2, this);
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.c;
    }

    @Override // defpackage.c1e
    public final f1e d(f1e f1eVar, f1e f1eVar2, f1e f1eVar3) {
        if (this.b.N(((xrd) f1eVar2).c, ((xrd) f1eVar3).c)) {
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
        return this.b;
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        this.c = (xrd) f1eVar;
    }

    @Override // defpackage.e89
    public final Object g() {
        return getValue();
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return ((xrd) qrd.s(this.c, this)).c;
    }

    @Override // defpackage.e89
    public final void setValue(Object obj) {
        ird irdVarH;
        xrd xrdVar = (xrd) qrd.f(this.c);
        if (this.b.N(xrdVar.c, obj)) {
            return;
        }
        xrd xrdVar2 = this.c;
        synchronized (qrd.c) {
            irdVarH = qrd.h();
            ((xrd) qrd.n(xrdVar2, this, irdVarH, xrdVar)).c = obj;
        }
        qrd.l(irdVarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((xrd) qrd.f(this.c)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        qk6 qk6Var = qk6.L0;
        yrd yrdVar = this.b;
        if (yrdVar.equals(qk6Var)) {
            i2 = 0;
        } else if (yrdVar.equals(i8c.f)) {
            i2 = 1;
        } else {
            if (!yrdVar.equals(hj6.X0)) {
                qc0.p("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
