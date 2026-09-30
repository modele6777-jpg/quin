package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g9h extends jsg implements ozg {
    public final /* synthetic */ AtomicReference d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9h(lah lahVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.d = atomicReference;
    }

    @Override // defpackage.ozg
    public final void C(List list) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // defpackage.jsg
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(kbh.CREATOR);
        lsg.d(parcel);
        C(arrayListCreateTypedArrayList);
        return true;
    }
}
