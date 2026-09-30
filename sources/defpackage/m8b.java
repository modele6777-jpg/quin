package defpackage;

import timber.log.Timber;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m8b {
    public final String a;

    public m8b(String str) {
        this.a = str;
    }

    public final void a(String str, Object... objArr) {
        iy9 iy9VarP = y41.p(str, objArr);
        String str2 = (String) iy9VarP.a();
        Throwable th = (Throwable) iy9VarP.b();
        String str3 = this.a;
        if (th != null) {
            nx2 nx2Var = Timber.a;
            nx2Var.l(str3);
            nx2Var.b(th, str2, new Object[0]);
        } else {
            nx2 nx2Var2 = Timber.a;
            nx2Var2.l(str3);
            nx2Var2.a(str2, new Object[0]);
        }
    }

    public final void b(String str) {
        nx2 nx2Var = Timber.a;
        nx2Var.l(this.a);
        nx2Var.c(str, new Object[0]);
    }

    public final void c(String str, Throwable th) {
        str.getClass();
        th.getClass();
        nx2 nx2Var = Timber.a;
        nx2Var.l(this.a);
        nx2Var.d(th, str, new Object[0]);
    }

    public final void d(String str, Object... objArr) {
        iy9 iy9VarP = y41.p(str, objArr);
        String str2 = (String) iy9VarP.a();
        Throwable th = (Throwable) iy9VarP.b();
        String str3 = this.a;
        if (th != null) {
            nx2 nx2Var = Timber.a;
            nx2Var.l(str3);
            nx2Var.d(th, str2, new Object[0]);
        } else {
            nx2 nx2Var2 = Timber.a;
            nx2Var2.l(str3);
            nx2Var2.c(str2, new Object[0]);
        }
    }

    public final void e(String str) {
        str.getClass();
        nx2 nx2Var = Timber.a;
        nx2Var.l(this.a);
        nx2Var.e(str, new Object[0]);
    }

    public final void f(String str, Object... objArr) {
        iy9 iy9VarP = y41.p(str, objArr);
        String str2 = (String) iy9VarP.a();
        Throwable th = (Throwable) iy9VarP.b();
        String str3 = this.a;
        if (th != null) {
            nx2 nx2Var = Timber.a;
            nx2Var.l(str3);
            nx2Var.f(th, str2, new Object[0]);
        } else {
            nx2 nx2Var2 = Timber.a;
            nx2Var2.l(str3);
            nx2Var2.e(str2, new Object[0]);
        }
    }

    public final void g(String str) {
        nx2 nx2Var = Timber.a;
        nx2Var.l(this.a);
        nx2Var.i(str, new Object[0]);
    }

    public final void h(String str, Throwable th) {
        nx2 nx2Var = Timber.a;
        nx2Var.l(this.a);
        nx2Var.j(th, str, new Object[0]);
    }
}
