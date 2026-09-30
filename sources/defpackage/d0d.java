package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d0d {
    public final int a;
    public final List b;
    public final ArrayList c;
    public final Executor d;
    public final qo1 e;
    public final int f;
    public final Map g;

    public d0d(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, qo1 qo1Var, int i2, Map map) {
        executor.getClass();
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = executor;
        this.e = qo1Var;
        this.f = i2;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0d) {
            d0d d0dVar = (d0d) obj;
            if (this.a == d0dVar.a && pa7.t(this.b, d0dVar.b) && this.c.equals(d0dVar.c) && pa7.t(this.d, d0dVar.d) && this.e == d0dVar.e && this.f == d0dVar.f && this.g.equals(d0dVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return ib8.c(this.g, ub3.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.e + ", sessionTemplateId=" + this.f + ", sessionParameters=" + this.g + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
