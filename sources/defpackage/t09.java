package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t09 {
    public final String a = t72.A();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(u57 u57Var) {
        String value;
        yw0 yw0Var = u57Var.a;
        em7 em7Var = yw0Var.b;
        z3b z3bVar = yw0Var.c;
        z3b z3bVar2 = yw0Var.a;
        StringBuilder sb = new StringBuilder(fm7.a(em7Var));
        sb.append(':');
        if (z3bVar == null || (value = z3bVar.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(z3bVar2);
        this.c.put(sb.toString(), u57Var);
    }

    public final void b(String str, u57 u57Var) {
        this.c.put(str, u57Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t09)) {
            return false;
        }
        return this.a.equals(((t09) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
