package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hg7 extends he8 implements ta4, x07 {
    public rg7 d;

    @Override // defpackage.ta4
    public final void a() {
        hg7 hg7Var;
        Unsafe unsafe;
        long j;
        rg7 rg7VarL = l();
        while (true) {
            Object objK = rg7VarL.K();
            if (objK instanceof hg7) {
                if (objK != this) {
                    return;
                }
                do {
                    unsafe = ud0.a;
                    j = rg7.b;
                    if (unsafe.compareAndSwapObject(rg7VarL, j, objK, sg7.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(rg7VarL, j) == objK);
            } else {
                if (!(objK instanceof x07) || ((x07) objK).d() == null) {
                    return;
                }
                while (true) {
                    Object objH = this.h();
                    if (objH instanceof mqb) {
                        return;
                    }
                    if (objH == this) {
                        return;
                    }
                    objH.getClass();
                    he8 he8Var = (he8) objH;
                    Unsafe unsafe2 = ud0.a;
                    long j2 = he8.c;
                    mqb mqbVar = (mqb) unsafe2.getObjectVolatile(he8Var, j2);
                    if (mqbVar == null) {
                        mqbVar = new mqb(he8Var);
                        unsafe2.putObjectVolatile(he8Var, j2, mqbVar);
                    }
                    mqb mqbVar2 = mqbVar;
                    while (true) {
                        Unsafe unsafe3 = ud0.a;
                        long j3 = he8.a;
                        hg7Var = this;
                        if (unsafe3.compareAndSwapObject(hg7Var, j3, objH, mqbVar2)) {
                            he8Var.f();
                            return;
                        } else if (unsafe3.getObjectVolatile(hg7Var, j3) != objH) {
                            break;
                        } else {
                            this = hg7Var;
                        }
                    }
                    this = hg7Var;
                }
            }
        }
    }

    @Override // defpackage.x07
    public final boolean b() {
        return true;
    }

    @Override // defpackage.x07
    public final ag9 d() {
        return null;
    }

    public dg7 getParent() {
        return l();
    }

    public final rg7 l() {
        rg7 rg7Var = this.d;
        if (rg7Var != null) {
            return rg7Var;
        }
        pa7.g0("job");
        throw null;
    }

    public abstract boolean m();

    public abstract void n(Throwable th);

    @Override // defpackage.he8
    public final String toString() {
        return getClass().getSimpleName() + '@' + mh3.F(this) + "[job@" + mh3.F(l()) + ']';
    }
}
