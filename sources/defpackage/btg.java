package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class btg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ cyg c;

    public btg(bwg bwgVar, long j) {
        this.b = j;
        Objects.requireNonNull(bwgVar);
        this.c = bwgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        cyg cygVar = this.c;
        switch (i) {
            case 0:
                ((bwg) cygVar).G0(j);
                break;
            default:
                b9h b9hVar = (b9h) cygVar;
                bwg bwgVar = ((w3h) b9hVar.b).Y;
                w3h.e(bwgVar);
                bwgVar.D0(j);
                b9hVar.f = null;
                break;
        }
    }

    public btg(b9h b9hVar, long j) {
        this.b = j;
        Objects.requireNonNull(b9hVar);
        this.c = b9hVar;
    }
}
