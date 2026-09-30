package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v85 {
    public final ArrayList a;
    public final ft b;
    public final qo1 c;
    public final int d;
    public final Map e;
    public final Integer f;
    public final w85 g;
    public final ot h;

    public v85(ArrayList arrayList, ft ftVar, qo1 qo1Var, int i, Map map, Integer num, w85 w85Var, ot otVar) {
        this.a = arrayList;
        this.b = ftVar;
        this.c = qo1Var;
        this.d = i;
        this.e = map;
        this.f = num;
        this.g = w85Var;
        this.h = otVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v85) {
            v85 v85Var = (v85) obj;
            if (this.a.equals(v85Var.a) && this.b == v85Var.b && this.c == v85Var.c && this.d == v85Var.d && this.e.equals(v85Var.e) && this.f.equals(v85Var.f) && this.g == v85Var.g && pa7.t(this.h, v85Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ib8.c(this.e, ub3.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (Integer.hashCode(2) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31;
        ot otVar = this.h;
        return iHashCode + (otVar == null ? 0 : otVar.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.a + ", executor=" + this.b + ", stateCallback=" + this.c + ", sessionTemplateId=" + this.d + ", sessionParameters=" + this.e + ", extensionMode=" + this.f + ", extensionStateCallback=" + this.g + ", postviewOutputConfiguration=" + this.h + ')';
    }
}
