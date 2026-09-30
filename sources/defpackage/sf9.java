package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sf9 {
    public sf9 a = null;
    public sf9 b = null;
    public sf9 c = null;
    public sf9 d = null;
    public sf9 e = null;
    public ArrayList f = null;

    public abstract void a(sug sugVar);

    public final void b(vtd vtdVar) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(vtdVar);
    }

    public void c(sf9 sf9Var) {
        sf9Var.i();
        sf9Var.f(this);
        sf9 sf9Var2 = this.c;
        if (sf9Var2 != null) {
            sf9Var2.e = sf9Var;
            sf9Var.d = sf9Var2;
        } else {
            this.b = sf9Var;
        }
        this.c = sf9Var;
    }

    public final List d() {
        ArrayList arrayList = this.f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final void e(sf9 sf9Var) {
        sf9Var.i();
        sf9 sf9Var2 = this.e;
        sf9Var.e = sf9Var2;
        if (sf9Var2 != null) {
            sf9Var2.d = sf9Var;
        }
        sf9Var.d = this;
        this.e = sf9Var;
        sf9 sf9Var3 = this.a;
        sf9Var.a = sf9Var3;
        if (sf9Var.e == null) {
            sf9Var3.c = sf9Var;
        }
    }

    public void f(sf9 sf9Var) {
        this.a = sf9Var;
    }

    public final void g(List list) {
        if (list.isEmpty()) {
            this.f = null;
        } else {
            this.f = new ArrayList(list);
        }
    }

    public String h() {
        return "";
    }

    public final void i() {
        sf9 sf9Var = this.d;
        if (sf9Var != null) {
            sf9Var.e = this.e;
        } else {
            sf9 sf9Var2 = this.a;
            if (sf9Var2 != null) {
                sf9Var2.b = this.e;
            }
        }
        sf9 sf9Var3 = this.e;
        if (sf9Var3 != null) {
            sf9Var3.d = sf9Var;
        } else {
            sf9 sf9Var4 = this.a;
            if (sf9Var4 != null) {
                sf9Var4.c = sf9Var;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return ub3.k(getClass().getSimpleName(), "{", h(), "}");
    }
}
