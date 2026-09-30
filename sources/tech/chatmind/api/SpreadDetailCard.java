package tech.chatmind.api;

import defpackage.ag2;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.uvd;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Ltech/chatmind/api/SpreadDetailCard;", "", "", "key", "name", "", "direction", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/SpreadDetailCard;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Ltech/chatmind/api/SpreadDetailCard;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getName", "I", "getDirection", "Companion", "tvd", "uvd", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SpreadDetailCard {
    public static final int $stable = 0;
    public static final uvd Companion = new uvd();
    private final int direction;
    private final String key;
    private final String name;

    public /* synthetic */ SpreadDetailCard(int i, String str, String str2, int i2, xyc xycVar) {
        this.key = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.direction = 1;
        } else {
            this.direction = i2;
        }
    }

    public static /* synthetic */ SpreadDetailCard copy$default(SpreadDetailCard spreadDetailCard, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = spreadDetailCard.key;
        }
        if ((i2 & 2) != 0) {
            str2 = spreadDetailCard.name;
        }
        if ((i2 & 4) != 0) {
            i = spreadDetailCard.direction;
        }
        return spreadDetailCard.copy(str, str2, i);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SpreadDetailCard self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || !pa7.t(self.key, "")) {
            output.w(serialDesc, 0, self.key);
        }
        if (output.g(serialDesc) || self.name != null) {
            output.A(serialDesc, 1, p4e.a, self.name);
        }
        if (!output.g(serialDesc) && self.direction == 1) {
            return;
        }
        output.v(2, self.direction, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDirection() {
        return this.direction;
    }

    public final SpreadDetailCard copy(String key, String name, int direction) {
        key.getClass();
        return new SpreadDetailCard(key, name, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpreadDetailCard)) {
            return false;
        }
        SpreadDetailCard spreadDetailCard = (SpreadDetailCard) other;
        return pa7.t(this.key, spreadDetailCard.key) && pa7.t(this.name, spreadDetailCard.name) && this.direction == spreadDetailCard.direction;
    }

    public final int getDirection() {
        return this.direction;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.name;
        return Integer.hashCode(this.direction) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return tec.g(this.direction, ")", ib8.o("SpreadDetailCard(key=", this.key, ", name=", this.name, ", direction="));
    }

    public SpreadDetailCard() {
        this((String) null, (String) null, 0, 7, (rp3) null);
    }

    public SpreadDetailCard(String str, String str2, int i) {
        str.getClass();
        this.key = str;
        this.name = str2;
        this.direction = i;
    }

    public /* synthetic */ SpreadDetailCard(String str, String str2, int i, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 1 : i);
    }
}
