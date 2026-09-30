package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yig extends ffg {
    public final /* synthetic */ gle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yig(gle gleVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 1);
        this.e = gleVar;
    }

    @Override // defpackage.ffg
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) xhg.a(parcel, Status.CREATOR);
        xhg.b(parcel);
        hcc.m(status, null, this.e);
        return true;
    }
}
