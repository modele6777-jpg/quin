package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p9h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ndh b;
    public final /* synthetic */ lah c;

    public p9h(lah lahVar, ndh ndhVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ndhVar;
                Objects.requireNonNull(lahVar);
                this.c = lahVar;
                break;
            default:
                this.b = ndhVar;
                this.c = lahVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ndh ndhVar = this.b;
        lah lahVar = this.c;
        switch (i) {
            case 0:
                w3h w3hVar = (w3h) lahVar.b;
                hzg hzgVar = lahVar.e;
                if (hzgVar == null) {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.x.a("Failed to send app backgrounded");
                } else {
                    try {
                        hzgVar.v(ndhVar);
                        lahVar.N0();
                    } catch (RemoteException e) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.b(e, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            default:
                hzg hzgVar2 = lahVar.e;
                w3h w3hVar2 = (w3h) lahVar.b;
                if (hzgVar2 == null) {
                    w0h w0hVar3 = w3hVar2.f;
                    w3h.h(w0hVar3);
                    w0hVar3.g.a("Failed to send consent settings to service");
                } else {
                    try {
                        hzgVar2.y(ndhVar);
                        lahVar.N0();
                    } catch (RemoteException e2) {
                        w0h w0hVar4 = w3hVar2.f;
                        w3h.h(w0hVar4);
                        w0hVar4.g.b(e2, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
