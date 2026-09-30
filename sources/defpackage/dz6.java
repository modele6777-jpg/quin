package defpackage;

import java.time.OffsetDateTime;
import tech.chatmind.api.message.model.InAppMessageIntensity;
import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dz6 {
    public final String a;
    public final InAppMessageType b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final InAppMessageIntensity g;
    public final String h;
    public final String i;
    public final String j;
    public final OffsetDateTime k;

    public dz6(String str, InAppMessageType inAppMessageType, String str2, String str3, String str4, String str5, InAppMessageIntensity inAppMessageIntensity, String str6, String str7, String str8, OffsetDateTime offsetDateTime) {
        str.getClass();
        inAppMessageType.getClass();
        str2.getClass();
        str4.getClass();
        inAppMessageIntensity.getClass();
        offsetDateTime.getClass();
        this.a = str;
        this.b = inAppMessageType;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = inAppMessageIntensity;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = offsetDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz6)) {
            return false;
        }
        dz6 dz6Var = (dz6) obj;
        return pa7.t(this.a, dz6Var.a) && this.b == dz6Var.b && pa7.t(this.c, dz6Var.c) && pa7.t(this.d, dz6Var.d) && pa7.t(this.e, dz6Var.e) && pa7.t(this.f, dz6Var.f) && this.g == dz6Var.g && pa7.t(this.h, dz6Var.h) && pa7.t(this.i, dz6Var.i) && pa7.t(this.j, dz6Var.j) && pa7.t(this.k, dz6Var.k);
    }

    public final int hashCode() {
        int iC = ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iC2 = ub3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode = (this.g.hashCode() + ((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        return this.k.hashCode() + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppMessageEntity(messageId=");
        sb.append(this.a);
        sb.append(", messageType=");
        sb.append(this.b);
        sb.append(", region=");
        ub3.v(sb, this.c, ", title=", this.d, ", content=");
        ub3.v(sb, this.e, ", imageUrl=", this.f, ", intensity=");
        sb.append(this.g);
        sb.append(", action=");
        sb.append(this.h);
        sb.append(", actionTips=");
        ub3.v(sb, this.i, ", attach=", this.j, ", createdAt=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
