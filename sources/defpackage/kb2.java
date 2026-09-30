package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kb2 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public bc2 f;
    public final HashSet g;

    public kb2(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(y3b.a(cls));
        for (Class cls2 : clsArr) {
            tm7.q(cls2, "Null interface");
            this.b.add(y3b.a(cls2));
        }
    }

    public final void a(xw3 xw3Var) {
        if (this.b.contains(xw3Var.a)) {
            qc0.j("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(xw3Var);
        }
    }

    public final lb2 b() {
        if (this.f != null) {
            return new lb2(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        qc0.p("Missing required property: factory.");
        return null;
    }

    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            qc0.p("Instantiation type has already been set.");
        }
    }

    public kb2(y3b y3bVar, y3b... y3bVarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(y3bVar);
        for (y3b y3bVar2 : y3bVarArr) {
            tm7.q(y3bVar2, "Null interface");
        }
        Collections.addAll(this.b, y3bVarArr);
    }
}
