package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yic {
    public static final yic c = new yic(2026, SolarTerm.SUMMER_SOLSTICE);
    public final int a;
    public final SolarTerm b;

    public yic(int i, SolarTerm solarTerm) {
        solarTerm.getClass();
        this.a = i;
        this.b = solarTerm;
    }

    public final String a() {
        return n3d.e(this.a, this.b);
    }

    public final mic b() {
        mic.a.getClass();
        return jy4.o(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yic)) {
            return false;
        }
        yic yicVar = (yic) obj;
        return this.a == yicVar.a && this.b == yicVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SeasonalCampaignContext(year=" + this.a + ", solarTerm=" + this.b + ")";
    }
}
