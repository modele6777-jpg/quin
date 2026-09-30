package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ehh {
    public final /* synthetic */ int a;

    public /* synthetic */ ehh(int i) {
        this.a = i;
    }

    public final void a(ngh nghVar, Iterator it, ahh ahhVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (!nghVar.c) {
                    qc0.p("non repeating key");
                } else if (nghVar.d && ((hlg) hlg.b.get()).a > 20) {
                    while (it.hasNext()) {
                        ahhVar.a(it.next(), nghVar.a);
                    }
                } else {
                    nghVar.a(it, ahhVar);
                }
                break;
        }
    }

    private final void b(ngh nghVar, Iterator it, ahh ahhVar) {
    }
}
