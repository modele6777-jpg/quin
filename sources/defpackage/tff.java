package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tff extends vff {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tff(Unsafe unsafe, int i) {
        super(unsafe, 0);
        this.c = i;
    }

    @Override // defpackage.vff
    public final boolean a(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (wff.g) {
                    if (wff.f(j, obj) == 0) {
                        return false;
                    }
                } else if (wff.g(j, obj) == 0) {
                    return false;
                }
                return true;
            case 1:
                if (wff.g) {
                    if (wff.f(j, obj) == 0) {
                        return false;
                    }
                } else if (wff.g(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                return this.b.getBoolean(obj, j);
        }
    }

    @Override // defpackage.vff
    public final byte b(long j, Object obj) {
        switch (this.c) {
            case 0:
                return wff.g ? wff.f(j, obj) : wff.g(j, obj);
            case 1:
                return wff.g ? wff.f(j, obj) : wff.g(j, obj);
            default:
                return this.b.getByte(obj, j);
        }
    }

    @Override // defpackage.vff
    public final double c(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            default:
                return this.b.getDouble(obj, j);
        }
    }

    @Override // defpackage.vff
    public final float d(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            default:
                return this.b.getFloat(obj, j);
        }
    }

    @Override // defpackage.vff
    public final void e(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!wff.g) {
                    wff.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    wff.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            case 1:
                if (!wff.g) {
                    wff.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    wff.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                this.b.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // defpackage.vff
    public final void f(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (!wff.g) {
                    wff.n(obj, j, b);
                } else {
                    wff.m(obj, j, b);
                }
                break;
            case 1:
                if (!wff.g) {
                    wff.n(obj, j, b);
                } else {
                    wff.m(obj, j, b);
                }
                break;
            default:
                this.b.putByte(obj, j, b);
                break;
        }
    }

    @Override // defpackage.vff
    public final void g(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putDouble(obj, j, d);
                break;
        }
    }

    @Override // defpackage.vff
    public final void h(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.b.putFloat(obj, j, f);
                break;
        }
    }

    @Override // defpackage.vff
    public boolean i() {
        switch (this.c) {
            case 2:
                if (!super.i()) {
                    return false;
                }
                try {
                    Class<?> cls = this.b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    wff.k(th);
                    return false;
                }
            default:
                return super.i();
        }
    }

    @Override // defpackage.vff
    public final boolean j() {
        switch (this.c) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.b;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (wff.c() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        wff.k(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    wff.k(th2);
                    return false;
                }
        }
    }
}
