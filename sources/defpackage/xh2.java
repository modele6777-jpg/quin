package defpackage;

import io.sentry.d;
import io.sentry.h7;
import io.sentry.instrumentation.file.a;
import io.sentry.o1;
import io.sentry.o5;
import io.sentry.q6;
import io.sentry.util.p;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xh2 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = h7.OK;
    public Object f;

    public xh2(o1 o1Var, File file, q6 q6Var) {
        this.b = o1Var;
        this.c = file;
        this.d = q6Var;
        this.f = new d(2, q6Var);
        o5.d().a("FileIO");
    }

    public void a(Closeable closeable) {
        o1 o1Var = (o1) this.b;
        try {
            try {
                closeable.close();
                b();
            } catch (IOException e) {
                this.e = h7.INTERNAL_ERROR;
                if (o1Var != null) {
                    o1Var.g(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    public void b() {
        String strJ;
        File file = (File) this.c;
        q6 q6Var = (q6) this.d;
        o1 o1Var = (o1) this.b;
        if (o1Var != null) {
            String strA = p.a(this.a);
            if (file != null) {
                String strA2 = p.a(this.a);
                if (q6Var.isSendDefaultPii()) {
                    strJ = file.getName() + " (" + strA2 + ")";
                } else {
                    int iLastIndexOf = file.getName().lastIndexOf(46);
                    strJ = (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() + (-1)) ? ib8.j("*** (", strA2, ")") : tec.m("***", file.getName().substring(iLastIndexOf), " (", strA2, ")");
                }
                o1Var.p(strJ);
                if (q6Var.isSendDefaultPii()) {
                    o1Var.k(file.getAbsolutePath(), "file.path");
                }
            } else {
                o1Var.p(strA);
            }
            o1Var.k(Long.valueOf(this.a), "file.size");
            boolean zC = q6Var.getThreadChecker().c();
            o1Var.k(Boolean.valueOf(zC), "blocked_main_thread");
            if (zC) {
                o1Var.k(((d) this.f).d(), "call_stack");
            }
            o1Var.h((h7) this.e);
        }
    }

    public Object c(a aVar) throws IOException {
        try {
            Object objCall = aVar.call();
            if (objCall instanceof Integer) {
                int iIntValue = ((Integer) objCall).intValue();
                if (iIntValue != -1) {
                    this.a += (long) iIntValue;
                    return objCall;
                }
            } else if (objCall instanceof Long) {
                long jLongValue = ((Long) objCall).longValue();
                if (jLongValue != -1) {
                    this.a += jLongValue;
                }
            }
            return objCall;
        } catch (IOException e) {
            this.e = h7.INTERNAL_ERROR;
            o1 o1Var = (o1) this.b;
            if (o1Var != null) {
                o1Var.g(e);
            }
            throw e;
        }
    }
}
