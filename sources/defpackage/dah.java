package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lah b;

    public /* synthetic */ dah(lah lahVar, int i) {
        this.a = i;
        this.b = lahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lah lahVar = this.b;
        switch (i) {
            case 0:
                lahVar.G0();
                break;
            case 1:
                w3h w3hVar = (w3h) lahVar.b;
                hzg hzgVar = lahVar.e;
                if (hzgVar == null) {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.g.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        hzgVar.m(lahVar.Q0(false));
                        lahVar.N0();
                    } catch (RemoteException e) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.b(e, "Failed to send Dma consent settings to the service");
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
                    w0hVar3.g.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        hzgVar2.h(lahVar.Q0(false));
                        lahVar.N0();
                    } catch (RemoteException e2) {
                        w0h w0hVar4 = w3hVar2.f;
                        w3h.h(w0hVar4);
                        w0hVar4.g.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
