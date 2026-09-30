package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g7h extends xb6 {
    @Override // defpackage.yt0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof d7h ? (d7h) iInterfaceQueryLocalInterface : new d7h(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 5);
    }

    @Override // defpackage.yt0
    public final za5[] f() {
        return k99.m;
    }

    @Override // defpackage.yt0
    public final int i() {
        return 9410000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
