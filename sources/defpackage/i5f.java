package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i5f extends gbe implements l26 {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j5f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5f(j5f j5fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j5fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        i5f i5fVar = new i5f(this.this$0, xn2Var);
        i5fVar.L$0 = obj;
        return i5fVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        l2f l2fVar;
        Object objA;
        wk9 wk9Var;
        ReentrantLock reentrantLock;
        vk9[] vk9VarArr;
        vk9 vk9Var;
        wk9 wk9Var2;
        ReentrantLock reentrantLock2;
        boolean z;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        boolean z2 = false;
        if (i == 0) {
            jzb.q(obj);
            l2fVar = (l2f) this.L$0;
            this.L$0 = l2fVar;
            this.label = 1;
            objA = l2fVar.a(this);
            if (objA != bw2Var) {
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            reentrantLock2 = (ReentrantLock) this.L$1;
            wk9Var2 = (wk9) this.L$0;
            try {
                jzb.q(obj);
                reentrantLock = reentrantLock2;
                wk9Var = wk9Var2;
                wk9Var.f = false;
                reentrantLock.unlock();
                return wefVar;
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    wk9Var2.f = z;
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock = reentrantLock2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        l2fVar = (l2f) this.L$0;
        jzb.q(obj);
        objA = obj;
        if (((Boolean) objA).booleanValue()) {
            return wefVar;
        }
        j5f j5fVar = this.this$0;
        wk9Var = j5fVar.h;
        reentrantLock = wk9Var.e;
        reentrantLock.lock();
        try {
            wk9Var.f = true;
            ReentrantLock reentrantLock3 = wk9Var.a;
            reentrantLock3.lock();
            try {
                if (wk9Var.d) {
                    wk9Var.d = false;
                    int length = wk9Var.b.length;
                    vk9VarArr = new vk9[length];
                    int i2 = 0;
                    boolean z3 = false;
                    while (i2 < length) {
                        boolean z4 = wk9Var.b[i2] > 0 ? true : z2;
                        boolean[] zArr = wk9Var.c;
                        if (z4 != zArr[i2]) {
                            zArr[i2] = z4;
                            vk9Var = z4 ? vk9.b : vk9.c;
                            z3 = true;
                        } else {
                            vk9Var = vk9.a;
                        }
                        vk9VarArr[i2] = vk9Var;
                        i2++;
                        z2 = false;
                    }
                    if (!z3) {
                        vk9VarArr = null;
                    }
                } else {
                    vk9VarArr = null;
                }
                reentrantLock3.unlock();
                if (vk9VarArr != null) {
                    try {
                        if (vk9VarArr.length != 0) {
                            k2f k2fVar = k2f.b;
                            h5f h5fVar = new h5f(vk9VarArr, j5fVar, l2fVar, null);
                            this.L$0 = wk9Var;
                            this.L$1 = reentrantLock;
                            this.label = 2;
                            if (l2fVar.b(k2fVar, h5fVar, this) != bw2Var) {
                                wk9Var2 = wk9Var;
                                reentrantLock2 = reentrantLock;
                                reentrantLock = reentrantLock2;
                                wk9Var = wk9Var2;
                            }
                            return bw2Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        wk9Var2 = wk9Var;
                        reentrantLock2 = reentrantLock;
                        z = false;
                        wk9Var2.f = z;
                        throw th;
                    }
                }
                wk9Var.f = false;
                reentrantLock.unlock();
                return wefVar;
            } catch (Throwable th4) {
                reentrantLock3.unlock();
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i5f) k((xn2) obj2, (l2f) obj)).r(wef.a);
    }
}
