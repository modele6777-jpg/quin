package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o4h extends vff {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4h(Unsafe unsafe, int i) {
        super(unsafe, 3);
        this.c = i;
    }

    @Override // defpackage.vff
    public final double k(long j, Object obj) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // defpackage.vff
    public final float m(long j, Object obj) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // defpackage.vff
    public final void o(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!s4h.e) {
                    s4h.f(obj, j, z);
                } else {
                    s4h.e(obj, j, z);
                }
                break;
            default:
                if (!s4h.e) {
                    s4h.f(obj, j, z);
                } else {
                    s4h.e(obj, j, z);
                }
                break;
        }
    }

    @Override // defpackage.vff
    public final void q(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.vff
    public final void r(Object obj, long j, float f) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.vff
    public final boolean t(long j, Object obj) {
        switch (this.c) {
            case 0:
                return s4h.e ? s4h.i(j, obj) : s4h.j(j, obj);
            default:
                return s4h.e ? s4h.i(j, obj) : s4h.j(j, obj);
        }
    }
}
