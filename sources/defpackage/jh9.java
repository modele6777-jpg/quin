package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jh9 {
    public final String a;
    public final int b;
    public final Notification c;

    public jh9(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(ut6 ut6Var) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        st6 st6Var = (st6) ut6Var;
        st6Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ut6.c);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            parcelObtain.writeTypedObject(notification, 0);
            if (!st6Var.d.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method notify is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return tec.g(this.b, ", tag:null]", sb);
    }
}
