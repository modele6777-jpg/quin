package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h8g {
    public static final h8g b;
    public final e8g a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = c8g.x;
        } else if (i >= 30) {
            b = a8g.w;
        } else {
            b = e8g.b;
        }
    }

    public h8g(h8g h8gVar) {
        if (h8gVar == null) {
            this.a = new e8g(this);
            return;
        }
        e8g e8gVar = h8gVar.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (e8gVar instanceof d8g)) {
            this.a = new d8g(this, (d8g) e8gVar);
        } else if (i >= 34 && (e8gVar instanceof c8g)) {
            this.a = new c8g(this, (c8g) e8gVar);
        } else if (i >= 31 && (e8gVar instanceof b8g)) {
            this.a = new b8g(this, (b8g) e8gVar);
        } else if (i >= 30 && (e8gVar instanceof a8g)) {
            this.a = new a8g(this, (a8g) e8gVar);
        } else if (i >= 29 && (e8gVar instanceof z7g)) {
            this.a = new z7g(this, (z7g) e8gVar);
        } else if (i >= 28 && (e8gVar instanceof y7g)) {
            this.a = new y7g(this, (y7g) e8gVar);
        } else if (e8gVar instanceof x7g) {
            this.a = new x7g(this, (x7g) e8gVar);
        } else if (e8gVar instanceof w7g) {
            this.a = new w7g(this, (w7g) e8gVar);
        } else {
            this.a = new e8g(this);
        }
        e8gVar.e(this);
    }

    public static x47 a(x47 x47Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, x47Var.a - i);
        int iMax2 = Math.max(0, x47Var.b - i2);
        int iMax3 = Math.max(0, x47Var.c - i3);
        int iMax4 = Math.max(0, x47Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? x47Var : x47.b(iMax, iMax2, iMax3, iMax4);
    }

    public static h8g c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        h8g h8gVar = new h8g(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = nvf.a;
            h8g h8gVarA = gvf.a(view);
            e8g e8gVar = h8gVar.a;
            e8gVar.y(h8gVarA);
            View rootView = view.getRootView();
            e8gVar.d(rootView);
            e8gVar.p(rootView);
            e8gVar.q();
            e8gVar.A(view.getWindowSystemUiVisibility());
        }
        return h8gVar;
    }

    public final WindowInsets b() {
        e8g e8gVar = this.a;
        if (e8gVar instanceof w7g) {
            return ((w7g) e8gVar).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h8g) {
            return Objects.equals(this.a, ((h8g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        e8g e8gVar = this.a;
        if (e8gVar == null) {
            return 0;
        }
        return e8gVar.hashCode();
    }

    public h8g(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new d8g(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new c8g(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new b8g(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new a8g(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new z7g(this, windowInsets);
        } else if (i >= 28) {
            this.a = new y7g(this, windowInsets);
        } else {
            this.a = new x7g(this, windowInsets);
        }
    }
}
