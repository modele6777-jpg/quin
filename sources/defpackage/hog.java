package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hog extends vff {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hog(Unsafe unsafe, int i) {
        super(unsafe, 2);
        this.c = i;
    }

    @Override // defpackage.vff
    public final void l(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (!iog.f) {
                    iog.c(obj, j, b);
                } else {
                    iog.b(obj, j, b);
                }
                break;
            default:
                if (!iog.f) {
                    iog.c(obj, j, b);
                } else {
                    iog.b(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.vff
    public final boolean n(long j, Object obj) {
        switch (this.c) {
            case 0:
                return iog.f ? iog.m(j, obj) : iog.n(j, obj);
            default:
                return iog.f ? iog.m(j, obj) : iog.n(j, obj);
        }
    }

    @Override // defpackage.vff
    public final void o(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!iog.f) {
                    iog.c(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    iog.b(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!iog.f) {
                    iog.c(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    iog.b(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.vff
    public final float p(long j, Object obj) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
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
    public final double s(long j, Object obj) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // defpackage.vff
    public final void u(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }
}
