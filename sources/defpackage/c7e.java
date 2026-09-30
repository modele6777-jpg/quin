package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c7e extends ncd implements q0e {
    @Override // defpackage.q0e
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.v;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.w + ((long) ((int) ((r() + ((long) this.y)) - this.w)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void y(int i) {
        synchronized (this) {
            Object[] objArr = this.v;
            objArr.getClass();
            i(Integer.valueOf(((Number) objArr[((int) ((this.w + ((long) ((int) ((r() + ((long) this.y)) - this.w)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
