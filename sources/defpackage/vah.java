package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vah implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ m7h c;

    public vah(m7h m7hVar, long j, long j2) {
        Objects.requireNonNull(m7hVar);
        this.c = m7hVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m3h m3hVar = ((w3h) ((ebh) this.c.b).b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new jfg(14, this));
    }
}
