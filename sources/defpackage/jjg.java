package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jjg extends ffg implements IInterface {
    public final /* synthetic */ int e;
    public final /* synthetic */ kjg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjg(kjg kjgVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 2);
        this.e = i;
        this.f = kjgVar;
    }

    @Override // defpackage.ffg
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        kjg kjgVar = this.f;
        int i2 = this.e;
        switch (i) {
            case 101:
                ejg.b(parcel);
                cva.f();
                return false;
            case 102:
                Status status = (Status) ejg.a(parcel, Status.CREATOR);
                ejg.b(parcel);
                switch (i2) {
                    case 0:
                        kjgVar.e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status status2 = (Status) ejg.a(parcel, Status.CREATOR);
                ejg.b(parcel);
                switch (i2) {
                    case 1:
                        kjgVar.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
