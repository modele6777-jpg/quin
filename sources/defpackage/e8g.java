package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class e8g {
    public static final h8g b;
    public final h8g a;

    static {
        v7g p7gVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            p7gVar = new u7g();
        } else if (i >= 35) {
            p7gVar = new t7g();
        } else if (i >= 34) {
            p7gVar = new s7g();
        } else if (i >= 31) {
            p7gVar = new r7g();
        } else if (i >= 30) {
            p7gVar = new q7g();
        } else {
            p7gVar = i >= 29 ? new p7g() : new o7g();
        }
        b = p7gVar.b().a.a().a.b().a.c();
    }

    public e8g(h8g h8gVar) {
        this.a = h8gVar;
    }

    public h8g a() {
        return this.a;
    }

    public h8g b() {
        return this.a;
    }

    public h8g c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8g)) {
            return false;
        }
        e8g e8gVar = (e8g) obj;
        return t() == e8gVar.t() && s() == e8gVar.s() && Objects.equals(n(), e8gVar.n()) && Objects.equals(l(), e8gVar.l()) && Objects.equals(h(), e8gVar.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public ha4 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public x47 i(int i) {
        return x47.e;
    }

    public x47 j(int i) {
        if ((i & 8) == 0) {
            return x47.e;
        }
        qc0.j("Unable to query the maximum insets for IME");
        return null;
    }

    public x47 k() {
        return n();
    }

    public x47 l() {
        return x47.e;
    }

    public x47 m() {
        return n();
    }

    public x47 n() {
        return x47.e;
    }

    public x47 o() {
        return n();
    }

    public h8g r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(h8g h8gVar) {
    }

    public void p(View view) {
    }

    public void v(ma4 ma4Var) {
    }

    public void w(x47[] x47VarArr) {
    }

    public void x(x47 x47Var) {
    }

    public void y(h8g h8gVar) {
    }

    public void z(x47 x47Var) {
    }
}
