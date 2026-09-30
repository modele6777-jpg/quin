package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w8h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9h b;

    public w8h(b9h b9hVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(b9hVar);
                this.b = b9hVar;
                break;
            default:
                Objects.requireNonNull(b9hVar);
                this.b = b9hVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b9h b9hVar = this.b;
        switch (i) {
            case 0:
                b9hVar.f = b9hVar.y;
                break;
            default:
                b9hVar.y = null;
                break;
        }
    }
}
