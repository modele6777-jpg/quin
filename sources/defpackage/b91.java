package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b91 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final k3e f;
    public final oif g;
    public final HashMap h;
    public final m3e i;
    public final m3e j;

    public b91(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, k3e k3eVar, oif oifVar, HashMap map, m3e m3eVar, m3e m3eVar2) {
        m3eVar.getClass();
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = k3eVar;
        this.g = oifVar;
        this.h = map;
        this.i = m3eVar;
        this.j = m3eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b91)) {
            return false;
        }
        b91 b91Var = (b91) obj;
        return this.a.equals(b91Var.a) && this.b.equals(b91Var.b) && this.c.equals(b91Var.c) && this.d.equals(b91Var.d) && this.e.equals(b91Var.e) && pa7.t(this.f, b91Var.f) && pa7.t(this.g, b91Var.g) && this.h.equals(b91Var.h) && pa7.t(this.i, b91Var.i) && pa7.t(this.j, b91Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        k3e k3eVar = this.f;
        int iHashCode2 = (iHashCode + (k3eVar == null ? 0 : k3eVar.hashCode())) * 31;
        oif oifVar = this.g;
        int iHashCode3 = (this.i.hashCode() + ((this.h.hashCode() + ((iHashCode2 + (oifVar == null ? 0 : oifVar.hashCode())) * 31)) * 31)) * 31;
        m3e m3eVar = this.j;
        return iHashCode3 + (m3eVar != null ? m3eVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
