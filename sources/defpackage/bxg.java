package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bxg extends jsg implements hvg {
    public final /* synthetic */ w36 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxg(qwg qwgVar, w36 w36Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.d = w36Var;
    }

    @Override // defpackage.hvg
    public final void a() {
        this.d.run();
    }

    @Override // defpackage.jsg
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a();
        return true;
    }
}
