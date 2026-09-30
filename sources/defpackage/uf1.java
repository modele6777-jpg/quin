package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uf1 {
    public final String a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final wj1 e;
    public final int f;
    public final Map g;
    public final int h;
    public final Map i;
    public final List j;
    public final List k;
    public final Map l;
    public final ev8 m;
    public final wf1 n;

    public uf1(String str, List list, List list2, ArrayList arrayList, wj1 wj1Var, int i, LinkedHashMap linkedHashMap, int i2, fl8 fl8Var, List list3, List list4, wf1 wf1Var) {
        ev8 ev8Var = new ev8();
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = wj1Var;
        this.f = i;
        this.g = linkedHashMap;
        this.h = i2;
        this.i = fl8Var;
        this.j = list3;
        this.k = list4;
        this.l = qu4.a;
        this.m = ev8Var;
        this.n = wf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf1)) {
            return false;
        }
        uf1 uf1Var = (uf1) obj;
        return pa7.t(this.a, uf1Var.a) && this.b.equals(uf1Var.b) && this.c.equals(uf1Var.c) && pa7.t(this.d, uf1Var.d) && pa7.t(this.e, uf1Var.e) && this.f == uf1Var.f && this.g.equals(uf1Var.g) && this.h == uf1Var.h && this.i.equals(uf1Var.i) && this.j.equals(uf1Var.j) && this.k.equals(uf1Var.k) && this.l.equals(uf1Var.l) && this.m.equals(uf1Var.m) && this.n.equals(uf1Var.n);
    }

    public final int hashCode() {
        int iA = tec.a(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ArrayList arrayList = this.d;
        int iHashCode = (iA + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        wj1 wj1Var = this.e;
        return (this.n.hashCode() + ((this.m.hashCode() + ib8.c(this.l, tec.a(tec.a(ib8.c(this.i, ub3.b(1, ub3.b(this.h, ib8.c(this.g, ub3.b(this.f, (iHashCode + (wj1Var != null ? wj1Var.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.j), 31, this.k), 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) ig1.b(this.a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + ", input=" + this.d + ", postviewStream=" + this.e + ", sessionTemplate=" + ((Object) ttb.b(this.f)) + ", sessionParameters=" + this.g + ", sessionMode=" + ((Object) kn2.b0(this.h)) + ", defaultTemplate=" + ((Object) ttb.b(1)) + ", defaultParameters=" + this.i + ", defaultListeners=" + this.j + ", graphStateListeners=" + this.k + ", requiredParameters=" + this.l + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.m + ", flags=" + this.n + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
