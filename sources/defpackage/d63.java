package defpackage;

import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d63 implements e63 {
    public final String a;
    public final String b;
    public final TarotCardChoice c;
    public final String d;
    public final String e;
    public final List f;
    public final lld g;
    public final List h;
    public final List i;

    public d63(String str, String str2, TarotCardChoice tarotCardChoice, String str3, String str4, List list, lld lldVar, List list2, List list3) {
        str.getClass();
        tarotCardChoice.getClass();
        str3.getClass();
        lldVar.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = str2;
        this.c = tarotCardChoice;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = lldVar;
        this.h = list2;
        this.i = list3;
    }

    public static d63 a(d63 d63Var, lld lldVar) {
        String str = d63Var.a;
        String str2 = d63Var.b;
        TarotCardChoice tarotCardChoice = d63Var.c;
        String str3 = d63Var.d;
        String str4 = d63Var.e;
        List list = d63Var.f;
        List list2 = d63Var.h;
        List list3 = d63Var.i;
        d63Var.getClass();
        str.getClass();
        tarotCardChoice.getClass();
        str3.getClass();
        list2.getClass();
        list3.getClass();
        return new d63(str, str2, tarotCardChoice, str3, str4, list, lldVar, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d63)) {
            return false;
        }
        d63 d63Var = (d63) obj;
        return pa7.t(this.a, d63Var.a) && this.b.equals(d63Var.b) && pa7.t(this.c, d63Var.c) && pa7.t(this.d, d63Var.d) && this.e.equals(d63Var.e) && this.f.equals(d63Var.f) && pa7.t(this.g, d63Var.g) && pa7.t(this.h, d63Var.h) && pa7.t(this.i, d63Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + tec.a((this.g.hashCode() + tec.a(ub3.c(ub3.c((this.c.hashCode() + ub3.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("Success(date=", this.a, ", affirmation=", this.b, ", tarotCard=");
        sbO.append(this.c);
        sbO.append(", cardName=");
        sbO.append(this.d);
        sbO.append(", reading=");
        ib8.v(sbO, this.e, ", questions=", this.f, ", skinBrowsingState=");
        sbO.append(this.g);
        sbO.append(", dos=");
        sbO.append(this.h);
        sbO.append(", donts=");
        return ks0.n(sbO, this.i, ")");
    }
}
