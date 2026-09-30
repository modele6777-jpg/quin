package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wch implements x5h {
    public final nvg a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public wch(AppMeasurementDynamiteService appMeasurementDynamiteService, nvg nvgVar) {
        this.b = appMeasurementDynamiteService;
        this.a = nvgVar;
    }

    @Override // defpackage.x5h
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.g(str, str2, bundle, j);
        } catch (RemoteException e) {
            w3h w3hVar = this.b.d;
            if (w3hVar != null) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.x.b(e, "Event listener threw exception");
            }
        }
    }
}
