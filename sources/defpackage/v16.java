package defpackage;

import tech.chatmind.api.personality.CosmicSection;
import tech.chatmind.api.personality.CpSection;
import tech.chatmind.api.personality.Overview;
import tech.chatmind.api.personality.PersonalitySection;
import tech.chatmind.api.personality.ProfessionSection;
import tech.chatmind.api.personality.RomanceSection;
import tech.chatmind.api.personality.ShortCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v16 {
    public final Overview a;
    public final ShortCard b;
    public final PersonalitySection c;
    public final RomanceSection d;
    public final CpSection e;
    public final ProfessionSection f;
    public final CosmicSection g;

    public v16(Overview overview, PersonalitySection personalitySection, ShortCard shortCard, RomanceSection romanceSection, CpSection cpSection, ProfessionSection professionSection, CosmicSection cosmicSection) {
        overview.getClass();
        personalitySection.getClass();
        this.a = overview;
        this.b = shortCard;
        this.c = personalitySection;
        this.d = romanceSection;
        this.e = cpSection;
        this.f = professionSection;
        this.g = cosmicSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v16)) {
            return false;
        }
        v16 v16Var = (v16) obj;
        return pa7.t(this.a, v16Var.a) && this.b.equals(v16Var.b) && pa7.t(this.c, v16Var.c) && this.d.equals(v16Var.d) && this.e.equals(v16Var.e) && this.f.equals(v16Var.f) && this.g.equals(v16Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FullReportData(overview=" + this.a + ", shortCard=" + this.b + ", personality=" + this.c + ", romance=" + this.d + ", cp=" + this.e + ", profession=" + this.f + ", cosmic=" + this.g + ")";
    }
}
