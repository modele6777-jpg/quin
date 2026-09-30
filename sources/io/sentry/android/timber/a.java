package io.sentry.android.timber;

import defpackage.gxe;
import io.sentry.d;
import io.sentry.g;
import io.sentry.i5;
import io.sentry.internal.debugmeta.c;
import io.sentry.l0;
import io.sentry.protocol.p;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.s4;
import io.sentry.t4;
import io.sentry.u5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends gxe {
    public final q5 b;
    public final q5 c;
    public final u5 d;
    public final ThreadLocal e;

    public a(q5 q5Var, q5 q5Var2, u5 u5Var) {
        q5Var.getClass();
        q5Var2.getClass();
        u5Var.getClass();
        this.b = q5Var;
        this.c = q5Var2;
        this.d = u5Var;
        this.e = new ThreadLocal();
    }

    @Override // defpackage.gxe
    public final void a(String str, Object... objArr) {
        super.a(str, Arrays.copyOf(objArr, objArr.length));
        k(3, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.gxe
    public final void b(Throwable th, String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        h(3, th, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        k(3, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.gxe
    public final void c(String str, Object... objArr) {
        super.c(str, Arrays.copyOf(objArr, objArr.length));
        k(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.gxe
    public final void d(Throwable th, String str, Object... objArr) {
        super.d(th, str, Arrays.copyOf(objArr, objArr.length));
        k(6, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.gxe
    public final void e(String str, Object... objArr) {
        super.e(str, Arrays.copyOf(objArr, objArr.length));
        k(4, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.gxe
    public final void f(Throwable th, String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        h(4, th, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        k(4, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.gxe
    public final void g(int i, String str, String str2, Throwable th) {
        str2.getClass();
        this.e.set(str);
    }

    @Override // defpackage.gxe
    public final void i(String str, Object... objArr) {
        super.i(str, Arrays.copyOf(objArr, objArr.length));
        k(5, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.gxe
    public final void j(Throwable th, String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        h(5, th, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        k(5, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void k(int i, Throwable th, String str, Object... objArr) {
        q5 q5Var;
        u5 u5Var;
        d dVar;
        g gVar;
        ThreadLocal threadLocal = this.e;
        String str2 = (String) threadLocal.get();
        if (str2 != null) {
            threadLocal.remove();
        }
        if ((str == null || str.length() == 0) && th == null) {
            return;
        }
        switch (i) {
            case 2:
                q5Var = q5.DEBUG;
                break;
            case 3:
                q5Var = q5.DEBUG;
                break;
            case 4:
                q5Var = q5.INFO;
                break;
            case 5:
                q5Var = q5.WARNING;
                break;
            case 6:
                q5Var = q5.ERROR;
                break;
            case 7:
                q5Var = q5.FATAL;
                break;
            default:
                q5Var = q5.DEBUG;
                break;
        }
        switch (i) {
            case 2:
                u5Var = u5.TRACE;
                break;
            case 3:
                u5Var = u5.DEBUG;
                break;
            case 4:
                u5Var = u5.INFO;
                break;
            case 5:
                u5Var = u5.WARN;
                break;
            case 6:
                u5Var = u5.ERROR;
                break;
            case 7:
                u5Var = u5.FATAL;
                break;
            default:
                u5Var = u5.DEBUG;
                break;
        }
        p pVar = new p();
        pVar.b = str;
        if (str != null && str.length() != 0 && objArr.length != 0) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            pVar.a = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(String.valueOf(obj));
        }
        pVar.c = new ArrayList(arrayList);
        if (q5Var.ordinal() >= this.b.ordinal()) {
            i5 i5Var = new i5();
            i5Var.J0 = q5Var;
            if (th != null) {
                i5Var.x = th;
            }
            if (str2 != null) {
                i5Var.b("TimberTag", str2);
            }
            i5Var.F0 = pVar;
            i5Var.G0 = "Timber";
            q4.b().C(i5Var, new l0());
        }
        if (q5Var.ordinal() >= this.c.ordinal()) {
            String message = th != null ? th.getMessage() : null;
            if (pVar.b != null) {
                gVar = new g();
                gVar.w = q5Var;
                gVar.g = "Timber";
                String str3 = pVar.a;
                if (str3 == null) {
                    str3 = pVar.b;
                }
                gVar.d = str3;
            } else if (message != null) {
                g gVar2 = new g();
                gVar2.e = "error";
                gVar2.d = message;
                gVar2.w = q5.ERROR;
                gVar2.g = "exception";
                gVar = gVar2;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                q4.b().i(gVar, new l0());
            }
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        if (u5Var.ordinal() >= this.d.ordinal()) {
            if (str2 != null) {
                s4[] s4VarArr = {new s4(t4.STRING, str2)};
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1);
                dVar = new d(1, concurrentHashMap);
                s4 s4Var = s4VarArr[0];
                if (s4Var != null) {
                    concurrentHashMap.put("timber.tag", s4Var);
                }
            } else {
                dVar = null;
            }
            c cVar = new c();
            cVar.b = dVar;
            cVar.c = "auto.log.timber";
            String message2 = th != null ? th.getMessage() : null;
            if (str != null && message2 != null) {
                q4.b().t().d(u5Var, cVar, str + '\n' + message2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                return;
            }
            if (str != null) {
                q4.b().t().d(u5Var, cVar, str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            } else if (message2 != null) {
                q4.b().t().d(u5Var, cVar, message2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            }
        }
    }
}
