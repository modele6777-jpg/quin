package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b93 {
    public final LocalDate a;
    public final LocalDate b;

    public b93(LocalDate localDate, LocalDate localDate2) {
        this.a = localDate;
        this.b = localDate2;
    }

    public final LocalDate a() {
        LocalDate localDate = this.b;
        return localDate == null ? this.a : localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b93)) {
            return false;
        }
        b93 b93Var = (b93) obj;
        return this.a.equals(b93Var.a) && pa7.t(this.b, b93Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LocalDate localDate = this.b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public final String toString() {
        return "DailyFortuneTargetWindow(today=" + this.a + ", tomorrow=" + this.b + ")";
    }
}
