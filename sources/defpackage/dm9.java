package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dm9 extends vyb {
    public final vyb c;
    public final yhb d;
    public IOException e;

    public dm9(vyb vybVar) {
        this.c = vybVar;
        this.d = new yhb(new yy0(this, vybVar.P0()));
    }

    @Override // defpackage.vyb
    public final v41 P0() {
        return this.d;
    }

    @Override // defpackage.vyb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.vyb
    public final long h() {
        return this.c.h();
    }

    @Override // defpackage.vyb
    public final oq8 l() {
        return this.c.l();
    }
}
