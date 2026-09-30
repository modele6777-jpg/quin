package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ffg extends Binder implements IInterface {
    public final /* synthetic */ int d;

    public ffg(String str, int i) {
        this.d = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
            default:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
        }
    }

    public static void I(Parcel parcel) {
        int i = jtg.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(ub3.h(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
        }
    }

    public abstract boolean G(Parcel parcel, int i);

    public abstract boolean H(Parcel parcel, int i);

    public abstract boolean J(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean K(int i, Parcel parcel, Parcel parcel2);

    public boolean L(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.d;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        boolean zOnTransact2 = false;
        byte b = 0;
        switch (this.d) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return G(parcel, i);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return J(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return K(i, parcel, parcel2);
            case 3:
                if (i > 16777215) {
                    zOnTransact2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact2) {
                    return true;
                }
                return H(parcel, i);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                m1h m1hVar = (m1h) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = dtg.a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(tec.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                reh rehVar = m1hVar.g.a;
                if (rehVar != null) {
                    gle gleVar = m1hVar.f;
                    synchronized (rehVar.f) {
                        rehVar.e.remove(gleVar);
                        break;
                    }
                    rehVar.a().post(new cah(b == true ? 1 : 0, rehVar));
                }
                m1hVar.e.d("onGetLaunchReviewFlowInfo", new Object[0]);
                m1hVar.f.c(new tjg((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                return true;
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return L(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                z87 z87Var = (z87) this;
                switch (i) {
                    case 1:
                        Status status = (Status) jtg.a(parcel, Status.CREATOR);
                        p6a p6aVar = (p6a) jtg.a(parcel, p6a.CREATOR);
                        I(parcel);
                        status.getClass();
                        hcc.m(status, p6aVar, z87Var.e);
                        return true;
                    case 2:
                        Status status2 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status2.getClass();
                        cva.f();
                        break;
                    case 3:
                        Status status3 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status3.getClass();
                        cva.f();
                        break;
                    case 4:
                        Status status4 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status4.getClass();
                        cva.f();
                        break;
                    case 5:
                        Status status5 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status5.getClass();
                        cva.f();
                        break;
                    case 6:
                        Status status6 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status6.getClass();
                        cva.f();
                        break;
                    case 7:
                        Status status7 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status7.getClass();
                        throw new UnsupportedOperationException();
                    case 8:
                        Status status8 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status8.getClass();
                        cva.f();
                        break;
                    case 9:
                        Status status9 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status9.getClass();
                        throw new UnsupportedOperationException();
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        Status status10 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        Status status11 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status11.getClass();
                        cva.f();
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        Status status12 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status12.getClass();
                        cva.f();
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        Status status13 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status13.getClass();
                        cva.f();
                        break;
                    case 14:
                        Status status14 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status14.getClass();
                        cva.f();
                        break;
                    case 15:
                        Status status15 = (Status) jtg.a(parcel, Status.CREATOR);
                        I(parcel);
                        status15.getClass();
                        cva.f();
                        break;
                }
                return false;
        }
    }
}
