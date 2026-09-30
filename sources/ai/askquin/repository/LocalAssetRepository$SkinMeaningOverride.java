package ai.askquin.repository;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ga8;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0017¨\u0006("}, d2 = {"ai/askquin/repository/LocalAssetRepository$SkinMeaningOverride", "", "", "cardKey", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "Lai/askquin/repository/LocalAssetRepository$SkinMeaningOverride;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Lai/askquin/repository/LocalAssetRepository$SkinMeaningOverride;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/repository/LocalAssetRepository$SkinMeaningOverride;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardKey", "getDescription", "Companion", "ai/askquin/repository/a", "ga8", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class LocalAssetRepository$SkinMeaningOverride {
    public static final ga8 Companion = new ga8();
    private final String cardKey;
    private final String description;

    public /* synthetic */ LocalAssetRepository$SkinMeaningOverride(int i, String str, String str2, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, a.a.e());
            throw null;
        }
        this.cardKey = str;
        if ((i & 2) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
    }

    public static /* synthetic */ LocalAssetRepository$SkinMeaningOverride copy$default(LocalAssetRepository$SkinMeaningOverride localAssetRepository$SkinMeaningOverride, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localAssetRepository$SkinMeaningOverride.cardKey;
        }
        if ((i & 2) != 0) {
            str2 = localAssetRepository$SkinMeaningOverride.description;
        }
        return localAssetRepository$SkinMeaningOverride.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(LocalAssetRepository$SkinMeaningOverride self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.cardKey);
        if (!output.g(serialDesc) && pa7.t(self.description, "")) {
            return;
        }
        output.w(serialDesc, 1, self.description);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardKey() {
        return this.cardKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final LocalAssetRepository$SkinMeaningOverride copy(String cardKey, String description) {
        cardKey.getClass();
        description.getClass();
        return new LocalAssetRepository$SkinMeaningOverride(cardKey, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalAssetRepository$SkinMeaningOverride)) {
            return false;
        }
        LocalAssetRepository$SkinMeaningOverride localAssetRepository$SkinMeaningOverride = (LocalAssetRepository$SkinMeaningOverride) other;
        return pa7.t(this.cardKey, localAssetRepository$SkinMeaningOverride.cardKey) && pa7.t(this.description, localAssetRepository$SkinMeaningOverride.description);
    }

    public final String getCardKey() {
        return this.cardKey;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.cardKey.hashCode() * 31);
    }

    public String toString() {
        return tec.m("SkinMeaningOverride(cardKey=", this.cardKey, ", description=", this.description, ")");
    }

    public LocalAssetRepository$SkinMeaningOverride(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.cardKey = str;
        this.description = str2;
    }

    public /* synthetic */ LocalAssetRepository$SkinMeaningOverride(String str, String str2, int i, rp3 rp3Var) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
