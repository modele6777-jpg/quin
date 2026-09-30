package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kk2 implements x8c {
    public final x8c a;

    public kk2(x8c x8cVar) {
        this.a = x8cVar;
    }

    @Override // defpackage.x8c
    public final void Q(int i, String str) {
        str.getClass();
        this.a.Q(i, str);
    }

    @Override // defpackage.x8c
    public final boolean R0() {
        return this.a.R0();
    }

    @Override // defpackage.x8c
    public final boolean T() {
        return this.a.T();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        x8c x8cVar = this.a;
        x8cVar.reset();
        x8cVar.s();
    }

    @Override // defpackage.x8c
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // defpackage.x8c
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // defpackage.x8c
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // defpackage.x8c
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // defpackage.x8c
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // defpackage.x8c
    public final void m(int i, long j) {
        this.a.m(i, j);
    }

    @Override // defpackage.x8c
    public final void n(byte[] bArr, int i) {
        this.a.n(bArr, i);
    }

    @Override // defpackage.x8c
    public final void o(int i) {
        this.a.o(i);
    }

    @Override // defpackage.x8c
    public final void reset() {
        this.a.reset();
    }

    @Override // defpackage.x8c
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.x8c
    public final String t0(int i) {
        return this.a.t0(i);
    }
}
