package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kja implements x8c {
    public final x8c a;
    public final long b;
    public final /* synthetic */ qja c;

    public kja(qja qjaVar, x8c x8cVar) {
        x8cVar.getClass();
        this.c = qjaVar;
        this.a = x8cVar;
        this.b = d8c.q();
    }

    @Override // defpackage.x8c
    public final void Q(int i, String str) {
        str.getClass();
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            this.a.Q(i, str);
        } else {
            p8c.x(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final boolean R0() {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            return this.a.R0();
        }
        p8c.x(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            this.a.close();
        } else {
            p8c.x(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final byte[] getBlob(int i) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            return this.a.getBlob(i);
        }
        p8c.x(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.x8c
    public final int getColumnCount() {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            return this.a.getColumnCount();
        }
        p8c.x(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.x8c
    public final String getColumnName(int i) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            return this.a.getColumnName(i);
        }
        p8c.x(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.x8c
    public final long getLong(int i) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            return this.a.getLong(i);
        }
        p8c.x(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.x8c
    public final boolean isNull(int i) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            return this.a.isNull(i);
        }
        p8c.x(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.x8c
    public final void m(int i, long j) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            this.a.m(i, j);
        } else {
            p8c.x(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final void n(byte[] bArr, int i) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            this.a.n(bArr, i);
        } else {
            p8c.x(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final void o(int i) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            this.a.o(i);
        } else {
            p8c.x(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final void reset() {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            this.a.reset();
        } else {
            p8c.x(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final void s() {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            this.a.s();
        } else {
            p8c.x(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final String t0(int i) {
        if (this.c.e) {
            p8c.x(21, "Statement is recycled");
            throw null;
        }
        if (this.b == d8c.q()) {
            return this.a.t0(i);
        }
        p8c.x(21, "Attempted to use statement on a different thread");
        throw null;
    }
}
