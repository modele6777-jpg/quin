package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i9h extends jsg implements vzg {
    public final /* synthetic */ AtomicReference d;
    public final /* synthetic */ lah e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9h(lah lahVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.d = atomicReference;
        this.e = lahVar;
    }

    @Override // defpackage.jsg
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        vbh vbhVar = (vbh) lsg.a(parcel, vbh.CREATOR);
        lsg.d(parcel);
        s(vbhVar);
        return true;
    }

    @Override // defpackage.vzg
    public final void s(vbh vbhVar) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            w0h w0hVar = ((w3h) this.e.b).f;
            w3h.h(w0hVar);
            w0hVar.Z.b(Integer.valueOf(vbhVar.a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(vbhVar);
            atomicReference.notifyAll();
        }
    }
}
