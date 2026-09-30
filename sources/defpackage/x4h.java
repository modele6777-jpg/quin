package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.sentry.android.core.b1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x4h extends ffg implements IInterface {
    public final int e;

    public x4h(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 5);
        oa7.v(bArr.length == 25);
        this.e = Arrays.hashCode(bArr);
    }

    public static byte[] O(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            qc0.i(e);
            return null;
        }
    }

    @Override // defpackage.ffg
    public final boolean L(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            vt6 vt6VarN = N();
            parcel2.writeNoException();
            itg.b(parcel2, vt6VarN);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.e);
        return true;
    }

    public abstract byte[] M();

    public final vt6 N() {
        return new tk9(M());
    }

    public final boolean equals(Object obj) {
        vt6 vt6VarN;
        if (obj instanceof x4h) {
            try {
                x4h x4hVar = (x4h) obj;
                if (x4hVar.e == this.e && (vt6VarN = x4hVar.N()) != null) {
                    return Arrays.equals(M(), (byte[]) tk9.N(vt6VarN));
                }
            } catch (RemoteException e) {
                b1.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
