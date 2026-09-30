package defpackage;

import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.personality.PersonalitySection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nsb {
    public static final int f = PersonalitySection.$stable | 8;
    public final iwa a;
    public final PersonalitySection b;
    public final TarotCardType c;
    public final boolean d;
    public final boolean e;

    public nsb(iwa iwaVar, PersonalitySection personalitySection, TarotCardType tarotCardType, boolean z, boolean z2) {
        this.a = iwaVar;
        this.b = personalitySection;
        this.c = tarotCardType;
        this.d = z;
        this.e = z2;
    }

    public static nsb a(nsb nsbVar, iwa iwaVar, PersonalitySection personalitySection, TarotCardType tarotCardType, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            iwaVar = nsbVar.a;
        }
        iwa iwaVar2 = iwaVar;
        if ((i & 2) != 0) {
            personalitySection = nsbVar.b;
        }
        PersonalitySection personalitySection2 = personalitySection;
        if ((i & 4) != 0) {
            tarotCardType = nsbVar.c;
        }
        TarotCardType tarotCardType2 = tarotCardType;
        if ((i & 8) != 0) {
            z = nsbVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = nsbVar.e;
        }
        nsbVar.getClass();
        return new nsb(iwaVar2, personalitySection2, tarotCardType2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsb)) {
            return false;
        }
        nsb nsbVar = (nsb) obj;
        return pa7.t(this.a, nsbVar.a) && pa7.t(this.b, nsbVar.b) && this.c == nsbVar.c && this.d == nsbVar.d && this.e == nsbVar.e;
    }

    public final int hashCode() {
        iwa iwaVar = this.a;
        int iHashCode = (iwaVar == null ? 0 : iwaVar.hashCode()) * 31;
        PersonalitySection personalitySection = this.b;
        int iHashCode2 = (iHashCode + (personalitySection == null ? 0 : personalitySection.hashCode())) * 31;
        TarotCardType tarotCardType = this.c;
        return Boolean.hashCode(this.e) + ub3.d((iHashCode2 + (tarotCardType != null ? tarotCardType.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportState(products=");
        sb.append(this.a);
        sb.append(", personalitySection=");
        sb.append(this.b);
        sb.append(", yourTarotRole=");
        sb.append(this.c);
        sb.append(", hasSubscribed=");
        sb.append(this.d);
        sb.append(", hasCount=");
        return ub3.m(sb, this.e, ")");
    }
}
