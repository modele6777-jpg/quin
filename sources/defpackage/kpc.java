package defpackage;

import java.time.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kpc {
    public final yic a;
    public final LocalDateTime b;

    public kpc(yic yicVar, LocalDateTime localDateTime) {
        yicVar.getClass();
        this.a = yicVar;
        this.b = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpc)) {
            return false;
        }
        kpc kpcVar = (kpc) obj;
        return pa7.t(this.a, kpcVar.a) && this.b.equals(kpcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeasonalReminderSchedule(campaign=" + this.a + ", localDateTime=" + this.b + ")";
    }
}
