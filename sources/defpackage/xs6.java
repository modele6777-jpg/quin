package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xs6 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public xs6(Context context, Looper looper) {
        this.c = new vea(20, context.getApplicationContext());
        this.d = new jce(new Handler(looper, null));
        this.e = new jce(new Handler(Looper.getMainLooper(), null));
    }

    public static void a(Object obj, ArrayList arrayList, x xVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) xVar.d(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, xVar);
            }
        }
    }

    public static h69 c(xt7 xt7Var) {
        tjd tjdVarS;
        tjd tjdVarS2;
        String str = qf7.a;
        xt7Var.getClass();
        bj5 bj5VarR = db6.r(xt7Var);
        if (bj5VarR == null || (tjdVarS = db6.u0(bj5VarR)) == null) {
            tjdVarS = db6.s(xt7Var);
            tjdVarS.getClass();
        }
        oy4 oy4Var = w8f.a;
        y22 y22VarM = tjdVarS.c0().m();
        u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
        if (qf7.k.containsKey(u09Var != null ? oz3.f(u09Var) : null)) {
            return h69.a;
        }
        bj5 bj5VarR2 = db6.r(xt7Var);
        if (bj5VarR2 == null || (tjdVarS2 = db6.e1(bj5VarR2)) == null) {
            tjdVarS2 = db6.s(xt7Var);
            tjdVarS2.getClass();
        }
        y22 y22VarM2 = tjdVarS2.c0().m();
        u09 u09Var2 = y22VarM2 instanceof u09 ? (u09) y22VarM2 : null;
        if (qf7.j.containsKey(u09Var2 != null ? oz3.f(u09Var2) : null)) {
            return h69.b;
        }
        return null;
    }

    public static vj9 d(xt7 xt7Var) {
        tjd tjdVarS;
        tjd tjdVarS2;
        xt7Var.getClass();
        bj5 bj5VarR = db6.r(xt7Var);
        if (bj5VarR == null || (tjdVarS = db6.u0(bj5VarR)) == null) {
            tjdVarS = db6.s(xt7Var);
            tjdVarS.getClass();
        }
        if (db6.l0(tjdVarS)) {
            return vj9.b;
        }
        bj5 bj5VarR2 = db6.r(xt7Var);
        if (bj5VarR2 == null || (tjdVarS2 = db6.e1(bj5VarR2)) == null) {
            tjdVarS2 = db6.s(xt7Var);
            tjdVarS2.getClass();
        }
        if (db6.l0(tjdVarS2)) {
            return null;
        }
        return vj9.c;
    }

    public dag b(e8f e8fVar) {
        List list;
        vj9 vj9Var;
        e8fVar.getClass();
        if (!(e8fVar instanceof my7)) {
            return null;
        }
        List upperBounds = ((c8f) e8fVar).getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!db6.g0((xt7) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (d((xt7) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                lw7 lw7VarN = eb3.N(z18.c, new e5(upperBounds, this));
                boolean zIsEmpty = arrayList.isEmpty();
                vj9 vj9Var2 = vj9.a;
                if (!zIsEmpty) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            ((xt7) it2.next()).getClass();
                            list = upperBounds;
                        }
                    }
                    return new dag(vj9Var2, false);
                }
                if (((List) lw7VarN.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) lw7VarN.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        ((xt7) it3.next()).getClass();
                        list = (List) lw7VarN.getValue();
                    }
                }
                return new dag(vj9Var2, true);
                if (list != null && list.isEmpty()) {
                    vj9Var = vj9.b;
                    break;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        vj9Var = vj9.b;
                        break;
                    }
                    if (!db6.n0((xt7) it4.next())) {
                        vj9Var = vj9.c;
                        break;
                    }
                }
                return new dag(vj9Var, list != upperBounds);
            }
        }
        return null;
    }

    public void e(final boolean z, final boolean z2) {
        jce jceVar = (jce) this.d;
        if (z && z2) {
            jceVar.e(new Runnable() { // from class: lzf
                @Override // java.lang.Runnable
                public final void run() {
                    ((vea) this.a.c).D(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        jce jceVar2 = (jce) this.e;
        jceVar2.a.postDelayed(new xu8(29, this, atomicBoolean), 1000L);
        jceVar.e(new Runnable() { // from class: mzf
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                ((vea) this.a.c).D(z, z2);
            }
        });
    }

    public void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.a) {
            e(true, z);
        }
    }

    public ArrayList g(xt7 xt7Var) {
        szc szcVar = (szc) this.d;
        xf7 xf7Var = (xf7) ((lw7) szcVar.d).getValue();
        b10 b10Var = ((mf7) szcVar.b).j;
        xt7Var.getClass();
        f5 f5Var = new f5(xt7Var, b10.b(b10Var, xf7Var, ((tt7) xt7Var).getAnnotations()), null);
        x xVar = new x(3, this);
        ArrayList arrayList = new ArrayList(1);
        a(f5Var, arrayList, xVar);
        return arrayList;
    }

    public xs6(f00 f00Var, boolean z, szc szcVar, y00 y00Var, boolean z2) {
        szcVar.getClass();
        this.c = f00Var;
        this.a = z;
        this.d = szcVar;
        this.e = y00Var;
        this.b = z2;
    }

    public xs6(Context context, String str, sug sugVar, boolean z, boolean z2) {
        sugVar.getClass();
        this.c = context;
        this.e = str;
        this.d = sugVar;
        this.a = z;
        this.b = z2;
    }

    public xs6(String str, byte[] bArr) {
        this.c = bArr;
        this.e = str;
        this.d = null;
        this.a = false;
        this.b = true;
    }

    public xs6(Exception exc, boolean z, String str) {
        this.c = null;
        this.e = str;
        this.d = exc;
        this.a = z;
        this.b = false;
    }
}
