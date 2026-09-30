package defpackage;

import android.content.Context;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m4 implements ejb, f00, sx, i5h {
    public final /* synthetic */ int a;
    public Object b;

    public m4(int i) {
        this.a = i;
        switch (i) {
            case 4:
                break;
            case 5:
                this.b = new Object();
                break;
            case 9:
                this.b = new ConcurrentHashMap();
                break;
            default:
                q69 q69Var = v67.a;
                this.b = new q69();
                break;
        }
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void l0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public void A0() {
        m3h m3hVar = ((w3h) this.b).g;
        w3h.h(m3hVar);
        m3hVar.A0();
    }

    @Override // defpackage.i5h
    public hj6 E() {
        throw null;
    }

    @Override // defpackage.i5h
    public m3h Z() {
        throw null;
    }

    @Override // defpackage.i5h
    public Context a0() {
        throw null;
    }

    @Override // defpackage.f00
    public h10 getAnnotations() {
        h10 h10Var = (h10) this.b;
        if (h10Var != null) {
            return h10Var;
        }
        l0(1);
        throw null;
    }

    @Override // defpackage.ejb, defpackage.prf
    public tt7 getType() {
        tt7 tt7Var = (tt7) this.b;
        if (tt7Var != null) {
            return tt7Var;
        }
        k0(1);
        throw null;
    }

    @Override // defpackage.sx
    public List i0() {
        return (List) this.b;
    }

    @Override // defpackage.sx
    public boolean j0() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((bp7) list.get(0)).c());
    }

    public abstract void m0(szc szcVar);

    public abstract void n0(qxc qxcVar);

    public abstract void o0();

    @Override // defpackage.i5h
    public w1e p() {
        throw null;
    }

    public abstract void p0();

    public abstract vz7 q0(int i, int i2, int i3, long j);

    public abstract String r0();

    public List s0(uz7 uz7Var, int i, long j) {
        q69 q69Var = (q69) this.b;
        List list = (List) q69Var.b(i);
        if (list != null) {
            return list;
        }
        List listA = uz7Var.a(i);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((tn8) listA.get(i2)).v(j));
        }
        q69Var.i(i, arrayList);
        return arrayList;
    }

    public abstract a26 t0(qxc qxcVar);

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public abstract void u0(yv1 yv1Var);

    @Override // defpackage.i5h
    public w0h v() {
        throw null;
    }

    public abstract Object v0();

    public Object w0(kgh kghVar, mxb mxbVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj = concurrentHashMap.get(kghVar);
        if (obj != null) {
            return obj;
        }
        Object objV0 = v0();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(kghVar, objV0);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iM = mxbVar.m();
        for (int i = 0; i < iM; i++) {
            if (bgh.f.equals(mxbVar.o(i))) {
                mxbVar.q(i);
            }
        }
        return objV0;
    }

    public abstract boolean x0(Level level);

    public abstract void y0(yfh yfhVar);

    public void z0(RuntimeException runtimeException, yfh yfhVar) {
        b1.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public m4(w3h w3hVar) {
        this.a = 8;
        oa7.A(w3hVar);
        this.b = w3hVar;
    }

    public m4(h10 h10Var) {
        this.a = 1;
        if (h10Var != null) {
            this.b = h10Var;
        } else {
            l0(0);
            throw null;
        }
    }

    public m4(tt7 tt7Var) {
        this.a = 0;
        if (tt7Var != null) {
            this.b = tt7Var;
        } else {
            k0(0);
            throw null;
        }
    }

    public /* synthetic */ m4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
