package tech.chatmind.api;

import defpackage.ab0;
import defpackage.ag2;
import defpackage.cb0;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.qh6;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\"¨\u00066"}, d2 = {"Ltech/chatmind/api/AppSettings;", "", "", "enableYearlySubUnlockAllCards", "", "newUserFreeReadingCount", "", "forceUpdateSince", "suggestUpdateSince", "", "experimentVariants", "<init>", "(ZILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/AppSettings;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/Map;", "copy", "(ZILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ltech/chatmind/api/AppSettings;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnableYearlySubUnlockAllCards", "I", "getNewUserFreeReadingCount", "Ljava/lang/String;", "getForceUpdateSince", "getSuggestUpdateSince", "Ljava/util/Map;", "getExperimentVariants", "Companion", "bb0", "cb0", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AppSettings {
    public static final int $stable = 8;
    private final boolean enableYearlySubUnlockAllCards;
    private final Map<String, String> experimentVariants;
    private final String forceUpdateSince;
    private final int newUserFreeReadingCount;
    private final String suggestUpdateSince;
    public static final cb0 Companion = new cb0();
    private static final lw7[] $childSerializers = {null, null, null, null, eb3.N(z18.b, new ab0(28))};

    public /* synthetic */ AppSettings(int i, boolean z, int i2, String str, String str2, Map map, xyc xycVar) {
        this.enableYearlySubUnlockAllCards = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.newUserFreeReadingCount = 2;
        } else {
            this.newUserFreeReadingCount = i2;
        }
        if ((i & 4) == 0) {
            this.forceUpdateSince = null;
        } else {
            this.forceUpdateSince = str;
        }
        if ((i & 8) == 0) {
            this.suggestUpdateSince = null;
        } else {
            this.suggestUpdateSince = str2;
        }
        if ((i & 16) == 0) {
            this.experimentVariants = qu4.a;
        } else {
            this.experimentVariants = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        p4e p4eVar = p4e.a;
        return new qh6(p4eVar, p4eVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppSettings copy$default(AppSettings appSettings, boolean z, int i, String str, String str2, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = appSettings.enableYearlySubUnlockAllCards;
        }
        if ((i2 & 2) != 0) {
            i = appSettings.newUserFreeReadingCount;
        }
        if ((i2 & 4) != 0) {
            str = appSettings.forceUpdateSince;
        }
        if ((i2 & 8) != 0) {
            str2 = appSettings.suggestUpdateSince;
        }
        if ((i2 & 16) != 0) {
            map = appSettings.experimentVariants;
        }
        Map map2 = map;
        String str3 = str;
        return appSettings.copy(z, i, str3, str2, map2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(AppSettings self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.enableYearlySubUnlockAllCards) {
            output.o(serialDesc, 0, self.enableYearlySubUnlockAllCards);
        }
        if (output.g(serialDesc) || self.newUserFreeReadingCount != 2) {
            output.v(1, self.newUserFreeReadingCount, serialDesc);
        }
        if (output.g(serialDesc) || self.forceUpdateSince != null) {
            output.A(serialDesc, 2, p4e.a, self.forceUpdateSince);
        }
        if (output.g(serialDesc) || self.suggestUpdateSince != null) {
            output.A(serialDesc, 3, p4e.a, self.suggestUpdateSince);
        }
        if (!output.g(serialDesc) && pa7.t(self.experimentVariants, qu4.a)) {
            return;
        }
        output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.experimentVariants);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableYearlySubUnlockAllCards() {
        return this.enableYearlySubUnlockAllCards;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNewUserFreeReadingCount() {
        return this.newUserFreeReadingCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getForceUpdateSince() {
        return this.forceUpdateSince;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuggestUpdateSince() {
        return this.suggestUpdateSince;
    }

    public final Map<String, String> component5() {
        return this.experimentVariants;
    }

    public final AppSettings copy(boolean enableYearlySubUnlockAllCards, int newUserFreeReadingCount, String forceUpdateSince, String suggestUpdateSince, Map<String, String> experimentVariants) {
        experimentVariants.getClass();
        return new AppSettings(enableYearlySubUnlockAllCards, newUserFreeReadingCount, forceUpdateSince, suggestUpdateSince, experimentVariants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSettings)) {
            return false;
        }
        AppSettings appSettings = (AppSettings) other;
        return this.enableYearlySubUnlockAllCards == appSettings.enableYearlySubUnlockAllCards && this.newUserFreeReadingCount == appSettings.newUserFreeReadingCount && pa7.t(this.forceUpdateSince, appSettings.forceUpdateSince) && pa7.t(this.suggestUpdateSince, appSettings.suggestUpdateSince) && pa7.t(this.experimentVariants, appSettings.experimentVariants);
    }

    public final boolean getEnableYearlySubUnlockAllCards() {
        return this.enableYearlySubUnlockAllCards;
    }

    public final Map<String, String> getExperimentVariants() {
        return this.experimentVariants;
    }

    public final String getForceUpdateSince() {
        return this.forceUpdateSince;
    }

    public final int getNewUserFreeReadingCount() {
        return this.newUserFreeReadingCount;
    }

    public final String getSuggestUpdateSince() {
        return this.suggestUpdateSince;
    }

    public int hashCode() {
        int iB = ub3.b(this.newUserFreeReadingCount, Boolean.hashCode(this.enableYearlySubUnlockAllCards) * 31, 31);
        String str = this.forceUpdateSince;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suggestUpdateSince;
        return this.experimentVariants.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        boolean z = this.enableYearlySubUnlockAllCards;
        int i = this.newUserFreeReadingCount;
        String str = this.forceUpdateSince;
        String str2 = this.suggestUpdateSince;
        Map<String, String> map = this.experimentVariants;
        StringBuilder sb = new StringBuilder("AppSettings(enableYearlySubUnlockAllCards=");
        sb.append(z);
        sb.append(", newUserFreeReadingCount=");
        sb.append(i);
        sb.append(", forceUpdateSince=");
        ub3.v(sb, str, ", suggestUpdateSince=", str2, ", experimentVariants=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public AppSettings() {
        this(false, 0, (String) null, (String) null, (Map) null, 31, (rp3) null);
    }

    public AppSettings(boolean z, int i, String str, String str2, Map<String, String> map) {
        map.getClass();
        this.enableYearlySubUnlockAllCards = z;
        this.newUserFreeReadingCount = i;
        this.forceUpdateSince = str;
        this.suggestUpdateSince = str2;
        this.experimentVariants = map;
    }

    public /* synthetic */ AppSettings(boolean z, int i, String str, String str2, Map map, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? qu4.a : map);
    }
}
