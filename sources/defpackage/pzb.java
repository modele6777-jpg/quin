package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pzb implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ qzb c;

    public pzb(qzb qzbVar, Class cls) {
        this.c = qzbVar;
        this.b = cls;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006a A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        at6 at6VarB;
        Object obj2;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        jy4 jy4Var = tea.b;
        if (jy4Var.r(method)) {
            return jy4Var.p(method, cls, obj, objArr2);
        }
        qzb qzbVar = this.c;
        while (true) {
            Object objPutIfAbsent = qzbVar.a.get(method);
            if (!(objPutIfAbsent instanceof at6)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = qzbVar.a.get(method);
                        if (obj2 == null) {
                            at6VarB = (at6) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = qzbVar.a.putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = qzbVar.a.get(method);
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                at6VarB = (at6) obj2;
                                break;
                            }
                            try {
                                at6VarB = at6.b(qzbVar, cls, method);
                                qzbVar.a.put(method, at6VarB);
                                break;
                            } catch (Throwable th2) {
                                qzbVar.a.remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                at6VarB = (at6) objPutIfAbsent;
                break;
            }
        }
        return at6VarB.a(new fm9(at6VarB.a, obj, objArr2, at6VarB.b, at6VarB.c), objArr2);
    }
}
