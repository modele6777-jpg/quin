package defpackage;

import java.time.OffsetDateTime;
import java.util.List;
import tech.chatmind.api.events.model.EventType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sle {
    public final String a;
    public final EventType b;
    public final OffsetDateTime c;
    public final OffsetDateTime d;
    public final String e;
    public final List f;
    public final String g;

    public sle(String str, EventType eventType, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str2, List list, String str3) {
        str.getClass();
        eventType.getClass();
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        this.a = str;
        this.b = eventType;
        this.c = offsetDateTime;
        this.d = offsetDateTime2;
        this.e = str2;
        this.f = list;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sle)) {
            return false;
        }
        sle sleVar = (sle) obj;
        return pa7.t(this.a, sleVar.a) && this.b == sleVar.b && pa7.t(this.c, sleVar.c) && pa7.t(this.d, sleVar.d) && this.e.equals(sleVar.e) && this.f.equals(sleVar.f) && this.g.equals(sleVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + tec.a(ub3.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateEventInfo(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", startAt=");
        sb.append(this.c);
        sb.append(", endAt=");
        sb.append(this.d);
        sb.append(", pattern=");
        ib8.v(sb, this.e, ", patternData=", this.f, ", recommendQuestion=");
        return ks0.l(sb, this.g, ")");
    }
}
