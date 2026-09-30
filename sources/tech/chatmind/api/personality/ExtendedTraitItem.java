package tech.chatmind.api.personality;

import defpackage.ag2;
import defpackage.an1;
import defpackage.g85;
import defpackage.h85;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Ltech/chatmind/api/personality/ExtendedTraitItem;", "", "", "leadingTitle", "highlightTitle", "trailingTitle", "desc", "heroDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/ExtendedTraitItem;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/personality/ExtendedTraitItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeadingTitle", "getHighlightTitle", "getTrailingTitle", "getDesc", "getHeroDesc", "Companion", "g85", "h85", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ExtendedTraitItem {
    public static final int $stable = 0;
    public static final h85 Companion = new h85();
    private final String desc;
    private final String heroDesc;
    private final String highlightTitle;
    private final String leadingTitle;
    private final String trailingTitle;

    public /* synthetic */ ExtendedTraitItem(int i, String str, String str2, String str3, String str4, String str5, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, g85.a.e());
            throw null;
        }
        this.leadingTitle = str;
        this.highlightTitle = str2;
        this.trailingTitle = str3;
        this.desc = str4;
        this.heroDesc = str5;
    }

    public static /* synthetic */ ExtendedTraitItem copy$default(ExtendedTraitItem extendedTraitItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extendedTraitItem.leadingTitle;
        }
        if ((i & 2) != 0) {
            str2 = extendedTraitItem.highlightTitle;
        }
        if ((i & 4) != 0) {
            str3 = extendedTraitItem.trailingTitle;
        }
        if ((i & 8) != 0) {
            str4 = extendedTraitItem.desc;
        }
        if ((i & 16) != 0) {
            str5 = extendedTraitItem.heroDesc;
        }
        String str6 = str5;
        String str7 = str3;
        return extendedTraitItem.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ExtendedTraitItem self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.leadingTitle);
        output.w(serialDesc, 1, self.highlightTitle);
        output.w(serialDesc, 2, self.trailingTitle);
        p4e p4eVar = p4e.a;
        output.A(serialDesc, 3, p4eVar, self.desc);
        output.A(serialDesc, 4, p4eVar, self.heroDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeadingTitle() {
        return this.leadingTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHighlightTitle() {
        return this.highlightTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrailingTitle() {
        return this.trailingTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeroDesc() {
        return this.heroDesc;
    }

    public final ExtendedTraitItem copy(String leadingTitle, String highlightTitle, String trailingTitle, String desc, String heroDesc) {
        leadingTitle.getClass();
        highlightTitle.getClass();
        trailingTitle.getClass();
        return new ExtendedTraitItem(leadingTitle, highlightTitle, trailingTitle, desc, heroDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedTraitItem)) {
            return false;
        }
        ExtendedTraitItem extendedTraitItem = (ExtendedTraitItem) other;
        return pa7.t(this.leadingTitle, extendedTraitItem.leadingTitle) && pa7.t(this.highlightTitle, extendedTraitItem.highlightTitle) && pa7.t(this.trailingTitle, extendedTraitItem.trailingTitle) && pa7.t(this.desc, extendedTraitItem.desc) && pa7.t(this.heroDesc, extendedTraitItem.heroDesc);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getHeroDesc() {
        return this.heroDesc;
    }

    public final String getHighlightTitle() {
        return this.highlightTitle;
    }

    public final String getLeadingTitle() {
        return this.leadingTitle;
    }

    public final String getTrailingTitle() {
        return this.trailingTitle;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.c(this.leadingTitle.hashCode() * 31, 31, this.highlightTitle), 31, this.trailingTitle);
        String str = this.desc;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.heroDesc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.leadingTitle;
        String str2 = this.highlightTitle;
        String str3 = this.trailingTitle;
        String str4 = this.desc;
        String str5 = this.heroDesc;
        StringBuilder sbO = ib8.o("ExtendedTraitItem(leadingTitle=", str, ", highlightTitle=", str2, ", trailingTitle=");
        ub3.v(sbO, str3, ", desc=", str4, ", heroDesc=");
        return ks0.l(sbO, str5, ")");
    }

    public ExtendedTraitItem(String str, String str2, String str3, String str4, String str5) {
        tec.x(str, str2, str3);
        this.leadingTitle = str;
        this.highlightTitle = str2;
        this.trailingTitle = str3;
        this.desc = str4;
        this.heroDesc = str5;
    }
}
