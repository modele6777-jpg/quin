package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n9h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ndh b;
    public final /* synthetic */ lah c;

    public /* synthetic */ n9h(lah lahVar, ndh ndhVar, int i) {
        this.a = i;
        this.b = ndhVar;
        this.c = lahVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        ndh ndhVar = this.b;
        lah lahVar = this.c;
        switch (i) {
            case 0:
                hzg hzgVar = lahVar.e;
                w3h w3hVar = (w3h) lahVar.b;
                if (hzgVar == null) {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.g.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        qqg qqgVar = w3hVar.d;
                        azg azgVar = bzg.W0;
                        if (qqgVar.L0(null, azgVar)) {
                            lahVar.S0(hzgVar, null, ndhVar);
                        }
                        hzgVar.t(ndhVar);
                        w3hVar.i().F0();
                        w3hVar.d.L0(null, azgVar);
                        lahVar.S0(hzgVar, null, ndhVar);
                        lahVar.N0();
                    } catch (RemoteException e) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.b(e, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                w3h w3hVar2 = (w3h) lahVar.b;
                hzg hzgVar2 = lahVar.e;
                if (hzgVar2 == null) {
                    w0h w0hVar3 = w3hVar2.f;
                    w3h.h(w0hVar3);
                    w0hVar3.g.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        hzgVar2.l(ndhVar);
                        lahVar.N0();
                    } catch (RemoteException e2) {
                        w0h w0hVar4 = w3hVar2.f;
                        w3h.h(w0hVar4);
                        w0hVar4.g.b(e2, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
