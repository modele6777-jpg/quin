package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zb4 extends bc4 {
    public final String a;
    public final String b;
    public final String c;
    public final tdb d;
    public final w57 e;
    public final w57 f;
    public final List g;
    public final List h;
    public final er2 i;
    public final fc4 j;
    public final TarotSkinIdentify k;
    public final LinkedHashMap l;

    public zb4(String str, String str2, String str3, tdb tdbVar, w57 w57Var, w57 w57Var2, List list, List list2, er2 er2Var, fc4 fc4Var, TarotSkinIdentify tarotSkinIdentify, LinkedHashMap linkedHashMap) {
        str.getClass();
        str2.getClass();
        tdbVar.getClass();
        w57Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tdbVar;
        this.e = w57Var;
        this.f = w57Var2;
        this.g = list;
        this.h = list2;
        this.i = er2Var;
        this.j = fc4Var;
        this.k = tarotSkinIdentify;
        this.l = linkedHashMap;
    }

    @Override // defpackage.bc4
    public final w57 a() {
        return this.e;
    }

    @Override // defpackage.bc4
    public final w57 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb4)) {
            return false;
        }
        zb4 zb4Var = (zb4) obj;
        return pa7.t(this.a, zb4Var.a) && pa7.t(this.b, zb4Var.b) && this.c.equals(zb4Var.c) && this.d == zb4Var.d && pa7.t(this.e, zb4Var.e) && pa7.t(this.f, zb4Var.f) && this.g.equals(zb4Var.g) && this.h.equals(zb4Var.h) && this.i.equals(zb4Var.i) && this.j.equals(zb4Var.j) && this.k == zb4Var.k && this.l.equals(zb4Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        w57 w57Var = this.f;
        int iHashCode2 = (this.j.hashCode() + ((this.i.hashCode() + tec.a(tec.a((iHashCode + (w57Var == null ? 0 : w57Var.hashCode())) * 31, 31, this.g), 31, this.h)) * 31)) * 31;
        TarotSkinIdentify tarotSkinIdentify = this.k;
        return this.l.hashCode() + ((iHashCode2 + (tarotSkinIdentify != null ? tarotSkinIdentify.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("Information(id=", this.a, ", title=", this.b, ", message=");
        sbO.append(this.c);
        sbO.append(", readState=");
        sbO.append(this.d);
        sbO.append(", createAt=");
        sbO.append(this.e);
        sbO.append(", drawnAt=");
        sbO.append(this.f);
        sbO.append(", cards=");
        sbO.append(this.g);
        sbO.append(", extraCards=");
        sbO.append(this.h);
        sbO.append(", launchArguments=");
        sbO.append(this.i);
        sbO.append(", key=");
        sbO.append(this.j);
        sbO.append(", usedSkin=");
        sbO.append(this.k);
        sbO.append(", cardSkins=");
        sbO.append(this.l);
        sbO.append(")");
        return sbO.toString();
    }
}
